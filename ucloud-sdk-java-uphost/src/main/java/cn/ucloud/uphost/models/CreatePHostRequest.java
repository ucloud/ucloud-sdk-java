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
package cn.ucloud.uphost.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class CreatePHostRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** ImageId，可以通过接口 [DescribePHostImage](api/uphost-api/describe_phost_image.html)获取 */
    @NotEmpty
    @UCloudParam("ImageId")
    private String imageId;

    /** 密码（密码需使用base64进行编码） */
    @NotEmpty
    @UCloudParam("Password")
    private String password;

    /** 物理机类型，默认为：db-2(基础型-SAS-V3) */
    @UCloudParam("Type")
    private String type;

    /** 物理机名称，默认为phost */
    @UCloudParam("Name")
    private String name;

    /** 物理机备注，默认为空 */
    @UCloudParam("Remark")
    private String remark;

    /** 业务组，默认为default */
    @UCloudParam("Tag")
    private String tag;

    /** 计费模式，枚举值为：Year, 按年付费； Month,按月付费；默认按月付费 */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长，1-10个月或1-10年；默认值为1。月付时，此参数传0，代表购买至月末，1代表整月。 */
    @UCloudParam("Quantity")
    private String quantity;

    /**
     * 防火墙ID，默认：Web推荐防火墙。如何查询SecurityGroupId请参见
     * [DescribeFirewall](api/unet-api/describe_firewall.html)。
     */
    @UCloudParam("SecurityGroupId")
    private String securityGroupId;

    /** 本地盘和裸金属1.0需要的参数。Raid配置，默认Raid10 支持:Raid0、Raid1、Raid5、Raid10，NoRaid */
    @UCloudParam("Raid")
    private String raid;

    /** VPC ID，不填为默认，VPC2.0下需要填写此字段。 */
    @UCloudParam("VPCId")
    private String vpcId;

    /** 子网ID，不填为默认，VPC2.0下需要填写此字段。 */
    @UCloudParam("SubnetId")
    private String subnetId;

    /** 网络环境，可选千兆：1G ，万兆：10G， 默认1G。智能网卡可以选择25G。 */
    @UCloudParam("Cluster")
    private String cluster;

    /** */
    @UCloudParam("Disks")
    private List<Disks> disks;

    /** 指定内网ip创建 */
    @UCloudParam("VpcIp")
    private String vpcIp;

    /** 短期促销活动时所需参数 */
    @UCloudParam("ActivityId")
    private Integer activityId;

    /** 短期促销活动时所需参数 */
    @UCloudParam("RuleId")
    private Integer ruleId;

    /** */
    @UCloudParam("NetworkInterface")
    private List<NetworkInterface> networkInterface;

    /** 代金券 */
    @UCloudParam("CouponId")
    private String couponId;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getRaid() {
        return raid;
    }

    public void setRaid(String raid) {
        this.raid = raid;
    }

    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public List<Disks> getDisks() {
        return disks;
    }

    public void setDisks(List<Disks> disks) {
        this.disks = disks;
    }

    public String getVpcIp() {
        return vpcIp;
    }

    public void setVpcIp(String vpcIp) {
        this.vpcIp = vpcIp;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public List<NetworkInterface> getNetworkInterface() {
        return networkInterface;
    }

    public void setNetworkInterface(List<NetworkInterface> networkInterface) {
        this.networkInterface = networkInterface;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public static class Disks extends Request {

        /** 裸金属机型参数->是否是系统盘。枚举值： True，是系统盘。 False，是数据盘（默认）。Disks数组中有且只能有一块盘是系统盘。 */
        @UCloudParam("IsBoot")
        private String isBoot;

        /** 裸金属机型参数->磁盘类型：枚举值：CLOUD_RSSD */
        @UCloudParam("Type")
        private String type;

        /** 裸金属机型参数->磁盘大小，单位GB，必须是10GB的整数倍。系统盘20-500GB，数据盘单块盘20-32000GB。 */
        @UCloudParam("Size")
        private Integer size;

        /** 裸金属机型参数->云盘代金券id。不适用于系统盘。请通过DescribeCoupon接口查询，或登录用户中心查看 */
        @UCloudParam("CouponId")
        private String couponId;

        public String getIsBoot() {
            return isBoot;
        }

        public void setIsBoot(String isBoot) {
            this.isBoot = isBoot;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public String getCouponId() {
            return couponId;
        }

        public void setCouponId(String couponId) {
            this.couponId = couponId;
        }
    }

    public static class NetworkInterface extends Request {

        /** */
        @UCloudParam("EIP")
        private NetworkInterfaceEIP eip;

        public NetworkInterfaceEIP getEIP() {
            return eip;
        }

        public void setEIP(NetworkInterfaceEIP eip) {
            this.eip = eip;
        }
    }

    public static class NetworkInterfaceEIP extends Request {

        /**
         * 【若绑定EIP，此参数必填】弹性IP的外网带宽, 单位为Mbps. 共享带宽模式必须指定0M带宽, 非共享带宽模式必须指定非0Mbps带宽. 各地域非共享带宽的带宽范围如下：
         * 流量计费[1-300]，带宽计费[1-800]
         */
        @UCloudParam("Bandwidth")
        private String bandwidth;

        /**
         * 弹性IP的计费模式. 枚举值: "Traffic", 流量计费; "Bandwidth", 带宽计费; "ShareBandwidth",共享带宽模式.
         * "Free":免费带宽模式,默认为 "Bandwidth"
         */
        @UCloudParam("PayMode")
        private String payMode;

        /** 绑定的共享带宽Id，仅当PayMode为ShareBandwidth时有效 */
        @UCloudParam("ShareBandwidthId")
        private String shareBandwidthId;

        /**
         * 【若绑定EIP，此参数必填】弹性IP的线路。枚举值: 国际: International BGP: Bgp 各地域允许的线路参数如下: cn-sh1: Bgp cn-sh2:
         * Bgp cn-gd: Bgp cn-bj1: Bgp cn-bj2: Bgp hk: International us-ca: International th-bkk:
         * International kr-seoul:International us-ws:International ge-fra:International
         * sg:International tw-kh:International.其他海外线路均为 International
         */
        @UCloudParam("OperatorName")
        private String operatorName;

        /** 当前EIP代金券id。请通过DescribeCoupon接口查询，或登录用户中心查看。 */
        @UCloudParam("CouponId")
        private String couponId;

        public String getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
        }

        public String getPayMode() {
            return payMode;
        }

        public void setPayMode(String payMode) {
            this.payMode = payMode;
        }

        public String getShareBandwidthId() {
            return shareBandwidthId;
        }

        public void setShareBandwidthId(String shareBandwidthId) {
            this.shareBandwidthId = shareBandwidthId;
        }

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getCouponId() {
            return couponId;
        }

        public void setCouponId(String couponId) {
            this.couponId = couponId;
        }
    }
}
