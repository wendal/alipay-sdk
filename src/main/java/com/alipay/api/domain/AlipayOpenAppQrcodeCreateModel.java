package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序生成推广二维码接口
 *
 * @author auto create
 * @since 1.0, 2017-04-19 10:50:06
 */
public class AlipayOpenAppQrcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6662924177148443125L;

	/**
	 * 对应的二维码描述
	 */
	@ApiField("describe")
	private String describe;

	/**
	 * 示例："/index.html?name=ali&loc=hz"，/index.html为小程序中能访问到的路径，?name=ali&loc=hz 为自定义的query参数
	 */
	@ApiField("url_param")
	private String urlParam;

	public String getDescribe() {
		return this.describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getUrlParam() {
		return this.urlParam;
	}
	public void setUrlParam(String urlParam) {
		this.urlParam = urlParam;
	}

}
