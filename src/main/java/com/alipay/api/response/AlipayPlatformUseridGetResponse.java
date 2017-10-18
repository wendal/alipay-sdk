package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.platform.userid.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-29 19:56:03
 */
public class AlipayPlatformUseridGetResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 2485881157486376829L;
=======
	private static final long serialVersionUID = 4195424955353995718L;
>>>>>>> master

	/** 
	 * id字典，key为openId，value为userId
	 */
	@ApiField("dict")
	private String dict;

	public void setDict(String dict) {
		this.dict = dict;
	}
	public String getDict( ) {
		return this.dict;
	}

}
