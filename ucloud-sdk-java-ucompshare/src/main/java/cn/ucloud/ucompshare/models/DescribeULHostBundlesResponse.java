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
package cn.ucloud.ucompshare.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeULHostBundlesResponse extends Response {

    /** 套餐列表 */
    @SerializedName("Bundles")
    private List<Bundle> bundles;

    public List<Bundle> getBundles() {
        return bundles;
    }

    public void setBundles(List<Bundle> bundles) {
        this.bundles = bundles;
    }

    public static class Bundle extends Response {

        /** 套餐ID。 */
        @SerializedName("BundleId")
        private String bundleId;

        /** CPU核数。 */
        @SerializedName("CPU")
        private Integer cpu;

        /** 内存大小。单位：MB。 */
        @SerializedName("Memory")
        private Integer memory;

        /** 系统盘大小。单位：GB。 */
        @SerializedName("SysDiskSpace")
        private Integer sysDiskSpace;

        /** 外网带宽。单位：Mbps。 */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /** 流量包大小。单位：GB。 */
        @SerializedName("TrafficPacket")
        private Integer trafficPacket;

        public String getBundleId() {
            return bundleId;
        }

        public void setBundleId(String bundleId) {
            this.bundleId = bundleId;
        }

        public Integer getCPU() {
            return cpu;
        }

        public void setCPU(Integer cpu) {
            this.cpu = cpu;
        }

        public Integer getMemory() {
            return memory;
        }

        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        public Integer getSysDiskSpace() {
            return sysDiskSpace;
        }

        public void setSysDiskSpace(Integer sysDiskSpace) {
            this.sysDiskSpace = sysDiskSpace;
        }

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        public Integer getTrafficPacket() {
            return trafficPacket;
        }

        public void setTrafficPacket(Integer trafficPacket) {
            this.trafficPacket = trafficPacket;
        }
    }
}
