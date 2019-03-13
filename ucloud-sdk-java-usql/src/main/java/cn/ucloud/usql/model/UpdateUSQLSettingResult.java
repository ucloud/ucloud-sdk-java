package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 更新USQL设置 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class UpdateUSQLSettingResult extends BaseResponseResult {
    /**
     * 结果输出位置
     */
    @SerializedName("OutputLocation")
    private String outputLocation;
    /**
     * API请求ID
     */
    @SerializedName("Request")
    private String request;


    public String getOutputLocation() {
        return this.outputLocation;
    }

    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }

    public String getRequest() {
        return this.request;
    }

    public void setRequest(String request) {
        this.request = request;
    }


}