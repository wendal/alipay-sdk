package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员卡模板创建
 *
 * @author auto create
 * @since 1.0, 2016-12-22 10:40:36
 */
public class AlipayMarketingCardTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7748489956218557613L;

	/**
	 * 业务卡号前缀，由商户自定义
	 */
	@ApiField("biz_no_prefix")
	private String bizNoPrefix;

	/**
	 * 业务卡号后缀长度，最大int值不能超过32-biz_no_suffix长度
	 */
	@ApiField("biz_no_suffix_len")
	private String bizNoSuffixLen;

	/**
	 * 卡级别配置
	 */
	@ApiListField("card_level_conf")
	@ApiField("template_card_level_conf_d_t_o")
	private List<TemplateCardLevelConfDTO> cardLevelConf;

	/**
	 * 卡类型为固定枚举类型，可选类型如下：
OUT_MEMBER_CARD：外部权益卡
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 栏位信息
	 */
	@ApiListField("column_info_list")
	@ApiField("template_column_info_d_t_o")
	private List<TemplateColumnInfoDTO> columnInfoList;

	/**
	 * 字段规则列表，会员卡开卡过程中，会员卡信息的生成规则，
例如：卡有效期为开卡后两年内有效，则设置为：DATE_IN_FUTURE
	 */
	@ApiListField("field_rule_list")
	@ApiField("template_field_rule_d_t_o")
	private List<TemplateFieldRuleDTO> fieldRuleList;

	/**
	 * 会员卡用户领卡配置，在门店等渠道露出领卡入口时，需要部署的商户领卡H5页面地址
	 */
	@ApiField("open_card_conf")
	private TemplateOpenCardConfDTO openCardConf;

	/**
	 * 卡模板投放渠道
	 */
	@ApiListField("pub_channels")
	@ApiField("pub_channel_d_t_o")
	private List<PubChannelDTO> pubChannels;

	/**
	 * 请求ID，由开发者生成并保证唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 服务Code
HUABEI_FUWU：花呗服务（只有需要花呗服务时，才需要加入该标识）
	 */
	@ApiListField("service_label_list")
	@ApiField("string")
	private List<String> serviceLabelList;

	/**
	 * 会员卡上架门店id（支付宝门店id），既发放会员卡的商家门店id
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * 权益信息，
1、在卡包的卡详情页面会自动添加权益栏位，展现会员卡特权，
2、如果添加门店渠道，则可在门店页展现会员卡的权益
	 */
	@ApiListField("template_benefit_info")
	@ApiField("template_benefit_info_d_t_o")
	private List<TemplateBenefitInfoDTO> templateBenefitInfo;

	/**
	 * 模板样式信息
	 */
	@ApiField("template_style_info")
	private TemplateStyleInfoDTO templateStyleInfo;

	/**
	 * 卡包详情页面中展现出的卡码（可用于扫码核销）
qrcode: 二维码
dqrcode: 动态二维码
barcode: 条码
dbarcode: 动态条码
text: 文本
	 */
	@ApiField("write_off_type")
	private String writeOffType;

	public String getBizNoPrefix() {
		return this.bizNoPrefix;
	}
	public void setBizNoPrefix(String bizNoPrefix) {
		this.bizNoPrefix = bizNoPrefix;
	}

	public String getBizNoSuffixLen() {
		return this.bizNoSuffixLen;
	}
	public void setBizNoSuffixLen(String bizNoSuffixLen) {
		this.bizNoSuffixLen = bizNoSuffixLen;
	}

	public List<TemplateCardLevelConfDTO> getCardLevelConf() {
		return this.cardLevelConf;
	}
	public void setCardLevelConf(List<TemplateCardLevelConfDTO> cardLevelConf) {
		this.cardLevelConf = cardLevelConf;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public List<TemplateColumnInfoDTO> getColumnInfoList() {
		return this.columnInfoList;
	}
	public void setColumnInfoList(List<TemplateColumnInfoDTO> columnInfoList) {
		this.columnInfoList = columnInfoList;
	}

	public List<TemplateFieldRuleDTO> getFieldRuleList() {
		return this.fieldRuleList;
	}
	public void setFieldRuleList(List<TemplateFieldRuleDTO> fieldRuleList) {
		this.fieldRuleList = fieldRuleList;
	}

	public TemplateOpenCardConfDTO getOpenCardConf() {
		return this.openCardConf;
	}
	public void setOpenCardConf(TemplateOpenCardConfDTO openCardConf) {
		this.openCardConf = openCardConf;
	}

	public List<PubChannelDTO> getPubChannels() {
		return this.pubChannels;
	}
	public void setPubChannels(List<PubChannelDTO> pubChannels) {
		this.pubChannels = pubChannels;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getServiceLabelList() {
		return this.serviceLabelList;
	}
	public void setServiceLabelList(List<String> serviceLabelList) {
		this.serviceLabelList = serviceLabelList;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

	public List<TemplateBenefitInfoDTO> getTemplateBenefitInfo() {
		return this.templateBenefitInfo;
	}
	public void setTemplateBenefitInfo(List<TemplateBenefitInfoDTO> templateBenefitInfo) {
		this.templateBenefitInfo = templateBenefitInfo;
	}

	public TemplateStyleInfoDTO getTemplateStyleInfo() {
		return this.templateStyleInfo;
	}
	public void setTemplateStyleInfo(TemplateStyleInfoDTO templateStyleInfo) {
		this.templateStyleInfo = templateStyleInfo;
	}

	public String getWriteOffType() {
		return this.writeOffType;
	}
	public void setWriteOffType(String writeOffType) {
		this.writeOffType = writeOffType;
	}

}
