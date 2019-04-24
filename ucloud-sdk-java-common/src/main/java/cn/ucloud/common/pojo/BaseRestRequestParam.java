package cn.ucloud.common.pojo;


import cn.ucloud.common.annotation.UcloudRestParam;
import cn.ucloud.common.http.ParamLocation;

import javax.validation.constraints.NotEmpty;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-17 21:51
 **/
public class BaseRestRequestParam {

    /**
     * require 根据公钥及API指令生成的用户签名，参见https://docs.ucloud.cn/api/summary/signature
     */
    @NotEmpty(message = "signature can not be empty")
    @UcloudRestParam(name = "Signature", location = ParamLocation.HEADER)
    protected String signature;


    /**
     * require 用户公钥
     */
    @UcloudRestParam(name = "PublicKey", location = ParamLocation.HEADER,
            signature = true)
    @NotEmpty(message = "publicKey can not be empty")
    protected String publicKey;


    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
}
