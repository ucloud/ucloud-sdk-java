package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 16:54
 */
public class AssociateEIPWithShareBandwidthResult extends BaseResponseResult {
    @SerializedName("Request_uuid")
    private String request_uuid;

    public String getRequest_uuid() {
        return request_uuid;
    }

    public void setRequest_uuid(String request_uuid) {
        this.request_uuid = request_uuid;
    }
}
