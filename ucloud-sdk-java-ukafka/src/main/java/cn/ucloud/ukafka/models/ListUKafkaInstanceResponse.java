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
package cn.ucloud.ukafka.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class ListUKafkaInstanceResponse extends Response {

    /** 实例信息 */
    @SerializedName("ClusterSet")
    private ClusterSet clusterSet;

    /** 总数 */
    @SerializedName("TotalCount")
    private String totalCount;

    public ClusterSet getClusterSet() {
        return clusterSet;
    }

    public void setClusterSet(ClusterSet clusterSet) {
        this.clusterSet = clusterSet;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public static class ClusterSet extends Response {

        /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
        @SerializedName("Zone")
        private String zone;

        /** 实例id */
        @SerializedName("ClusterInstanceId")
        private String clusterInstanceId;

        /** 实例名称 */
        @SerializedName("ClusterInstanceName")
        private String clusterInstanceName;

        /** 框架 */
        @SerializedName("Framework")
        private String framework;

        /** Kafka 框架版本 */
        @SerializedName("FrameworkVersion")
        private String frameworkVersion;

        /** 实例备注 */
        @SerializedName("Remark")
        private String remark;

        /** 实例创建时间戳 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 实例运行时间 */
        @SerializedName("RunningTime")
        private Integer runningTime;

        /** 实例过期时间 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 是否自动续费 */
        @SerializedName("AutoRenew")
        private String autoRenew;

        /** 付费类型 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 实例节点个数 */
        @SerializedName("UHostCount")
        private Integer uHostCount;

        /** 冗余计数（已废弃） */
        @SerializedName("RedundantCount")
        private Integer redundantCount;

        /**
         * 实例当前状态,集群状态："Running"| "Abnormal"| "Creating"| "Deleting"| "CreateFailed"|
         * "DeleteFailed"| "Unavailable"| "Deleted"| "Updating"| "Deploying"| "Migrating"|
         * "ExpandFailed"
         */
        @SerializedName("State")
        private String state;

        /** 实例标记 */
        @SerializedName("Tag")
        private String tag;

        /** 实例机型 */
        @SerializedName("InstanceGroupType")
        private String instanceGroupType;

        /** 所属 VPC id */
        @SerializedName("VPCId")
        private String vpcId;

        /** 所属子网 id */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 业务组 ID */
        @SerializedName("BusinessId")
        private String businessId;

        /** 事件状态未读消息（已废弃） */
        @SerializedName("NewMessage")
        private String newMessage;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getClusterInstanceId() {
            return clusterInstanceId;
        }

        public void setClusterInstanceId(String clusterInstanceId) {
            this.clusterInstanceId = clusterInstanceId;
        }

        public String getClusterInstanceName() {
            return clusterInstanceName;
        }

        public void setClusterInstanceName(String clusterInstanceName) {
            this.clusterInstanceName = clusterInstanceName;
        }

        public String getFramework() {
            return framework;
        }

        public void setFramework(String framework) {
            this.framework = framework;
        }

        public String getFrameworkVersion() {
            return frameworkVersion;
        }

        public void setFrameworkVersion(String frameworkVersion) {
            this.frameworkVersion = frameworkVersion;
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

        public Integer getRunningTime() {
            return runningTime;
        }

        public void setRunningTime(Integer runningTime) {
            this.runningTime = runningTime;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public String getAutoRenew() {
            return autoRenew;
        }

        public void setAutoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Integer getUHostCount() {
            return uHostCount;
        }

        public void setUHostCount(Integer uHostCount) {
            this.uHostCount = uHostCount;
        }

        public Integer getRedundantCount() {
            return redundantCount;
        }

        public void setRedundantCount(Integer redundantCount) {
            this.redundantCount = redundantCount;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getInstanceGroupType() {
            return instanceGroupType;
        }

        public void setInstanceGroupType(String instanceGroupType) {
            this.instanceGroupType = instanceGroupType;
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

        public String getNewMessage() {
            return newMessage;
        }

        public void setNewMessage(String newMessage) {
            this.newMessage = newMessage;
        }
    }
}
