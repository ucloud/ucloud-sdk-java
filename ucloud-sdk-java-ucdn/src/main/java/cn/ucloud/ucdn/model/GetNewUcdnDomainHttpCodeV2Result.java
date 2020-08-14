package cn.ucloud.ucdn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取域名详细状态码监控 result
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 16:35
 */
public class GetNewUcdnDomainHttpCodeV2Result extends BaseResponseResult {
    /**
     * 状态码实例表。详细见{@link HttpCodeV2Detail}
     */
    @SerializedName("HttpCodeV2Detail")
    private List<HttpCodeV2Detail> httpCodeV2Details;

    public List<HttpCodeV2Detail> getHttpCodeV2Details() {
        return httpCodeV2Details;
    }

    public void setHttpCodeV2Details(List<HttpCodeV2Detail> httpCodeV2Details) {
        this.httpCodeV2Details = httpCodeV2Details;
    }
}
