package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * “蚁盾”智能IP检测服务
 *
 * @author auto create
 * @since 1.0, 2017-03-21 10:28:38
 */
public class SsdataDataserviceRiskIpprofileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2565448911382221335L;

	/**
	 * IP地址
	 */
	@ApiField("ip_address")
	private String ipAddress;

	/**
	 * 手机号码
	 */
	@ApiField("phone")
	private String phone;

	public String getIpAddress() {
		return this.ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
