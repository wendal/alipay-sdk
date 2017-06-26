package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 停车ISV系统配置接口
 *
 * @author auto create
 * @since 1.0, 2017-06-13 15:26:36
 */
public class AlipayEcoMycarParkingConfigSetModel extends AlipayObject {

	private static final long serialVersionUID = 6292363796355648111L;

	/**
	 * 签约支付宝账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 接口信息列表，停车业务需要配置的接口列表，该值为JSON数据格式的LIST对象，现阶段只需要配置一个页面接口即可 。每次请将所有的接口配置信息都传入，未传的接口信息将会被置空。
	 */
	@ApiListField("interface_info_list")
	@ApiField("interface_info_list")
	private List<InterfaceInfoList> interfaceInfoList;

	/**
	 * 商户简称，由开发者提供
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户客服电话
	 */
	@ApiField("merchant_service_phone")
	private String merchantServicePhone;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public List<InterfaceInfoList> getInterfaceInfoList() {
		return this.interfaceInfoList;
	}
	public void setInterfaceInfoList(List<InterfaceInfoList> interfaceInfoList) {
		this.interfaceInfoList = interfaceInfoList;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantServicePhone() {
		return this.merchantServicePhone;
	}
	public void setMerchantServicePhone(String merchantServicePhone) {
		this.merchantServicePhone = merchantServicePhone;
	}

}
