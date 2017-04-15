package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通过该接口多组合条件查询口碑线下Leads信息
 *
 * @author auto create
 * @since 1.0, 2017-02-07 16:46:29
 */
public class AlipayOfflineMarketLeadsBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8475985677154874716L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 最细的类目编号
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 区域编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 筛选记录创建时间的结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 支付宝leads ID列表，最多一次查询100个leads详情。
	 */
	@ApiListField("leads_ids")
	@ApiField("string")
	private List<String> leadsIds;

	/**
	 * 若不以request_ids或者leads_ids查询，则此参数必填。PUBLIC：公海查询 PRIVATE：私海查询
	 */
	@ApiField("leads_range")
	private String leadsRange;

	/**
	 * 操作用户的支付账号id
	 */
	@ApiField("op_id")
	private String opId;

	/**
	 * 页码，留空标示第一页，默认20个结果为一页
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页记录数，默认20，最大100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 省编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 请求ID，根据请求ID精确查询，最多一次查询100个leads详情。
	 */
	@ApiListField("request_ids")
	@ApiField("string")
	private List<String> requestIds;

	/**
	 * 门店标签，注意传多个分店信息无法匹配
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 筛选记录创建时间的起始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * Leads状态。INIT：未认领，CLAIMED：已认领，CONFIRMING：待商户确认，RELATED：已关联商户，OPENING：开店中，OPENED：已开店
	 */
	@ApiField("status")
	private String status;

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

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<String> getLeadsIds() {
		return this.leadsIds;
	}
	public void setLeadsIds(List<String> leadsIds) {
		this.leadsIds = leadsIds;
	}

	public String getLeadsRange() {
		return this.leadsRange;
	}
	public void setLeadsRange(String leadsRange) {
		this.leadsRange = leadsRange;
	}

	public String getOpId() {
		return this.opId;
	}
	public void setOpId(String opId) {
		this.opId = opId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public List<String> getRequestIds() {
		return this.requestIds;
	}
	public void setRequestIds(List<String> requestIds) {
		this.requestIds = requestIds;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
