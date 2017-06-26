package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学生信息查询
 *
 * @author auto create
 * @since 1.0, 2017-06-13 10:29:05
 */
public class AlipayEcoEduKtStudentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3815376475459528164L;

	/**
	 * Isv pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 学校编号，同步学校返回的编号
	 */
	@ApiField("school_no")
	private String schoolNo;

	/**
	 * 学校pid
	 */
	@ApiField("school_pid")
	private String schoolPid;

	/**
	 * 学生编号，发送账单接口返回的学生编号
	 */
	@ApiField("student_no")
	private String studentNo;

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getSchoolNo() {
		return this.schoolNo;
	}
	public void setSchoolNo(String schoolNo) {
		this.schoolNo = schoolNo;
	}

	public String getSchoolPid() {
		return this.schoolPid;
	}
	public void setSchoolPid(String schoolPid) {
		this.schoolPid = schoolPid;
	}

	public String getStudentNo() {
		return this.studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

}
