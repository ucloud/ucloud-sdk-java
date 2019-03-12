package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 创建证书 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class CreatePathXSSLResult extends BaseResponseResult {
    /**
     * SSL证书的Id
     */
    @SerializedName("SSLId")
    private String sSLId;


    public String getsSLId() {
        return this.sSLId;
    }

    public void setsSLId(String sSLId) {
        this.sSLId = sSLId;
    }


}