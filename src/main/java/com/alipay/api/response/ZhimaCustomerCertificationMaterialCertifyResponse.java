package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.certification.material.certify response.
 * 
 * @author auto create
 * @since 1.0, 2017-10-26 17:39:02
 */
public class ZhimaCustomerCertificationMaterialCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4435372659388813837L;

	/** 
	 * 本次认证的唯一标识，商户需要记录，后续的操作都需要用到
	 */
	@ApiField("biz_no")
	private String bizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

}
