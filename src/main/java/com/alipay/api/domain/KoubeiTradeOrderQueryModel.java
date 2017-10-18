package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑订单详情
 *
 * @author auto create
<<<<<<< HEAD
 * @since 1.0, 2017-09-22 14:49:14
 */
public class KoubeiTradeOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5743392624466954242L;
=======
 * @since 1.0, 2017-08-25 13:05:36
 */
public class KoubeiTradeOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5799322323181649419L;
>>>>>>> master

	/**
	 * 口碑订单号
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
