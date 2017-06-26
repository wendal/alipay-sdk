package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.template.message.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-14 20:27:44
 */
public class AlipayMobilePublicTemplateMessageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2653238326545936459L;

	/** 
	 * 结果值
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
