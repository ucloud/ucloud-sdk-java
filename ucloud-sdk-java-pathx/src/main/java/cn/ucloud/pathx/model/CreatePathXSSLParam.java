package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 创建证书 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class CreatePathXSSLParam extends BaseRequestParam {
    /**
     * SSL证书的名字，默认值为空
     */
    @UcloudParam("SSLName")
    @NotEmpty(message = "sSLName can not be empty")
    private String sSLName;
    /**
     * 所添加的SSL证书类型，目前只支持Pem格式
     */
    @UcloudParam("SSLType")
    private String sSLType;
    /**
     * SSL证书的完整内容，私钥不可使用密码，包括加密证书的私钥、用户证书或CA证书等
     */
    @UcloudParam("SSLContent")
    private String sSLContent;
    /**
     * 用户自签证书内容
     */
    @UcloudParam("UserCert")
    private String userCert;
    /**
     * 加密证书的私钥，不可使用密码保护，开启密码保护后，重启服务需要输入密码
     */
    @UcloudParam("PrivateKey")
    private String privateKey;
    /**
     * CA颁发证书内容
     */
    @UcloudParam("CACert")
    private String cACert;


    public CreatePathXSSLParam(String projectId
            , String sSLName
    ) {
        super("CreatePathXSSL");
        this.projectId = projectId;
        this.sSLName = sSLName;
    }


    public String getsSLName() {
        return this.sSLName;
    }

    public void setsSLName(String sSLName) {
        this.sSLName = sSLName;
    }

    public String getsSLType() {
        return this.sSLType;
    }

    public void setsSLType(String sSLType) {
        this.sSLType = sSLType;
    }

    public String getsSLContent() {
        return this.sSLContent;
    }

    public void setsSLContent(String sSLContent) {
        this.sSLContent = sSLContent;
    }

    public String getUserCert() {
        return this.userCert;
    }

    public void setUserCert(String userCert) {
        this.userCert = userCert;
    }

    public String getPrivateKey() {
        return this.privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getcACert() {
        return this.cACert;
    }

    public void setcACert(String cACert) {
        this.cACert = cACert;
    }


}