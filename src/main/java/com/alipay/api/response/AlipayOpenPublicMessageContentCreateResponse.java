package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.message.content.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-01-19 12:14:49
 */
public class AlipayOpenPublicMessageContentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7346119635617591863L;

	/** 
	 * 内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/** 
	 * 内容详情内链url
	 */
	@ApiField("content_url")
	private String contentUrl;

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentId( ) {
		return this.contentId;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}
	public String getContentUrl( ) {
		return this.contentUrl;
	}

}
