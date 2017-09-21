package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * xwbtestpre
 *
 * @author auto create
 * @since 1.0, 2017-08-07 15:35:09
 */
public class AlipayOpenAppXwbtestpreCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3785561765946397772L;

	/**
	 * 1
	 */
	@ApiField("sd")
	private String sd;

	/**
	 * 1
	 */
	@ApiField("xwb")
	private String xwb;

	public String getSd() {
		return this.sd;
	}
	public void setSd(String sd) {
		this.sd = sd;
	}

	public String getXwb() {
		return this.xwb;
	}
	public void setXwb(String xwb) {
		this.xwb = xwb;
	}

}
