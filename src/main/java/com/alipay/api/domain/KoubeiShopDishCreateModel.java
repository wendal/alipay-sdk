package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜品创建接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:11
 */
public class KoubeiShopDishCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7171268277721889978L;

	/**
	 * 菜品描述，最多40个字
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 菜品名称，同一商户下菜品名称不允许重复，最多12个字
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 菜品图片，目前只支持传1个
	 */
	@ApiListField("pictures")
	@ApiField("picture")
	private List<Picture> pictures;

	/**
	 * 菜品价格 单位 元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 菜品标签列表，标签类型包括：菜属性、菜推荐，菜属性的值包括：重辣、中辣、微辣和清淡，菜推荐的值包括：热门HOT
	 */
	@ApiListField("tags")
	@ApiField("dish_tag")
	private List<DishTag> tags;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDishName() {
		return this.dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public List<Picture> getPictures() {
		return this.pictures;
	}
	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public List<DishTag> getTags() {
		return this.tags;
	}
	public void setTags(List<DishTag> tags) {
		this.tags = tags;
	}

}
