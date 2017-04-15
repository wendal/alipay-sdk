package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-23 14:22:11
 */
public class AlipayMarketingCampaignDrawcampTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 7475617476893515814L;

	/** 
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 活动流水id
	 */
	@ApiField("camp_log_id")
	private String campLogId;

	/** 
	 * 拓展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 奖品唯一标识
	 */
	@ApiField("prize_flag")
	private String prizeFlag;

	/** 
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/** 
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/** 
	 * 是否中奖结果状态，如果为true时返回的结果中的其他字段非空，否则返回的其他字段为空
	 */
	@ApiField("trigger_result")
	private Boolean triggerResult;

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

	public void setCampLogId(String campLogId) {
		this.campLogId = campLogId;
	}
	public String getCampLogId( ) {
		return this.campLogId;
	}

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

	public void setPrizeFlag(String prizeFlag) {
		this.prizeFlag = prizeFlag;
	}
	public String getPrizeFlag( ) {
		return this.prizeFlag;
	}

	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}
	public String getPrizeId( ) {
		return this.prizeId;
	}

	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}
	public String getPrizeName( ) {
		return this.prizeName;
	}

	public void setTriggerResult(Boolean triggerResult) {
		this.triggerResult = triggerResult;
	}
	public Boolean getTriggerResult( ) {
		return this.triggerResult;
	}

}
