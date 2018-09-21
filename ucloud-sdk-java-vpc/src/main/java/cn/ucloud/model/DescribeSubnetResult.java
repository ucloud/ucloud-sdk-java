package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取子网信息 结果类
 * @author: codezhang
 * @date: 2018-09-21 16:21
 **/

public class DescribeSubnetResult extends BaseResponseResult {

    public static class Subnet{

        /**
         * 创建时间 Unix时间戳
         */
        @SerializedName("CreateTime")
        private Integer createTime;

        /**
         * 网关
         */
        @SerializedName("Gateway")
        private String gateway;

        /**
         * 有没有NAT GW
         */
        @SerializedName("HasNATGW")
        private Boolean hasNATGW;

        /**
         * 子网名称
         */
        @SerializedName("Name")
        private String name;

        /**
         * 掩码
         */
        @SerializedName("Netmask")
        private String netmask;

        /**
         *  备注
         */
        @SerializedName("Remark")
        private String  remark;

        /**
         * 路由表编号
         */
        @SerializedName("RouteTableId")
        private String routeTableId;

        /**
         * 子网
         */
        @SerializedName("Subnet")
        private String subnet;

        /**
         * 子网ID
         */
        @SerializedName("SubnetId")
        private String subnetId;

        /**
         * 子网名称
         */
        @SerializedName("SubnetName")
        private String subnetName;

        /**
         * 子网类型
         */
        @SerializedName("SubnetType")
        private Integer subnetType;

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
         * vpc名称
         */
        @SerializedName("VPCName")
        private String vpcName;


        /**
         * vrouterId
         */
        @SerializedName("VRouterId")
        private String vrouterId;

        /**
         * zone
         */
        @SerializedName("Zone")
        private String zone;

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getGateway() {
            return gateway;
        }

        public void setGateway(String gateway) {
            this.gateway = gateway;
        }

        public Boolean getHasNATGW() {
            return hasNATGW;
        }

        public void setHasNATGW(Boolean hasNATGW) {
            this.hasNATGW = hasNATGW;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNetmask() {
            return netmask;
        }

        public void setNetmask(String netmask) {
            this.netmask = netmask;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRouteTableId() {
            return routeTableId;
        }

        public void setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
        }

        public String getSubnet() {
            return subnet;
        }

        public void setSubnet(String subnet) {
            this.subnet = subnet;
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

        public Integer getSubnetType() {
            return subnetType;
        }

        public void setSubnetType(Integer subnetType) {
            this.subnetType = subnetType;
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

        public String getVrouterId() {
            return vrouterId;
        }

        public void setVrouterId(String vrouterId) {
            this.vrouterId = vrouterId;
        }

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        @Override
        public String toString() {
            return "Subnet{" +
                    "createTime=" + createTime +
                    ", gateway='" + gateway + '\'' +
                    ", hasNATGW=" + hasNATGW +
                    ", name='" + name + '\'' +
                    ", netmask='" + netmask + '\'' +
                    ", remark='" + remark + '\'' +
                    ", routeTableId='" + routeTableId + '\'' +
                    ", subnet='" + subnet + '\'' +
                    ", subnetId='" + subnetId + '\'' +
                    ", subnetName='" + subnetName + '\'' +
                    ", subnetType=" + subnetType +
                    ", tag='" + tag + '\'' +
                    ", vpcId='" + vpcId + '\'' +
                    ", vpcName='" + vpcName + '\'' +
                    ", vrouterId='" + vrouterId + '\'' +
                    ", zone='" + zone + '\'' +
                    '}';
        }
    }


    /**
     * 满足条件的子网总数量
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    @SerializedName("DataSet")
    private List<Subnet> subnets;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<Subnet> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<Subnet> subnets) {
        this.subnets = subnets;
    }

    @Override
    public String toString() {
        return "DescribeSubnetResult{" +
                "totalCount=" + totalCount +
                ", subnets=" + subnets +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
