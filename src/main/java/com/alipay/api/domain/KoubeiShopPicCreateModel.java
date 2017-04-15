package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 环境图创建接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:11
 */
public class KoubeiShopPicCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3516133314149596542L;

	/**
	 * 环境图名称，不能超过12个字，同一个商户下环境图的名称不允许重复
	 */
	@ApiField("name")
	private String name;

	/**
	 * 图片列表，这里的图片类型仅支持ENVIRONMENT，目前只允许传一张图片
	 */
	@ApiListField("pictures")
	@ApiField("content_picture")
	private List<ContentPicture> pictures;

	/**
	 * 店铺图片适用的门店列表，最多支持500，可通过接口alipay.offline.market.shop.summary.batchquery来获取商户下的门店列表，请求参数query_type需要设置为CONTENT_RELATION
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<ContentPicture> getPictures() {
		return this.pictures;
	}
	public void setPictures(List<ContentPicture> pictures) {
		this.pictures = pictures;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

}
