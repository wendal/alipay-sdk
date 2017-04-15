package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商openApi操作私海leads释放
 *
 * @author auto create
 * @since 1.0, 2017-02-07 16:46:47
 */
public class AlipayOfflineMarketLeadsReleaseModel extends AlipayObject {

	private static final long serialVersionUID = 8777238447759261876L;

	/**
	 * leads主键
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 当前操作id
	 */
	@ApiField("op_id")
	private String opId;

	/**
	 * 异步结果通知
	 */
	@ApiField("operate_notify_url")
	private String operateNotifyUrl;

	/**
	 * 释放原因
	 */
	@ApiField("release_reason")
	private String releaseReason;

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

	public String getReleaseReason() {
		return this.releaseReason;
	}
	public void setReleaseReason(String releaseReason) {
		this.releaseReason = releaseReason;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
