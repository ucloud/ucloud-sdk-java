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

public class GetUcdnProIspBandwidthV2Response extends Response {

    /** 按省份的带宽流量实例表。具体参考下面BandwidthSet */
    @SerializedName("BandwidthSet")
    private List<ProIspBandwidthSet> bandwidthSet;

    public List<ProIspBandwidthSet> getBandwidthSet() {
        return bandwidthSet;
    }

    public void setBandwidthSet(List<ProIspBandwidthSet> bandwidthSet) {
        this.bandwidthSet = bandwidthSet;
    }

    public static class ProIspBandwidthSet extends Response {

        /** 省份代码 */
        @SerializedName("Province")
        private String province;

        /** 省份带宽流量实例表 */
        @SerializedName("BandwidthTrafficList")
        private List<ProIspBandwidthList> bandwidthTrafficList;

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public List<ProIspBandwidthList> getBandwidthTrafficList() {
            return bandwidthTrafficList;
        }

        public void setBandwidthTrafficList(List<ProIspBandwidthList> bandwidthTrafficList) {
            this.bandwidthTrafficList = bandwidthTrafficList;
        }
    }

    public static class ProIspBandwidthList extends Response {

        /** 带宽获取的时间点。格式：时间戳 */
        @SerializedName("Time")
        private Integer time;

        /** 返回值返回指定时间区间内CDN的带宽峰值，单位Mbps */
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
