package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚁盾内容识别
 *
 * @author auto create
 * @since 1.0, 2017-07-27 14:07:09
 */
public class SsdataDataserviceRiskContentVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 6164118115934189341L;

	/**
	 * 需要识别的文本
	 */
	@ApiField("content")
	private String content;

	/**
	 * 风险类型，0-垃圾广告，1-暴恐政， 2-涉黄， 3-涉毒，4-涉赌
	 */
	@ApiField("risk_type")
	private String riskType;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getRiskType() {
		return this.riskType;
	}
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

}
