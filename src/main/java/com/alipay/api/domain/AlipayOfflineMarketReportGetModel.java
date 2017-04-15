package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取店铺信息
 *
 * @author auto create
 * @since 1.0, 2015-12-17 10:04:22
 */
public class AlipayOfflineMarketReportGetModel extends AlipayObject {

	private static final long serialVersionUID = 5454852727828291768L;

	/**
	 * 操作人PID
	 */
	@ApiField("ope_pid")
	private String opePid;

	/**
	 * 全局唯一的流水号
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getOpePid() {
		return this.opePid;
	}
	public void setOpePid(String opePid) {
		this.opePid = opePid;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
