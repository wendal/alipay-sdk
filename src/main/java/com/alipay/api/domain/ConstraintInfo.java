package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动限制信息
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
public class ConstraintInfo extends AlipayObject {

	private static final long serialVersionUID = 8333777582465691821L;

	/**
	 * 人群规则组ID
仅直发奖类型活动设置有效，通过调用营销活动人群组规则创建接口参数返回
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

	/**
	 * 针对指定人群的约束条件
	 */
	@ApiField("crowd_restriction")
	private String crowdRestriction;

	/**
	 * 单品码列表
仅在创建消费单品送活动时设置，最多设置500个单品码,由商户根据自己的商品管理自定义，一般为国标码
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/**
	 * 最低消费金额，单位元
仅在创建消费送礼包活动时设置
	 */
	@ApiField("min_cost")
	private String minCost;

	/**
	 * 活动适用的门店列表
仅品牌商发起的招商活动可为空
最多支持10w家门店
	 */
	@ApiListField("suit_shops")
	@ApiField("string")
	private List<String> suitShops;

	/**
	 * 活动期间用户能够参与的次数限制
如果不设置则不限制参与次数
	 */
	@ApiField("user_win_count")
	private String userWinCount;

	/**
	 * 活动期间用户能够参与的频率限制
如果不设置则不限制参与频率
每日中奖1次: D||1 
每周中奖2次: W||2 
每月中奖3次: M||3
	 */
	@ApiField("user_win_frequency")
	private String userWinFrequency;

	public String getCrowdGroupId() {
		return this.crowdGroupId;
	}
	public void setCrowdGroupId(String crowdGroupId) {
		this.crowdGroupId = crowdGroupId;
	}

	public String getCrowdRestriction() {
		return this.crowdRestriction;
	}
	public void setCrowdRestriction(String crowdRestriction) {
		this.crowdRestriction = crowdRestriction;
	}

	public List<String> getItemIds() {
		return this.itemIds;
	}
	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

	public String getMinCost() {
		return this.minCost;
	}
	public void setMinCost(String minCost) {
		this.minCost = minCost;
	}

	public List<String> getSuitShops() {
		return this.suitShops;
	}
	public void setSuitShops(List<String> suitShops) {
		this.suitShops = suitShops;
	}

	public String getUserWinCount() {
		return this.userWinCount;
	}
	public void setUserWinCount(String userWinCount) {
		this.userWinCount = userWinCount;
	}

	public String getUserWinFrequency() {
		return this.userWinFrequency;
	}
	public void setUserWinFrequency(String userWinFrequency) {
		this.userWinFrequency = userWinFrequency;
	}

}
