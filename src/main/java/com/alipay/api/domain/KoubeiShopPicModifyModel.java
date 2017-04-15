package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 环境图修改接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:11
 */
public class KoubeiShopPicModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2863557449954489537L;

	/**
	 * 环境图名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 适用的门店列表
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * 店铺图片id
	 */
	@ApiField("shop_pic_id")
	private String shopPicId;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

	public String getShopPicId() {
		return this.shopPicId;
	}
	public void setShopPicId(String shopPicId) {
		this.shopPicId = shopPicId;
	}

}
