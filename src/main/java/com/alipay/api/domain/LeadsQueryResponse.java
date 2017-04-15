package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 线下店铺Leads模型
 *
 * @author auto create
 * @since 1.0, 2017-02-07 16:46:29
 */
public class LeadsQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 5869132615492651444L;

	/**
	 * 联系地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 门店授权函,营业执照与签约账号主体不一致时需要
	 */
	@ApiField("auth_letter")
	private String authLetter;

	/**
	 * 授权函url
	 */
	@ApiField("auth_letter_url")
	private String authLetterUrl;

	/**
	 * 人均消费价格
	 */
	@ApiField("avg_price")
	private String avgPrice;

	/**
	 * 门店是否有包厢，T表示有，F表示没有
	 */
	@ApiField("box")
	private String box;

	/**
	 * 分店名
	 */
	@ApiField("branch_shop_name")
	private String branchShopName;

	/**
	 * 品牌LOGO; 图片ID。
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * logo图片url
	 */
	@ApiField("brand_logo_url")
	private String brandLogoUrl;

	/**
	 * 品牌名，不填写则默认为“其它品牌”
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 经营许可证
	 */
	@ApiField("business_certificate")
	private String businessCertificate;

	/**
	 * 经营许可证有效期，格式：2020-03-20，只有餐饮类目需要
	 */
	@ApiField("business_certificate_expires")
	private String businessCertificateExpires;

	/**
	 * 许可证图片url
	 */
	@ApiField("business_certificate_url")
	private String businessCertificateUrl;

	/**
	 * 营业时间，支持分段营业时间，以英文逗号分隔
	 */
	@ApiField("business_time")
	private String businessTime;

	/**
	 * 最细的类目编号
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 城市编码。
国标码，详见国家统计局数据。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * leads认领时间
	 */
	@ApiField("claim_time")
	private Date claimTime;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系人手机号
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/**
	 * leads创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 门店内景图。
建议上传3-10张，尺寸在2000px＊1500px以上，格式为bmp、png、jpg、gif，不超过10M。
	 */
	@ApiListField("detail_images")
	@ApiField("string")
	private List<String> detailImages;

	/**
	 * 门店内景图名称列表
	 */
	@ApiListField("detail_images_name")
	@ApiField("string")
	private List<String> detailImagesName;

	/**
	 * 门店内景图URL列表
	 */
	@ApiListField("detail_images_url")
	@ApiField("string")
	private List<String> detailImagesUrl;

	/**
	 * 区县编码。
国标码，详见国家统计局数据。
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 扩展属性，JSON格式：keyMerchant-是否重点商户（T/F）
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 机具号，多个之间以英文逗号分隔
	 */
	@ApiField("implement_id")
	private String implementId;

	/**
	 * 是否已补全信息，如果为T，表示leads已经补全信息，可以开店
	 */
	@ApiField("is_complete")
	private String isComplete;

	/**
	 * 是否隐藏：T-是，F-否。
	 */
	@ApiField("is_hidden")
	private String isHidden;

	/**
	 * 是否在其他平台开店，T表示有开店，F表示未开店，用于证明其开店资质，如无营业执照必须有在其他平台的开店资质才能入住口碑平台，其他平台主要包括美团、点评。
	 */
	@ApiField("is_operating_online")
	private String isOperatingOnline;

	/**
	 * 是否系统导入leads：T-是，F-否。
	 */
	@ApiField("is_system_import")
	private String isSystemImport;

	/**
	 * 纬度，注：高德坐标系，需要服务商引导用户校准经纬度
	 */
	@ApiField("latitude")
	private Long latitude;

	/**
	 * 支付宝leads ID，后续的增删改查接口都使用该ID作为主键
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * PUBLIC：公海 PRIVATE：私海
	 */
	@ApiField("leads_range")
	private String leadsRange;

	/**
	 * 门店营业执照图片
	 */
	@ApiField("licence")
	private String licence;

	/**
	 * 门店营业执照编号
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
	 * 证照图片url
	 */
	@ApiField("licence_url")
	private String licenceUrl;

	/**
	 * 经度，注：高德坐标系，需要服务商引导用户校准经纬度
	 */
	@ApiField("longitude")
	private Long longitude;

	/**
	 * 门店首图。
建议尺寸在2000px＊1500px以上，格式为bmp、png、jpg、gif，不超过10M。
	 */
	@ApiField("main_image")
	private String mainImage;

	/**
	 * 门店首图名称
	 */
	@ApiField("main_image_name")
	private String mainImageName;

	/**
	 * 门店首图URL
	 */
	@ApiField("main_image_url")
	private String mainImageUrl;

	/**
	 * 主门店名
	 */
	@ApiField("main_shop_name")
	private String mainShopName;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 是否有无烟区，T表示有无烟区，F表示没有无烟区
	 */
	@ApiField("no_smoking")
	private String noSmoking;

	/**
	 * 其他平台开店竞对图片url，多个url使用英文逗号隔开,isv迁移到新接口使用此字段，与is_operating_online=T配套使用。online_image升级到version=2.0版本后将废弃，使用online_url替代。
	 */
	@ApiField("online_url")
	private String onlineUrl;

	/**
	 * 操作用户的支付账号id
	 */
	@ApiField("op_id")
	private String opId;

	/**
	 * 支付宝内部使用，外部商户不需要填写此字段。其他资质
	 */
	@ApiField("other_authorization")
	private String otherAuthorization;

	/**
	 * 其他资质url列表，逗号分隔
	 */
	@ApiField("other_authorization_url")
	private String otherAuthorizationUrl;

	/**
	 * 其他联系方式
	 */
	@ApiField("other_contact_info")
	private String otherContactInfo;

	/**
	 * 门店是否支持停车，T表示支持，F表示不支持
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
	 * 省份编码。
国标码，详见国家统计局数据。
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 请求ID，标识本次创建请求
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * leads状态。
INIT：未认领，CLAIMED：已认领，CONFIRMING：待商户确认，RELATED：已关联商户，OPENING：开店中，OPENED：已开店。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 外部门店编号；
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

	public String getAuthLetterUrl() {
		return this.authLetterUrl;
	}
	public void setAuthLetterUrl(String authLetterUrl) {
		this.authLetterUrl = authLetterUrl;
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

	public String getBrandLogoUrl() {
		return this.brandLogoUrl;
	}
	public void setBrandLogoUrl(String brandLogoUrl) {
		this.brandLogoUrl = brandLogoUrl;
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

	public String getBusinessCertificateUrl() {
		return this.businessCertificateUrl;
	}
	public void setBusinessCertificateUrl(String businessCertificateUrl) {
		this.businessCertificateUrl = businessCertificateUrl;
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

	public Date getClaimTime() {
		return this.claimTime;
	}
	public void setClaimTime(Date claimTime) {
		this.claimTime = claimTime;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public List<String> getDetailImages() {
		return this.detailImages;
	}
	public void setDetailImages(List<String> detailImages) {
		this.detailImages = detailImages;
	}

	public List<String> getDetailImagesName() {
		return this.detailImagesName;
	}
	public void setDetailImagesName(List<String> detailImagesName) {
		this.detailImagesName = detailImagesName;
	}

	public List<String> getDetailImagesUrl() {
		return this.detailImagesUrl;
	}
	public void setDetailImagesUrl(List<String> detailImagesUrl) {
		this.detailImagesUrl = detailImagesUrl;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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

	public String getIsHidden() {
		return this.isHidden;
	}
	public void setIsHidden(String isHidden) {
		this.isHidden = isHidden;
	}

	public String getIsOperatingOnline() {
		return this.isOperatingOnline;
	}
	public void setIsOperatingOnline(String isOperatingOnline) {
		this.isOperatingOnline = isOperatingOnline;
	}

	public String getIsSystemImport() {
		return this.isSystemImport;
	}
	public void setIsSystemImport(String isSystemImport) {
		this.isSystemImport = isSystemImport;
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

	public String getLeadsRange() {
		return this.leadsRange;
	}
	public void setLeadsRange(String leadsRange) {
		this.leadsRange = leadsRange;
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

	public String getLicenceUrl() {
		return this.licenceUrl;
	}
	public void setLicenceUrl(String licenceUrl) {
		this.licenceUrl = licenceUrl;
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

	public String getMainImageName() {
		return this.mainImageName;
	}
	public void setMainImageName(String mainImageName) {
		this.mainImageName = mainImageName;
	}

	public String getMainImageUrl() {
		return this.mainImageUrl;
	}
	public void setMainImageUrl(String mainImageUrl) {
		this.mainImageUrl = mainImageUrl;
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

	public String getOtherAuthorization() {
		return this.otherAuthorization;
	}
	public void setOtherAuthorization(String otherAuthorization) {
		this.otherAuthorization = otherAuthorization;
	}

	public String getOtherAuthorizationUrl() {
		return this.otherAuthorizationUrl;
	}
	public void setOtherAuthorizationUrl(String otherAuthorizationUrl) {
		this.otherAuthorizationUrl = otherAuthorizationUrl;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
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
