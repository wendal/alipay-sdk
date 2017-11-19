package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.xwbtest.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-10-12 20:28:12
 */
public class AlipayOpenAppXwbtestBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6855912844217871719L;

	/** 
	 * 1
	 */
	@ApiField("xwb")
	private String xwb;

	public void setXwb(String xwb) {
		this.xwb = xwb;
	}
	public String getXwb( ) {
		return this.xwb;
	}

}
