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
package cn.ucloud.vpc.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllocateBatchSecondaryIpResponse extends Response {

    /** 详见IpsInfo */
    @SerializedName("IpsInfo")
    private List<IpsInfo> ipsInfo;

    public List<IpsInfo> getIpsInfo() {
        return ipsInfo;
    }

    public void setIpsInfo(List<IpsInfo> ipsInfo) {
        this.ipsInfo = ipsInfo;
    }

    public static class StatusInfo extends Response {

        /** 枚举值：Succeeded，Failed */
        @SerializedName("StatusCode")
        private String statusCode;

        /** IP分配失败原因 */
        @SerializedName("Message")
        private String message;

        public String getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(String statusCode) {
            this.statusCode = statusCode;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    public static class IpsInfo extends Response {

        /** 内网IP地址 */
        @SerializedName("Ip")
        private String ip;

        /** 掩码 */
        @SerializedName("Mask")
        private String mask;

        /** 网关 */
        @SerializedName("Gateway")
        private String gateway;

        /** MAC地址 */
        @SerializedName("Mac")
        private String mac;

        /** 子网资源ID */
        @SerializedName("SubnetId")
        private String subnetId;

        /** VPC资源ID */
        @SerializedName("VPCId")
        private String vpcId;

        /** IP分配结果，详见StatusInfo */
        @SerializedName("Status")
        private StatusInfo status;

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getMask() {
            return mask;
        }

        public void setMask(String mask) {
            this.mask = mask;
        }

        public String getGateway() {
            return gateway;
        }

        public void setGateway(String gateway) {
            this.gateway = gateway;
        }

        public String getMac() {
            return mac;
        }

        public void setMac(String mac) {
            this.mac = mac;
        }

        public String getSubnetId() {
            return subnetId;
        }

        public void setSubnetId(String subnetId) {
            this.subnetId = subnetId;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }

        public StatusInfo getStatus() {
            return status;
        }

        public void setStatus(StatusInfo status) {
            this.status = status;
        }
    }
}
