package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.leads.qrcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-07-12 17:50:16
 */
public class AlipayOfflineMarketLeadsQrcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2695775418538895527L;

	/** 
	 * 开店二维码URL地址
	 */
	@ApiField("qr_code")
	private String qrCode;

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

}
