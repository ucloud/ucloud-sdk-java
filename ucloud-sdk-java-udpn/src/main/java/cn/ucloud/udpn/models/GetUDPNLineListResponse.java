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
package cn.ucloud.udpn.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUDPNLineListResponse extends Response {

    /** DataSet中的元素个数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 当前支持的专线线路详细信息，详见UDPNLineSet */
    @SerializedName("DataSet")
    private List<UDPNLineSet> dataSet;

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

    public static class UDPNLineSet extends Response {

        /**
         * 支持UDPN的地域之一，北京二：cn-bj2, 上海二：cn-sh2, 广东：cn-gd, 亚太： hk, 上海一：cn-sh1, 法兰克福：ge-fra, 新加坡：sg,
         * 华盛顿：us-ws, 洛杉矶：us-la， 东京：jpn-tky
         */
        @SerializedName("LocalRegion")
        private String localRegion;

        /**
         * 支持UDPN的地域之一，北京二：cn-bj2, 上海二：cn-sh2, 广东：cn-gd, 亚太： hk, 上海一：cn-sh1, 法兰克福：ge-fra, 新加坡：sg,
         * 华盛顿：us-ws, 洛杉矶：us-la， 东京：jpn-tky
         */
        @SerializedName("RemoteRegion")
        private String remoteRegion;

        /** 线路带宽上限,单位 M */
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
    }
}
