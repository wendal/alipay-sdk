package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育缴费学校信息录入接口
 *
 * @author auto create
 * @since 1.0, 2016-12-28 17:54:50
 */
public class AlipayEcoEduKtSchoolinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1132217328179464572L;

	/**
	 * 市的国家编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 区县的国家编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 区县名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 商家名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 商家编码，ISV_NO
	 */
	@ApiField("isv_no")
	private String isvNo;

	/**
	 * 此链接是为了保持教育缴费平台与ISV
商户支付状态一致性。用户支付成功后，会异步回调此链接，回调时，会带入支付的相关参数，ISV商户可以根据返回的参数更新账单状态。支付宝异步通知说明
	 */
	@ApiField("isv_notify_url")
	private String isvNotifyUrl;

	/**
	 * Isv支付宝pid，商家在支付宝的唯一标识
	 */
	@ApiField("isv_phone")
	private String isvPhone;

	/**
	 * Isv支付宝pid，用于支付返佣
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 省的国家编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 省名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 学校的图像，一般为学校的标识，该字段为图片的链接地址，只支持png或jpg图片格式，图片高度为108，宽度为108 ，不大于20k
	 */
	@ApiField("school_icon")
	private String schoolIcon;

	/**
	 * 如果学校图像数据填写，则此字段不能为空。目前只支持png和jpg两种格式
	 */
	@ApiField("school_icon_type")
	private String schoolIconType;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 学校支付宝pid，用于授权
	 */
	@ApiField("school_pid")
	private String schoolPid;

	/**
	 * 学校的国家标准编码
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	/**
	 * 学校的类型：托幼小初高。1、托, 2、幼,  3、小,  4、初,  5、高。如果学校兼有多种属性，可以写为：初高中为45 ， 小初为34
	 */
	@ApiField("school_type")
	private String schoolType;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return this.districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getIsvNo() {
		return this.isvNo;
	}
	public void setIsvNo(String isvNo) {
		this.isvNo = isvNo;
	}

	public String getIsvNotifyUrl() {
		return this.isvNotifyUrl;
	}
	public void setIsvNotifyUrl(String isvNotifyUrl) {
		this.isvNotifyUrl = isvNotifyUrl;
	}

	public String getIsvPhone() {
		return this.isvPhone;
	}
	public void setIsvPhone(String isvPhone) {
		this.isvPhone = isvPhone;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getSchoolIcon() {
		return this.schoolIcon;
	}
	public void setSchoolIcon(String schoolIcon) {
		this.schoolIcon = schoolIcon;
	}

	public String getSchoolIconType() {
		return this.schoolIconType;
	}
	public void setSchoolIconType(String schoolIconType) {
		this.schoolIconType = schoolIconType;
	}

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolPid() {
		return this.schoolPid;
	}
	public void setSchoolPid(String schoolPid) {
		this.schoolPid = schoolPid;
	}

	public String getSchoolStdcode() {
		return this.schoolStdcode;
	}
	public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}

	public String getSchoolType() {
		return this.schoolType;
	}
	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

}
