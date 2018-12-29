package cn.ucloud.ulb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 创建SSL证书 结果类
 * @author: codezhang
 * @date: 2018-09-20 09:42
 **/

public class CreateSSLResult extends BaseResponseResult {

    /**
     * SSL证书的Id
     */
    @SerializedName("SSLId")
    private  String sslId;

    public String getSslId() {
        return sslId;
    }

    public void setSslId(String sslId) {
        this.sslId = sslId;
    }

    @Override
    public String toString() {
        return "CreateSSLResult{" +
                "sslId='" + sslId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
