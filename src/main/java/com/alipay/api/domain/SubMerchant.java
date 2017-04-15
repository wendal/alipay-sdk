package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二级商户信息
 *
 * @author auto create
 * @since 1.0, 2017-04-10 14:29:41
 */
public class SubMerchant extends AlipayObject {

	private static final long serialVersionUID = 4324781945841731149L;

	/**
	 * 二级商户的支付宝id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
