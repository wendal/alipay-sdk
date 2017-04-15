package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.zminfo.pair.get response.
 * 
 * @author auto create
 * @since 1.0, 2015-02-06 13:09:24
 */
public class AlipayTrustUserZminfoPairGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7116652828525593212L;

	/** 
	 * 申请者芝麻信用信息JSON串
	 */
	@ApiField("apply_zm_info")
	private String applyZmInfo;

	/** 
	 * 信息失效时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/** 
	 * 被申请者芝麻信用信息JSON串
	 */
	@ApiField("owner_zm_info")
	private String ownerZmInfo;

	public void setApplyZmInfo(String applyZmInfo) {
		this.applyZmInfo = applyZmInfo;
	}
	public String getApplyZmInfo( ) {
		return this.applyZmInfo;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	public Date getExpireTime( ) {
		return this.expireTime;
	}

	public void setOwnerZmInfo(String ownerZmInfo) {
		this.ownerZmInfo = ownerZmInfo;
	}
	public String getOwnerZmInfo( ) {
		return this.ownerZmInfo;
	}

}
