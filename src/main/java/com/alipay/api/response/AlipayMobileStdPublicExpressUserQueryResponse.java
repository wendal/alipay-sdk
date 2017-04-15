package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.express.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 20:21:15
 */
public class AlipayMobileStdPublicExpressUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5674625735189299214L;

	/** 
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 证件类型，身份证
	 */
	@ApiField("cert_type")
	private String certType;

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

}
