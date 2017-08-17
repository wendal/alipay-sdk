package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝个人协议页面签约接口
 *
 * @author auto create
 * @since 1.0, 2017-07-12 15:43:21
 */
public class AlipayUserAgreementPageSignModel extends AlipayObject {

	private static final long serialVersionUID = 5161792687993588862L;

	/**
	 * 请按当前接入的方式进行填充，且输入值必须为文档中的参数取值范围。
扫码或者短信页面签约需要拼装http的请求地址访问中间页面，钱包h5页面签约可直接拼接schema的请求地址
	 */
	@ApiField("access_params")
	private AccessParams accessParams;

	/**
	 * 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。
格式规则：支持大写小写字母和数字，最长32位。
商户系统按需传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 用户在商户网站的登录账号，用于在签约页面展示，如果为空，则不展示
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/**
	 * 用户实名信息参数，包含：姓名、身份证号。商户传入用户实名信息参数，支付宝会对比用户在支付宝端的实名信息。
	 */
	@ApiField("identity_params")
	private IdentityParams identityParams;

	/**
	 * 个人签约产品码，商户和支付宝签约时确定，商户可咨询技术支持。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	/**
	 * 签约产品属性，json格式
	 */
	@ApiField("prod_params")
	private ProdParams prodParams;

	/**
	 * 销售产品码，商户签约的支付宝合同所对应的产品码。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 签约营销参数，此值为json格式；具体的key需与营销约定
	 */
	@ApiField("promo_params")
	private String promoParams;

	/**
	 * 协议签约场景，商户和支付宝签约时确定，商户可咨询技术支持。
当传入商户签约号external_agreement_no时，场景不能为默认值DEFAULT|DEFAULT。
	 */
	@ApiField("sign_scene")
	private String signScene;

	/**
	 * 当前用户签约请求的协议有效周期。
整形数字加上时间单位的协议有效期，从发起签约请求的时间开始算起。
目前支持的时间单位：
1. d：天
2. m：月
如果未传入，默认为长期有效。
	 */
	@ApiField("sign_validity_period")
	private String signValidityPeriod;

	/**
	 * 签约第三方主体类型。对于三方协议，表示当前用户和哪一类的第三方主体进行签约。
取值范围：
1. PARTNER（平台商户）
2. MERCHANT（集团商户），集团下子商户可共享用户签约内容
默认为PARTNER。
	 */
	@ApiField("third_party_type")
	private String thirdPartyType;

	/**
	 * 芝麻授权信息，针对于信用代扣签约。json格式。
	 */
	@ApiField("zm_auth_params")
	private ZmAuthParams zmAuthParams;

	public AccessParams getAccessParams() {
		return this.accessParams;
	}
	public void setAccessParams(AccessParams accessParams) {
		this.accessParams = accessParams;
	}

	public String getExternalAgreementNo() {
		return this.externalAgreementNo;
	}
	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}

	public String getExternalLogonId() {
		return this.externalLogonId;
	}
	public void setExternalLogonId(String externalLogonId) {
		this.externalLogonId = externalLogonId;
	}

	public IdentityParams getIdentityParams() {
		return this.identityParams;
	}
	public void setIdentityParams(IdentityParams identityParams) {
		this.identityParams = identityParams;
	}

	public String getPersonalProductCode() {
		return this.personalProductCode;
	}
	public void setPersonalProductCode(String personalProductCode) {
		this.personalProductCode = personalProductCode;
	}

	public ProdParams getProdParams() {
		return this.prodParams;
	}
	public void setProdParams(ProdParams prodParams) {
		this.prodParams = prodParams;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getPromoParams() {
		return this.promoParams;
	}
	public void setPromoParams(String promoParams) {
		this.promoParams = promoParams;
	}

	public String getSignScene() {
		return this.signScene;
	}
	public void setSignScene(String signScene) {
		this.signScene = signScene;
	}

	public String getSignValidityPeriod() {
		return this.signValidityPeriod;
	}
	public void setSignValidityPeriod(String signValidityPeriod) {
		this.signValidityPeriod = signValidityPeriod;
	}

	public String getThirdPartyType() {
		return this.thirdPartyType;
	}
	public void setThirdPartyType(String thirdPartyType) {
		this.thirdPartyType = thirdPartyType;
	}

	public ZmAuthParams getZmAuthParams() {
		return this.zmAuthParams;
	}
	public void setZmAuthParams(ZmAuthParams zmAuthParams) {
		this.zmAuthParams = zmAuthParams;
	}

}
