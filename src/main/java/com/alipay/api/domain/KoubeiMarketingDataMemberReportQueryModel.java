package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员报表批量查询接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:10
 */
public class KoubeiMarketingDataMemberReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7589822951815557193L;

	/**
	 * 查询报表数据的业务日期，精确到天，格式为yyyymmdd，数据按天返回
	 */
	@ApiField("biz_date")
	private String bizDate;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

}
