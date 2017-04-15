package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费账单详情
 *
 * @author auto create
 * @since 1.0, 2016-12-28 17:54:37
 */
public class ChargeItems extends AlipayObject {

	private static final long serialVersionUID = 2223322884468619514L;

	/**
	 * 缴费项名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 缴费项金额
	 */
	@ApiField("item_price")
	private String itemPrice;

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

}
