package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * xwbtest单纯测试
 *
 * @author auto create
 * @since 1.0, 2017-10-12 20:28:12
 */
public class AlipayOpenAppXwbtestBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5862623411797123653L;

	/**
	 * 1sd
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
