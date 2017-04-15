package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.cash.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-02-23 23:08:11
 */
public class AlipayMarketingCampaignCashCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3689795675632733185L;

	/** 
	 * 生成的现金红包活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	/** 
	 * 原始活动号,商户排查问题时提供的活动依据
	 */
	@ApiField("origin_crowd_no")
	private String originCrowdNo;

	/** 
	 * 活动创建后的付款链接,返回的是urlencode编码后的字符串。需要进行支付宝登录，在浏览器中打开后进行付款。建议给最终给商户提供的链接为:https://auth.alipay.com/login/index.htm?goto=[pay_url],这将引导商户先登录后再进行付款。
	 */
	@ApiField("pay_url")
	private String payUrl;

	public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}
	public String getCrowdNo( ) {
		return this.crowdNo;
	}

	public void setOriginCrowdNo(String originCrowdNo) {
		this.originCrowdNo = originCrowdNo;
	}
	public String getOriginCrowdNo( ) {
		return this.originCrowdNo;
	}

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}
	public String getPayUrl( ) {
		return this.payUrl;
	}

}
