package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌故事下架接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:11
 */
public class KoubeiContentBrandstoryOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 8629295127768939142L;

	/**
	 * 需要下架的品牌故事id
	 */
	@ApiField("brand_story_id")
	private String brandStoryId;

	public String getBrandStoryId() {
		return this.brandStoryId;
	}
	public void setBrandStoryId(String brandStoryId) {
		this.brandStoryId = brandStoryId;
	}

}
