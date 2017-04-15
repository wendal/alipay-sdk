package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车牌代扣状态查询API
 *
 * @author auto create
 * @since 1.0, 2016-12-22 21:53:37
 */
public class AlipayEcoMycarParkingAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2261245978275471251L;

	/**
	 * 车牌，用户车辆进场时ISV设备识别到的车辆牌照
	 */
	@ApiField("car_number")
	private String carNumber;

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

}
