package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * xwbtest
 *
 * @author auto create
 * @since 1.0, 2017-07-20 15:51:58
 */
public class AlipaySecurityProdXwbtestPurchaseModel extends AlipayObject {

	private static final long serialVersionUID = 6756855987543679856L;

	/**
	 * 参数描述必须通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是否唯一(如需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线时间。
	 */
	@ApiField("add")
	private String add;

	/**
	 * 西湖区文三路国际大厦
	 */
	@ApiField("address")
	private String address;

	/**
	 * 参数描述必须通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是否唯一(如1需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线时间。
	 */
	@ApiField("idcard")
	private String idcard;

	/**
	 * s
	 */
	@ApiField("sdf")
	private AlipayKeyanClass sdf;

	/**
	 * 1 1
	 */
	@ApiListField("sdfx")
	@ApiField("string")
	private List<String> sdfx;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAdd() {
		return this.add;
	}
	public void setAdd(String add) {
		this.add = add;
	}

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdcard() {
		return this.idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public AlipayKeyanClass getSdf() {
		return this.sdf;
	}
	public void setSdf(AlipayKeyanClass sdf) {
		this.sdf = sdf;
	}

	public List<String> getSdfx() {
		return this.sdfx;
	}
	public void setSdfx(List<String> sdfx) {
		this.sdfx = sdfx;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
