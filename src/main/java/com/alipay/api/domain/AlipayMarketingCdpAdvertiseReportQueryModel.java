package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告效果分析接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:17
 */
public class AlipayMarketingCdpAdvertiseReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1719787911459555249L;

	/**
	 * 广告Id，唯一标识一条广告
	 */
	@ApiField("ad_id")
	private String adId;

	public String getAdId() {
		return this.adId;
	}
	public void setAdId(String adId) {
		this.adId = adId;
	}

}
