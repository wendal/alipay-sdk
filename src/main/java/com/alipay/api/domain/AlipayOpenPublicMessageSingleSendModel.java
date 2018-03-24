package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单发模板消息
 *
 * @author auto create
 * @since 1.0, 2018-03-07 10:30:34
 */
public class AlipayOpenPublicMessageSingleSendModel extends AlipayObject {

	private static final long serialVersionUID = 6315693642484693657L;

	/**
	 * 消息模板相关参数，其中包括templateId模板ID和context模板上下文
	 */
	@ApiField("template")
	private Template template;

	/**
	 * 消息接收用户的userid
	 */
	@ApiField("to_user_id")
	private String toUserId;

	public Template getTemplate() {
		return this.template;
	}
	public void setTemplate(Template template) {
		this.template = template;
	}

	public String getToUserId() {
		return this.toUserId;
	}
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

}
