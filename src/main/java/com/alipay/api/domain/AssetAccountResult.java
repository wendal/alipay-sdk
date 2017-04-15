package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户绑定
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class AssetAccountResult extends AlipayObject {

	private static final long serialVersionUID = 2249535454445345897L;

	/**
	 * 用户的支付宝账号对应的支付宝唯一用户标识，不可变更。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 账户绑定关系唯一标识
	 */
	@ApiField("consumer_id")
	private String consumerId;

	/**
	 * 使用该app提供用户信息的商户，可以和app相同。
	 */
	@ApiField("provider_id")
	private String providerId;

	/**
	 * 用户在商户网站的会员标识。商户需确保其唯一性，不可变更。
	 */
	@ApiField("provider_user_id")
	private String providerUserId;

	/**
	 * 用户在商户网站的会员名（登录号或昵称）。
	 */
	@ApiField("provider_user_name")
	private String providerUserName;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getConsumerId() {
		return this.consumerId;
	}
	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}

	public String getProviderId() {
		return this.providerId;
	}
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getProviderUserId() {
		return this.providerUserId;
	}
	public void setProviderUserId(String providerUserId) {
		this.providerUserId = providerUserId;
	}

	public String getProviderUserName() {
		return this.providerUserName;
	}
	public void setProviderUserName(String providerUserName) {
		this.providerUserName = providerUserName;
	}

}
