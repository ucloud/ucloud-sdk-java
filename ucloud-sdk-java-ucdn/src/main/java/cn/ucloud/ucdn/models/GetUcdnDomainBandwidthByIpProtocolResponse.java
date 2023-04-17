/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.ucdn.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUcdnDomainBandwidthByIpProtocolResponse extends Response {

    /** 带宽信息列表，参见BandwidthTrafficInfo */
    @SerializedName("BandwidthTrafficList")
    private List<BandwidthTrafficInfo> bandwidthTrafficList;

    public List<BandwidthTrafficInfo> getBandwidthTrafficList() {
        return bandwidthTrafficList;
    }

    public void setBandwidthTrafficList(List<BandwidthTrafficInfo> bandwidthTrafficList) {
        this.bandwidthTrafficList = bandwidthTrafficList;
    }

    public static class BandwidthTrafficInfo extends Response {

        /** 带宽获取的时间点。格式：时间戳 */
        @SerializedName("Time")
        private Integer time;

        /**
         * 返回值返回指定时间区间内CDN的带宽峰值，单位Mbps（如果请求参数Type为0，则Value是五分钟粒度的带宽值，如果Type为1，则Value是1小时的带宽峰值，如果Type为2，则Value是一天内的带宽峰值）
         */
        @SerializedName("CdnBandwidth")
        private Double cdnBandwidth;

        /** 对应时间粒度的流量，单位字节 */
        @SerializedName("Traffic")
        private Double traffic;

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        public Double getCdnBandwidth() {
            return cdnBandwidth;
        }

        public void setCdnBandwidth(Double cdnBandwidth) {
            this.cdnBandwidth = cdnBandwidth;
        }

        public Double getTraffic() {
            return traffic;
        }

        public void setTraffic(Double traffic) {
            this.traffic = traffic;
        }
    }
}
