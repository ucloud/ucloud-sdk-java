package cn.ucloud.ucdn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取流量信息 result
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/12 12:46
 */
public class GetUcdnTrafficResult extends BaseResponseResult {
    /**
     * 用户不同区域的流量信息, 具体结构参见TrafficSet部分
     */
    @SerializedName("TrafficSet")
    private List<TrafficInfo> trafficSet;

    public List<TrafficInfo> getTrafficSet() {
        return trafficSet;
    }

    public void setTrafficSet(List<TrafficInfo> trafficSet) {
        this.trafficSet = trafficSet;
    }
}
