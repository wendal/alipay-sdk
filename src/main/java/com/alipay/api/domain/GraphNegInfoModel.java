package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云图负面信息模型
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class GraphNegInfoModel extends AlipayObject {

	private static final long serialVersionUID = 2437631469821153121L;

	/**
	 * 案号
	 */
	@ApiField("case_code")
	private String caseCode;

	/**
	 * 法律生效文书确定的义务
	 */
	@ApiField("duty")
	private String duty;

	/**
	 * 失信被执行人姓名/机构名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 被执行人的履行情况
	 */
	@ApiField("performance")
	private String performance;

	/**
	 * 立案时间
	 */
	@ApiField("reg_date")
	private String regDate;

	public String getCaseCode() {
		return this.caseCode;
	}
	public void setCaseCode(String caseCode) {
		this.caseCode = caseCode;
	}

	public String getDuty() {
		return this.duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPerformance() {
		return this.performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}

	public String getRegDate() {
		return this.regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

}
