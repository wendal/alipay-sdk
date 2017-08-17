package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡开卡接口
 *
 * @author auto create
 * @since 1.0, 2017-07-20 10:21:56
 */
public class AlipayMarketingCardOpenModel extends AlipayObject {

	private static final long serialVersionUID = 4428517531971244667L;

	/**
	 * 外部卡信息(biz_card_no无需填写)
	 */
	@ApiField("card_ext_info")
	private MerchantCard cardExtInfo;

	/**
	 * 支付宝分配的卡模板Id（卡模板创建接口返回的模板ID）
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 发卡用户信息
	 */
	@ApiField("card_user_info")
	private CardUserInfo cardUserInfo;

	/**
	 * 商户会员信息
	 */
	@ApiField("member_ext_info")
	private MerchantMenber memberExtInfo;

	/**
	 * 外部商户的领卡渠道，用于记录外部商户端领卡来源的渠道信息，渠道值可自行定义（仅限数字、字母、下划线） 
例如：
线下门店领取:20161534000000000008863（可填门店shopId）
线下扫二维码领取:QR;
线下活动领取:20170522000000000003609（可填商户活动ID）
	 */
	@ApiField("open_card_channel")
	private String openCardChannel;

	/**
	 * 外部商户流水号（商户需要确保唯一性控制，类似request_id唯一请求标识）
	 */
	@ApiField("out_serial_no")
	private String outSerialNo;

	public MerchantCard getCardExtInfo() {
		return this.cardExtInfo;
	}
	public void setCardExtInfo(MerchantCard cardExtInfo) {
		this.cardExtInfo = cardExtInfo;
	}

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public CardUserInfo getCardUserInfo() {
		return this.cardUserInfo;
	}
	public void setCardUserInfo(CardUserInfo cardUserInfo) {
		this.cardUserInfo = cardUserInfo;
	}

	public MerchantMenber getMemberExtInfo() {
		return this.memberExtInfo;
	}
	public void setMemberExtInfo(MerchantMenber memberExtInfo) {
		this.memberExtInfo = memberExtInfo;
	}

	public String getOpenCardChannel() {
		return this.openCardChannel;
	}
	public void setOpenCardChannel(String openCardChannel) {
		this.openCardChannel = openCardChannel;
	}

	public String getOutSerialNo() {
		return this.outSerialNo;
	}
	public void setOutSerialNo(String outSerialNo) {
		this.outSerialNo = outSerialNo;
	}

}
