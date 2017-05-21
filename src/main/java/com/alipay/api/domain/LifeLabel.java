package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询标签数据
 *
 * @author auto create
 * @since 1.0, 2017-04-27 10:54:31
 */
public class LifeLabel extends AlipayObject {

	private static final long serialVersionUID = 1149281729183258561L;

	/**
	 * 标签值类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 标签id
	 */
	@ApiField("label_id")
	private Long labelId;

	/**
	 * 标签名
	 */
	@ApiField("label_name")
	private String labelName;

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Long getLabelId() {
		return this.labelId;
	}
	public void setLabelId(Long labelId) {
		this.labelId = labelId;
	}

	public String getLabelName() {
		return this.labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

}
