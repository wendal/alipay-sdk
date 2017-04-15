package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 环境图删除接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:11
 */
public class KoubeiShopPicDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7514196457328355662L;

	/**
	 * 店铺图片id
	 */
	@ApiField("shop_pic_id")
	private String shopPicId;

	public String getShopPicId() {
		return this.shopPicId;
	}
	public void setShopPicId(String shopPicId) {
		this.shopPicId = shopPicId;
	}

}
