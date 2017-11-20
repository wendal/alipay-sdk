package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝用户拉新奖品抽奖接口
 *
 * @author auto create
 * @since 1.0, 2017-06-12 19:48:23
 */
public class AlipayUserInviteAwardReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 7381974526314126114L;

	/**
	 * 用户扫码抽奖输入的手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 外部业务方代码
	 */
	@ApiField("out_biz_code")
	private String outBizCode;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOutBizCode() {
		return this.outBizCode;
	}
	public void setOutBizCode(String outBizCode) {
		this.outBizCode = outBizCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
