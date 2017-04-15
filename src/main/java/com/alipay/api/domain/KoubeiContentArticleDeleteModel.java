package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 达人说文章删除
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:11
 */
public class KoubeiContentArticleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2345972163329514735L;

	/**
	 * 达人说文章id
	 */
	@ApiField("article_id")
	private String articleId;

	public String getArticleId() {
		return this.articleId;
	}
	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

}
