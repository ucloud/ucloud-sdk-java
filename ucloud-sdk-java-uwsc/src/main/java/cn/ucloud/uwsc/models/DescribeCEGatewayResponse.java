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
package cn.ucloud.uwsc.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeCEGatewayResponse extends Response {

    /** 总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** CE信息 */
    @SerializedName("VPNInfos")
    private List<VPNInfo> vpnInfos;

    /** 请求 ID */
    @SerializedName("RequestId")
    private String requestId;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<VPNInfo> getVPNInfos() {
        return vpnInfos;
    }

    public void setVPNInfos(List<VPNInfo> vpnInfos) {
        this.vpnInfos = vpnInfos;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public static class VPNInfo extends Response {

        /** 地域 */
        @SerializedName("Region")
        private String region;

        /** UWAN 实例 ID */
        @SerializedName("PopGwId")
        private String popGwId;

        /** UWAN 资源名称 */
        @SerializedName("PopGwName")
        private String popGwName;

        /** CE 网关 ID */
        @SerializedName("VPNId")
        private String vpnId;

        /** 子隧道 ID */
        @SerializedName("VPNTunnelIds")
        private List<String> vpnTunnelIds;

        /** CE 名称 */
        @SerializedName("Name")
        private String name;

        /** 客户自有外网 IP */
        @SerializedName("PublicIp")
        private String publicIp;

        /** CE网关的接入方式：静态IP（Static）,动态IP（Dynamic） */
        @SerializedName("IpType")
        private String ipType;

        /** 状态（默认为空） */
        @SerializedName("Status")
        private String status;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** CE备注 */
        @SerializedName("Remark")
        private String remark;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getPopGwId() {
            return popGwId;
        }

        public void setPopGwId(String popGwId) {
            this.popGwId = popGwId;
        }

        public String getPopGwName() {
            return popGwName;
        }

        public void setPopGwName(String popGwName) {
            this.popGwName = popGwName;
        }

        public String getVPNId() {
            return vpnId;
        }

        public void setVPNId(String vpnId) {
            this.vpnId = vpnId;
        }

        public List<String> getVPNTunnelIds() {
            return vpnTunnelIds;
        }

        public void setVPNTunnelIds(List<String> vpnTunnelIds) {
            this.vpnTunnelIds = vpnTunnelIds;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPublicIp() {
            return publicIp;
        }

        public void setPublicIp(String publicIp) {
            this.publicIp = publicIp;
        }

        public String getIpType() {
            return ipType;
        }

        public void setIpType(String ipType) {
            this.ipType = ipType;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}
