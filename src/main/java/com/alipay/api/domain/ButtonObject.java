package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜单对象模型
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:41
 */
public class ButtonObject extends AlipayObject {

	private static final long serialVersionUID = 5688543572835981895L;

	/**
	 * 当actionType为link时，该参数为详细链接；
当actionType为out时，该参数为用户自定义参数；
当actionType为tel时，该参数为电话号码。
该参数最长255个字符，不允许冒号等特殊字符
	 */
	@ApiField("action_param")
	private String actionParam;

	/**
	 * 菜单类型：
out——事件型菜单；
link——链接型菜单；
tel——点击拨打电话
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 菜单标题，一级菜单不超过4个汉字，子菜单不超过12个汉字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 二级菜单数组，个数应为1~5个
	 */
	@ApiListField("sub_button")
	@ApiField("sub_button")
	private List<SubButton> subButton;

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

	public List<SubButton> getSubButton() {
		return this.subButton;
	}
	public void setSubButton(List<SubButton> subButton) {
		this.subButton = subButton;
	}

}
