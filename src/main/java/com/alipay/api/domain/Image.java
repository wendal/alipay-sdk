package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图片信息
 *
 * @author auto create
 * @since 1.0, 2017-06-14 11:02:07
 */
public class Image extends AlipayObject {

	private static final long serialVersionUID = 7427277888797433679L;

	/**
	 * 图片url
	 */
	@ApiField("url")
	private String url;

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
