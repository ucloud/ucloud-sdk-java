package cn.ucloud.ucdn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取域名状态码监控 result
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 16:35
 */
public class GetNewUcdnDomainHttpCodeResult extends BaseResponseResult {
    /**
     * 状态码实例表。详细见{@link HttpCodeInfo}
     */
    @SerializedName("HttpCodeDetail")
    private List<HttpCodeInfo> httpCodeDetails;

    public List<HttpCodeInfo> getHttpCodeDetails() {
        return httpCodeDetails;
    }

    public void setHttpCodeDetails(List<HttpCodeInfo> httpCodeDetails) {
        this.httpCodeDetails = httpCodeDetails;
    }
}
