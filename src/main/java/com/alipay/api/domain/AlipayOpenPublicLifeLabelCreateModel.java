package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建标签接口
 *
 * @author auto create
 * @since 1.0, 2017-06-01 11:26:34
 */
public class AlipayOpenPublicLifeLabelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6374361831216815641L;

	/**
	 * 标签值类型，支持的值有string，不传默认为"string"
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 自定义标签名
	 */
	@ApiField("label_name")
	private String labelName;

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getLabelName() {
		return this.labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

}
