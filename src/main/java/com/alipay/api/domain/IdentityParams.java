package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户实名信息参数
 *
 * @author auto create
 * @since 1.0, 2017-08-17 14:37:45
 */
public class IdentityParams extends AlipayObject {

	private static final long serialVersionUID = 6828876744248446721L;

	/**
	 * 用户身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
