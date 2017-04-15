package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.standard.verify.get response.
 * 
 * @author auto create
 * @since 1.0, 2015-02-06 13:10:24
 */
public class AlipayTrustUserStandardVerifyGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7868345293925513929L;

	/** 
	 * 详见说明文档和代码样例
	 */
	@ApiField("verify_info")
	private String verifyInfo;

	public void setVerifyInfo(String verifyInfo) {
		this.verifyInfo = verifyInfo;
	}
	public String getVerifyInfo( ) {
		return this.verifyInfo;
	}

}
