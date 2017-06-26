package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询个性化扩展区标签规则
 *
 * @author auto create
 * @since 1.0, 2017-06-14 11:09:10
 */
public class QueryLabelRule extends AlipayObject {

	private static final long serialVersionUID = 3671253632174116234L;

	/**
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 标签名
	 */
	@ApiField("label_name")
	private String labelName;

	/**
	 * 标签值，当有多个取值时用英文","分隔，不允许传入下划线"_"、竖线"|"或者空格" "，多个取值时，用户符合其中一个值即可命中该套扩展区
	 */
	@ApiField("label_value")
	private String labelValue;

	public String getLabelId() {
		return this.labelId;
	}
	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public String getLabelName() {
		return this.labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getLabelValue() {
		return this.labelValue;
	}
	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
	}

}
