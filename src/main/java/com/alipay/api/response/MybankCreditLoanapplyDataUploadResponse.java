package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.data.upload response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-21 11:01:22
 */
public class MybankCreditLoanapplyDataUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1598533645167428399L;

	/** 
	 * 数据在网商银行内部系统的唯一ID。由网商银行融资平台的系统生成，返回给外部机构。
	 */
	@ApiField("data_id")
	private String dataId;

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}
	public String getDataId( ) {
		return this.dataId;
	}

}
