package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查询评价接口返回对象
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:40:31
 */
public class CommentOpenModel extends AlipayObject {

	private static final long serialVersionUID = 8248139112149936886L;

	/**
	 * 口碑评价id
	 */
	@ApiField("comment_id")
	private String commentId;

	/**
	 * 评价发表时间
	 */
	@ApiField("comment_publish_time")
	private Date commentPublishTime;

	/**
	 * 评价内容，不超过2000字，不区分中英文
	 */
	@ApiField("content")
	private String content;

	/**
	 * 评价关联的手艺人id
	 */
	@ApiField("craftsman_id")
	private String craftsmanId;

	/**
	 * 评价上传图片，一条评价最多9张图片
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 评价回复
	 */
	@ApiField("reply")
	private CommentReplyOpenModel reply;

	/**
	 * 评分，1-5分，1分最低，5分最高，均为整数
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 评价对应的门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getCommentId() {
		return this.commentId;
	}
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public Date getCommentPublishTime() {
		return this.commentPublishTime;
	}
	public void setCommentPublishTime(Date commentPublishTime) {
		this.commentPublishTime = commentPublishTime;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getCraftsmanId() {
		return this.craftsmanId;
	}
	public void setCraftsmanId(String craftsmanId) {
		this.craftsmanId = craftsmanId;
	}

	public List<String> getImages() {
		return this.images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}

	public CommentReplyOpenModel getReply() {
		return this.reply;
	}
	public void setReply(CommentReplyOpenModel reply) {
		this.reply = reply;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
