package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.antifraud.risk.list response.
 * 
 * @author auto create
 * @since 1.0, 2017-10-13 14:18:41
 */
public class ZhimaCreditAntifraudRiskListResponse extends AlipayResponse {

	private static final long serialVersionUID = 6644885351699799367L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 是否命中风险编码，yes标识命中，no标识未命中
	 */
	@ApiField("hit_risk")
	private String hitRisk;

	/** 
	 * 命中风险项的RiskCode列表，对应的描述见产品文档
	 */
	@ApiListField("risk_code")
	@ApiField("string")
	private List<String> riskCode;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setHitRisk(String hitRisk) {
		this.hitRisk = hitRisk;
	}
	public String getHitRisk( ) {
		return this.hitRisk;
	}

	public void setRiskCode(List<String> riskCode) {
		this.riskCode = riskCode;
	}
	public List<String> getRiskCode( ) {
		return this.riskCode;
	}

}
