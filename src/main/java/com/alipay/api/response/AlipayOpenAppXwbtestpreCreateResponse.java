package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.xwbtestpre.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-08-07 15:35:09
 */
public class AlipayOpenAppXwbtestpreCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4499682475681157375L;

	/** 
	 * s
	 */
	@ApiField("forestuser")
	private Boolean forestuser;

	/** 
	 * 1
	 */
	@ApiField("sd")
	private String sd;

	/** 
	 * 1
	 */
	@ApiField("sdd")
	private String sdd;

	/** 
	 * 1
	 */
	@ApiField("sdf")
	private String sdf;

	/** 
	 * 描述
	 */
	@ApiField("sdfsdf")
	private Boolean sdfsdf;

	public void setForestuser(Boolean forestuser) {
		this.forestuser = forestuser;
	}
	public Boolean getForestuser( ) {
		return this.forestuser;
	}

	public void setSd(String sd) {
		this.sd = sd;
	}
	public String getSd( ) {
		return this.sd;
	}

	public void setSdd(String sdd) {
		this.sdd = sdd;
	}
	public String getSdd( ) {
		return this.sdd;
	}

	public void setSdf(String sdf) {
		this.sdf = sdf;
	}
	public String getSdf( ) {
		return this.sdf;
	}

	public void setSdfsdf(Boolean sdfsdf) {
		this.sdfsdf = sdfsdf;
	}
	public Boolean getSdfsdf( ) {
		return this.sdfsdf;
	}

}
