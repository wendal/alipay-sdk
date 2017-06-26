package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学生信息更新
 *
 * @author auto create
 * @since 1.0, 2017-06-13 10:29:37
 */
public class AlipayEcoEduKtStudentModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4199129825812253347L;

	/**
	 * 修改后的姓名
	 */
	@ApiField("child_name")
	private String childName;

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
	 * 区分ISV操作，“D”表示删除，“U”表示更新，区分大小写。
如果为U，则学生名字，学号，省份证至少填写一项
	 */
	@ApiField("status")
	private String status;

	/**
	 * 修改后的学号
	 */
	@ApiField("student_code")
	private String studentCode;

	/**
	 * 修改后的身份证号码
	 */
	@ApiField("student_identify")
	private String studentIdentify;

	/**
	 * 学生编号，发送账单接口返回的学生编号
	 */
	@ApiField("student_no")
	private String studentNo;

	public String getChildName() {
		return this.childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}

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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStudentCode() {
		return this.studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getStudentIdentify() {
		return this.studentIdentify;
	}
	public void setStudentIdentify(String studentIdentify) {
		this.studentIdentify = studentIdentify;
	}

	public String getStudentNo() {
		return this.studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

}
