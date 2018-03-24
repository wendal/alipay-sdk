package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除收款账号接口
 *
 * @author auto create
 * @since 1.0, 2018-02-06 16:03:27
 */
public class AlipayOpenPublicPayeeBindDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3869743675366159587L;

	/**
	 * 收款账号，需要解除绑定的收款支付宝账号
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
