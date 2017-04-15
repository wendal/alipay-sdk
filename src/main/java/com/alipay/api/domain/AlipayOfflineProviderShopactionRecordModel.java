package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv 回传的商户操作行为信息调用接口
 *
 * @author auto create
 * @since 1.0, 2017-03-31 13:28:32
 */
public class AlipayOfflineProviderShopactionRecordModel extends AlipayObject {

	private static final long serialVersionUID = 3548618862577265516L;

	/**
	 * 详情设置会根据action_type字段类型不同而格式不同，请详细查看开放平台文案，会详细说明如果设置，整体是json结构。
	 */
	@ApiField("action_detail")
	private String actionDetail;

	/**
	 * 每次请求的唯一id，需开发者自行保证此参数值每次请求的唯一性。后续可以通过当前唯一id进行问题排查。
	 */
	@ApiField("action_outer_id")
	private String actionOuterId;

	/**
	 * 支持的操作类型

1. insert_table(插入桌位)

2. update_table(更新桌位)

3. insert_dish(插入菜品)

4. delete_dish(删除菜品)

5. soldout_dish(估清菜品)

6. modify_dish(修改菜品)

7. modify_shop_status(店铺状态变更)
每一种操作行为对应的action_detail都不同，action_detail结构都是json串。
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 商户行为发生时间 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("date_time")
	private String dateTime;

	/**
	 * 参数值固定为shop，代表店铺行为
	 */
	@ApiField("entity")
	private String entity;

	/**
	 * 当action_type的参数值是 insert_table、update_table、insert_dish、delete_dish、soldout_dish、modify_dish、insert_dish时，此参数的值固定为：REPAST
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 传入店铺关联关系。标记当前接口涉及到的店铺信息，同时如果传入的数据在口碑不存在，口碑会建立一条shop_id+ outer_id+ type的关联数据
	 */
	@ApiField("outer_shop_do")
	private OuterShopDO outerShopDo;

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

	public OuterShopDO getOuterShopDo() {
		return this.outerShopDo;
	}
	public void setOuterShopDo(OuterShopDO outerShopDo) {
		this.outerShopDo = outerShopDo;
	}

}
