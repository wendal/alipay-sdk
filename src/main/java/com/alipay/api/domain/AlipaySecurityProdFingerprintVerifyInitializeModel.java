package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指纹校验初始化
 *
 * @author auto create
 * @since 1.0, 2017-01-12 17:27:23
 */
public class AlipaySecurityProdFingerprintVerifyInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 5443124411468678478L;

	/**
	 * IFAA协议的版本，目前为2.0
	 */
	@ApiField("ifaa_version")
	private String ifaaVersion;

	/**
	 * IFAA标准中用于关联IFAA Server和业务方Server开通状态的token，此token为注册时保存的token，传入此token，用于生成服务端校验信息。
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
