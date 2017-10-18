package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISP功能测试接口
 *
 * @author auto create
 * @since 1.0, 2017-09-25 09:09:21
 */
public class AlipayOpenAppPackagetestModel extends AlipayObject {

<<<<<<< HEAD
	private static final long serialVersionUID = 6425369949518668532L;
=======
	private static final long serialVersionUID = 1225979959429342258L;
>>>>>>> master

	/**
	 * testtest
	 */
	@ApiField("testparam")
	private String testparam;

	/**
	 * testtest
	 */
	@ApiField("testtest")
	private String testtest;

	public String getTestparam() {
		return this.testparam;
	}
	public void setTestparam(String testparam) {
		this.testparam = testparam;
	}

	public String getTesttest() {
		return this.testtest;
	}
	public void setTesttest(String testtest) {
		this.testtest = testtest;
	}

}
