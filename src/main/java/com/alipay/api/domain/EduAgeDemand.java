package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兼职平台贴子年龄
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class EduAgeDemand extends AlipayObject {

	private static final long serialVersionUID = 3317486933578448857L;

	/**
	 * 结束年龄
	 */
	@ApiField("age_end")
	private String ageEnd;

	/**
	 * 开始年龄
	 */
	@ApiField("age_start")
	private String ageStart;

	public String getAgeEnd() {
		return this.ageEnd;
	}
	public void setAgeEnd(String ageEnd) {
		this.ageEnd = ageEnd;
	}

	public String getAgeStart() {
		return this.ageStart;
	}
	public void setAgeStart(String ageStart) {
		this.ageStart = ageStart;
	}

}
