package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流程任务
 *
 * @author auto create
 * @since 1.0, 2017-03-03 11:29:15
 */
public class BPOpenApiTask extends AlipayObject {

	private static final long serialVersionUID = 4264515457819988913L;

	/**
	 * 处理地址
	 */
	@ApiField("deal_url")
	private String dealUrl;

	/**
	 * 详情展示地址
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 审批节点中文显示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 审批节点code
	 */
	@ApiField("name")
	private String name;

	/**
	 * 可点击的操作
	 */
	@ApiField("operate_transition")
	private String operateTransition;

	/**
	 * 处理人域账号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 处理人花名
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 加签类型
	 */
	@ApiField("sign_type")
	private String signType;

	/**
	 * 状态:CREATED,TAKEN,TEMP_SAVE,COMPLETED,CANCELED
	 */
	@ApiField("state")
	private String state;

	/**
	 * 节点类型：UserTask，SystemTask
	 */
	@ApiField("type")
	private String type;

	public String getDealUrl() {
		return this.dealUrl;
	}
	public void setDealUrl(String dealUrl) {
		this.dealUrl = dealUrl;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOperateTransition() {
		return this.operateTransition;
	}
	public void setOperateTransition(String operateTransition) {
		this.operateTransition = operateTransition;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getSignType() {
		return this.signType;
	}
	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
