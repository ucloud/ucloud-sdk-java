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
package cn.ucloud.unet.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeEIPResponse extends Response {

    /** 满足条件的弹性IP总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 未绑定的弹性IP总数 */
    @SerializedName("UnbindCount")
    private Integer unbindCount;

    /** 满足条件的弹性IP带宽总和, 单位Mbps */
    @SerializedName("TotalBandwidth")
    private Integer totalBandwidth;

    /** 弹性IP列表, 每项参数详见 UnetEIPSet */
    @SerializedName("EIPSet")
    private List<UnetEIPSet> eipSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getUnbindCount() {
        return unbindCount;
    }

    public void setUnbindCount(Integer unbindCount) {
        this.unbindCount = unbindCount;
    }

    public Integer getTotalBandwidth() {
        return totalBandwidth;
    }

    public void setTotalBandwidth(Integer totalBandwidth) {
        this.totalBandwidth = totalBandwidth;
    }

    public List<UnetEIPSet> getEIPSet() {
        return eipSet;
    }

    public void setEIPSet(List<UnetEIPSet> eipSet) {
        this.eipSet = eipSet;
    }

    public static class UnetEIPResourceSet extends Response {

        /**
         * 已绑定的资源类型, 枚举值为: uhost, 云主机；natgw：NAT网关；ulb：负载均衡器；upm: 物理机; hadoophost:
         * 大数据集群;fortresshost：堡垒机；udockhost：容器；udhost：私有专区主机；vpngw：IPSec
         * VPN；ucdr：云灾备；dbaudit：数据库审计，uni：虚拟网卡。
         */
        @SerializedName("ResourceType")
        private String resourceType;

        /** 已绑定的资源名称 */
        @SerializedName("ResourceName")
        private String resourceName;

        /** 已绑定资源的资源ID */
        @SerializedName("ResourceID")
        private String resourceID;

        /** 资源绑定的虚拟网卡的类型。uni，虚拟网卡。 */
        @SerializedName("SubResourceType")
        private String subResourceType;

        /** 资源绑定的虚拟网卡的名称 */
        @SerializedName("SubResourceName")
        private String subResourceName;

        /** 资源绑定的虚拟网卡的ID */
        @SerializedName("SubResourceId")
        private String subResourceId;

        /** 弹性IP的资源ID */
        @SerializedName("EIPId")
        private String eipId;

        public String getResourceType() {
            return resourceType;
        }

        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        public String getResourceID() {
            return resourceID;
        }

        public void setResourceID(String resourceID) {
            this.resourceID = resourceID;
        }

        public String getSubResourceType() {
            return subResourceType;
        }

        public void setSubResourceType(String subResourceType) {
            this.subResourceType = subResourceType;
        }

        public String getSubResourceName() {
            return subResourceName;
        }

        public void setSubResourceName(String subResourceName) {
            this.subResourceName = subResourceName;
        }

        public String getSubResourceId() {
            return subResourceId;
        }

        public void setSubResourceId(String subResourceId) {
            this.subResourceId = subResourceId;
        }

        public String getEIPId() {
            return eipId;
        }

        public void setEIPId(String eipId) {
            this.eipId = eipId;
        }
    }

    public static class UnetEIPSet extends Response {

        /** 弹性IP的资源ID */
        @SerializedName("EIPId")
        private String eipId;

        /** 外网出口权重, 默认为50, 范围[0-100] */
        @SerializedName("Weight")
        private Integer weight;

        /** 带宽模式, 枚举值为: 0: 非共享带宽模式, 1: 共享带宽模式 */
        @SerializedName("BandwidthType")
        private Integer bandwidthType;

        /** 弹性IP的带宽, 单位为Mbps, 当BandwidthType=1时, 该处显示为共享带宽值. 当BandwidthType=0时, 该处显示这个弹性IP的带宽. */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /** 弹性IP的资源绑定状态, 枚举值为: used: 已绑定, free: 未绑定, freeze: 已冻结 */
        @SerializedName("Status")
        private String status;

        /**
         * 付费方式, 枚举值为: Year, 按年付费; Month, 按月付费; Dynamic, 按小时付费; Trial, 试用. 按小时付费和试用这两种付费模式需要开通权限.
         */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 弹性IP的创建时间, 格式为Unix Timestamp */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 弹性IP的到期时间, 格式为Unix Timestamp */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 弹性IP的详细信息列表, 具体结构见下方 UnetEIPResourceSet */
        @SerializedName("Resource")
        private UnetEIPResourceSet resource;

        /** 弹性IP的详细信息列表, 具体结构见下方 UnetEIPAddrSet */
        @SerializedName("EIPAddr")
        private List<UnetEIPAddrSet> eipAddr;

        /** 弹性IP的名称,缺省值为 "EIP" */
        @SerializedName("Name")
        private String name;

        /** 弹性IP的业务组标识, 缺省值为 "Default" */
        @SerializedName("Tag")
        private String tag;

        /** 弹性IP的备注, 缺省值为 "" */
        @SerializedName("Remark")
        private String remark;

        /**
         * 弹性IP的计费模式, 枚举值为: "Bandwidth", 带宽计费; "Traffic", 流量计费; "ShareBandwidth",共享带宽模式. 默认为
         * "Bandwidth".
         */
        @SerializedName("PayMode")
        private String payMode;

        /** 共享带宽信息 参见 ShareBandwidthSet */
        @SerializedName("ShareBandwidthSet")
        private ShareBandwidthSet shareBandwidthSet;

        /** 弹性IP是否到期 */
        @SerializedName("Expire")
        private Boolean expire;

        public String getEIPId() {
            return eipId;
        }

        public void setEIPId(String eipId) {
            this.eipId = eipId;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public Integer getBandwidthType() {
            return bandwidthType;
        }

        public void setBandwidthType(Integer bandwidthType) {
            this.bandwidthType = bandwidthType;
        }

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public UnetEIPResourceSet getResource() {
            return resource;
        }

        public void setResource(UnetEIPResourceSet resource) {
            this.resource = resource;
        }

        public List<UnetEIPAddrSet> getEIPAddr() {
            return eipAddr;
        }

        public void setEIPAddr(List<UnetEIPAddrSet> eipAddr) {
            this.eipAddr = eipAddr;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public String getPayMode() {
            return payMode;
        }

        public void setPayMode(String payMode) {
            this.payMode = payMode;
        }

        public ShareBandwidthSet getShareBandwidthSet() {
            return shareBandwidthSet;
        }

        public void setShareBandwidthSet(ShareBandwidthSet shareBandwidthSet) {
            this.shareBandwidthSet = shareBandwidthSet;
        }

        public Boolean getExpire() {
            return expire;
        }

        public void setExpire(Boolean expire) {
            this.expire = expire;
        }
    }

    public static class ShareBandwidthSet extends Response {

        /** 共享带宽带宽值 */
        @SerializedName("ShareBandwidth")
        private Integer shareBandwidth;

        /** 共享带宽的资源名称 */
        @SerializedName("ShareBandwidthName")
        private String shareBandwidthName;

        /** 共享带宽ID */
        @SerializedName("ShareBandwidthId")
        private String shareBandwidthId;

        public Integer getShareBandwidth() {
            return shareBandwidth;
        }

        public void setShareBandwidth(Integer shareBandwidth) {
            this.shareBandwidth = shareBandwidth;
        }

        public String getShareBandwidthName() {
            return shareBandwidthName;
        }

        public void setShareBandwidthName(String shareBandwidthName) {
            this.shareBandwidthName = shareBandwidthName;
        }

        public String getShareBandwidthId() {
            return shareBandwidthId;
        }

        public void setShareBandwidthId(String shareBandwidthId) {
            this.shareBandwidthId = shareBandwidthId;
        }
    }

    public static class UnetEIPAddrSet extends Response {

        /** 运营商信息如: 电信: Telecom, 联通: Unicom, 国际: International, Duplet: 双线IP（电信+联通), BGP: Bgp */
        @SerializedName("OperatorName")
        private String operatorName;

        /** IP地址 */
        @SerializedName("IP")
        private String ip;

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }
    }
}
