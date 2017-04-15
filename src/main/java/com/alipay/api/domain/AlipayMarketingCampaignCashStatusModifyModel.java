package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更改现金活动状态
 *
 * @author auto create
 * @since 1.0, 2017-01-05 15:04:17
 */
public class AlipayMarketingCampaignCashStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8747524879558933966L;

	/**
	 * 修改后的活动状态, PAUSE或者READY
	 */
	@ApiField("camp_status")
	private String campStatus;

	/**
	 * 要修改的现金红包活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	public String getCampStatus() {
		return this.campStatus;
	}
	public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}

	public String getCrowdNo() {
		return this.crowdNo;
	}
	public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}

}
