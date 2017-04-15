# alipay-sdk
把支付宝的SDK导入成maven库


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