package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑客分佣账单查询接口
 *
 * @author auto create
 * @since 1.0, 2017-04-17 10:53:54
 */
public class KoubeiAdvertCommissionBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6448251953863243814L;

	/**
	 * 账期(格式为yyyyMM)
	 */
	@ApiField("date")
	private String date;

	/**
	 * 账单类型
deal-交易账单
settle-结算账单
	 */
	@ApiField("type")
	private String type;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
