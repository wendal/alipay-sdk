package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.policy.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2017-10-24 17:05:10
 */
public class AlipayInsAutoAutoinsprodPolicyCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 2868332262256984459L;

	/** 
	 * 操作结果 true/false
	 */
	@ApiField("cancel_result")
	private String cancelResult;

	public void setCancelResult(String cancelResult) {
		this.cancelResult = cancelResult;
	}
	public String getCancelResult( ) {
		return this.cancelResult;
	}

}
