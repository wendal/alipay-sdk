package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询阿里通信小号信息
 *
 * @author auto create
 * @since 1.0, 2017-07-26 14:38:27
 */
public class SsdataDataserviceRiskAlixiaohaoQueryModel extends AlipayObject {

<<<<<<< HEAD
	private static final long serialVersionUID = 5552778966217212958L;
=======
	private static final long serialVersionUID = 4393884697628964772L;
>>>>>>> master

	/**
	 * 电话号码
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
