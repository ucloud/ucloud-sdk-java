package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 创建证书 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class CreatePathXSSLParam extends BaseRequestParam {
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UcloudParam("ProjectId")
    @NotEmpty(message = "projectId can not be empty")
    private String projectId;
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


    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getSSLName() {
        return this.sSLName;
    }

    public void setSSLName(String sSLName) {
        this.sSLName = sSLName;
    }

    public String getSSLType() {
        return this.sSLType;
    }

    public void setSSLType(String sSLType) {
        this.sSLType = sSLType;
    }

    public String getSSLContent() {
        return this.sSLContent;
    }

    public void setSSLContent(String sSLContent) {
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

    public String getCACert() {
        return this.cACert;
    }

    public void setCACert(String cACert) {
        this.cACert = cACert;
    }


}