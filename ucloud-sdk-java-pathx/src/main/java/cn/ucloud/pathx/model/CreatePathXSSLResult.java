package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 创建证书 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class CreatePathXSSLResult extends BaseResponseResult {
    /**
     * SSL证书的Id
     */
    @SerializedName("SSLId")
    private String sSLId;


    public String getSSLId() {
        return this.sSLId;
    }

    public void setSSLId(String sSLId) {
        this.sSLId = sSLId;
    }


}