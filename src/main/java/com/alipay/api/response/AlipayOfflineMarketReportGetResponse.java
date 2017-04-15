package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.report.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-05-16 16:13:16
 */
public class AlipayOfflineMarketReportGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8549235484677352582L;

	/** 
	 * 街道
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 近30日交易金额
	 */
	@ApiField("amount_in_30_days")
	private String amountIn30Days;

	/** 
	 * 近7日交易金额
	 */
	@ApiField("amount_in_7_days")
	private String amountIn7Days;

	/** 
	 * 人均消费金额(单位:分,下同)
	 */
	@ApiField("amount_per_capita")
	private String amountPerCapita;

	/** 
	 * 昨日交易金额
	 */
	@ApiField("amount_yesterday")
	private String amountYesterday;

	/** 
	 * 大区
	 */
	@ApiField("area")
	private String area;

	/** 
	 * WAITING_ASSIGN(待分配)、确认中(CONFIRMING)、已分配(ASSIGNED)
	 */
	@ApiField("assign_status")
	private String assignStatus;

	/** 
	 * 后台小二的UID
	 */
	@ApiField("bd_staff_uid")
	private String bdStaffUid;

	/** 
	 * 品牌
	 */
	@ApiField("brand_name")
	private String brandName;

	/** 
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 市代码
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 城市经理
	 */
	@ApiField("city_manager_name")
	private String cityManagerName;

	/** 
	 * 城市经理uid
	 */
	@ApiField("city_manager_uid")
	private String cityManagerUid;

	/** 
	 * 竞对最低折扣值
	 */
	@ApiField("competitor_lowest_discount")
	private String competitorLowestDiscount;

	/** 
	 * 1：全民开店的数据开店类型显示为全民开店；0：非全民开店的数据开店类型显示为非全民开店；
	 */
	@ApiField("create_channel")
	private String createChannel;

	/** 
	 * 三级行业
	 */
	@ApiField("detail_category")
	private String detailCategory;

	/** 
	 * 三级行业编号
	 */
	@ApiField("detail_category_code")
	private String detailCategoryCode;

	/** 
	 * 折扣id
	 */
	@ApiField("discount_id")
	private String discountId;

	/** 
	 * 区(县)
	 */
	@ApiField("district")
	private String district;

	/** 
	 * 区县代码
	 */
	@ApiField("district_code")
	private String districtCode;

	/** 
	 * 当面付审核状态
	 */
	@ApiField("f2f_audit_status")
	private String f2fAuditStatus;

	/** 
	 * 当面付生效时间
	 */
	@ApiField("f2f_online")
	private Date f2fOnline;

	/** 
	 * 当面付签约次数
	 */
	@ApiField("f2f_sign_count")
	private String f2fSignCount;

	/** 
	 * 当面付状态
	 */
	@ApiField("f2f_status")
	private String f2fStatus;

	/** 
	 * 当面付签约情况-版本
	 */
	@ApiField("f2f_version")
	private String f2fVersion;

	/** 
	 * 当面付审核状态
	 */
	@ApiField("ff_audit_status")
	private String ffAuditStatus;

	/** 
	 * 当面付生效时间
	 */
	@ApiField("ff_online")
	private Date ffOnline;

	/** 
	 * 当面付签约次数
	 */
	@ApiField("ff_sign_count")
	private String ffSignCount;

	/** 
	 * 当面付状态
	 */
	@ApiField("ff_status")
	private String ffStatus;

	/** 
	 * 当面付签约情况-版本
	 */
	@ApiField("ff_version")
	private String ffVersion;

	/** 
	 * 门店创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 门店修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 有无折扣
	 */
	@ApiField("has_discount")
	private String hasDiscount;

	/** 
	 * 是否享受立减(0:否；1:是)
	 */
	@ApiField("has_discount_privilege")
	private String hasDiscountPrivilege;

	/** 
	 * 是否有机具
	 */
	@ApiField("has_equipment")
	private String hasEquipment;

	/** 
	 * 有无双证
	 */
	@ApiField("has_shuangzheng")
	private String hasShuangzheng;

	/** 
	 * 是否有全民折扣(0:否；1:是)
	 */
	@ApiField("has_whole_people_discount")
	private String hasWholePeopleDiscount;

	/** 
	 * 流水号
	 */
	@ApiField("id")
	private String id;

	/** 
	 * 是否在黑名单(0:否；1:是)
	 */
	@ApiField("in_blacklist")
	private String inBlacklist;

	/** 
	 * 有效期30天以上折扣是否核销
	 */
	@ApiField("item_consumed_30")
	private String itemConsumed30;

	/** 
	 * 有效期30天以上折扣数
	 */
	@ApiField("item_count_30")
	private String itemCount30;

	/** 
	 * 是否ka
	 */
	@ApiField("ka")
	private String ka;

	/** 
	 * leads商户名称
	 */
	@ApiField("leads_name")
	private String leadsName;

	/** 
	 * 城市经理或超级管理员确认门店分配的时间
	 */
	@ApiField("manual_confirm_assign_time")
	private Date manualConfirmAssignTime;

	/** 
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 电话
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 近30天大于2元订单量
	 */
	@ApiField("order_1")
	private String order1;

	/** 
	 * 近1天大于2元订单量
	 */
	@ApiField("order_in_1_day")
	private String orderIn1Day;

	/** 
	 * 近7天内大于2元订单量
	 */
	@ApiField("order_in_7_days")
	private String orderIn7Days;

	/** 
	 * 一级行业
	 */
	@ApiField("pri_category")
	private String priCategory;

	/** 
	 * 一级行业编号
	 */
	@ApiField("pri_category_code")
	private String priCategoryCode;

	/** 
	 * 省代码
	 */
	@ApiField("prov_code")
	private String provCode;

	/** 
	 * 服务商名称
	 */
	@ApiField("provider_name")
	private String providerName;

	/** 
	 * 服务商Pid
	 */
	@ApiField("provider_pid")
	private String providerPid;

	/** 
	 * 服务商小二
	 */
	@ApiField("provider_staff_name")
	private String providerStaffName;

	/** 
	 * 服务商小二uid
	 */
	@ApiField("provider_staff_uid")
	private String providerStaffUid;

	/** 
	 * 省
	 */
	@ApiField("province")
	private String province;

	/** 
	 * 全民开店类型的推荐人,体现为归属人
	 */
	@ApiField("recommender")
	private String recommender;

	/** 
	 * 推荐人类型
	 */
	@ApiField("recommender_type")
	private String recommenderType;

	/** 
	 * 门店审核状态(审核中|审核通过|审核失败)
	 */
	@ApiField("shop_audit_status")
	private String shopAuditStatus;

	/** 
	 * 门店编号
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 店铺运营等级，0：全国KA，1：城市重点，2：中小，3：长尾
	 */
	@ApiField("shop_level")
	private String shopLevel;

	/** 
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/** 
	 * 门店首次上架时间
	 */
	@ApiField("shop_online")
	private Date shopOnline;

	/** 
	 * 开店来源。有服务商开店，商家自主开店，全民个人开店等
	 */
	@ApiField("shop_source")
	private String shopSource;

	/** 
	 * 门店标签,多个以逗号分隔
	 */
	@ApiField("shop_tag")
	private String shopTag;

	/** 
	 * 二级行业
	 */
	@ApiField("sub_category")
	private String subCategory;

	/** 
	 * 二级行业编号
	 */
	@ApiField("sub_category_code")
	private String subCategoryCode;

	/** 
	 * 电话
	 */
	@ApiField("telephone")
	private String telephone;

	/** 
	 * 近30天大于2元用户数
	 */
	@ApiField("user_1")
	private String user1;

	/** 
	 * user_in_1_day
	 */
	@ApiField("user_in_1_day")
	private String userIn1Day;

	/** 
	 * 近7天内大于2元的用户数
	 */
	@ApiField("user_in_7_days")
	private String userIn7Days;

	/** 
	 * 近1天核销笔数
	 */
	@ApiField("verification_in_1_day")
	private String verificationIn1Day;

	/** 
	 * 近30天内核销笔数
	 */
	@ApiField("verification_in_30_days")
	private String verificationIn30Days;

	/** 
	 * 近7天内核销笔数
	 */
	@ApiField("verification_in_7_days")
	private String verificationIn7Days;

	/** 
	 * 全民最低折扣值
	 */
	@ApiField("whole_people_lowest_discount")
	private String wholePeopleLowestDiscount;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setAmountIn30Days(String amountIn30Days) {
		this.amountIn30Days = amountIn30Days;
	}
	public String getAmountIn30Days( ) {
		return this.amountIn30Days;
	}

	public void setAmountIn7Days(String amountIn7Days) {
		this.amountIn7Days = amountIn7Days;
	}
	public String getAmountIn7Days( ) {
		return this.amountIn7Days;
	}

	public void setAmountPerCapita(String amountPerCapita) {
		this.amountPerCapita = amountPerCapita;
	}
	public String getAmountPerCapita( ) {
		return this.amountPerCapita;
	}

	public void setAmountYesterday(String amountYesterday) {
		this.amountYesterday = amountYesterday;
	}
	public String getAmountYesterday( ) {
		return this.amountYesterday;
	}

	public void setArea(String area) {
		this.area = area;
	}
	public String getArea( ) {
		return this.area;
	}

	public void setAssignStatus(String assignStatus) {
		this.assignStatus = assignStatus;
	}
	public String getAssignStatus( ) {
		return this.assignStatus;
	}

	public void setBdStaffUid(String bdStaffUid) {
		this.bdStaffUid = bdStaffUid;
	}
	public String getBdStaffUid( ) {
		return this.bdStaffUid;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandName( ) {
		return this.brandName;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity( ) {
		return this.city;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityCode( ) {
		return this.cityCode;
	}

	public void setCityManagerName(String cityManagerName) {
		this.cityManagerName = cityManagerName;
	}
	public String getCityManagerName( ) {
		return this.cityManagerName;
	}

	public void setCityManagerUid(String cityManagerUid) {
		this.cityManagerUid = cityManagerUid;
	}
	public String getCityManagerUid( ) {
		return this.cityManagerUid;
	}

	public void setCompetitorLowestDiscount(String competitorLowestDiscount) {
		this.competitorLowestDiscount = competitorLowestDiscount;
	}
	public String getCompetitorLowestDiscount( ) {
		return this.competitorLowestDiscount;
	}

	public void setCreateChannel(String createChannel) {
		this.createChannel = createChannel;
	}
	public String getCreateChannel( ) {
		return this.createChannel;
	}

	public void setDetailCategory(String detailCategory) {
		this.detailCategory = detailCategory;
	}
	public String getDetailCategory( ) {
		return this.detailCategory;
	}

	public void setDetailCategoryCode(String detailCategoryCode) {
		this.detailCategoryCode = detailCategoryCode;
	}
	public String getDetailCategoryCode( ) {
		return this.detailCategoryCode;
	}

	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}
	public String getDiscountId( ) {
		return this.discountId;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	public String getDistrict( ) {
		return this.district;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictCode( ) {
		return this.districtCode;
	}

	public void setF2fAuditStatus(String f2fAuditStatus) {
		this.f2fAuditStatus = f2fAuditStatus;
	}
	public String getF2fAuditStatus( ) {
		return this.f2fAuditStatus;
	}

	public void setF2fOnline(Date f2fOnline) {
		this.f2fOnline = f2fOnline;
	}
	public Date getF2fOnline( ) {
		return this.f2fOnline;
	}

	public void setF2fSignCount(String f2fSignCount) {
		this.f2fSignCount = f2fSignCount;
	}
	public String getF2fSignCount( ) {
		return this.f2fSignCount;
	}

	public void setF2fStatus(String f2fStatus) {
		this.f2fStatus = f2fStatus;
	}
	public String getF2fStatus( ) {
		return this.f2fStatus;
	}

	public void setF2fVersion(String f2fVersion) {
		this.f2fVersion = f2fVersion;
	}
	public String getF2fVersion( ) {
		return this.f2fVersion;
	}

	public void setFfAuditStatus(String ffAuditStatus) {
		this.ffAuditStatus = ffAuditStatus;
	}
	public String getFfAuditStatus( ) {
		return this.ffAuditStatus;
	}

	public void setFfOnline(Date ffOnline) {
		this.ffOnline = ffOnline;
	}
	public Date getFfOnline( ) {
		return this.ffOnline;
	}

	public void setFfSignCount(String ffSignCount) {
		this.ffSignCount = ffSignCount;
	}
	public String getFfSignCount( ) {
		return this.ffSignCount;
	}

	public void setFfStatus(String ffStatus) {
		this.ffStatus = ffStatus;
	}
	public String getFfStatus( ) {
		return this.ffStatus;
	}

	public void setFfVersion(String ffVersion) {
		this.ffVersion = ffVersion;
	}
	public String getFfVersion( ) {
		return this.ffVersion;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

	public void setHasDiscount(String hasDiscount) {
		this.hasDiscount = hasDiscount;
	}
	public String getHasDiscount( ) {
		return this.hasDiscount;
	}

	public void setHasDiscountPrivilege(String hasDiscountPrivilege) {
		this.hasDiscountPrivilege = hasDiscountPrivilege;
	}
	public String getHasDiscountPrivilege( ) {
		return this.hasDiscountPrivilege;
	}

	public void setHasEquipment(String hasEquipment) {
		this.hasEquipment = hasEquipment;
	}
	public String getHasEquipment( ) {
		return this.hasEquipment;
	}

	public void setHasShuangzheng(String hasShuangzheng) {
		this.hasShuangzheng = hasShuangzheng;
	}
	public String getHasShuangzheng( ) {
		return this.hasShuangzheng;
	}

	public void setHasWholePeopleDiscount(String hasWholePeopleDiscount) {
		this.hasWholePeopleDiscount = hasWholePeopleDiscount;
	}
	public String getHasWholePeopleDiscount( ) {
		return this.hasWholePeopleDiscount;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

	public void setInBlacklist(String inBlacklist) {
		this.inBlacklist = inBlacklist;
	}
	public String getInBlacklist( ) {
		return this.inBlacklist;
	}

	public void setItemConsumed30(String itemConsumed30) {
		this.itemConsumed30 = itemConsumed30;
	}
	public String getItemConsumed30( ) {
		return this.itemConsumed30;
	}

	public void setItemCount30(String itemCount30) {
		this.itemCount30 = itemCount30;
	}
	public String getItemCount30( ) {
		return this.itemCount30;
	}

	public void setKa(String ka) {
		this.ka = ka;
	}
	public String getKa( ) {
		return this.ka;
	}

	public void setLeadsName(String leadsName) {
		this.leadsName = leadsName;
	}
	public String getLeadsName( ) {
		return this.leadsName;
	}

	public void setManualConfirmAssignTime(Date manualConfirmAssignTime) {
		this.manualConfirmAssignTime = manualConfirmAssignTime;
	}
	public Date getManualConfirmAssignTime( ) {
		return this.manualConfirmAssignTime;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
	}

	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setOrder1(String order1) {
		this.order1 = order1;
	}
	public String getOrder1( ) {
		return this.order1;
	}

	public void setOrderIn1Day(String orderIn1Day) {
		this.orderIn1Day = orderIn1Day;
	}
	public String getOrderIn1Day( ) {
		return this.orderIn1Day;
	}

	public void setOrderIn7Days(String orderIn7Days) {
		this.orderIn7Days = orderIn7Days;
	}
	public String getOrderIn7Days( ) {
		return this.orderIn7Days;
	}

	public void setPriCategory(String priCategory) {
		this.priCategory = priCategory;
	}
	public String getPriCategory( ) {
		return this.priCategory;
	}

	public void setPriCategoryCode(String priCategoryCode) {
		this.priCategoryCode = priCategoryCode;
	}
	public String getPriCategoryCode( ) {
		return this.priCategoryCode;
	}

	public void setProvCode(String provCode) {
		this.provCode = provCode;
	}
	public String getProvCode( ) {
		return this.provCode;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public String getProviderName( ) {
		return this.providerName;
	}

	public void setProviderPid(String providerPid) {
		this.providerPid = providerPid;
	}
	public String getProviderPid( ) {
		return this.providerPid;
	}

	public void setProviderStaffName(String providerStaffName) {
		this.providerStaffName = providerStaffName;
	}
	public String getProviderStaffName( ) {
		return this.providerStaffName;
	}

	public void setProviderStaffUid(String providerStaffUid) {
		this.providerStaffUid = providerStaffUid;
	}
	public String getProviderStaffUid( ) {
		return this.providerStaffUid;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvince( ) {
		return this.province;
	}

	public void setRecommender(String recommender) {
		this.recommender = recommender;
	}
	public String getRecommender( ) {
		return this.recommender;
	}

	public void setRecommenderType(String recommenderType) {
		this.recommenderType = recommenderType;
	}
	public String getRecommenderType( ) {
		return this.recommenderType;
	}

	public void setShopAuditStatus(String shopAuditStatus) {
		this.shopAuditStatus = shopAuditStatus;
	}
	public String getShopAuditStatus( ) {
		return this.shopAuditStatus;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setShopLevel(String shopLevel) {
		this.shopLevel = shopLevel;
	}
	public String getShopLevel( ) {
		return this.shopLevel;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopName( ) {
		return this.shopName;
	}

	public void setShopOnline(Date shopOnline) {
		this.shopOnline = shopOnline;
	}
	public Date getShopOnline( ) {
		return this.shopOnline;
	}

	public void setShopSource(String shopSource) {
		this.shopSource = shopSource;
	}
	public String getShopSource( ) {
		return this.shopSource;
	}

	public void setShopTag(String shopTag) {
		this.shopTag = shopTag;
	}
	public String getShopTag( ) {
		return this.shopTag;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getSubCategory( ) {
		return this.subCategory;
	}

	public void setSubCategoryCode(String subCategoryCode) {
		this.subCategoryCode = subCategoryCode;
	}
	public String getSubCategoryCode( ) {
		return this.subCategoryCode;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getTelephone( ) {
		return this.telephone;
	}

	public void setUser1(String user1) {
		this.user1 = user1;
	}
	public String getUser1( ) {
		return this.user1;
	}

	public void setUserIn1Day(String userIn1Day) {
		this.userIn1Day = userIn1Day;
	}
	public String getUserIn1Day( ) {
		return this.userIn1Day;
	}

	public void setUserIn7Days(String userIn7Days) {
		this.userIn7Days = userIn7Days;
	}
	public String getUserIn7Days( ) {
		return this.userIn7Days;
	}

	public void setVerificationIn1Day(String verificationIn1Day) {
		this.verificationIn1Day = verificationIn1Day;
	}
	public String getVerificationIn1Day( ) {
		return this.verificationIn1Day;
	}

	public void setVerificationIn30Days(String verificationIn30Days) {
		this.verificationIn30Days = verificationIn30Days;
	}
	public String getVerificationIn30Days( ) {
		return this.verificationIn30Days;
	}

	public void setVerificationIn7Days(String verificationIn7Days) {
		this.verificationIn7Days = verificationIn7Days;
	}
	public String getVerificationIn7Days( ) {
		return this.verificationIn7Days;
	}

	public void setWholePeopleLowestDiscount(String wholePeopleLowestDiscount) {
		this.wholePeopleLowestDiscount = wholePeopleLowestDiscount;
	}
	public String getWholePeopleLowestDiscount( ) {
		return this.wholePeopleLowestDiscount;
	}

}
