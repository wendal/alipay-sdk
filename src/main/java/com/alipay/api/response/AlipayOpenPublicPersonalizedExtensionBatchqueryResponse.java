package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryExtension;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.personalized.extension.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-01 11:26:41
 */
public class AlipayOpenPublicPersonalizedExtensionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6182659922684928618L;

	/** 
	 * 个性化扩展区套数
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * 个性化扩展区信息
	 */
	@ApiListField("extensions")
	@ApiField("query_extension")
	private List<QueryExtension> extensions;

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

	public void setExtensions(List<QueryExtension> extensions) {
		this.extensions = extensions;
	}
	public List<QueryExtension> getExtensions( ) {
		return this.extensions;
	}

}
