package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 评价回复接口
 *
 * @author auto create
 * @since 1.0, 2017-03-14 22:26:53
 */
public class KoubeiContentCommentReplyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7133157528958469652L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为接口koubei.member.data.oauth.query（口碑业务授权令牌查询）中的auth_code，默认有效期24小时；isv自身角色操作的时候，无需传该参数
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 口碑评价id 可通过koubei.content.comment.data.batchquery接口查询
	 */
	@ApiField("comment_id")
	private String commentId;

	/**
	 * 评价回复内容，回复的内容不超过500字，不区分中英文
	 */
	@ApiField("content")
	private String content;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getCommentId() {
		return this.commentId;
	}
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
