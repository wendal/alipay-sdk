package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.craftsman.data.provider.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-10-11 20:36:24
 */
public class KoubeiCraftsmanDataProviderCreateResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 7867313869544488996L;
=======
	private static final long serialVersionUID = 7224124891226926371L;
>>>>>>> master

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
