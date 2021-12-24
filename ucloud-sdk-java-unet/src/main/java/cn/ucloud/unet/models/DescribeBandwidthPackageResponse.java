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
package cn.ucloud.unet.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeBandwidthPackageResponse extends Response {

    /** 满足条件的带宽包总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 带宽包详细信息, 参见 UnetBandwidthPackageSet */
    @SerializedName("DataSets")
    private List<UnetBandwidthPackageSet> dataSets;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UnetBandwidthPackageSet> getDataSets() {
        return dataSets;
    }

    public void setDataSets(List<UnetBandwidthPackageSet> dataSets) {
        this.dataSets = dataSets;
    }

    public static class EIPAddrSet extends Response {

        /** 运营商信息, 枚举值为: BGP: BGP; International: 国际. */
        @SerializedName("OperatorName")
        private String operatorName;

        /** 弹性IP地址 */
        @SerializedName("IP")
        private String ip;

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }
    }

    public static class UnetBandwidthPackageSet extends Response {

        /** 带宽包的资源ID */
        @SerializedName("BandwidthPackageId")
        private String bandwidthPackageId;

        /** 生效时间, 格式为 Unix Timestamp */
        @SerializedName("EnableTime")
        private Integer enableTime;

        /** 失效时间, 格式为 Unix Timestamp */
        @SerializedName("DisableTime")
        private Integer disableTime;

        /** 创建时间, 格式为 Unix Timestamp */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 带宽包的临时带宽值, 单位Mbps */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /** 带宽包所绑定弹性IP的资源ID */
        @SerializedName("EIPId")
        private String eipId;

        /** 带宽包所绑定弹性IP的详细信息,只有当EIPId对应双线IP时, EIPAddr的长度为2, 其他情况, EIPAddr长度均为1.参见 EIPAddrSet */
        @SerializedName("EIPAddr")
        private List<EIPAddrSet> eipAddr;

        public String getBandwidthPackageId() {
            return bandwidthPackageId;
        }

        public void setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
        }

        public Integer getEnableTime() {
            return enableTime;
        }

        public void setEnableTime(Integer enableTime) {
            this.enableTime = enableTime;
        }

        public Integer getDisableTime() {
            return disableTime;
        }

        public void setDisableTime(Integer disableTime) {
            this.disableTime = disableTime;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        public String getEIPId() {
            return eipId;
        }

        public void setEIPId(String eipId) {
            this.eipId = eipId;
        }

        public List<EIPAddrSet> getEIPAddr() {
            return eipAddr;
        }

        public void setEIPAddr(List<EIPAddrSet> eipAddr) {
            this.eipAddr = eipAddr;
        }
    }
}
