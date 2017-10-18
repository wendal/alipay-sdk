package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.activity.bill.download response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-29 15:08:57
 */
public class KoubeiMarketingDataActivityBillDownloadResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 8167221387868327455L;
=======
	private static final long serialVersionUID = 1596252924618324816L;
>>>>>>> master

	/** 
	 * 账单下载地址
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
