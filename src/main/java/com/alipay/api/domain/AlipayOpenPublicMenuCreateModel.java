package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建菜单
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:14
 */
public class AlipayOpenPublicMenuCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5147572775576451488L;

	/**
	 * 一级菜单数组，个数应为1~4个
	 */
	@ApiListField("button")
	@ApiField("button_object")
	private List<ButtonObject> button;

	public List<ButtonObject> getButton() {
		return this.button;
	}
	public void setButton(List<ButtonObject> button) {
		this.button = button;
	}

}
