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

public class ListSubnetForNATGWResponse extends Response {

    /** 具体参数请见NatgwSubnetDataSet */
    @SerializedName("DataSet")
    private List<NatgwSubnetDataSet> dataSet;

    public List<NatgwSubnetDataSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<NatgwSubnetDataSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class NatgwSubnetDataSet extends Response {

        /** 子网id */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 子网网段 */
        @SerializedName("Subnet")
        private String subnet;

        /** 掩码 */
        @SerializedName("Netmask")
        private String netmask;

        /** 子网名字 */
        @SerializedName("SubnetName")
        private String subnetName;

        /** 是否绑定NATGW */
        @SerializedName("HasNATGW")
        private Boolean hasNATGW;

        public String getSubnetId() {
            return subnetId;
        }

        public void setSubnetId(String subnetId) {
            this.subnetId = subnetId;
        }

        public String getSubnet() {
            return subnet;
        }

        public void setSubnet(String subnet) {
            this.subnet = subnet;
        }

        public String getNetmask() {
            return netmask;
        }

        public void setNetmask(String netmask) {
            this.netmask = netmask;
        }

        public String getSubnetName() {
            return subnetName;
        }

        public void setSubnetName(String subnetName) {
            this.subnetName = subnetName;
        }

        public Boolean getHasNATGW() {
            return hasNATGW;
        }

        public void setHasNATGW(Boolean hasNATGW) {
            this.hasNATGW = hasNATGW;
        }
    }
}
