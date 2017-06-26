package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 默认扩展区创建接口
 *
 * @author auto create
 * @since 1.0, 2017-05-25 11:40:02
 */
public class AlipayOpenPublicDefaultExtensionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6899431421523378722L;

	/**
	 * 默认扩展区列表，最大条数为3，
	 */
	@ApiListField("areas")
	@ApiField("extension_area")
	private List<ExtensionArea> areas;

	public List<ExtensionArea> getAreas() {
		return this.areas;
	}
	public void setAreas(List<ExtensionArea> areas) {
		this.areas = areas;
	}

}
