package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LeadsQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.leads.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-02-07 16:46:29
 */
public class AlipayOfflineMarketLeadsBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2623485231728715764L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page_no")
	private Long currentPageNo;

	/** 
	 * 支付宝leads信息列表
	 */
	@ApiListField("leads_query_responses")
	@ApiField("leads_query_response")
	private List<LeadsQueryResponse> leadsQueryResponses;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_items")
	private Long totalItems;

	/** 
	 * 总页码数目
	 */
	@ApiField("total_page_no")
	private Long totalPageNo;

	public void setCurrentPageNo(Long currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
	public Long getCurrentPageNo( ) {
		return this.currentPageNo;
	}

	public void setLeadsQueryResponses(List<LeadsQueryResponse> leadsQueryResponses) {
		this.leadsQueryResponses = leadsQueryResponses;
	}
	public List<LeadsQueryResponse> getLeadsQueryResponses( ) {
		return this.leadsQueryResponses;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}
	public Long getTotalItems( ) {
		return this.totalItems;
	}

	public void setTotalPageNo(Long totalPageNo) {
		this.totalPageNo = totalPageNo;
	}
	public Long getTotalPageNo( ) {
		return this.totalPageNo;
	}

}
