package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.label.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-27 17:50:46
 */
public class AlipayOpenPublicLifeLabelCreateResponse extends AlipayResponse {

<<<<<<< HEAD
	private static final long serialVersionUID = 4815848872519662629L;
=======
	private static final long serialVersionUID = 2639159929669422489L;
>>>>>>> master

	/** 
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}
	public String getLabelId( ) {
		return this.labelId;
	}

}
