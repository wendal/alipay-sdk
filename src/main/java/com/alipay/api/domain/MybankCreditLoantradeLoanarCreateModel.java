package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构代客户签署合约并放款
 *
 * @author auto create
 * @since 1.0, 2017-03-10 17:05:38
 */
public class MybankCreditLoantradeLoanarCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5366279969195134135L;

	/**
	 * 收款方参与机构码
	 */
	@ApiField("account_fin_code")
	private String accountFinCode;

	/**
	 * 收款方机构名称
	 */
	@ApiField("account_fin_name")
	private String accountFinName;

	/**
	 * 对公对私
	 */
	@ApiField("account_fin_type")
	private String accountFinType;

	/**
	 * 收款方名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 收款方账户号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 收款方账户类型
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 2088开头的支付宝数字ID
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 支用金额，默认人民币，精确到小数点两位，单位元
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/**
	 * 业务单据号
	 */
	@ApiField("bsn_no")
	private String bsnNo;

	/**
	 * 授信编号
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 客群
	 */
	@ApiField("cust_group")
	private String custGroup;

	/**
	 * 放款账户渠道
	 */
	@ApiField("grant_channel")
	private String grantChannel;

	/**
	 * 经营行业
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 参与者
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 参与者会员角色ID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * BC政策码
	 */
	@ApiField("loan_policy_code")
	private String loanPolicyCode;

	/**
	 * 贷款期限
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 贷款期限单位
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 销售产品编码
	 */
	@ApiField("pd_code")
	private String pdCode;

	/**
	 * 销售产品版本号
	 */
	@ApiField("pd_version")
	private String pdVersion;

	/**
	 * 还款方式
	 */
	@ApiField("repay_mode")
	private String repayMode;

	/**
	 * 请求流水号，用于幂等控制.以"ipRoleId_"开头
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 签名值
	 */
	@ApiField("sign")
	private String sign;

	/**
	 * 转账备注
	 */
	@ApiField("trans_memo")
	private String transMemo;

	public String getAccountFinCode() {
		return this.accountFinCode;
	}
	public void setAccountFinCode(String accountFinCode) {
		this.accountFinCode = accountFinCode;
	}

	public String getAccountFinName() {
		return this.accountFinName;
	}
	public void setAccountFinName(String accountFinName) {
		this.accountFinName = accountFinName;
	}

	public String getAccountFinType() {
		return this.accountFinType;
	}
	public void setAccountFinType(String accountFinType) {
		this.accountFinType = accountFinType;
	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getApplyAmt() {
		return this.applyAmt;
	}
	public void setApplyAmt(String applyAmt) {
		this.applyAmt = applyAmt;
	}

	public String getBsnNo() {
		return this.bsnNo;
	}
	public void setBsnNo(String bsnNo) {
		this.bsnNo = bsnNo;
	}

	public String getCreditNo() {
		return this.creditNo;
	}
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}

	public String getCustGroup() {
		return this.custGroup;
	}
	public void setCustGroup(String custGroup) {
		this.custGroup = custGroup;
	}

	public String getGrantChannel() {
		return this.grantChannel;
	}
	public void setGrantChannel(String grantChannel) {
		this.grantChannel = grantChannel;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getLoanPolicyCode() {
		return this.loanPolicyCode;
	}
	public void setLoanPolicyCode(String loanPolicyCode) {
		this.loanPolicyCode = loanPolicyCode;
	}

	public Long getLoanTerm() {
		return this.loanTerm;
	}
	public void setLoanTerm(Long loanTerm) {
		this.loanTerm = loanTerm;
	}

	public String getLoanTermUnit() {
		return this.loanTermUnit;
	}
	public void setLoanTermUnit(String loanTermUnit) {
		this.loanTermUnit = loanTermUnit;
	}

	public String getPdCode() {
		return this.pdCode;
	}
	public void setPdCode(String pdCode) {
		this.pdCode = pdCode;
	}

	public String getPdVersion() {
		return this.pdVersion;
	}
	public void setPdVersion(String pdVersion) {
		this.pdVersion = pdVersion;
	}

	public String getRepayMode() {
		return this.repayMode;
	}
	public void setRepayMode(String repayMode) {
		this.repayMode = repayMode;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSign() {
		return this.sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getTransMemo() {
		return this.transMemo;
	}
	public void setTransMemo(String transMemo) {
		this.transMemo = transMemo;
	}

}
