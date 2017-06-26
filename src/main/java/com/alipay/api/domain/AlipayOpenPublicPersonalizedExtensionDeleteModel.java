package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个性化扩展区删除接口
 *
 * @author auto create
 * @since 1.0, 2017-06-01 11:26:50
 */
public class AlipayOpenPublicPersonalizedExtensionDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6883183639269684836L;

	/**
	 * 扩展区套id，接口创建个性化扩展区时会返回
	 */
	@ApiField("extension_key")
	private String extensionKey;

	public String getExtensionKey() {
		return this.extensionKey;
	}
	public void setExtensionKey(String extensionKey) {
		this.extensionKey = extensionKey;
	}

}
