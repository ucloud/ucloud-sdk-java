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

public class DescribeSecondaryIpResponse extends Response {

    /** */
    @SerializedName("DataSet")
    private List<IpInfo> dataSet;

    public List<IpInfo> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<IpInfo> dataSet) {
        this.dataSet = dataSet;
    }

    public static class IpInfo extends Response {

        /** */
        @SerializedName("Ip")
        private String ip;

        /** */
        @SerializedName("Mask")
        private String mask;

        /** */
        @SerializedName("Gateway")
        private String gateway;

        /** */
        @SerializedName("Mac")
        private String mac;

        /** */
        @SerializedName("SubnetId")
        private String subnetId;

        /** */
        @SerializedName("VPCId")
        private String vpcId;

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
    }
}
