package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个性化扩展区标签规则
 *
 * @author auto create
 * @since 1.0, 2017-07-14 11:47:35
 */
public class LabelRule extends AlipayObject {

	private static final long serialVersionUID = 3382627969686837221L;

	/**
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 标签值，当有多个取值时用英文","分隔，不允许传入下划线"_"、竖线"|"或者空格" "和方括号"["、"]"
	 */
	@ApiField("label_value")
	private String labelValue;

	/**
	 * 目前支持EQ（等于）、BETWEEN（范围）、IN（包含）三种操作符；每个标签支持的运算符可以通过查询接口获得。该字段允许为空，默认运算符为IN
	 */
	@ApiField("operator")
	private String operator;

	public String getLabelId() {
		return this.labelId;
	}
	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public String getLabelValue() {
		return this.labelValue;
	}
	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
