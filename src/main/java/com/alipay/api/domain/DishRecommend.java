package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐菜
 *
 * @author auto create
 * @since 1.0, 2017-09-01 16:50:22
 */
public class DishRecommend extends AlipayObject {

	private static final long serialVersionUID = 8189526855538274986L;

	/**
	 * 购买可能性/商品热度得分
	 */
	@ApiField("buy_posibility")
	private String buyPosibility;

	/**
	 * 菜品ID
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 菜品名称
	 */
	@ApiField("dish_name")
	private String dishName;

	public String getBuyPosibility() {
		return this.buyPosibility;
	}
	public void setBuyPosibility(String buyPosibility) {
		this.buyPosibility = buyPosibility;
	}

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return this.dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

}
