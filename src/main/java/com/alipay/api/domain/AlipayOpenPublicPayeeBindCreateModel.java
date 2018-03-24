package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加收款账号接口
 *
 * @author auto create
 * @since 1.0, 2018-02-07 20:37:28
 */
public class AlipayOpenPublicPayeeBindCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1858591829632322253L;

	/**
	 * 收款账号，需要绑定的收款支付宝账号
	 */
	@ApiField("login_id")
	private String loginId;

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

}
