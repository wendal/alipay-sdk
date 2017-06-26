package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保订单出单确认
 *
 * @author auto create
 * @since 1.0, 2017-04-18 11:34:53
 */
public class AlipayInsSceneApplicationIssueConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4379824752963562492L;

	/**
	 * 投保订单号
	 */
	@ApiField("application_no")
	private String applicationNo;

	public String getApplicationNo() {
		return this.applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

}
