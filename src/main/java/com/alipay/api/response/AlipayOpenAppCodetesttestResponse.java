package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.codetesttest response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-12 20:55:36
 */
public class AlipayOpenAppCodetesttestResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 1864149732875655691L;
=======
	private static final long serialVersionUID = 2451814921478711178L;
>>>>>>> master

	/** 
	 * 测试测试测试
	 */
	@ApiField("testtesttest")
	private String testtesttest;

	public void setTesttesttest(String testtesttest) {
		this.testtesttest = testtesttest;
	}
	public String getTesttesttest( ) {
		return this.testtesttest;
	}

}
