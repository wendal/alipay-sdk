package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单查询接口
 *
 * @author auto create
 * @since 1.0, 2017-03-15 17:51:59
 */
public class AlipayEcoMycarMaintainBizorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8742678669351468375L;

	/**
	 * 车主平台生成的订单号。
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
