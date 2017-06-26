package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签删除接口
 *
 * @author auto create
 * @since 1.0, 2017-06-01 11:25:48
 */
public class AlipayOpenPublicLifeLabelDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4362449425955318445L;

	/**
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

	public String getLabelId() {
		return this.labelId;
	}
	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

}
