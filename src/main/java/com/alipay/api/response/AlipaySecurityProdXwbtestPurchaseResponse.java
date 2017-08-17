package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.xwbtest.purchase response.
 * 
 * @author auto create
 * @since 1.0, 2017-07-20 15:51:58
 */
public class AlipaySecurityProdXwbtestPurchaseResponse extends AlipayResponse {

	private static final long serialVersionUID = 4623816833543112996L;

	/** 
	 * 参数描述必须通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是否唯一(如需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线时间。
	 */
	@ApiField("add")
	private String add;

	/** 
	 * 1
	 */
	@ApiField("as")
	private String as;

	/** 
	 * 参数描述必须通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是否唯一(如需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线时间。
	 */
	@ApiListField("del")
	@ApiField("boolean")
	private List<Boolean> del;

	/** 
	 * 参数描述必须1通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是否唯一(如需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线时间。
	 */
	@ApiField("idcard")
	private String idcard;

	public void setAdd(String add) {
		this.add = add;
	}
	public String getAdd( ) {
		return this.add;
	}

	public void setAs(String as) {
		this.as = as;
	}
	public String getAs( ) {
		return this.as;
	}

	public void setDel(List<Boolean> del) {
		this.del = del;
	}
	public List<Boolean> getDel( ) {
		return this.del;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getIdcard( ) {
		return this.idcard;
	}

}
