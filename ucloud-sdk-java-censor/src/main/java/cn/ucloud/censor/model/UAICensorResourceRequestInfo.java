package cn.ucloud.censor.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : UAI安全审查资源请求信息
 * @Author : codezhang
 * @Date : 2019-04-18 17:27
 **/
public class UAICensorResourceRequestInfo {

    /**
     * 请求API名称
     */
    @SerializedName("ApiName")
    private String apiName;

    /**
     * 请求分布信息
     */
    @SerializedName("DataSet")
    private List<UAICensorDetailRequestInfo> requestInfos;

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public List<UAICensorDetailRequestInfo> getRequestInfos() {
        return requestInfos;
    }

    public void setRequestInfos(List<UAICensorDetailRequestInfo> requestInfos) {
        this.requestInfos = requestInfos;
    }
}
