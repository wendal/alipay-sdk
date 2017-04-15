package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.staff.update response.
 * 
 * @author auto create
 * @since 1.0, 2016-05-16 16:12:42
 */
public class AlipayOfflineProviderStaffUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6282166326365493694L;

	/** 
	 * 同步失败错误原因信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 同步操作完成后的结果
	 */
	@ApiField("operate_result")
	private String operateResult;

	/** 
	 * 同步员工的操作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/** 
	 * 员工pid
	 */
	@ApiField("pid")
	private String pid;

	/** 
	 * 服务商员工staff_id
	 */
	@ApiField("staff_id")
	private String staffId;

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setOperateResult(String operateResult) {
		this.operateResult = operateResult;
	}
	public String getOperateResult( ) {
		return this.operateResult;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
	public String getOperateType( ) {
		return this.operateType;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid( ) {
		return this.pid;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getStaffId( ) {
		return this.staffId;
	}

}
