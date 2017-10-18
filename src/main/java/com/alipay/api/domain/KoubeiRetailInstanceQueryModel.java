package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户券查询接口
 *
 * @author auto create
 * @since 1.0, 2017-08-24 21:58:29
 */
public class KoubeiRetailInstanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6884151989147928148L;

	/**
	 * 当前页码，最小1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 一次请求返回的数据量，最小1~50整数
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
