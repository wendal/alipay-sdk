package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子证件产品-驾驶证
 *
 * @author auto create
 * @since 1.0, 2017-01-13 10:25:16
 */
public class AlipayUserCertDocDrivingLicense extends AlipayObject {

	private static final long serialVersionUID = 7198435797472518579L;

	/**
	 * 准驾车型
	 */
	@ApiField("clazz")
	private String clazz;

	/**
	 * 证号
	 */
	@ApiField("driving_license_no")
	private String drivingLicenseNo;

	/**
	 * 失效日期
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 档案编号
	 */
	@ApiField("file_no")
	private String fileNo;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 生效日期
	 */
	@ApiField("valide_date")
	private String valideDate;

	public String getClazz() {
		return this.clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getDrivingLicenseNo() {
		return this.drivingLicenseNo;
	}
	public void setDrivingLicenseNo(String drivingLicenseNo) {
		this.drivingLicenseNo = drivingLicenseNo;
	}

	public String getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getFileNo() {
		return this.fileNo;
	}
	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getValideDate() {
		return this.valideDate;
	}
	public void setValideDate(String valideDate) {
		this.valideDate = valideDate;
	}

}
