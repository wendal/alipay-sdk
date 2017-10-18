package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ceshi moxing
 *
 * @author auto create
 * @since 1.0, 2017-08-01 16:05:41
 */
public class AlipayKeyanClass extends AlipayObject {

<<<<<<< HEAD
	private static final long serialVersionUID = 1266868697951293844L;
=======
	private static final long serialVersionUID = 3216995243184443443L;
>>>>>>> master

	/**
	 * 1
	 */
	@ApiField("user_name")
	private String userName;

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
