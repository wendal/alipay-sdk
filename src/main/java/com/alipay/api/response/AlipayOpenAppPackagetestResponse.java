package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.packagetest response.
 * 
 * @author auto create
 * @since 1.0, 2016-09-21 21:43:09
 */
public class AlipayOpenAppPackagetestResponse extends AlipayResponse {

	private static final long serialVersionUID = 7725876118679858835L;

	/** 
	 * testtest
	 */
	@ApiField("testtesttesttest")
	private String testtesttesttest;

	public void setTesttesttesttest(String testtesttesttest) {
		this.testtesttesttest = testtesttesttest;
	}
	public String getTesttesttesttest( ) {
		return this.testtesttesttest;
	}

}
