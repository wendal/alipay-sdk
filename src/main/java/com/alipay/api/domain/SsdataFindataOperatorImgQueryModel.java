package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取图片验证码
 *
 * @author auto create
 * @since 1.0, 2017-10-27 09:36:48
 */
public class SsdataFindataOperatorImgQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8663422795256437372L;

	/**
	 * 系统业务流水号，在提交用户信息时获得
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
