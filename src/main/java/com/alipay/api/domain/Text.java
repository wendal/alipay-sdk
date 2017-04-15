package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文本消息内容
 *
 * @author auto create
 * @since 1.0, 2016-12-02 15:56:25
 */
public class Text extends AlipayObject {

	private static final long serialVersionUID = 6779814727623176585L;

	/**
	 * 你好!
	 */
	@ApiField("content")
	private String content;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
