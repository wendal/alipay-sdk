package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品删除接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:11
 */
public class KoubeiShopDishDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5434219998238575288L;

	/**
	 * 菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

}
