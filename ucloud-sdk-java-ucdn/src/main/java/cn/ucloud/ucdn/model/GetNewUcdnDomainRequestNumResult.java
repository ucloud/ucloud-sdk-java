package cn.ucloud.ucdn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取域名请求数 result
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 17:40
 */
public class GetNewUcdnDomainRequestNumResult extends BaseResponseResult {
    /**
     * 请求数实例表。
     */
    @SerializedName("RequestList")
    private List<RequestInfo> requestList;

    public List<RequestInfo> getRequestList() {
        return requestList;
    }

    public void setRequestList(List<RequestInfo> requestList) {
        this.requestList = requestList;
    }
}
