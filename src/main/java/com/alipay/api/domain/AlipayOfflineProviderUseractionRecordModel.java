package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv 回传的用户操作行为信息调用接口
 *
 * @author auto create
 * @since 1.0, 2017-03-31 13:28:43
 */
public class AlipayOfflineProviderUseractionRecordModel extends AlipayObject {

	private static final long serialVersionUID = 6519277355112558963L;

	/**
	 * 详情设置会更具action_type字段类型不同而格式不同，请详细查看开放平台文案，会详细说明如果设置，整体是json结构。
	 */
	@ApiField("action_detail")
	private String actionDetail;

	/**
	 * 每次请求的唯一id，需开发者自行保证此参数值每次请求的唯一性。后续可以通过当前唯一id进行问题排查。
	 */
	@ApiField("action_outer_id")
	private String actionOuterId;

	/**
	 * 当前支持类型如下：
1、order_dishes(上传用户菜单)
2、order_num(餐厅排号)
3、order_book_create(餐厅预定)
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 废弃，不需要设置
	 */
	@ApiField("alipay_app_id")
	private String alipayAppId;

	/**
	 * 行为发生时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("date_time")
	private String dateTime;

	/**
	 * 参数值固定为user，代表用户行为
	 */
	@ApiField("entity")
	private String entity;

	/**
	 * 上传类型为：order_dishes(上传用户菜单)、order_num(餐厅排号)、order_book_create(餐厅预定）设置的类型都是REPAST
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 如果排号场景设置用户领取排号时的用户手机号，其他场景ISV尽量获取用户信息相关的手机号码，口碑会通过手机号计算用户在支付宝关联的用户信息，然后将用户的所有数据进行归档分析。
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 传入店铺关联关系。标记当前接口涉及到的店铺信息，同时如果传入的数据在口碑不存在，口碑会建立一条shop_id+ outer_id+ type的关联数据
	 */
	@ApiField("outer_shop_do")
	private OuterShopDO outerShopDo;

	/**
	 * 废弃，不需要设置
	 */
	@ApiField("platform_user_id")
	private String platformUserId;

	/**
	 * 废弃，不需要设置
	 */
	@ApiField("source")
	private String source;

	/**
	 * 支付宝账户ID，如果获取不到支付宝账户ID，一定不能设置。如何获取支付宝账户ID,获取用户uid的接口调用文档：https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.jokL1V&treeId=193&articleId=105656&docType=1#s3
	 */
	@ApiField("user_id")
	private String userId;

	public String getActionDetail() {
		return this.actionDetail;
	}
	public void setActionDetail(String actionDetail) {
		this.actionDetail = actionDetail;
	}

	public String getActionOuterId() {
		return this.actionOuterId;
	}
	public void setActionOuterId(String actionOuterId) {
		this.actionOuterId = actionOuterId;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getAlipayAppId() {
		return this.alipayAppId;
	}
	public void setAlipayAppId(String alipayAppId) {
		this.alipayAppId = alipayAppId;
	}

	public String getDateTime() {
		return this.dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getEntity() {
		return this.entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public OuterShopDO getOuterShopDo() {
		return this.outerShopDo;
	}
	public void setOuterShopDo(OuterShopDO outerShopDo) {
		this.outerShopDo = outerShopDo;
	}

	public String getPlatformUserId() {
		return this.platformUserId;
	}
	public void setPlatformUserId(String platformUserId) {
		this.platformUserId = platformUserId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
