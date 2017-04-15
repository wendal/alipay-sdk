package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetAccountResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.account.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 18:05:33
 */
public class AlipayAssetAccountGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6727988268156826671L;

	/** 
	 * 账户绑定关系列表
	 */
	@ApiListField("asset_list")
	@ApiField("asset_account_result")
	private List<AssetAccountResult> assetList;

	public void setAssetList(List<AssetAccountResult> assetList) {
		this.assetList = assetList;
	}
	public List<AssetAccountResult> getAssetList( ) {
		return this.assetList;
	}

}
