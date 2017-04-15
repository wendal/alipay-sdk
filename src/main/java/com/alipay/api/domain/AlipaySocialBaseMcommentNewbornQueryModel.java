package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新生查询接口
 *
 * @author auto create
 * @since 1.0, 2016-09-08 17:37:49
 */
public class AlipaySocialBaseMcommentNewbornQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4454321852366633362L;

	/**
	 * 支付宝userId
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
