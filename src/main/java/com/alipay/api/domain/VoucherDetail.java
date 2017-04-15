package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券明细信息
 *
 * @author auto create
 * @since 1.0, 2017-04-10 14:29:41
 */
public class VoucherDetail extends AlipayObject {

	private static final long serialVersionUID = 1354734289678372552L;

	/**
	 * 优惠券面额，它应该会等于商家出资加上其他出资方出资
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 券id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 优惠券备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商家出资（特指发起交易的商家出资金额）
	 */
	@ApiField("merchant_contribute")
	private String merchantContribute;

	/**
	 * 券名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 其他出资方出资金额，可能是支付宝，可能是品牌商，或者其他方，也可能是他们的一起出资
	 */
	@ApiField("other_contribute")
	private String otherContribute;

	/**
	 * 当前有三种类型：
ALIPAY_FIX_VOUCHER - 全场代金券
ALIPAY_DISCOUNT_VOUCHER - 折扣券
ALIPAY_ITEM_VOUCHER - 单品优惠
注：不排除将来新增其他类型的可能，商家接入时注意兼容性避免硬编码
	 */
	@ApiField("type")
	private String type;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMerchantContribute() {
		return this.merchantContribute;
	}
	public void setMerchantContribute(String merchantContribute) {
		this.merchantContribute = merchantContribute;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOtherContribute() {
		return this.otherContribute;
	}
	public void setOtherContribute(String otherContribute) {
		this.otherContribute = otherContribute;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
