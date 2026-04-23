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
package cn.ucloud.uhadoop.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUHadoopInstanceResponse extends Response {

    /** 集群信息 */
    @SerializedName("ClusterSet")
    private List<ClusterInfo> clusterSet;

    public List<ClusterInfo> getClusterSet() {
        return clusterSet;
    }

    public void setClusterSet(List<ClusterInfo> clusterSet) {
        this.clusterSet = clusterSet;
    }

    public static class ClusterInfo extends Response {

        /** 可用区 */
        @SerializedName("Zone")
        private String zone;

        /** 集群Tag */
        @SerializedName("Tag")
        private String tag;

        /** 实例ID */
        @SerializedName("InstanceId")
        private String instanceId;

        /** 实例名称 */
        @SerializedName("InstanceName")
        private String instanceName;

        /**
         * 框架，值为'Hadoop'|'HDFS'|'MR'|'StarRocks'之一,框架，例如Hadoop|MR|HDFS|StarRocks Hadoop框架包含存储与计算服务
         * MR集群包含计算服务 HDFS只包含存储服务,StarRocks为StarRocks集群
         */
        @SerializedName("Framework")
        private String framework;

        /** VPC ID */
        @SerializedName("VPCId")
        private String vpcId;

        /** 子网ID */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 业务组ID */
        @SerializedName("BusinessId")
        private String businessId;

        /** Uhadoop版本，值为 uhadoop 3.0|uhadoop 2.2|uhadoop 3.1 */
        @SerializedName("ReleaseVersion")
        private String releaseVersion;

        /** Hadoop版本，值为 hadoop3.2.1-udh3.0|hadoop3.3.4-udh3.1 |hadoop2.8.5-udh2.2 */
        @SerializedName("HadoopVersion")
        private String hadoopVersion;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private String createTime;

        /** 付费类型 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 到期时间 */
        @SerializedName("ExpireTime")
        private String expireTime;

        /**
         * 状态，值为以下其中之一，Running(运行中)|Creating(创建中)|CreateFailed(创建失败)|Deploying(部署中)|Updating(变更中)
         */
        @SerializedName("State")
        private String state;

        /** Master节点数量 */
        @SerializedName("MasterCount")
        private String masterCount;

        /** core节点数量 */
        @SerializedName("CoreCount")
        private String coreCount;

        /** Task节点数量 */
        @SerializedName("TaskCount")
        private String taskCount;

        /** 运行时间 */
        @SerializedName("RunningTime")
        private String runningTime;

        /** 组件集合 */
        @SerializedName("AppConfigSet")
        private String appConfigSet;

        /** 组件数量 */
        @SerializedName("AppConfigCount")
        private String appConfigCount;

        /** 是否开启安全组 */
        @SerializedName("IsOpenSecGroup")
        private String isOpenSecGroup;

        /** 节点集合 */
        @SerializedName("NodeSet")
        private String nodeSet;

        /** 节点数量 */
        @SerializedName("NodeCount")
        private String nodeCount;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
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

        public String getFramework() {
            return framework;
        }

        public void setFramework(String framework) {
            this.framework = framework;
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

        public String getBusinessId() {
            return businessId;
        }

        public void setBusinessId(String businessId) {
            this.businessId = businessId;
        }

        public String getReleaseVersion() {
            return releaseVersion;
        }

        public void setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
        }

        public String getHadoopVersion() {
            return hadoopVersion;
        }

        public void setHadoopVersion(String hadoopVersion) {
            this.hadoopVersion = hadoopVersion;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(String expireTime) {
            this.expireTime = expireTime;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getMasterCount() {
            return masterCount;
        }

        public void setMasterCount(String masterCount) {
            this.masterCount = masterCount;
        }

        public String getCoreCount() {
            return coreCount;
        }

        public void setCoreCount(String coreCount) {
            this.coreCount = coreCount;
        }

        public String getTaskCount() {
            return taskCount;
        }

        public void setTaskCount(String taskCount) {
            this.taskCount = taskCount;
        }

        public String getRunningTime() {
            return runningTime;
        }

        public void setRunningTime(String runningTime) {
            this.runningTime = runningTime;
        }

        public String getAppConfigSet() {
            return appConfigSet;
        }

        public void setAppConfigSet(String appConfigSet) {
            this.appConfigSet = appConfigSet;
        }

        public String getAppConfigCount() {
            return appConfigCount;
        }

        public void setAppConfigCount(String appConfigCount) {
            this.appConfigCount = appConfigCount;
        }

        public String getIsOpenSecGroup() {
            return isOpenSecGroup;
        }

        public void setIsOpenSecGroup(String isOpenSecGroup) {
            this.isOpenSecGroup = isOpenSecGroup;
        }

        public String getNodeSet() {
            return nodeSet;
        }

        public void setNodeSet(String nodeSet) {
            this.nodeSet = nodeSet;
        }

        public String getNodeCount() {
            return nodeCount;
        }

        public void setNodeCount(String nodeCount) {
            this.nodeCount = nodeCount;
        }
    }
}
