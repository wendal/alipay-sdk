package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建私海leads
 *
 * @author auto create
 * @since 1.0, 2016-12-23 13:37:27
 */
public class AlipayOfflineMarketLeadsCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6126498759596778786L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 分店名称
	 */
	@ApiField("branch_shop_name")
	private String branchShopName;

	/**
	 * 品牌名称，如果传空或不存在，默认使用：其它品牌
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 品类id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 营业执照上的公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * kp联系人职位，按照枚举值填写
	 */
	@ApiField("contact_kp_job")
	private String contactKpJob;

	/**
	 * kp联系人电话，只能填写一个，座机或者手机
	 */
	@ApiField("contact_kp_tel")
	private String contactKpTel;

	/**
	 * 联系人
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系方式
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/**
	 * 内景图,按照列表顺序展示
	 */
	@ApiListField("detail_images")
	@ApiField("string")
	private List<String> detailImages;

	/**
	 * 区编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private Long latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private Long longitude;

	/**
	 * 图片对应的图片Id
	 */
	@ApiField("main_image")
	private String mainImage;

	/**
	 * 主店名
	 */
	@ApiField("main_shop_name")
	private String mainShopName;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 当前操作人id
	 */
	@ApiField("op_id")
	private String opId;

	/**
	 * 异步结果通知地址
	 */
	@ApiField("operate_notify_url")
	private String operateNotifyUrl;

	/**
	 * 其他联系方式
	 */
	@ApiField("other_contact_info")
	private String otherContactInfo;

	/**
	 * 省编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 外部流水号
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBranchShopName() {
		return this.branchShopName;
	}
	public void setBranchShopName(String branchShopName) {
		this.branchShopName = branchShopName;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactKpJob() {
		return this.contactKpJob;
	}
	public void setContactKpJob(String contactKpJob) {
		this.contactKpJob = contactKpJob;
	}

	public String getContactKpTel() {
		return this.contactKpTel;
	}
	public void setContactKpTel(String contactKpTel) {
		this.contactKpTel = contactKpTel;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public List<String> getDetailImages() {
		return this.detailImages;
	}
	public void setDetailImages(List<String> detailImages) {
		this.detailImages = detailImages;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public Long getLatitude() {
		return this.latitude;
	}
	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public Long getLongitude() {
		return this.longitude;
	}
	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public String getMainImage() {
		return this.mainImage;
	}
	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

	public String getMainShopName() {
		return this.mainShopName;
	}
	public void setMainShopName(String mainShopName) {
		this.mainShopName = mainShopName;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOpId() {
		return this.opId;
	}
	public void setOpId(String opId) {
		this.opId = opId;
	}

	public String getOperateNotifyUrl() {
		return this.operateNotifyUrl;
	}
	public void setOperateNotifyUrl(String operateNotifyUrl) {
		this.operateNotifyUrl = operateNotifyUrl;
	}

	public String getOtherContactInfo() {
		return this.otherContactInfo;
	}
	public void setOtherContactInfo(String otherContactInfo) {
		this.otherContactInfo = otherContactInfo;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
