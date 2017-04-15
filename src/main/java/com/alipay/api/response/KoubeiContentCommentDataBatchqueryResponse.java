package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CommentOpenModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.content.comment.data.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-03 10:40:31
 */
public class KoubeiContentCommentDataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1199433314343496547L;

	/** 
	 * 评价结果列表
	 */
	@ApiListField("comments")
	@ApiField("comment_open_model")
	private List<CommentOpenModel> comments;

	/** 
	 * 当前查询条件下评价总数
	 */
	@ApiField("count")
	private Long count;

	public void setComments(List<CommentOpenModel> comments) {
		this.comments = comments;
	}
	public List<CommentOpenModel> getComments( ) {
		return this.comments;
	}

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

}
