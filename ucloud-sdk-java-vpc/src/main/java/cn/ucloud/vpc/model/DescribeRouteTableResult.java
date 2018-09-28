package cn.ucloud.vpc.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取路由表详细信息(包括路由策略) 结果类
 * @author: codezhang
 * @date: 2018-09-21 18:48
 **/

public class DescribeRouteTableResult extends BaseResponseResult {


    public static class RouteTable{

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
            return "RouteTable{" +
                    "createTime=" + createTime +
                    ", name='" + name + '\'' +
                    ", remark='" + remark + '\'' +
                    ", routeRules=" + routeRules +
                    ", routeTableId='" + routeTableId + '\'' +
                    ", routeTableType=" + routeTableType +
                    ", subnetCount=" + subnetCount +
                    ", tag='" + tag + '\'' +
                    ", vpcId='" + vpcId + '\'' +
                    ", vpcName='" + vpcName + '\'' +
                    '}';
        }
    }


    public static class RouteRule{

        /**
         * 目标地址
         */
        @SerializedName("DstAddr")
        private String dstAddr;

        /**
         * 下一跳
         */
        @SerializedName("NextHop")
        private String nextHop;

        /**
         * 下一跳名称
         */
        @SerializedName("NextHopName")
        private String nextHopName;

        /**
         * 下一跳类型
         */
        @SerializedName("NextHopType")
        private String nextHopType;

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

        public String getDstAddr() {
            return dstAddr;
        }

        public void setDstAddr(String dstAddr) {
            this.dstAddr = dstAddr;
        }

        public String getNextHop() {
            return nextHop;
        }

        public void setNextHop(String nextHop) {
            this.nextHop = nextHop;
        }

        public String getNextHopName() {
            return nextHopName;
        }

        public void setNextHopName(String nextHopName) {
            this.nextHopName = nextHopName;
        }

        public String getNextHopType() {
            return nextHopType;
        }

        public void setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
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
            return "RouteRule{" +
                    "dstAddr='" + dstAddr + '\'' +
                    ", nextHop='" + nextHop + '\'' +
                    ", nextHopName='" + nextHopName + '\'' +
                    ", nextHopType='" + nextHopType + '\'' +
                    ", remark='" + remark + '\'' +
                    ", routeRuleId='" + routeRuleId + '\'' +
                    '}';
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

    @Override
    public String toString() {
        return "DescribeRouteTableResult{" +
                "routeTables=" + routeTables +
                ", totalCount=" + totalCount +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
