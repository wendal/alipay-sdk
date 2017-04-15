package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广发信用分数据结构
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class GfResult extends AlipayObject {

	private static final long serialVersionUID = 7189699623118633973L;

	/**
	 * 身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 相同身份证号个数
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 用户是否存在
	 */
	@ApiField("exist")
	private String exist;

	/**
	 * 最高分
	 */
	@ApiField("max_score")
	private Long maxScore;

	/**
	 * 最低分
	 */
	@ApiField("min_score")
	private Long minScore;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getExist() {
		return this.exist;
	}
	public void setExist(String exist) {
		this.exist = exist;
	}

	public Long getMaxScore() {
		return this.maxScore;
	}
	public void setMaxScore(Long maxScore) {
		this.maxScore = maxScore;
	}

	public Long getMinScore() {
		return this.minScore;
	}
	public void setMinScore(Long minScore) {
		this.minScore = minScore;
	}

}
