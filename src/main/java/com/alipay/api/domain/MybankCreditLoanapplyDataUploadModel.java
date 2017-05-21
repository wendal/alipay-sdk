package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部合作机构数据推送
 *
 * @author auto create
 * @since 1.0, 2017-04-21 11:01:22
 */
public class MybankCreditLoanapplyDataUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8462733385854358925L;

	/**
	 * 业务单编号。在申请场景下，就是申请单编号，唯一标识一笔贷款授信申请，由网商银行的系统生成。客户每次在网商银行提交一笔授信申请，都会生成一个唯一的申请单编号，此值会在授信申请的消息或者授信申请接口中返回。这个值维护了推送的数据和授信申请之间的映射关系。必填项。在其他场景，比如订单交易场景下，就是订单号。
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务场景码。根据不同的合作模式，业务场景码不同，标识这笔数据是在哪个业务场景下产生的，由网商银行系统生成。目前只有两种场景，1：申请场景，2：交易订单场景。以后可根据业务发展增加场景码。默认为申请场景。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 数据类型，标识推送的数据属于哪一个类别。合作机构在签署合作协议时，能够获取推送的数据类型。命名规范：大写英文字母，多个单词以下划线分隔。比如，货运行业接入的数据，命名为PARTNER_TRANSPORT_DATA。
	 */
	@ApiField("category")
	private String category;

	/**
	 * json格式的数据。根据合作协议约定的数据内容，把数据组装成json格式。必填项。
	 */
	@ApiField("data")
	private String data;

	/**
	 * 数据提供方的标识，一般取合作机构的英文名或中文拼音。例如，如果合作机构是滴滴，则该值就可以填didi。必填项。
	 */
	@ApiField("data_provider")
	private String dataProvider;

	/**
	 * 贷款申请人的唯一标识，个人客户一般为身份证号码或者支付宝ID，公司客户为工商注册号。全局唯一，用来唯一标识一个客户。如果身份证号包含字母，则字母必须大写。必填项。客户身份证号码可以从网商银行发送给机构的授信申请消息中获取，也可以是客户在机构注册时登记的信息。
	 */
	@ApiField("entity_code")
	private String entityCode;

	/**
	 * 数据所属的实体名称，一般为客户姓名或者公司名，作为客户的标识，不唯一，用来做申请单的校验。必填项。客户姓名可以从网商银行发送给机构的授信申请消息中获取，也可以是客户在机构注册时登记的信息。
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 客户的身份类型，由具体的合作场景决定。当个人客户以身份证为标识时是PERSON，企业是COMPAY。如果以会员ID标识客户，则支付宝会员填ALIPAY，网商银行会员填MYBANK。非必填项。
	 */
	@ApiField("entity_type")
	private String entityType;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getDataProvider() {
		return this.dataProvider;
	}
	public void setDataProvider(String dataProvider) {
		this.dataProvider = dataProvider;
	}

	public String getEntityCode() {
		return this.entityCode;
	}
	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

	public String getEntityName() {
		return this.entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

}
