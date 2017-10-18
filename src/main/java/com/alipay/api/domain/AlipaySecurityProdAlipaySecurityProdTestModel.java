package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安全业务操作
 *
 * @author auto create
 * @since 1.0, 2016-03-02 10:47:05
 */
public class AlipaySecurityProdAlipaySecurityProdTestModel extends AlipayObject {

<<<<<<< HEAD
	private static final long serialVersionUID = 8741169651142426571L;
=======
	private static final long serialVersionUID = 4373229684639596743L;
>>>>>>> master

	/**
	 * ddd
	 */
	@ApiListField("cds")
	@ApiField("string")
	private List<String> cds;

	/**
	 * aaa
	 */
	@ApiField("ddd")
	private String ddd;

	public List<String> getCds() {
		return this.cds;
	}
	public void setCds(List<String> cds) {
		this.cds = cds;
	}

	public String getDdd() {
		return this.ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

}
