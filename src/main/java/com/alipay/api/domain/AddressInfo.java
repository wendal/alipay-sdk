package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连商户地址信息
 *
 * @author auto create
 * @since 1.0, 2017-03-15 19:13:20
 */
public class AddressInfo extends AlipayObject {

	private static final long serialVersionUID = 7535731781766753631L;

	/**
	 * 商户详细经营地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 商户所在城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 商户所在区县编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 纬度，浮点型,小数点后最多保留6位
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，浮点型, 小数点后最多保留6位
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 商户所在省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 地址类型。取值范围：BUSINESS_ADDRESS：经营地址（默认）；REGISTERED_ADDRESS：注册地址
	 */
	@ApiField("type")
	private String type;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
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

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
