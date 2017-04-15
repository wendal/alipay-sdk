package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.certification.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-01-10 16:08:28
 */
public class ZhimaCustomerCertificationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4693115287315443417L;

	/** 
	 * 认证过程成认证过的各渠道的状态,中间材料等数据
	 */
	@ApiField("channel_statuses")
	private String channelStatuses;

	/** 
	 * 如果认证没有通过会显示失败原因,更详细的情况在channel_statuses参数里面
	 */
	@ApiField("failed_reason")
	private String failedReason;

	/** 
	 * 认证是否通过,通过为true,不通过为false
	 */
	@ApiField("passed")
	private String passed;

	public void setChannelStatuses(String channelStatuses) {
		this.channelStatuses = channelStatuses;
	}
	public String getChannelStatuses( ) {
		return this.channelStatuses;
	}

	public void setFailedReason(String failedReason) {
		this.failedReason = failedReason;
	}
	public String getFailedReason( ) {
		return this.failedReason;
	}

	public void setPassed(String passed) {
		this.passed = passed;
	}
	public String getPassed( ) {
		return this.passed;
	}

}
