package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地推小二认领了Leads后申请创建开店二维码，提供给商户扫描开店。
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:16
 */
public class AlipayOfflineMarketLeadsQrcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6627341489978739949L;

	/**
	 * 支付宝leads ID，后续的增删改查接口都使用该ID作为主键
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 操作用户的支付账号id
	 */
	@ApiField("op_id")
	private String opId;

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	public String getOpId() {
		return this.opId;
	}
	public void setOpId(String opId) {
		this.opId = opId;
	}

}
