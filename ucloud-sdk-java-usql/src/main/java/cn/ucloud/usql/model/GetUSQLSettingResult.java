package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 获取用户USQL配置 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class GetUSQLSettingResult extends BaseResponseResult {
    /**
     * 结果数据存储位置
     */
    @SerializedName("OutputLocation")
    private String outputLocation;

    @SerializedName("Request")
    private String request;

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getOutputLocation() {
        return this.outputLocation;
    }

    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }


}