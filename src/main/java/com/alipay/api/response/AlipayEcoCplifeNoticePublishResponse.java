package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.notice.publish response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-02 18:17:16
 */
public class AlipayEcoCplifeNoticePublishResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 4112442651899197966L;
=======
	private static final long serialVersionUID = 6731533925767273331L;
>>>>>>> master

	/** 
	 * 支付宝平台统一生产的通知公告唯一ID标示.
	 */
	@ApiField("notice_id")
	private String noticeId;

	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeId( ) {
		return this.noticeId;
	}

}
