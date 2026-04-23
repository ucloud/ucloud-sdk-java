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
package cn.ucloud.ues.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListUESInstanceResponse extends Response {

    /** 实例信息列表 */
    @SerializedName("ClusterSet")
    private List<ClusterInfo> clusterSet;

    /** 实例个数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<ClusterInfo> getClusterSet() {
        return clusterSet;
    }

    public void setClusterSet(List<ClusterInfo> clusterSet) {
        this.clusterSet = clusterSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class ClusterInfo extends Response {

        /** 可用区 */
        @SerializedName("Zone")
        private String zone;

        /** 项目组ID标识 */
        @SerializedName("BusinessId")
        private String businessId;

        /** 计费类型，默认为Month */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 失效时间 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 节点个数，默认为集群大小 */
        @SerializedName("NodeCount")
        private Integer nodeCount;

        /** 实例运行时长 */
        @SerializedName("RunTime")
        private Integer runTime;

        /** 应用服务版本号 */
        @SerializedName("AppVersion")
        private String appVersion;

        /** 实例状态 */
        @SerializedName("State")
        private String state;

        /** 实例资源ID */
        @SerializedName("InstanceId")
        private String instanceId;

        /** 实例名称 */
        @SerializedName("InstanceName")
        private String instanceName;

        /** 应用名称 */
        @SerializedName("AppName")
        private String appName;

        /** 服务集群ID标识（弃用） */
        @SerializedName("UESInstanceId")
        private String uesInstanceId;

        /** 服务集群名称（弃用） */
        @SerializedName("UESInstanceName")
        private String uesInstanceName;

        /** 服务版本号（弃用） */
        @SerializedName("ServiceVersion")
        private String serviceVersion;

        /** 子网ID标识 */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 业务组 */
        @SerializedName("Tag")
        private String tag;

        /** VPCID标识 */
        @SerializedName("VPCId")
        private String vpcId;

        /** VIP地址信息 */
        @SerializedName("Vip")
        private String vip;

        /** 是否开启安全组 */
        @SerializedName("IsSecGroup")
        private Boolean isSecGroup;

        /** 多可用区 */
        @SerializedName("MultiZones")
        private List<String> multiZones;

        /** 是否支持改配 */
        @SerializedName("Resizable")
        private Boolean resizable;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getBusinessId() {
            return businessId;
        }

        public void setBusinessId(String businessId) {
            this.businessId = businessId;
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

        public Integer getNodeCount() {
            return nodeCount;
        }

        public void setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
        }

        public Integer getRunTime() {
            return runTime;
        }

        public void setRunTime(Integer runTime) {
            this.runTime = runTime;
        }

        public String getAppVersion() {
            return appVersion;
        }

        public void setAppVersion(String appVersion) {
            this.appVersion = appVersion;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getInstanceId() {
            return instanceId;
        }

        public void setInstanceId(String instanceId) {
            this.instanceId = instanceId;
        }

        public String getInstanceName() {
            return instanceName;
        }

        public void setInstanceName(String instanceName) {
            this.instanceName = instanceName;
        }

        public String getAppName() {
            return appName;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }

        public String getUESInstanceId() {
            return uesInstanceId;
        }

        public void setUESInstanceId(String uesInstanceId) {
            this.uesInstanceId = uesInstanceId;
        }

        public String getUESInstanceName() {
            return uesInstanceName;
        }

        public void setUESInstanceName(String uesInstanceName) {
            this.uesInstanceName = uesInstanceName;
        }

        public String getServiceVersion() {
            return serviceVersion;
        }

        public void setServiceVersion(String serviceVersion) {
            this.serviceVersion = serviceVersion;
        }

        public String getSubnetId() {
            return subnetId;
        }

        public void setSubnetId(String subnetId) {
            this.subnetId = subnetId;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }

        public String getVip() {
            return vip;
        }

        public void setVip(String vip) {
            this.vip = vip;
        }

        public Boolean getIsSecGroup() {
            return isSecGroup;
        }

        public void setIsSecGroup(Boolean isSecGroup) {
            this.isSecGroup = isSecGroup;
        }

        public List<String> getMultiZones() {
            return multiZones;
        }

        public void setMultiZones(List<String> multiZones) {
            this.multiZones = multiZones;
        }

        public Boolean getResizable() {
            return resizable;
        }

        public void setResizable(Boolean resizable) {
            this.resizable = resizable;
        }
    }
}
