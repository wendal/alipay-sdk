package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.smartactivity.forecast response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-15 17:09:47
 */
public class KoubeiMarketingDataSmartactivityForecastResponse extends AlipayResponse {

	private static final long serialVersionUID = 7769532186198344933L;

	/** 
	 * 提升复购率区间上限
	 */
	@ApiField("repay_rate_range_max")
	private String repayRateRangeMax;

	/** 
	 * 提升复购率区间下限
	 */
	@ApiField("repay_rate_range_min")
	private String repayRateRangeMin;

	/** 
	 * 活动收益金额(分)区间上限值
	 */
	@ApiField("trade_amt_range_max")
	private String tradeAmtRangeMax;

	/** 
	 * 活动收益金额(分)区间下限值
	 */
	@ApiField("trade_amt_range_min")
	private String tradeAmtRangeMin;

	/** 
	 * 核销数量区间上限
	 */
	@ApiField("verify_count_range_max")
	private String verifyCountRangeMax;

	/** 
	 * 核销数量区间下限
	 */
	@ApiField("verify_count_range_min")
	private String verifyCountRangeMin;

	public void setRepayRateRangeMax(String repayRateRangeMax) {
		this.repayRateRangeMax = repayRateRangeMax;
	}
	public String getRepayRateRangeMax( ) {
		return this.repayRateRangeMax;
	}

	public void setRepayRateRangeMin(String repayRateRangeMin) {
		this.repayRateRangeMin = repayRateRangeMin;
	}
	public String getRepayRateRangeMin( ) {
		return this.repayRateRangeMin;
	}

	public void setTradeAmtRangeMax(String tradeAmtRangeMax) {
		this.tradeAmtRangeMax = tradeAmtRangeMax;
	}
	public String getTradeAmtRangeMax( ) {
		return this.tradeAmtRangeMax;
	}

	public void setTradeAmtRangeMin(String tradeAmtRangeMin) {
		this.tradeAmtRangeMin = tradeAmtRangeMin;
	}
	public String getTradeAmtRangeMin( ) {
		return this.tradeAmtRangeMin;
	}

	public void setVerifyCountRangeMax(String verifyCountRangeMax) {
		this.verifyCountRangeMax = verifyCountRangeMax;
	}
	public String getVerifyCountRangeMax( ) {
		return this.verifyCountRangeMax;
	}

	public void setVerifyCountRangeMin(String verifyCountRangeMin) {
		this.verifyCountRangeMin = verifyCountRangeMin;
	}
	public String getVerifyCountRangeMin( ) {
		return this.verifyCountRangeMin;
	}

}
