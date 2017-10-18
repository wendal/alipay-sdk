package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公众号标签管理-查询用户标签
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:14
 */
public class AlipayOpenPublicLabelUserQueryModel extends AlipayObject {

<<<<<<< HEAD
	private static final long serialVersionUID = 2885282629815446511L;
=======
	private static final long serialVersionUID = 6259365789516224894L;
>>>>>>> master

	/**
	 * 支付宝用户的userid，2088开头长度为16位的字符串
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
