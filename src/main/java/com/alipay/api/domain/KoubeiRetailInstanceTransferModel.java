package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户维度券置顶接口
 *
 * @author auto create
 * @since 1.0, 2017-08-24 21:58:24
 */
public class KoubeiRetailInstanceTransferModel extends AlipayObject {

	private static final long serialVersionUID = 8492788638211521256L;

	/**
	 * json格式的置顶的券id列表信息，id的顺序指定置顶的券的顺序
	 */
	@ApiField("instance_id_list")
	private String instanceIdList;

	public String getInstanceIdList() {
		return this.instanceIdList;
	}
	public void setInstanceIdList(String instanceIdList) {
		this.instanceIdList = instanceIdList;
	}

}
