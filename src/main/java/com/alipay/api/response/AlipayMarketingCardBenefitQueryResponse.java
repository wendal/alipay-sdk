package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.McardTemplateBenefitQuery;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.benefit.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-20 22:02:34
 */
public class AlipayMarketingCardBenefitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6659357887572149923L;

	/** 
	 * 会员卡模板外部权益列表
	 */
	@ApiListField("mcard_template_benefit_query")
	@ApiField("mcard_template_benefit_query")
	private List<McardTemplateBenefitQuery> mcardTemplateBenefitQuery;

	public void setMcardTemplateBenefitQuery(List<McardTemplateBenefitQuery> mcardTemplateBenefitQuery) {
		this.mcardTemplateBenefitQuery = mcardTemplateBenefitQuery;
	}
	public List<McardTemplateBenefitQuery> getMcardTemplateBenefitQuery( ) {
		return this.mcardTemplateBenefitQuery;
	}

}
