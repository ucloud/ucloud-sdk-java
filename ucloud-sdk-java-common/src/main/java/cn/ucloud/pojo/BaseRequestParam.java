package cn.ucloud.pojo;

import cn.ucloud.annotation.UcloudParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 基础请求参数
 * @author: codezhang
 * @date: 2018-09-13 17:33
 **/

public class BaseRequestParam {
    @UcloudParam("Action")
    @NotEmpty(message = "action can not be empty")
    private String action;

    @UcloudParam("Signature")
    private String signature;

    @UcloudParam("PublicKey")
    private String publicKey;

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
