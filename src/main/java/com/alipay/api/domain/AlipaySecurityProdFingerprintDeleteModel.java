package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指纹解注册
 *
 * @author auto create
 * @since 1.0, 2017-01-12 17:27:09
 */
public class AlipaySecurityProdFingerprintDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6117368646766222322L;

	/**
	 * IFAA协议的版本，目前为2.0
	 */
	@ApiField("ifaa_version")
	private String ifaaVersion;

	/**
	 * IFAA标准中用于关联IFAA Server和业务方Server开通状态的token，此token为注册时保存的token，传入此token，用于生成服务端去注册信息。
	 */
	@ApiField("token")
	private String token;

	public String getIfaaVersion() {
		return this.ifaaVersion;
	}
	public void setIfaaVersion(String ifaaVersion) {
		this.ifaaVersion = ifaaVersion;
	}

	public String getToken() {
		return this.token;
	}
	public void setToken(String token) {
		this.token = token;
	}

}
