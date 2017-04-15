package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分期对象的元数据信息
 *
 * @author auto create
 * @since 1.0, 2017-03-10 17:05:09
 */
public class InstallmentMetaInfo extends AlipayObject {

	private static final long serialVersionUID = 5327927747878254379L;

	/**
	 * 结束期数，包含此值
	 */
	@ApiField("end_term")
	private Long endTerm;

	/**
	 * 开始期数，包含此值
	 */
	@ApiField("start_term")
	private Long startTerm;

	/**
	 * 数值
	 */
	@ApiField("value")
	private String value;

	public Long getEndTerm() {
		return this.endTerm;
	}
	public void setEndTerm(Long endTerm) {
		this.endTerm = endTerm;
	}

	public Long getStartTerm() {
		return this.startTerm;
	}
	public void setStartTerm(Long startTerm) {
		this.startTerm = startTerm;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
