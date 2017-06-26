package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当成付扣款接口
 *
 * @author auto create
 * @since 1.0, 2017-04-24 15:50:04
 */
public class AlipayEbppFacepayBillPayModel extends AlipayObject {

	private static final long serialVersionUID = 3151487727364228568L;

	/**
	 * 账期
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务类型英文名称，固定传JF，表示缴费
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 出账机构英文名称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 扩展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 滞纳金额，单位：元
	 */
	@ApiField("fine_amount")
	private String fineAmount;

	/**
	 * 机构唯一ID（要求全局唯一）
	 */
	@ApiField("inst_no")
	private String instNo;

	/**
	 * ISV交易流水号（要求全局唯一）
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 支付金额（包含滞纳金），单位：元
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 商户partnerId
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 子业务类型英文名称，ELECTRIC-电费，WATER-水费，GAS-燃气费
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 用户支付宝付款码
	 */
	@ApiField("user_identity_code")
	private String userIdentityCode;

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getFineAmount() {
		return this.fineAmount;
	}
	public void setFineAmount(String fineAmount) {
		this.fineAmount = fineAmount;
	}

	public String getInstNo() {
		return this.instNo;
	}
	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getUserIdentityCode() {
		return this.userIdentityCode;
	}
	public void setUserIdentityCode(String userIdentityCode) {
		this.userIdentityCode = userIdentityCode;
	}

}
