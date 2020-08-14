package cn.ucloud.ucdn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取加速域名流量使用信息 result
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 17:40
 */
public class GetUcdnDomainTrafficResult extends BaseResponseResult {
    /**
     * 流量实例表，具体结构见 {@link UcdnDomainTrafficInfo}
     */
    @SerializedName("TrafficSet")
    private List<UcdnDomainTrafficInfo> trafficSet;

    public List<UcdnDomainTrafficInfo> getTrafficSet() {
        return trafficSet;
    }

    public void setTrafficSet(List<UcdnDomainTrafficInfo> trafficSet) {
        this.trafficSet = trafficSet;
    }
}
