package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预算信息
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
public class BudgetInfo extends AlipayObject {

	private static final long serialVersionUID = 1517559689845138177L;

	/**
	 * 预算数量
	 */
	@ApiField("budget_total")
	private String budgetTotal;

	/**
	 * 预算类型
	 */
	@ApiField("budget_type")
	private String budgetType;

	public String getBudgetTotal() {
		return this.budgetTotal;
	}
	public void setBudgetTotal(String budgetTotal) {
		this.budgetTotal = budgetTotal;
	}

	public String getBudgetType() {
		return this.budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

}
