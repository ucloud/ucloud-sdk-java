package cn.ucloud.udpn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取专线线路列表 结果类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-04 10:36
 */
public class GetUDPNLineListResult extends BaseResponseResult {
    /**
     * DataSet中的元素个数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 当前支持的专线线路详细信息，详见UDPNLineSet
     */
    @SerializedName("DataSet")
    private List<UDPNLineSet> dataSet;

    public static class UDPNLineSet {
        /**
         * 支持UDPN的地域之一，
         * 北京二：cn-bj2, 上海二：cn-sh2, 广东：cn-gd, 亚太： hk, 上海一：cn-sh1, 法兰克福：ge-fra, 新加坡：sg, 华盛顿：us-ws, 洛杉矶：us-la， 东京：jpn-tky
         */
        @SerializedName("LocalRegion")
        private String localRegion;
        /**
         * 支持UDPN的地域之一，
         * 北京二：cn-bj2, 上海二：cn-sh2, 广东：cn-gd, 亚太： hk, 上海一：cn-sh1, 法兰克福：ge-fra, 新加坡：sg, 华盛顿：us-ws, 洛杉矶：us-la， 东京：jpn-tky
         */
        @SerializedName("RemoteRegion")
        private String remoteRegion;
        /**
         * 线路带宽上限,单位 M
         */
        @SerializedName("BandwidthUpperLimit")
        private Integer bandwidthUpperLimit;

        public String getLocalRegion() {
            return localRegion;
        }

        public void setLocalRegion(String localRegion) {
            this.localRegion = localRegion;
        }

        public String getRemoteRegion() {
            return remoteRegion;
        }

        public void setRemoteRegion(String remoteRegion) {
            this.remoteRegion = remoteRegion;
        }

        public Integer getBandwidthUpperLimit() {
            return bandwidthUpperLimit;
        }

        public void setBandwidthUpperLimit(Integer bandwidthUpperLimit) {
            this.bandwidthUpperLimit = bandwidthUpperLimit;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UDPNLineSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDPNLineSet> dataSet) {
        this.dataSet = dataSet;
    }
}
