package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保订单出单确认
 *
 * @author auto create
 * @since 1.0, 2017-09-28 17:19:31
 */
public class AlipayInsSceneApplicationIssueConfirmModel extends AlipayObject {

<<<<<<< HEAD
	private static final long serialVersionUID = 4887882643831891258L;
=======
	private static final long serialVersionUID = 2286693716989754469L;
>>>>>>> master

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
