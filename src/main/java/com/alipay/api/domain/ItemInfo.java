package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券的单品信息
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
public class ItemInfo extends AlipayObject {

	private static final long serialVersionUID = 5313343271159587274L;

	/**
	 * 券适用的单品码列表
最少配置1个单品码
最多配置500个单品码
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/**
	 * 单品图片列表
单品图片不能超过3张
	 */
	@ApiListField("item_imgs")
	@ApiField("string")
	private List<String> itemImgs;

	/**
	 * 单品券详细介绍跳转链接
	 */
	@ApiField("item_link")
	private String itemLink;

	/**
	 * 单品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 单品券说明
	 */
	@ApiField("item_text")
	private String itemText;

	/**
	 * 最高优惠商品件数
	 */
	@ApiField("max_discount_num")
	private String maxDiscountNum;

	/**
	 * 最低购买商品件数
	 */
	@ApiField("min_consume_num")
	private String minConsumeNum;

	/**
	 * 单品的原价，单位元
必须为合法金额类型字符串，如9.99
	 */
	@ApiField("original_price")
	private String originalPrice;

	public List<String> getItemIds() {
		return this.itemIds;
	}
	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

	public List<String> getItemImgs() {
		return this.itemImgs;
	}
	public void setItemImgs(List<String> itemImgs) {
		this.itemImgs = itemImgs;
	}

	public String getItemLink() {
		return this.itemLink;
	}
	public void setItemLink(String itemLink) {
		this.itemLink = itemLink;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemText() {
		return this.itemText;
	}
	public void setItemText(String itemText) {
		this.itemText = itemText;
	}

	public String getMaxDiscountNum() {
		return this.maxDiscountNum;
	}
	public void setMaxDiscountNum(String maxDiscountNum) {
		this.maxDiscountNum = maxDiscountNum;
	}

	public String getMinConsumeNum() {
		return this.minConsumeNum;
	}
	public void setMinConsumeNum(String minConsumeNum) {
		this.minConsumeNum = minConsumeNum;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

}
