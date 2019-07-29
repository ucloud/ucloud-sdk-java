package cn.ucloud.vpc.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取路由表详细信息(包括路由策略) 结果类
 * @author: codezhang
 * @date: 2018-09-21 18:48
 **/

public class DescribeRouteTableResult extends BaseResponseResult {


    public static class RouteTable {

        /**
         * 创建时间
         */
        @SerializedName("CreateTime")
        private Integer createTime;

        /**
         * 名称
         */
        @SerializedName("Name")
        private String name;

        /**
         * 掩码
         */
        @SerializedName("Remark")
        private String remark;

        /**
         * 路由规则
         */
        @SerializedName("RouteRules")
        private List<RouteRule> routeRules;

        /**
         * id
         */
        @SerializedName("RouteTableId")
        private String routeTableId;

        /**
         * 路由表类型
         */
        @SerializedName("RouteTableType")
        private Integer routeTableType;

        /**
         * 子网数目
         */
        @SerializedName("SubnetCount")
        private Integer subnetCount;


        /**
         * 业务组
         */
        @SerializedName("Tag")
        private String tag;

        /**
         * vpcId
         */
        @SerializedName("VPCId")
        private String vpcId;

        /**
         * vpcName
         */
        @SerializedName("VPCName")
        private String vpcName;

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public List<RouteRule> getRouteRules() {
            return routeRules;
        }

        public void setRouteRules(List<RouteRule> routeRules) {
            this.routeRules = routeRules;
        }

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

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getVpcId() {
            return vpcId;
        }

        public void setVpcId(String vpcId) {
            this.vpcId = vpcId;
        }

        public String getVpcName() {
            return vpcName;
        }

        public void setVpcName(String vpcName) {
            this.vpcName = vpcName;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }


    public static class RouteRule {

        @SerializedName("AccountId")
        private Integer accountId;

        /**
         * 路由表ID
         */
        @SerializedName("RouteTableId")
        private String routeTableId;

        /**
         * 路由类型
         */
        @SerializedName("RuleType")
        private Integer ruleType;

        /**
         * 源地址
         */
        @SerializedName("SrcAddr")
        private String srcAddr;

        /**
         *源端口
         */
        @SerializedName("SrcPort")
        private Integer srcPort;

        /**
         * 目标地址
         */
        @SerializedName("DstAddr")
        private String dstAddr;

        /**
         * 目标端口
         */
        @SerializedName("DstPort")
        private Integer dstPort;

        /**
         * 下一跳ID
         */
        @SerializedName("NexthopId")
        private String nexthopId;

        /**
         * 下一跳类型
         */
        @SerializedName("NexthopType")
        private String nexthopType;

        /**
         * 优先级
         */
        @SerializedName("Priority")
        private Integer priority;

        /**
         * VNet ID
         */
        @SerializedName("VNetId")
        private String vnetId;

        @SerializedName("OriginAddr")
        private String originAddr;

        /**
         * 备注
         */
        @SerializedName("Remark")
        private String remark;

        /**
         * 路由ID
         */
        @SerializedName("RouteRuleId")
        private String routeRuleId;

        public Integer getAccountId() {
            return accountId;
        }

        public void setAccountId(Integer accountId) {
            this.accountId = accountId;
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

        public Integer getPriority() {
            return priority;
        }

        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        public String getVnetId() {
            return vnetId;
        }

        public void setVnetId(String vnetId) {
            this.vnetId = vnetId;
        }

        public String getOriginAddr() {
            return originAddr;
        }

        public void setOriginAddr(String originAddr) {
            this.originAddr = originAddr;
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

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }


    /**
     * 路由表信息
     */
    @SerializedName("RouteTables")
    private List<RouteTable> routeTables;

    /**
     * RouteTables的数量
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 名称
     */
    @SerializedName("Name")
    private String name;


    /**
     * 备注
     */
    @SerializedName("Remark")
    private String remark;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<RouteTable> getRouteTables() {
        return routeTables;
    }

    public void setRouteTables(List<RouteTable> routeTables) {
        this.routeTables = routeTables;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
