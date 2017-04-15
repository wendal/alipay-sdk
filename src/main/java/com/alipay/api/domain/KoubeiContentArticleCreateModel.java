package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 达人说文章创建
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:11
 */
public class KoubeiContentArticleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7494162229536444785L;

	/**
	 * 作者简介
	 */
	@ApiField("author_intro")
	private String authorIntro;

	/**
	 * 作者
	 */
	@ApiField("author_name")
	private String authorName;

	/**
	 * 封面
	 */
	@ApiField("cover")
	private ArticlePicture cover;

	/**
	 * 文章简介长度不能大于500，已描述为准
	 */
	@ApiField("introduction")
	private String introduction;

	/**
	 * 正文段落，所有段落总字数不能少于300字，整个正文必须至少一张图片
	 */
	@ApiListField("paragraph_list")
	@ApiField("article_paragraph")
	private List<ArticleParagraph> paragraphList;

	/**
	 * 内容提供的机构
	 */
	@ApiField("provider")
	private String provider;

	/**
	 * 店铺地址
	 */
	@ApiField("shop_address")
	private String shopAddress;

	/**
	 * 店铺图片适用的门店列表，目前仅支持1个店铺，可通过接口alipay.offline.market.shop.summary.batchquery来获取商户下的门店列表，请求参数query_type需要设置为CONTENT_RELATION
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * 店铺名
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 文章标题
	 */
	@ApiField("title")
	private String title;

	public String getAuthorIntro() {
		return this.authorIntro;
	}
	public void setAuthorIntro(String authorIntro) {
		this.authorIntro = authorIntro;
	}

	public String getAuthorName() {
		return this.authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public ArticlePicture getCover() {
		return this.cover;
	}
	public void setCover(ArticlePicture cover) {
		this.cover = cover;
	}

	public String getIntroduction() {
		return this.introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public List<ArticleParagraph> getParagraphList() {
		return this.paragraphList;
	}
	public void setParagraphList(List<ArticleParagraph> paragraphList) {
		this.paragraphList = paragraphList;
	}

	public String getProvider() {
		return this.provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getShopAddress() {
		return this.shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
