package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于支付宝用户通过医院服务窗绑定当地社保卡
 *
 * @author auto create
 * @since 1.0, 2017-03-01 18:24:48
 */
public class AlipayCommerceMedicalInstcardBindModel extends AlipayObject {

	private static final long serialVersionUID = 2527939553199222744L;

	/**
	 * 支付宝处理完请求后，如验证成功，当前页面自动跳转到商户网站里指定页面的http路径。
	 */
	@ApiField("return_url")
	private String returnUrl;

	public String getReturnUrl() {
		return this.returnUrl;
	}
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

}
