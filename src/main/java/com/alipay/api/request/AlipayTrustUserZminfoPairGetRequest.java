package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayTrustUserZminfoPairGetResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.trust.user.zminfo.pair.get request
 * 
 * @author auto create
 * @since 1.0, 2015-02-06 13:09:24
 */
public class AlipayTrustUserZminfoPairGetRequest implements AlipayRequest<AlipayTrustUserZminfoPairGetResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 描述申请者的用户信息JSON串，身份证号，姓名等
	 */
	private String applyUserInfo;

	/** 
	* 被申请人的用户信息JSON串
	 */
	private String ownerUserInfo;

	/** 
	* 请求的芝麻信用信息类型，目前仅支持芝麻分
	 */
	private String zmInfoType;

	public void setApplyUserInfo(String applyUserInfo) {
		this.applyUserInfo = applyUserInfo;
	}
	public String getApplyUserInfo() {
		return this.applyUserInfo;
	}

	public void setOwnerUserInfo(String ownerUserInfo) {
		this.ownerUserInfo = ownerUserInfo;
	}
	public String getOwnerUserInfo() {
		return this.ownerUserInfo;
	}

	public void setZmInfoType(String zmInfoType) {
		this.zmInfoType = zmInfoType;
	}
	public String getZmInfoType() {
		return this.zmInfoType;
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
		return "alipay.trust.user.zminfo.pair.get";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("apply_user_info", this.applyUserInfo);
		txtParams.put("owner_user_info", this.ownerUserInfo);
		txtParams.put("zm_info_type", this.zmInfoType);
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

	public Class<AlipayTrustUserZminfoPairGetResponse> getResponseClass() {
		return AlipayTrustUserZminfoPairGetResponse.class;
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
