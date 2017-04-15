package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品诊断类型列表对象
 *
 * @author auto create
 * @since 1.0, 2017-02-12 21:51:42
 */
public class ItemDiagnoseType extends AlipayObject {

	private static final long serialVersionUID = 8132968377483424638L;

	/**
	 * 类型
	 */
	@ApiField("item_diagnose")
	private String itemDiagnose;

	/**
	 * 对类型的描述
	 */
	@ApiField("item_diagnose_desc")
	private String itemDiagnoseDesc;

	public String getItemDiagnose() {
		return this.itemDiagnose;
	}
	public void setItemDiagnose(String itemDiagnose) {
		this.itemDiagnose = itemDiagnose;
	}

	public String getItemDiagnoseDesc() {
		return this.itemDiagnoseDesc;
	}
	public void setItemDiagnoseDesc(String itemDiagnoseDesc) {
		this.itemDiagnoseDesc = itemDiagnoseDesc;
	}

}
