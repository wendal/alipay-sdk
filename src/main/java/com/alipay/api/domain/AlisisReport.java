package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报表概述信息
 *
 * @author auto create
 * @since 1.0, 2016-10-28 10:26:26
 */
public class AlisisReport extends AlipayObject {

	private static final long serialVersionUID = 3311525783437384353L;

	/**
	 * 报表描述
	 */
	@ApiField("report_desc")
	private String reportDesc;

	/**
	 * 报表名称
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 报表唯一标识
	 */
	@ApiField("report_uk")
	private String reportUk;

	public String getReportDesc() {
		return this.reportDesc;
	}
	public void setReportDesc(String reportDesc) {
		this.reportDesc = reportDesc;
	}

	public String getReportName() {
		return this.reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getReportUk() {
		return this.reportUk;
	}
	public void setReportUk(String reportUk) {
		this.reportUk = reportUk;
	}

}
