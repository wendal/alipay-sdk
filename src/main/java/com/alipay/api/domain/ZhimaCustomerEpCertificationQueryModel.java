package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业认证查询服务
 *
 * @author auto create
 * @since 1.0, 2017-10-13 14:43:23
 */
public class ZhimaCustomerEpCertificationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2763753155787478644L;

	/**
	 * 一次认证的唯一标识,在商户调用认证初始化接口的时候获取
	 */
	@ApiField("biz_no")
	private String bizNo;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

}
