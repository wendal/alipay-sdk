package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店id查桌码信息列表
 *
 * @author auto create
 * @since 1.0, 2017-06-26 14:14:11
 */
public class KoubeiCateringTablelistQueryModel extends AlipayObject {

<<<<<<< HEAD
	private static final long serialVersionUID = 8898743156924598612L;
=======
	private static final long serialVersionUID = 1667252139667437762L;
>>>>>>> master

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
