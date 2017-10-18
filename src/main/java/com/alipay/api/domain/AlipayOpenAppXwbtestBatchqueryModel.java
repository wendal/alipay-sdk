package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * xwbtest单纯测试
 *
 * @author auto create
 * @since 1.0, 2017-08-25 13:03:36
 */
public class AlipayOpenAppXwbtestBatchqueryModel extends AlipayObject {

<<<<<<< HEAD
	private static final long serialVersionUID = 1679666375534516191L;
=======
	private static final long serialVersionUID = 8595479511728993724L;
>>>>>>> master

	/**
	 * 1
	 */
	@ApiField("xwb")
	private String xwb;

	public String getXwb() {
		return this.xwb;
	}
	public void setXwb(String xwb) {
		this.xwb = xwb;
	}

}
