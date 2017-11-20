package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 点餐菜品推荐
 *
 * @author auto create
 * @since 1.0, 2017-10-23 20:06:40
 */
public class KoubeiCateringDishRecommendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8768163938275412778L;

	/**
	 * 用户已点的主菜品ID，传入时作为推荐菜品参考
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 点餐门店所属的商家PID
	 */
	@ApiField("merchent_pid")
	private String merchentPid;

	/**
	 * 点餐的门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getMerchentPid() {
		return this.merchentPid;
	}
	public void setMerchentPid(String merchentPid) {
		this.merchentPid = merchentPid;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
