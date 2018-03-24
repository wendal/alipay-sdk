package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 理赔报案时相关的保单信息
 *
 * @author auto create
 * @since 1.0, 2017-11-02 12:01:15
 */
public class InsClaimPolicy extends AlipayObject {

	private static final long serialVersionUID = 8415874518646753986L;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

}
