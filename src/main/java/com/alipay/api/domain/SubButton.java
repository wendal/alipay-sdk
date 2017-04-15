package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子菜单对象模型
 *
 * @author auto create
 * @since 1.0, 2016-08-10 17:27:04
 */
public class SubButton extends AlipayObject {

	private static final long serialVersionUID = 7511621593474882786L;

	/**
	 * 当actionType为link时，该参数为详细链接； 当actionType为out时，该参数为用户自定义参数； 当actionType为tel时，该参数为电话号码。 该参数最长255个字符，不允许冒号等特殊字符
	 */
	@ApiField("action_param")
	private String actionParam;

	/**
	 * 菜单类型： out——事件型菜单； link——链接型菜单； tel——点击拨打电话
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 菜单标题，一级菜单不超过4个汉字，子菜单不超过12个汉字
	 */
	@ApiField("name")
	private String name;

	public String getActionParam() {
		return this.actionParam;
	}
	public void setActionParam(String actionParam) {
		this.actionParam = actionParam;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
