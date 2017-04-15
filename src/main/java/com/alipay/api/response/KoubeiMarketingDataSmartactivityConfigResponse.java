package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.smartactivity.config response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-14 16:49:12
 */
public class KoubeiMarketingDataSmartactivityConfigResponse extends AlipayResponse {

	private static final long serialVersionUID = 5767753913196933494L;

	/** 
	 * 活动类型
CONSUME_SEND 消费送
DIRECT_SEND 直发奖
GUESS_SEND 口令送
	 */
	@ApiField("activity_type")
	private String activityType;

	/** 
	 * 活动有效天数
	 */
	@ApiField("activity_valid_days")
	private String activityValidDays;

	/** 
	 * 活动配置CODE
	 */
	@ApiField("config_code")
	private String configCode;

	/** 
	 * 活动人群对象，包含针对N天未消费的用户/所有用户
	 */
	@ApiField("crowd_group")
	private String crowdGroup;

	/** 
	 * 商品ID，只有在诊断码为SUPER_ITEM表示菜品营销时此字段才可能有值，多个值之间使用竖线|分隔
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 商品名称，只有在诊断码为SUPER_ITEM表示菜品营销时此字段才可能有值，多个值之间使用竖线|分隔
	 */
	@ApiField("item_name")
	private String itemName;

	/** 
	 * 奖品面额门槛（阶梯状），消费满不同的金额可以使用不同的券,单位：分
	 */
	@ApiField("min_consume")
	private String minConsume;

	/** 
	 * 领券门槛（阶梯状），消费满不同的金额发不同金额的券券
活动类型为消费送且不是消费送礼包时设置
多营销工具之间不允许设置重复值
单位：分
	 */
	@ApiField("min_cost")
	private String minCost;

	/** 
	 * 营销类型，只有在诊断码为SUPER_ITEM表示菜品营销时此字段才可能有值，多个值之间使用竖线|分隔
	 */
	@ApiField("pro_type")
	private String proType;

	/** 
	 * 目前支持以下类型：
EXCHANGE：兑换券
MONEY：代金券
REDUCETO：减至券
RATE：折扣券
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/** 
	 * 券有效天数
	 */
	@ApiField("voucher_valid_days")
	private String voucherValidDays;

	/** 
	 * 券面额，折扣券为折扣比例、立减为金额 单位：分
	 */
	@ApiField("worth_value")
	private String worthValue;

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
	public String getActivityType( ) {
		return this.activityType;
	}

	public void setActivityValidDays(String activityValidDays) {
		this.activityValidDays = activityValidDays;
	}
	public String getActivityValidDays( ) {
		return this.activityValidDays;
	}

	public void setConfigCode(String configCode) {
		this.configCode = configCode;
	}
	public String getConfigCode( ) {
		return this.configCode;
	}

	public void setCrowdGroup(String crowdGroup) {
		this.crowdGroup = crowdGroup;
	}
	public String getCrowdGroup( ) {
		return this.crowdGroup;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemName( ) {
		return this.itemName;
	}

	public void setMinConsume(String minConsume) {
		this.minConsume = minConsume;
	}
	public String getMinConsume( ) {
		return this.minConsume;
	}

	public void setMinCost(String minCost) {
		this.minCost = minCost;
	}
	public String getMinCost( ) {
		return this.minCost;
	}

	public void setProType(String proType) {
		this.proType = proType;
	}
	public String getProType( ) {
		return this.proType;
	}

	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}
	public String getVoucherType( ) {
		return this.voucherType;
	}

	public void setVoucherValidDays(String voucherValidDays) {
		this.voucherValidDays = voucherValidDays;
	}
	public String getVoucherValidDays( ) {
		return this.voucherValidDays;
	}

	public void setWorthValue(String worthValue) {
		this.worthValue = worthValue;
	}
	public String getWorthValue( ) {
		return this.worthValue;
	}

}
