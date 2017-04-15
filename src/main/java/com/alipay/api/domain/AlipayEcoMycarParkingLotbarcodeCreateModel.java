package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料二维码
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:18
 */
public class AlipayEcoMycarParkingLotbarcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7615653195648719335L;

	/**
	 * 停车场编号
	 */
	@ApiField("parking_id")
	private String parkingId;

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

}
