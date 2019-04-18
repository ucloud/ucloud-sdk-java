package cn.ucloud.censor.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description :获取UAI安全审查资源监控信息
 * @Author : codezhang
 * @Date : 2019-04-18 17:28
 **/
public class GetUAICensorResourceMetricInfoResult extends BaseResponseResult {

    /**
     * 资源的监控信息
     */
    @SerializedName("DataSet")
    private List<UAICensorResourceRequestInfo> requestInfos;

    public List<UAICensorResourceRequestInfo> getRequestInfos() {
        return requestInfos;
    }

    public void setRequestInfos(List<UAICensorResourceRequestInfo> requestInfos) {
        this.requestInfos = requestInfos;
    }
}
