package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zdatafront.datatransfered.send response.
 * 
 * @author auto create
 * @since 1.0, 2017-05-18 11:27:33
 */
public class AlipayZdatafrontDatatransferedSendResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 7325555148326421857L;
=======
	private static final long serialVersionUID = 8156554212625594897L;
>>>>>>> master

	/** 
	 * 表示数据传输是否成功
	 */
	@ApiField("success")
	private String success;

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
