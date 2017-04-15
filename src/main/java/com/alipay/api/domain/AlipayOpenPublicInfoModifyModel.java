package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务窗基础信息修改接口
 *
 * @author auto create
 * @since 1.0, 2016-08-10 17:27:20
 */
public class AlipayOpenPublicInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4456147675333288268L;

	/**
	 * 服务窗名称，2-20个字之间；不得含有违反法律法规和公序良俗的相关信息；不得侵害他人名誉权、知识产权、商业秘密等合法权利；不得以太过广泛的、或产品、行业词组来命名，如：女装、皮革批发；不得以实名认证的媒体资质账号创建服务窗，或媒体相关名称命名服务窗，如：XX电视台、XX杂志等
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 授权运营书，企业商户若为被经营方授权，需上传加盖公章的扫描件，请使用照片上传接口上传图片获得image_url
	 */
	@ApiField("auth_pic")
	private String authPic;

	/**
	 * 营业执照地址，建议尺寸 320 x 320px，支持.jpg .jpeg .png 格式，小于3M
	 */
	@ApiField("license_url")
	private String licenseUrl;

	/**
	 * 服务窗头像地址，建议尺寸 320 x 320px，支持.jpg .jpeg .png 格式，小于3M
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 服务窗欢迎语，200字以内，首次使用服务窗必须
	 */
	@ApiField("public_greeting")
	private String publicGreeting;

	/**
	 * 门店照片Url
	 */
	@ApiListField("shop_pics")
	@ApiField("string")
	private List<String> shopPics;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAuthPic() {
		return this.authPic;
	}
	public void setAuthPic(String authPic) {
		this.authPic = authPic;
	}

	public String getLicenseUrl() {
		return this.licenseUrl;
	}
	public void setLicenseUrl(String licenseUrl) {
		this.licenseUrl = licenseUrl;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getPublicGreeting() {
		return this.publicGreeting;
	}
	public void setPublicGreeting(String publicGreeting) {
		this.publicGreeting = publicGreeting;
	}

	public List<String> getShopPics() {
		return this.shopPics;
	}
	public void setShopPics(List<String> shopPics) {
		this.shopPics = shopPics;
	}

}
