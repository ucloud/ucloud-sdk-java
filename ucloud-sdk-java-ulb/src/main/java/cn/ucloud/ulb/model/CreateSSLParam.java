package cn.ucloud.ulb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:  创建SSL证书 参数类
 * 创建SSL证书，可以把整个 Pem 证书内容传过来，或者把证书、私钥、CA证书分别传过来
 * @author: codezhang
 * @date: 2018-09-19 18:57
 **/

public class CreateSSLParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require SSL证书的名字，默认值为空
     */
    @UcloudParam("SSLName")
    @NotEmpty(message = "sslName can not be empty")
    private String sslName;

    /**
     * optional 所添加的SSL证书类型，目前只支持Pem格式
     */
    @UcloudParam("SSLType")
    private String sslType;

    /**
     * optional SSL证书的完整内容，包括用户证书、加密证书的私钥、CA证书
     */
    @UcloudParam("SSLContent")
    private String sslContent;

    /**
     * optional 用户的证书
     */
    @UcloudParam("UserCert")
    private String userCert;

    /**
     * optional 加密证书的私钥
     */
    @UcloudParam("PrivateKey")
    private String privateKey;


    /**
     * optional CA证书
     */
    @UcloudParam("CaCert")
    private String caCert;


    public CreateSSLParam(@NotEmpty(message = "region can not be empty") String region,
                          @NotEmpty(message = "sslName can not be empty") String sslName) {
        super("CreateSSL");
        this.region = region;
        this.sslName = sslName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSslName() {
        return sslName;
    }

    public void setSslName(String sslName) {
        this.sslName = sslName;
    }

    public String getSslType() {
        return sslType;
    }

    public void setSslType(String sslType) {
        this.sslType = sslType;
    }

    public String getSslContent() {
        return sslContent;
    }

    public void setSslContent(String sslContent) {
        this.sslContent = sslContent;
    }

    public String getUserCert() {
        return userCert;
    }

    public void setUserCert(String userCert) {
        this.userCert = userCert;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getCaCert() {
        return caCert;
    }

    public void setCaCert(String caCert) {
        this.caCert = caCert;
    }
}
