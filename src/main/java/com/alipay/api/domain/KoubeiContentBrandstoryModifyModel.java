package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 品牌故事更新接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:11
 */
public class KoubeiContentBrandstoryModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5659973855387354185L;

	/**
	 * 品牌故事id
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 修改的时候不传就代表删除
	 */
	@ApiField("cover")
	private Picture cover;

	/**
	 * 正文必填  段落不能为空, 最多5段   每段最多3张图片 每个段落文字最多500字
	 */
	@ApiListField("paragraph_list")
	@ApiField("paragraph")
	private List<Paragraph> paragraphList;

	/**
	 * 店铺图片适用的门店列表，最多支持500，可通过接口alipay.offline.market.shop.summary.batchquery来获取商户下的门店列表，请求参数query_type需要设置为CONTENT_RELATION
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * 标题，最多25个字
	 */
	@ApiField("title")
	private String title;

	/**
	 * 视频
	 */
	@ApiField("video")
	private Video video;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public Picture getCover() {
		return this.cover;
	}
	public void setCover(Picture cover) {
		this.cover = cover;
	}

	public List<Paragraph> getParagraphList() {
		return this.paragraphList;
	}
	public void setParagraphList(List<Paragraph> paragraphList) {
		this.paragraphList = paragraphList;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Video getVideo() {
		return this.video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}

}
