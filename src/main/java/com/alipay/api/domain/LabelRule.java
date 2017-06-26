package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个性化扩展区标签规则
 *
 * @author auto create
 * @since 1.0, 2017-06-14 11:09:17
 */
public class LabelRule extends AlipayObject {

	private static final long serialVersionUID = 1313287736725311829L;

	/**
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

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

	public String getLabelValue() {
		return this.labelValue;
	}
	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
	}

}
