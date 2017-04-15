package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TemplateCardLevelConfDTO;
import com.alipay.api.domain.TemplateColumnInfoDTO;
import com.alipay.api.domain.TemplateFieldRuleDTO;
import com.alipay.api.domain.TemplateOpenCardConfDTO;
import com.alipay.api.domain.PubChannelDTO;
import com.alipay.api.domain.TemplateBenefitInfoDTO;
import com.alipay.api.domain.TemplateStyleInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-10-18 15:46:32
 */
public class AlipayMarketingCardTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5177224159853562567L;

	/** 
	 * 业务卡号前缀，由商户自定义
	 */
	@ApiField("biz_no_prefix")
	private String bizNoPrefix;

	/** 
	 * 卡号长度
	 */
	@ApiField("biz_no_suffix_len")
	private String bizNoSuffixLen;

	/** 
	 * 卡等级配置
	 */
	@ApiListField("card_level_confs")
	@ApiField("template_card_level_conf_d_t_o")
	private List<TemplateCardLevelConfDTO> cardLevelConfs;

	/** 
	 * 会员卡类型：
OUT_MEMBER_CARD：外部权益卡
	 */
	@ApiField("card_type")
	private String cardType;

	/** 
	 * 栏位信息（卡包详情页面展现的栏位）
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
	 * 服务标签列表
	 */
	@ApiListField("service_label_list")
	@ApiField("string")
	private List<String> serviceLabelList;

	/** 
	 * 门店ids
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
	 * 模板样式信息(钱包展现效果)
	 */
	@ApiField("template_style_info")
	private TemplateStyleInfoDTO templateStyleInfo;

	public void setBizNoPrefix(String bizNoPrefix) {
		this.bizNoPrefix = bizNoPrefix;
	}
	public String getBizNoPrefix( ) {
		return this.bizNoPrefix;
	}

	public void setBizNoSuffixLen(String bizNoSuffixLen) {
		this.bizNoSuffixLen = bizNoSuffixLen;
	}
	public String getBizNoSuffixLen( ) {
		return this.bizNoSuffixLen;
	}

	public void setCardLevelConfs(List<TemplateCardLevelConfDTO> cardLevelConfs) {
		this.cardLevelConfs = cardLevelConfs;
	}
	public List<TemplateCardLevelConfDTO> getCardLevelConfs( ) {
		return this.cardLevelConfs;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardType( ) {
		return this.cardType;
	}

	public void setColumnInfoList(List<TemplateColumnInfoDTO> columnInfoList) {
		this.columnInfoList = columnInfoList;
	}
	public List<TemplateColumnInfoDTO> getColumnInfoList( ) {
		return this.columnInfoList;
	}

	public void setFieldRuleList(List<TemplateFieldRuleDTO> fieldRuleList) {
		this.fieldRuleList = fieldRuleList;
	}
	public List<TemplateFieldRuleDTO> getFieldRuleList( ) {
		return this.fieldRuleList;
	}

	public void setOpenCardConf(TemplateOpenCardConfDTO openCardConf) {
		this.openCardConf = openCardConf;
	}
	public TemplateOpenCardConfDTO getOpenCardConf( ) {
		return this.openCardConf;
	}

	public void setPubChannels(List<PubChannelDTO> pubChannels) {
		this.pubChannels = pubChannels;
	}
	public List<PubChannelDTO> getPubChannels( ) {
		return this.pubChannels;
	}

	public void setServiceLabelList(List<String> serviceLabelList) {
		this.serviceLabelList = serviceLabelList;
	}
	public List<String> getServiceLabelList( ) {
		return this.serviceLabelList;
	}

	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}
	public List<String> getShopIds( ) {
		return this.shopIds;
	}

	public void setTemplateBenefitInfo(List<TemplateBenefitInfoDTO> templateBenefitInfo) {
		this.templateBenefitInfo = templateBenefitInfo;
	}
	public List<TemplateBenefitInfoDTO> getTemplateBenefitInfo( ) {
		return this.templateBenefitInfo;
	}

	public void setTemplateStyleInfo(TemplateStyleInfoDTO templateStyleInfo) {
		this.templateStyleInfo = templateStyleInfo;
	}
	public TemplateStyleInfoDTO getTemplateStyleInfo( ) {
		return this.templateStyleInfo;
	}

}
