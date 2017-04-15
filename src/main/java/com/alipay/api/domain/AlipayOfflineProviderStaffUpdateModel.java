package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云纵员工信息同步到口碑
 *
 * @author auto create
 * @since 1.0, 2015-11-26 16:16:02
 */
public class AlipayOfflineProviderStaffUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 6514725629644969191L;

	/**
	 * 支付宝账号
	 */
	@ApiField("alipay_no")
	private String alipayNo;

	/**
	 * 行业类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 客户端请求IP
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * 新增员工的备注信息
	 */
	@ApiField("description")
	private String description;

	/**
	 * 要同步员工的邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 登录用户的staff_id
	 */
	@ApiField("login_staff_id")
	private String loginStaffId;

	/**
	 * 服务商pid
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 服务商id的类型
	 */
	@ApiField("merchant_id_type")
	private String merchantIdType;

	/**
	 * 云纵登录人员pid
	 */
	@ApiField("ope_pid")
	private String opePid;

	/**
	 * 同步云纵员工操作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 流水号参数
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 角色类型
	 */
	@ApiField("role_type")
	private String roleType;

	/**
	 * 修改删除员工的主键id
	 */
	@ApiField("staff_id")
	private String staffId;

	/**
	 * 要同步员工的电话号码
	 */
	@ApiField("staff_mobile")
	private String staffMobile;

	/**
	 * 新增员工姓名
	 */
	@ApiField("staff_name")
	private String staffName;

	/**
	 * 员工类型
	 */
	@ApiField("staff_type")
	private String staffType;

	public String getAlipayNo() {
		return this.alipayNo;
	}
	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getClientIp() {
		return this.clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginStaffId() {
		return this.loginStaffId;
	}
	public void setLoginStaffId(String loginStaffId) {
		this.loginStaffId = loginStaffId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantIdType() {
		return this.merchantIdType;
	}
	public void setMerchantIdType(String merchantIdType) {
		this.merchantIdType = merchantIdType;
	}

	public String getOpePid() {
		return this.opePid;
	}
	public void setOpePid(String opePid) {
		this.opePid = opePid;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getStaffId() {
		return this.staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStaffMobile() {
		return this.staffMobile;
	}
	public void setStaffMobile(String staffMobile) {
		this.staffMobile = staffMobile;
	}

	public String getStaffName() {
		return this.staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffType() {
		return this.staffType;
	}
	public void setStaffType(String staffType) {
		this.staffType = staffType;
	}

}
