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

public class DescribeSubnetResponse extends Response {

    /** 子网总数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 子网信息数组，具体资源见下方SubnetInfo */
    @SerializedName("DataSet")
    private List<SubnetInfo> dataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<SubnetInfo> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<SubnetInfo> dataSet) {
        this.dataSet = dataSet;
    }

    public static class SubnetInfo extends Response {

        /** 可用区名称 */
        @SerializedName("Zone")
        private String zone;

        /** 子网关联的IPv6网段 */
        @SerializedName("IPv6Network")
        private String iPv6Network;

        /** VPCId */
        @SerializedName("VPCId")
        private String vpcId;

        /** VPC名称 */
        @SerializedName("VPCName")
        private String vpcName;

        /** 子网Id */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 子网名称 */
        @SerializedName("SubnetName")
        private String subnetName;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        /** 业务组 */
        @SerializedName("Tag")
        private String tag;

        /** 子网类型 */
        @SerializedName("SubnetType")
        private Integer subnetType;

        /** 子网网段 */
        @SerializedName("Subnet")
        private String subnet;

        /** 子网掩码 */
        @SerializedName("Netmask")
        private String netmask;

        /** 子网网关 */
        @SerializedName("Gateway")
        private String gateway;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 是否有natgw */
        @SerializedName("HasNATGW")
        private Boolean hasNATGW;

        /** 路由表Id */
        @SerializedName("RouteTableId")
        private String routeTableId;

        /** 可用IP数量 */
        @SerializedName("AvailableIPs")
        private Integer availableIPs;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getIPv6Network() {
            return iPv6Network;
        }

        public void setIPv6Network(String iPv6Network) {
            this.iPv6Network = iPv6Network;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }

        public String getVPCName() {
            return vpcName;
        }

        public void setVPCName(String vpcName) {
            this.vpcName = vpcName;
        }

        public String getSubnetId() {
            return subnetId;
        }

        public void setSubnetId(String subnetId) {
            this.subnetId = subnetId;
        }

        public String getSubnetName() {
            return subnetName;
        }

        public void setSubnetName(String subnetName) {
            this.subnetName = subnetName;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public Integer getSubnetType() {
            return subnetType;
        }

        public void setSubnetType(Integer subnetType) {
            this.subnetType = subnetType;
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

        public String getGateway() {
            return gateway;
        }

        public void setGateway(String gateway) {
            this.gateway = gateway;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Boolean getHasNATGW() {
            return hasNATGW;
        }

        public void setHasNATGW(Boolean hasNATGW) {
            this.hasNATGW = hasNATGW;
        }

        public String getRouteTableId() {
            return routeTableId;
        }

        public void setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
        }

        public Integer getAvailableIPs() {
            return availableIPs;
        }

        public void setAvailableIPs(Integer availableIPs) {
            this.availableIPs = availableIPs;
        }
    }
}
