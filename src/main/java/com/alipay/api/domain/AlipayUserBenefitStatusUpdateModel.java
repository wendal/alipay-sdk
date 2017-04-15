package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁会员合作专区权益状态变更接口
 *
 * @author auto create
 * @since 1.0, 2016-09-28 17:51:43
 */
public class AlipayUserBenefitStatusUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 8724535111972933345L;

	/**
	 * 权益的ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 1:上线， 0:下线,  2:失效；
上线状态所有人可见，不可编辑；
下线状态白名单可见，可以编辑；
失效状态所有人不可见，不可编辑。
	 */
	@ApiField("benefit_status")
	private String benefitStatus;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getBenefitStatus() {
		return this.benefitStatus;
	}
	public void setBenefitStatus(String benefitStatus) {
		this.benefitStatus = benefitStatus;
	}

}
