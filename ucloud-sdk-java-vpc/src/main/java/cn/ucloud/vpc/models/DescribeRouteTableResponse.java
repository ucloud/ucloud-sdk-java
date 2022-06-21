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

public class DescribeRouteTableResponse extends Response {

    /** 路由表信息 */
    @SerializedName("RouteTables")
    private List<RouteTableInfo> routeTables;

    /** RouteTables字段的数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<RouteTableInfo> getRouteTables() {
        return routeTables;
    }

    public void setRouteTables(List<RouteTableInfo> routeTables) {
        this.routeTables = routeTables;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class RouteTableInfo extends Response {

        /** 路由表资源ID */
        @SerializedName("RouteTableId")
        private String routeTableId;

        /** 路由表类型。1为默认路由表，0为自定义路由表 */
        @SerializedName("RouteTableType")
        private Integer routeTableType;

        /** 绑定该路由表的子网数量 */
        @SerializedName("SubnetCount")
        private Integer subnetCount;

        /** 绑定该路由表的子网 */
        @SerializedName("SubnetIds")
        private List<String> subnetIds;

        /** 路由表所属的VPC资源ID */
        @SerializedName("VPCId")
        private String vpcId;

        /** 路由表所属的VPC资源名称 */
        @SerializedName("VPCName")
        private String vpcName;

        /** 路由表所属业务组 */
        @SerializedName("Tag")
        private String tag;

        /** 路由表备注 */
        @SerializedName("Remark")
        private String remark;

        /** 创建时间戳 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 路由规则 */
        @SerializedName("RouteRules")
        private List<RouteRuleInfo> routeRules;

        public String getRouteTableId() {
            return routeTableId;
        }

        public void setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
        }

        public Integer getRouteTableType() {
            return routeTableType;
        }

        public void setRouteTableType(Integer routeTableType) {
            this.routeTableType = routeTableType;
        }

        public Integer getSubnetCount() {
            return subnetCount;
        }

        public void setSubnetCount(Integer subnetCount) {
            this.subnetCount = subnetCount;
        }

        public List<String> getSubnetIds() {
            return subnetIds;
        }

        public void setSubnetIds(List<String> subnetIds) {
            this.subnetIds = subnetIds;
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

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public List<RouteRuleInfo> getRouteRules() {
            return routeRules;
        }

        public void setRouteRules(List<RouteRuleInfo> routeRules) {
            this.routeRules = routeRules;
        }
    }

    public static class RouteRuleInfo extends Response {

        /** 项目ID信息 */
        @SerializedName("AccountId")
        private Integer accountId;

        /** 目的地址 */
        @SerializedName("DstAddr")
        private String dstAddr;

        /** 保留字段，暂未使用 */
        @SerializedName("DstPort")
        private Integer dstPort;

        /** 路由下一跳资源ID */
        @SerializedName("NexthopId")
        private String nexthopId;

        /**
         * 路由表下一跳类型。LOCAL，本VPC内部通信路由；PUBLIC，公共服务路由；CNAT，外网路由；UDPN，跨域高速通道路由；HYBRIDGW，混合云路由；INSTANCE，实例路由；VNET，VPC联通路由；IPSEC
         * VPN，指向VPN网关的路由。
         */
        @SerializedName("NexthopType")
        private String nexthopType;

        /** 实例类型，枚举值：UHOST，云主机；UNI，虚拟网卡；PHOST，物理云主机 */
        @SerializedName("InstanceType")
        private String instanceType;

        /** 保留字段，暂未使用 */
        @SerializedName("OriginAddr")
        private String originAddr;

        /** 保留字段，暂未使用 */
        @SerializedName("Priority")
        private Integer priority;

        /** 路由规则备注 */
        @SerializedName("Remark")
        private String remark;

        /** 规则ID */
        @SerializedName("RouteRuleId")
        private String routeRuleId;

        /** 路由表资源ID */
        @SerializedName("RouteTableId")
        private String routeTableId;

        /** 路由规则类型。0，系统路由规则；1，自定义路由规则 */
        @SerializedName("RuleType")
        private Integer ruleType;

        /** 保留字段，暂未使用 */
        @SerializedName("SrcAddr")
        private String srcAddr;

        /** 保留字段，暂未使用 */
        @SerializedName("SrcPort")
        private Integer srcPort;

        /** 所属的VPC */
        @SerializedName("VNetId")
        private String vNetId;

        public Integer getAccountId() {
            return accountId;
        }

        public void setAccountId(Integer accountId) {
            this.accountId = accountId;
        }

        public String getDstAddr() {
            return dstAddr;
        }

        public void setDstAddr(String dstAddr) {
            this.dstAddr = dstAddr;
        }

        public Integer getDstPort() {
            return dstPort;
        }

        public void setDstPort(Integer dstPort) {
            this.dstPort = dstPort;
        }

        public String getNexthopId() {
            return nexthopId;
        }

        public void setNexthopId(String nexthopId) {
            this.nexthopId = nexthopId;
        }

        public String getNexthopType() {
            return nexthopType;
        }

        public void setNexthopType(String nexthopType) {
            this.nexthopType = nexthopType;
        }

        public String getInstanceType() {
            return instanceType;
        }

        public void setInstanceType(String instanceType) {
            this.instanceType = instanceType;
        }

        public String getOriginAddr() {
            return originAddr;
        }

        public void setOriginAddr(String originAddr) {
            this.originAddr = originAddr;
        }

        public Integer getPriority() {
            return priority;
        }

        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRouteRuleId() {
            return routeRuleId;
        }

        public void setRouteRuleId(String routeRuleId) {
            this.routeRuleId = routeRuleId;
        }

        public String getRouteTableId() {
            return routeTableId;
        }

        public void setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
        }

        public Integer getRuleType() {
            return ruleType;
        }

        public void setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
        }

        public String getSrcAddr() {
            return srcAddr;
        }

        public void setSrcAddr(String srcAddr) {
            this.srcAddr = srcAddr;
        }

        public Integer getSrcPort() {
            return srcPort;
        }

        public void setSrcPort(Integer srcPort) {
            this.srcPort = srcPort;
        }

        public String getVNetId() {
            return vNetId;
        }

        public void setVNetId(String vNetId) {
            this.vNetId = vNetId;
        }
    }
}
