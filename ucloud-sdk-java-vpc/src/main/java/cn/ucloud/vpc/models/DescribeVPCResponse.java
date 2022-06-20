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

public class DescribeVPCResponse extends Response {

    /** vpc信息，具体结构见下方VPCInfo */
    @SerializedName("DataSet")
    private List<VPCInfo> dataSet;

    public List<VPCInfo> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<VPCInfo> dataSet) {
        this.dataSet = dataSet;
    }

    public static class VPCNetworkInfo extends Response {

        /** vpc地址空间 */
        @SerializedName("Network")
        private String network;

        /** 地址空间中子网数量 */
        @SerializedName("SubnetCount")
        private Integer subnetCount;

        public String getNetwork() {
            return network;
        }

        public void setNetwork(String network) {
            this.network = network;
        }

        public Integer getSubnetCount() {
            return subnetCount;
        }

        public void setSubnetCount(Integer subnetCount) {
            this.subnetCount = subnetCount;
        }
    }

    public static class VPCInfo extends Response {

        /** */
        @SerializedName("NetworkInfo")
        private List<VPCNetworkInfo> networkInfo;

        /** */
        @SerializedName("SubnetCount")
        private Integer subnetCount;

        /** */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        /** */
        @SerializedName("Tag")
        private String tag;

        /** */
        @SerializedName("Name")
        private String name;

        /** VPCId */
        @SerializedName("VPCId")
        private String vpcId;

        /** */
        @SerializedName("Network")
        private List<String> network;

        /** VPC关联的IPv6网段 */
        @SerializedName("IPv6Network")
        private String iPv6Network;

        /** VPC关联的IPv6网段所属运营商 */
        @SerializedName("OperatorName")
        private String operatorName;

        public List<VPCNetworkInfo> getNetworkInfo() {
            return networkInfo;
        }

        public void setNetworkInfo(List<VPCNetworkInfo> networkInfo) {
            this.networkInfo = networkInfo;
        }

        public Integer getSubnetCount() {
            return subnetCount;
        }

        public void setSubnetCount(Integer subnetCount) {
            this.subnetCount = subnetCount;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }

        public List<String> getNetwork() {
            return network;
        }

        public void setNetwork(List<String> network) {
            this.network = network;
        }

        public String getIPv6Network() {
            return iPv6Network;
        }

        public void setIPv6Network(String iPv6Network) {
            this.iPv6Network = iPv6Network;
        }

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }
    }
}
