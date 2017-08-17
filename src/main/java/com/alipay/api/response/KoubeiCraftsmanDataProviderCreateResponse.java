package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.craftsman.data.provider.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-01-13 16:26:55
 */
public class KoubeiCraftsmanDataProviderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1499132248378279334L;

	/** 
	 * 手艺人id
	 */
	@ApiField("craftsman_id")
	private String craftsmanId;

	public void setCraftsmanId(String craftsmanId) {
		this.craftsmanId = craftsmanId;
	}
	public String getCraftsmanId( ) {
		return this.craftsmanId;
	}

}
