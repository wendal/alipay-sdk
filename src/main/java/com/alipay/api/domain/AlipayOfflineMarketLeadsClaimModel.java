package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公海认领leads
 *
 * @author auto create
 * @since 1.0, 2017-02-07 16:46:42
 */
public class AlipayOfflineMarketLeadsClaimModel extends AlipayObject {

	private static final long serialVersionUID = 2514359573281488281L;

	/**
	 * leadsId
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 当前用户id
	 */
	@ApiField("op_id")
	private String opId;

	/**
	 * 异步结果通知，以及后续该流水状态变更同孩子
	 */
	@ApiField("operate_notify_url")
	private String operateNotifyUrl;

	/**
	 * 外部流水号
	 */
	@ApiField("request_id")
	private String requestId;

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	public String getOpId() {
		return this.opId;
	}
	public void setOpId(String opId) {
		this.opId = opId;
	}

	public String getOperateNotifyUrl() {
		return this.operateNotifyUrl;
	}
	public void setOperateNotifyUrl(String operateNotifyUrl) {
		this.operateNotifyUrl = operateNotifyUrl;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
