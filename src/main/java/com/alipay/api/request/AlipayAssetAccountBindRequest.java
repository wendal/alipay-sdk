package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayAssetAccountBindResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.asset.account.bind request
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 18:06:34
 */
public class AlipayAssetAccountBindRequest implements AlipayRequest<AlipayAssetAccountBindResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 绑定场景，目前仅支持如下：
wechat：微信公众平台；
transport：物流转运平台；
appOneBind：一对一app绑定； 
注意：必须是这些值，区分大小写。
	 */
	private String bindScene;

	/** 
	* 使用该app提供用户信息的商户，可以和app相同。
	 */
	private String providerId;

	/** 
	* 用户在商户网站的会员标识。商户需确保其唯一性，不可变更。
	 */
	private String providerUserId;

	/** 
	* 用户在商户网站的会员名（登录号或昵称）。
	 */
	private String providerUserName;

	public void setBindScene(String bindScene) {
		this.bindScene = bindScene;
	}
	public String getBindScene() {
		return this.bindScene;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	public String getProviderId() {
		return this.providerId;
	}

	public void setProviderUserId(String providerUserId) {
		this.providerUserId = providerUserId;
	}
	public String getProviderUserId() {
		return this.providerUserId;
	}

	public void setProviderUserName(String providerUserName) {
		this.providerUserName = providerUserName;
	}
	public String getProviderUserName() {
		return this.providerUserName;
	}
	private String terminalType;
	private String terminalInfo;	
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
	private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}

    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }	

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.asset.account.bind";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("bind_scene", this.bindScene);
		txtParams.put("provider_id", this.providerId);
		txtParams.put("provider_user_id", this.providerUserId);
		txtParams.put("provider_user_name", this.providerUserName);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<AlipayAssetAccountBindResponse> getResponseClass() {
		return AlipayAssetAccountBindResponse.class;
	}
	

    public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
