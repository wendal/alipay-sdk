package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 只能营销方案详情查询
 *
 * @author auto create
 * @since 1.0, 2017-10-12 10:54:43
 */
public class KoubeiMarketingCampaignIntelligentPromoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2374979858216899318L;

	/**
	 * 操作人员上下文
	 */
	@ApiField("operator_context")
	private PromoOperatorInfo operatorContext;

	/**
	 * 智能营销活动id
	 */
	@ApiField("promo_id")
	private String promoId;

	public PromoOperatorInfo getOperatorContext() {
		return this.operatorContext;
	}
	public void setOperatorContext(PromoOperatorInfo operatorContext) {
		this.operatorContext = operatorContext;
	}

	public String getPromoId() {
		return this.promoId;
	}
	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}

}
