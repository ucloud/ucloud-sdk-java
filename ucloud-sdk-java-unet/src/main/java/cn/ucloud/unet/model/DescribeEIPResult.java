package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取弹性IP信息
 * @author: codezhang
 * @date: 2018-09-25 14:17
 **/

public class DescribeEIPResult extends BaseResponseResult {


    public static class UnetEIP{
        /**
         * 弹性IP的资源ID
         */
        @SerializedName("EIPId")
        private String eipId;

        /**
         * 外网出口权重, 默认为50, 范围[0-100]
         */
        @SerializedName("Weight")
        private Integer weight;

        /**
         * 带宽模式, 枚举值为: 0: 非共享带宽模式, 1: 共享带宽模式
         */
        @SerializedName("BandwithType")
        private Integer bandwithType;

        /**
         * 弹性IP的资源绑定状态, 枚举值为: used: 已绑定, free: 未绑定, freeze: 已冻结
         */
        @SerializedName("Status")
        private String status;

        /**
         * 付费方式, 枚举值为: Year, 按年付费; Month, 按月付费; Dynamic, 按小时付费; Trial, 试用.
         * 按小时付费和试用这两种付费模式需要开通权限.
         */
        @SerializedName("ChargeType")
        private String chargeType;

        /**
         * 弹性IP的创建时间, 格式为Unix Timestamp
         */
        @SerializedName("CreateTime")
        private Integer createTime;

        /**
         * 弹性IP的到期时间, 格式为Unix Timestamp
         */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /**
         * 弹性IP的详细信息列表, 具体结构见下方 UnetEIPResourceSet
         */
        @SerializedName("Resource")
        private UnetEIPResource resource;

        /**
         * 弹性IP的详细信息列表, 具体结构见下方 UnetEIPAddrSet
         */
        @SerializedName("EIPAddr")
        private List<UnetEIPAddr> eipAddrs;

        /**
         * 弹性IP的名称,缺省值为 "EIP"
         */
        @SerializedName("Name")
        private String name;

        /**
         * 弹性IP的业务组标识, 缺省值为 "Default"
         */
        @SerializedName("Tag")
        private String tag;

        /**
         * 弹性IP的备注, 缺省值为 ""
         */
        @SerializedName("Remark")
        private String remark;

        /**
         * 弹性IP的计费模式, 枚举值为: "Bandwidth", 带宽计费; "Traffic", 流量计费; "ShareBandwidth",共享带宽模式.
         * 默认为 "Bandwidth".
         */
        @SerializedName("PayMode")
        private String payMode;

        /**
         * 共享带宽信息 参见 ShareBandwidthSet
         */
        @SerializedName("ShareBandwidthSet")
        private ShareBandwidth shareBandwidth;

        /**
         * 弹性IP是否到期
         */
        @SerializedName("Expire")
        private Boolean expire;

        /**
         * 带宽
         */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /**
         * 带宽类型
         */
        @SerializedName("BandwidthType")
        private Integer bandwidthType;

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

        public String getEipId() {
            return eipId;
        }

        public void setEipId(String eipId) {
            this.eipId = eipId;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public Integer getBandwithType() {
            return bandwithType;
        }

        public void setBandwithType(Integer bandwithType) {
            this.bandwithType = bandwithType;
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

        public UnetEIPResource getResource() {
            return resource;
        }

        public void setResource(UnetEIPResource resource) {
            this.resource = resource;
        }

        public List<UnetEIPAddr> getEipAddrs() {
            return eipAddrs;
        }

        public void setEipAddrs(List<UnetEIPAddr> eipAddrs) {
            this.eipAddrs = eipAddrs;
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

        public ShareBandwidth getShareBandwidth() {
            return shareBandwidth;
        }

        public void setShareBandwidth(ShareBandwidth shareBandwidth) {
            this.shareBandwidth = shareBandwidth;
        }

        public Boolean getExpire() {
            return expire;
        }

        public void setExpire(Boolean expire) {
            this.expire = expire;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }


    public static class UnetEIPAddr{
        /**
         * 运营商信息如: 国际: International, BGP: Bgp
         */
        @SerializedName("OperatorName")
        private String operatorName;

        /**
         * IP地址
         */
        @SerializedName("IP")
        private String ip;

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }


    public static class ShareBandwidth{

        /**
         * 共享带宽带宽值
         */
        @SerializedName("ShareBandwidth")
        private Integer shareBandwidth;

        /**
         * 共享带宽的资源名称
         */
        @SerializedName("ShareBandwidthName")
        private String shareBandwidthName;

        /**
         * 共享带宽ID
         */
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

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }


    public static class UnetEIPResource{

        /**
         * 已绑定的资源类型, 枚举值为: uhost, 云主机；vrouter：虚拟路由器；ulb：负载均衡器
         */
        @SerializedName("ResourceType")
        private String resourceType;

        /**
         * 已绑定的资源名称
         */
        @SerializedName("ResourceName")
        private String resourceName;

        /**
         * 已绑定资源的资源ID
         */
        @SerializedName("ResourceID")
        private String resourceId;

        /**
         * 弹性IP的资源ID
         */
        @SerializedName("Zone")
        private String zone;

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

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }


    /**
     * 满足条件的弹性IP总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 满足条件的弹性IP带宽总和, 单位Mbps
     */
    @SerializedName("TotalBandwidth")
    private Integer totalBandwidth;

    /**
     * 弹性IP列表, 每项参数详见 UnetEIP
     */
    @SerializedName("EIPSet")
    private List<UnetEIP> eips;

    /**
     * 请求uuid
     */
    @SerializedName("Request_uuid")
    private String requestUuid;

    public String getRequestUuid() {
        return requestUuid;
    }

    public void setRequestUuid(String requestUuid) {
        this.requestUuid = requestUuid;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalBandwidth() {
        return totalBandwidth;
    }

    public void setTotalBandwidth(Integer totalBandwidth) {
        this.totalBandwidth = totalBandwidth;
    }

    public List<UnetEIP> getEips() {
        return eips;
    }

    public void setEips(List<UnetEIP> eips) {
        this.eips = eips;
    }
}
