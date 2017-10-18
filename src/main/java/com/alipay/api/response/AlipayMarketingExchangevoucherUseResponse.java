package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.exchangevoucher.use response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-19 11:26:47
 */
public class AlipayMarketingExchangevoucherUseResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 3859843412166753518L;
=======
	private static final long serialVersionUID = 6535516791232871415L;
>>>>>>> master

	/** 
	 * 被核销的券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
