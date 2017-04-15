package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 错误上报的特征字段
 *
 * @author auto create
 * @since 1.0, 2017-03-24 18:26:38
 */
public class ReportErrorFeature extends AlipayObject {

	private static final long serialVersionUID = 8267273465662221895L;

	/**
	 * 桌号
	 */
	@ApiField("table_num")
	private String tableNum;

	public String getTableNum() {
		return this.tableNum;
	}
	public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}

}
