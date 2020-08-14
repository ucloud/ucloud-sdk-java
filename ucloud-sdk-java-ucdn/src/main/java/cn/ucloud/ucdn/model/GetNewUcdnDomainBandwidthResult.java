package cn.ucloud.ucdn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取域名带宽数据 result
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 15:42
 */
public class GetNewUcdnDomainBandwidthResult extends BaseResponseResult {
    /**
     * 带宽信息列表，参见{@link BandwidthInfo}
     */
    @SerializedName("BandwidthList")
    private List<BandwidthInfo> bandwidthList;

    /**
     * 从起始时间到结束时间内的所使用的CDN总流量，单位GB
     */
    @SerializedName("Traffic")
    private Float traffic;

    public List<BandwidthInfo> getBandwidthList() {
        return bandwidthList;
    }

    public void setBandwidthList(List<BandwidthInfo> bandwidthList) {
        this.bandwidthList = bandwidthList;
    }

    public Float getTraffic() {
        return traffic;
    }

    public void setTraffic(Float traffic) {
        this.traffic = traffic;
    }
}
