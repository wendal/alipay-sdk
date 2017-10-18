package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐菜
 *
 * @author auto create
 * @since 1.0, 2017-08-25 16:00:11
 */
public class DishRecommend extends AlipayObject {

	private static final long serialVersionUID = 5866354492845872699L;

	/**
	 * 购买可能性/商品热度得分
	 */
	@ApiField("buy_posibility")
	private Long buyPosibility;

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

	public Long getBuyPosibility() {
		return this.buyPosibility;
	}
	public void setBuyPosibility(Long buyPosibility) {
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
