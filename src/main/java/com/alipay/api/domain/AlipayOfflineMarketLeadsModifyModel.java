package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 私海leads修改
 *
 * @author auto create
 * @since 1.0, 2016-12-23 13:37:39
 */
public class AlipayOfflineMarketLeadsModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1811969257837717899L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 门店授权函,营业执照与签约账号主体不一致时需要
	 */
	@ApiField("auth_letter")
	private String authLetter;

	/**
	 * 人均消费价格，最少1元，最大不超过99999元，请按实际情况填写；单位元，不需填写单位；
	 */
	@ApiField("avg_price")
	private String avgPrice;

	/**
	 * 门店是否有包厢，T表示有，F表示没有，不传在客户端不作展示
	 */
	@ApiField("box")
	private String box;

	/**
	 * 分店名称
	 */
	@ApiField("branch_shop_name")
	private String branchShopName;

	/**
	 * 品牌LOGO; 图片ID。
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 经营许可证，只有餐饮类目需要
	 */
	@ApiField("business_certificate")
	private String businessCertificate;

	/**
	 * 经营许可证有效期，格式：2020-03-20，只有餐饮类目需要
	 */
	@ApiField("business_certificate_expires")
	private String businessCertificateExpires;

	/**
	 * 营业时间，支持分段营业时间，以英文逗号分隔
	 */
	@ApiField("business_time")
	private String businessTime;

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
	 * 营业执照上的公司名称，如果修改为空，传入:"#EMPTY#",传入空，不修改
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
	 * 联系电话
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/**
	 * 内景图
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
	 * 机具号，多个之间以英文逗号分隔
	 */
	@ApiField("implement_id")
	private String implementId;

	/**
	 * 是否补全信息，如果传T，表示当前请求是补全信息，只有补全了信息的leads，才允许开店
	 */
	@ApiField("is_complete")
	private String isComplete;

	/**
	 * 是否在其他平台开店，T表示有开店，F表示未开店，用于证明其开店资质，如无营业执照必须有在其他平台的开店资质才能入住口碑平台，其他平台主要包括美团、点评。
	 */
	@ApiField("is_operating_online")
	private String isOperatingOnline;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private Long latitude;

	/**
	 * 修改的leadsId
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 门店营业执照图片，营业执照信息与is_operating_online至少填一项
	 */
	@ApiField("licence")
	private String licence;

	/**
	 * 门店营业执照编号，营业执照信息与is_operating_online至少填一项
	 */
	@ApiField("licence_code")
	private String licenceCode;

	/**
	 * 营业执照过期时间
	 */
	@ApiField("licence_expires")
	private String licenceExpires;

	/**
	 * 门店营业执照名称
	 */
	@ApiField("licence_name")
	private String licenceName;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private Long longitude;

	/**
	 * 门店首图
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
	 * 是否有无烟区，T表示有无烟区，F表示没有无烟区，不传在客户端不展示
	 */
	@ApiField("no_smoking")
	private String noSmoking;

	/**
	 * 其他平台开店竞对图片url，多个url使用英文逗号隔开,isv迁移到新接口使用此字段，与is_operating_online=T配套使用。online_image升级到version=2.0版本后将废弃，使用online_url替代。
	 */
	@ApiField("online_url")
	private String onlineUrl;

	/**
	 * 当前操作人
	 */
	@ApiField("op_id")
	private String opId;

	/**
	 * 异步结果通知
	 */
	@ApiField("operate_notify_url")
	private String operateNotifyUrl;

	/**
	 * 支付宝内部使用，外部商户不需要填写此字段。其他资质
	 */
	@ApiField("other_authorization")
	private String otherAuthorization;

	/**
	 * 其他联系方式
	 */
	@ApiField("other_contact_info")
	private String otherContactInfo;

	/**
	 * 门店是否支持停车，T表示支持，F表示不支持，不传在客户端不作展示
	 */
	@ApiField("parking")
	private String parking;

	/**
	 * 付款方式：code_scanned_pay：付款码
online_pay：在线买单
	 */
	@ApiField("pay_type")
	private String payType;

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

	/**
	 * 外部门店编号；最长54位字符，该编号将作为收单接口的入参， 请开发者自行确保其唯一性
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 门店其他的服务，门店与用户线下兑现
	 */
	@ApiField("value_added")
	private String valueAdded;

	/**
	 * 门店是否支持WIFI，T表示支持，F表示不支持，不传在客户端不作展示
	 */
	@ApiField("wifi")
	private String wifi;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAuthLetter() {
		return this.authLetter;
	}
	public void setAuthLetter(String authLetter) {
		this.authLetter = authLetter;
	}

	public String getAvgPrice() {
		return this.avgPrice;
	}
	public void setAvgPrice(String avgPrice) {
		this.avgPrice = avgPrice;
	}

	public String getBox() {
		return this.box;
	}
	public void setBox(String box) {
		this.box = box;
	}

	public String getBranchShopName() {
		return this.branchShopName;
	}
	public void setBranchShopName(String branchShopName) {
		this.branchShopName = branchShopName;
	}

	public String getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBusinessCertificate() {
		return this.businessCertificate;
	}
	public void setBusinessCertificate(String businessCertificate) {
		this.businessCertificate = businessCertificate;
	}

	public String getBusinessCertificateExpires() {
		return this.businessCertificateExpires;
	}
	public void setBusinessCertificateExpires(String businessCertificateExpires) {
		this.businessCertificateExpires = businessCertificateExpires;
	}

	public String getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
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

	public String getImplementId() {
		return this.implementId;
	}
	public void setImplementId(String implementId) {
		this.implementId = implementId;
	}

	public String getIsComplete() {
		return this.isComplete;
	}
	public void setIsComplete(String isComplete) {
		this.isComplete = isComplete;
	}

	public String getIsOperatingOnline() {
		return this.isOperatingOnline;
	}
	public void setIsOperatingOnline(String isOperatingOnline) {
		this.isOperatingOnline = isOperatingOnline;
	}

	public Long getLatitude() {
		return this.latitude;
	}
	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	public String getLicence() {
		return this.licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}

	public String getLicenceCode() {
		return this.licenceCode;
	}
	public void setLicenceCode(String licenceCode) {
		this.licenceCode = licenceCode;
	}

	public String getLicenceExpires() {
		return this.licenceExpires;
	}
	public void setLicenceExpires(String licenceExpires) {
		this.licenceExpires = licenceExpires;
	}

	public String getLicenceName() {
		return this.licenceName;
	}
	public void setLicenceName(String licenceName) {
		this.licenceName = licenceName;
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

	public String getNoSmoking() {
		return this.noSmoking;
	}
	public void setNoSmoking(String noSmoking) {
		this.noSmoking = noSmoking;
	}

	public String getOnlineUrl() {
		return this.onlineUrl;
	}
	public void setOnlineUrl(String onlineUrl) {
		this.onlineUrl = onlineUrl;
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

	public String getOtherAuthorization() {
		return this.otherAuthorization;
	}
	public void setOtherAuthorization(String otherAuthorization) {
		this.otherAuthorization = otherAuthorization;
	}

	public String getOtherContactInfo() {
		return this.otherContactInfo;
	}
	public void setOtherContactInfo(String otherContactInfo) {
		this.otherContactInfo = otherContactInfo;
	}

	public String getParking() {
		return this.parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
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

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getValueAdded() {
		return this.valueAdded;
	}
	public void setValueAdded(String valueAdded) {
		this.valueAdded = valueAdded;
	}

	public String getWifi() {
		return this.wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

}
