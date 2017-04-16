# alipay-sdk
把支付宝的SDK导入成maven库

来源地址https://doc.open.alipay.com/docs/doc.htm?treeId=54&articleId=103419&docType=1

###SDK集成
1.SDK已经对加签验签逻辑做了封装，使用SDK可直接调用API。

2.确定接口对应的类
例如接口名：alipay.offline.material.image.upload

在SDK中对应的类为：每个单词首字母大写，并去掉分隔符（“.”），末尾加上Request（或Response）

如上接口名对应的类为：

AlipayOfflineMaterialImageUploadRequest（请求类）

AlipayOfflineMaterialImageUploadResponse（响应类）

#####普通调用示例

```
//实例化客户端
AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", APP_ID, APP_PRIVATE_KEY, "json", CHARSET, ALIPAY_PUBLIC_KEY, "RSA2");
//实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.open.public.template.message.industry.modify 
AlipayOpenPublicTemplateMessageIndustryModifyRequest request = new AlipayOpenPublicTemplateMessageIndustryModifyRequest();
//SDK已经封装掉了公共参数，这里只需要传入业务参数
//此次只是参数展示，未进行字符串转义，实际情况下请转义
request.setBizContent("  {" +
"    \"primary_industry_name\":\"IT科技/IT软件与服务\"," +
"    \"primary_industry_code\":\"10001/20102\"," +
"    \"secondary_industry_code\":\"10001/20102\"," +
"    \"secondary_industry_name\":\"IT科技/IT软件与服务\"" +
" }");
AlipayOpenPublicTemplateMessageIndustryModifyResponse response = alipayClient.execute(request); 
//调用成功，则处理业务逻辑
if(response.isSuccess()){
    //.....
}
```

#####图片上传接口调用示例

```
AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", APP_ID, APP_PRIVATE_KEY, "json", CHARSET, ALIPAY_PUBLIC_KEY, "RSA2");
// 实例化具体API对应的request类,类名称和接口名称对应，当前调用接口名称：alipay.offline.material.image.upload 
AlipayOfflineMaterialImageUploadRequest request = new AlipayOfflineMaterialImageUploadRequest();
request.setImageName("test");
//Windows请填写绝对路径，不支持相对路径；Linux支持相对路径
FileItem item = new FileItem("C:/Downloads/ooopic_963991_7eea1f5426105f9e6069/16365_1271139700.jpg");
request.setImageType("JPG");
request.setImageContent(item);
//执行API请求
AlipayOfflineMaterialImageUploadResponse response = alipayClient.execute(request);
//调用成功，则处理业务逻辑
if(response.isSuccess()){
     //获取图片访问地址
    String imageUrl = response.getImageUrl();
    //.....
}
```

#####用户授权接口调用示例

```
AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", APP_ID, APP_PRIVATE_KEY, "json", CHARSET, ALIPAY_PUBLIC_KEY, "RSA2");
//实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.user.userinfo.share
AlipayUserUserinfoShareRequest request = new AlipayUserUserinfoShareRequest();
//授权类接口执行API调用时需要带上accessToken
AlipayUserUserinfoShareResponse response= alipayClient.execute(request,"accessToken"); 
//业务处理
//...
```

#####应用授权接口调用示例（ISV代理商户调用）

```
AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", APP_ID, APP_PRIVATE_KEY, "json", CHARSET, ALIPAY_PUBLIC_KEY, "RSA2");
//实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.open.public.template.message.industry.modify 
AlipayOpenPublicTemplateMessageIndustryModifyRequest request = new AlipayOpenPublicTemplateMessageIndustryModifyRequest();
//SDK已经封装掉了公共参数，这里只需要传入业务参数
//此次只是参数展示，未进行字符串转义，实际情况下请转义
request.setBizContent("  { " +
"    \"primary_industry_name\":\"IT科技/IT软件与服务\"," +
"    \"primary_industry_code\":\"10001/20102\"," + 
"    \"secondary_industry_code\":\"10001/20102\"," +
"    \"secondary_industry_name\":\"IT科技/IT软件与服务\"" +
"  }");
//ISV代理商户调用需要传入app_auth_token
request.putOtherTextParam("app_auth_token", "201511BBaaa6464f271f49e482f2e9fe63ca5F05");
AlipayOpenPublicTemplateMessageIndustryModifyResponse response = alipayClient.execute(request); 
//调用成功，则处理业务逻辑
if(response.isSuccess()){
    //.....
}
```


## maven配置

```xml
		<dependency>
			<groupId>com.alipay</groupId>
			<artifactId>alipay-sdk</artifactId>
			<version>1.0.0-SNAPSHOT</version>
		</dependency>
```

快照库地址

```xml
	<repositories>
		<repository>
			<id>nutz-snapshots</id>
			<url>https://jfrog.nutz.cn/artifactory/snapshots</url>
			<snapshots>
				<enabled>true</enabled>
				<updatePolicy>always</updatePolicy>
			</snapshots>
			<releases>
				<enabled>false</enabled>
			</releases>
		</repository>
	</repositories>
```