package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板栏位信息
 *
 * @author auto create
 * @since 1.0, 2016-12-28 15:26:46
 */
public class TemplateColumnInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7371353672349656894L;

	/**
	 * 标准栏位：行为由支付宝统一定，同时已经分配标准Code
BALANCE：会员卡余额
POINT：积分
LEVEL：等级
TELEPHOME：联系方式
自定义栏位：行为由商户定义，自定义Code码（只要无重复）
	 */
	@ApiField("code")
	private String code;

	/**
	 * 扩展信息
	 */
	@ApiField("more_info")
	private MoreInfoDTO moreInfo;

	/**
	 * 1、openNative：打开二级页面，展现 more中descs
2、openWeb：打开URL
3、staticinfo：静态信息
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 栏目的标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 卡包详情页面，卡栏位右边展现的值
	 */
	@ApiField("value")
	private String value;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public MoreInfoDTO getMoreInfo() {
		return this.moreInfo;
	}
	public void setMoreInfo(MoreInfoDTO moreInfo) {
		this.moreInfo = moreInfo;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
