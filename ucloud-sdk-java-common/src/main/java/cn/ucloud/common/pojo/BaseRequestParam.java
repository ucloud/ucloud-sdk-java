package cn.ucloud.common.pojo;

import cn.ucloud.common.annotation.UcloudParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 基础请求参数
 * @author: codezhang
 * @date: 2018-09-13 17:33
 **/

public class BaseRequestParam {
    /**
     * 对应的API名称，如CreateUHostInstance
     */
    @UcloudParam("Action")
    @NotEmpty(message = "action can not be empty")
    protected String action;

    /**
     * require 根据公钥及API指令生成的用户签名，参见https://docs.ucloud.cn/api/summary/signature
     */
    @NotEmpty(message = "signature can not be empty")
    @UcloudParam("Signature")
    protected String signature;


    /**
     * require 用户公钥
     */
    @UcloudParam("PublicKey")
    @NotEmpty(message = "publicKey can not be empty")
    protected String publicKey;


    /**
     * optional 项目编号（子帐号用）,不填写为默认项目，子帐号必须填写, 请参考GetProjectList接口
     */
    @UcloudParam("ProjectId")
    protected String projectId;

    protected BaseRequestParam(@NotEmpty(message = "action can not be empty") String action) {
        this.action = action;
    }

    public String getProjectId() {
        return projectId;
    }


    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
