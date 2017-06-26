package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询标签数据
 *
 * @author auto create
 * @since 1.0, 2017-06-14 11:09:13
 */
public class LifeLabel extends AlipayObject {

	private static final long serialVersionUID = 4315765772869294638L;

	/**
	 * 标签类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 标签值类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 标签英文代码
	 */
	@ApiField("label_code")
	private String labelCode;

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
	 * 操作符代码
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 文本与取值的映射关系
	 */
	@ApiListField("options")
	@ApiField("option")
	private List<Option> options;

	/**
	 * 标签类型，目前分为common（通用标签）、custom（生活号自定义标签）、cloud（云实验室标签）
	 */
	@ApiField("type")
	private String type;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getLabelCode() {
		return this.labelCode;
	}
	public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}

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

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public List<Option> getOptions() {
		return this.options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
