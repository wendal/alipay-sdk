package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑目前的系统在淘宝域（后续要迁移），佣金管理服务在支付宝域，需要通过openapi进行调用
 *
 * @author auto create
 * @since 1.0, 2015-11-24 16:04:51
 */
public class AlipayOfflineMarketExpensePostModel extends AlipayObject {

	private static final long serialVersionUID = 8353746153569973533L;

	/**
	 * 操作方法
	 */
	@ApiField("action")
	private String action;

	/**
	 * 操作请求参数，JSON格式
	 */
	@ApiField("request")
	private String request;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getRequest() {
		return this.request;
	}
	public void setRequest(String request) {
		this.request = request;
	}

}
