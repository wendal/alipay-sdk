package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于支付宝用户通过医院服务窗绑定当地社保卡
 *
 * @author auto create
 * @since 1.0, 2017-06-09 11:56:55
 */
public class AlipayCommerceMedicalInstcardBindModel extends AlipayObject {

	private static final long serialVersionUID = 5811448548914949798L;

	/**
	 * 区域编码，使用国家行政区划代码，可参看
http://www.stats.gov.cn/tjsj/tjbz/xzqhdm
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 支付宝处理完请求后，如验证成功，当前页面自动跳转到商户网站里指定页面的http路径。
	 */
	@ApiField("return_url")
	private String returnUrl;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

}
