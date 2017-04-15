package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车卡生成二维码
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:18
 */
public class AlipayEcoMycarParkingCardbarcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1253157229149268133L;

	/**
	 * 设备商订单id
	 */
	@ApiField("equipment_id")
	private String equipmentId;

	/**
	 * 支付宝交易流水号订单
	 */
	@ApiField("parking_id")
	private String parkingId;

	public String getEquipmentId() {
		return this.equipmentId;
	}
	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

}
