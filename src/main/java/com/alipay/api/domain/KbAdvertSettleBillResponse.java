package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统账单查询结果(结算账单)
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:34:04
 */
public class KbAdvertSettleBillResponse extends AlipayObject {

	private static final long serialVersionUID = 3369938461995351881L;

	/**
	 * 账单下载地址(为空表示查无账单)
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * 结算账单打款日期(为空表示未打款)
	 */
	@ApiField("paid_date")
	private String paidDate;

	public String getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getPaidDate() {
		return this.paidDate;
	}
	public void setPaidDate(String paidDate) {
		this.paidDate = paidDate;
	}

}
