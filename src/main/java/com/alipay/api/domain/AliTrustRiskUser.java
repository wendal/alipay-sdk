package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿里信用所提供的风险名单对象
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class AliTrustRiskUser extends AlipayObject {

	private static final long serialVersionUID = 8342536345867987296L;

	/**
	 * 如果在风险名单中,记录被列入风险名单的日期;否则为空
	 */
	@ApiField("date")
	private String date;

	/**
	 * 如果在风险名单中,记录被列入风险名单的原因;否则为空
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 是否在风险名单库中的标识
	 */
	@ApiField("risk")
	private Boolean risk;

	/**
	 * 值始终为"阿里小贷"
	 */
	@ApiField("source")
	private String source;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public Boolean getRisk() {
		return this.risk;
	}
	public void setRisk(Boolean risk) {
		this.risk = risk;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
