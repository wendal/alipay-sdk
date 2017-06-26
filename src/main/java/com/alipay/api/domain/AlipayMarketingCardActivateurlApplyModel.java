package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡领卡链接获取接口
 *
 * @author auto create
 * @since 1.0, 2017-04-18 12:10:12
 */
public class AlipayMarketingCardActivateurlApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5745242273514283225L;

	/**
	 * 会员卡开卡表单提交后回调地址。
1.该地址不可带参数，如需回传参数，可设置out_string入参。
	 */
	@ApiField("callback")
	private String callback;

	/**
	 * 扩展信息，会员领卡完成后将此参数原样带回商户页面。
	 */
	@ApiField("out_string")
	private String outString;

	/**
	 * 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果
	 */
	@ApiField("template_id")
	private String templateId;

	public String getCallback() {
		return this.callback;
	}
	public void setCallback(String callback) {
		this.callback = callback;
	}

	public String getOutString() {
		return this.outString;
	}
	public void setOutString(String outString) {
		this.outString = outString;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
