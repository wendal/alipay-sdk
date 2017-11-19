package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料采购单获取接口
 *
 * @author auto create
 * @since 1.0, 2017-07-27 19:40:45
 */
public class KoubeiSalesKbassetStuffPurchaseorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8825529261113743317L;

	/**
	 * 每页大小：最小1，最大100
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
