package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业关注名单详情
 *
 * @author auto create
 * @since 1.0, 2016-12-22 11:25:22
 */
public class ZmWatchListDetail extends AlipayObject {

	private static final long serialVersionUID = 2512761858817661134L;

	/**
	 * 行业编码，例如：
AA	金融（信贷类）；
AB	公检法 ；
AC	金融（支付类）；
AD	租车行业；
AE	酒店行业；
AF	电商行业；
AG	租房行业；
AH	运营商；
AI	保险行业；
AJ	公共事业。
该列表动态更新，更新前芝麻将进行通知。
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 风险编码，编码由芝麻进行维护和升级，会存在新增编码的可能，更新前芝麻会进行通知。
	 */
	@ApiField("code")
	private String code;

	/**
	 * 行业关注名单记录扩展信息
	 */
	@ApiListField("extend_info")
	@ApiField("zm_watch_list_extend_info")
	private List<ZmWatchListExtendInfo> extendInfo;

	/**
	 * 数据更新时间
	 */
	@ApiField("refresh_time")
	private Date refreshTime;

	/**
	 * 对于借款贷款信用消费等，该字段标识是否结清。true，已经结清；false，未结清。
	 */
	@ApiField("settlement")
	private Boolean settlement;

	/**
	 * 当用户进行异议处理，并核查完毕之后，仍有异议时，给出的声明
	 */
	@ApiField("statement")
	private String statement;

	/**
	 * 用户本人对该条负面记录有异议时，表示该异议处理流程的状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 行业名单风险类型，编码由芝麻进行维护和升级，会存在新增编码的可能，更新前芝麻将会进行通知。
	 */
	@ApiField("type")
	private String type;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public List<ZmWatchListExtendInfo> getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(List<ZmWatchListExtendInfo> extendInfo) {
		this.extendInfo = extendInfo;
	}

	public Date getRefreshTime() {
		return this.refreshTime;
	}
	public void setRefreshTime(Date refreshTime) {
		this.refreshTime = refreshTime;
	}

	public Boolean getSettlement() {
		return this.settlement;
	}
	public void setSettlement(Boolean settlement) {
		this.settlement = settlement;
	}

	public String getStatement() {
		return this.statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
