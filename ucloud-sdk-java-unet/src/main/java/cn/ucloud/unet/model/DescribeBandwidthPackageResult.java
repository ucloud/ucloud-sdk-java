package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取某地域下的带宽包信息 结果类
 * @author: codezhang
 * @date: 2018-09-27 15:48
 **/

public class DescribeBandwidthPackageResult extends BaseResponseResult {


    public static  class BandwidthPackage{

        /**
         * 带宽包的资源ID
         */
        @SerializedName("BandwidthPackageId")
        private String bandwidthPackageId;

        /**
         * 生效时间, 格式为 Unix Timestamp
         */
        @SerializedName("EnableTime")
        private Integer enableTime;

        /**
         * 失效时间, 格式为 Unix Timestamp
         */
        @SerializedName("DisableTime")
        private Integer disableTime;

        /**
         * 创建时间, 格式为 Unix Timestamp
         */
        @SerializedName("CreateTime")
        private Integer createTime;

        /**
         * 带宽包的临时带宽值, 单位Mbps
         */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /**
         * 带宽包所绑定弹性IP的资源ID
         */
        @SerializedName("EIPId")
        private String eipId;

        /**
         * 带宽包所绑定弹性IP的详细信息,只有当EIPId对应双线IP时, EIPAddr的长度为2, 其他情况, EIPAddr长度均为1.参见 EIPAddrSet
         */
        @SerializedName("EIPAddr")
        private List<EIPAddr> eipAddrs;

        /**
         * 生命周期
         */
        @SerializedName("LifeCycle")
        private String lifeCycle;

        public String getLifeCycle() {
            return lifeCycle;
        }

        public void setLifeCycle(String lifeCycle) {
            this.lifeCycle = lifeCycle;
        }

        public String getBandwidthPackageId() {
            return bandwidthPackageId;
        }

        public void setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
        }

        public Integer getEnableTime() {
            return enableTime;
        }

        public void setEnableTime(Integer enableTime) {
            this.enableTime = enableTime;
        }

        public Integer getDisableTime() {
            return disableTime;
        }

        public void setDisableTime(Integer disableTime) {
            this.disableTime = disableTime;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
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

        public List<EIPAddr> getEipAddrs() {
            return eipAddrs;
        }

        public void setEipAddrs(List<EIPAddr> eipAddrs) {
            this.eipAddrs = eipAddrs;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }


    public static  class EIPAddr{

        /**
         * 运营商信息, 枚举值为: Bgp: BGP; International: 国际.
         */
        @SerializedName("OperatorName")
        private String operatorName;

        /**
         * 弹性IP地址
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

    /**
     * 满足条件的带宽包总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 带宽包详细信息, 参见 UnetBandwidthPackageSet
     */
    @SerializedName("DataSets")
    private List<BandwidthPackage> bandwidthPackages;

    /**
     * 请求UUID
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

    public List<BandwidthPackage> getBandwidthPackages() {
        return bandwidthPackages;
    }

    public void setBandwidthPackages(List<BandwidthPackage> bandwidthPackages) {
        this.bandwidthPackages = bandwidthPackages;
    }
}
