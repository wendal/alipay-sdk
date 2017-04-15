package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指纹校验
 *
 * @author auto create
 * @since 1.0, 2017-01-12 17:27:17
 */
public class AlipaySecurityProdFingerprintVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 6366965675654189325L;

	/**
	 * ifaf_message:校验阶段客户端返回的协议体数据，对应《IFAA本地免密技术规范》中的IFAFMessage，内容中包含客户端的校验数据。
	 */
	@ApiField("ifaf_message")
	private String ifafMessage;

	/**
	 * 外部业务号，商户的业务单据号，用于核对与问题排查
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getIfafMessage() {
		return this.ifafMessage;
	}
	public void setIfafMessage(String ifafMessage) {
		this.ifafMessage = ifafMessage;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
