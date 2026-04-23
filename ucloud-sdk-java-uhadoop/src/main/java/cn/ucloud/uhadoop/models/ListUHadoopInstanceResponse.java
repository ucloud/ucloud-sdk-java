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

public class ListUHadoopInstanceResponse extends Response {

    /** 集群信息集合 */
    @SerializedName("ClusterSet")
    private List<ListClusterInfo> clusterSet;

    /** 总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<ListClusterInfo> getClusterSet() {
        return clusterSet;
    }

    public void setClusterSet(List<ListClusterInfo> clusterSet) {
        this.clusterSet = clusterSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class ListClusterInfo extends Response {

        /** 可用区 */
        @SerializedName("Zone")
        private String zone;

        /** 实例ID */
        @SerializedName("InstanceId")
        private String instanceId;

        /** 实例名称 */
        @SerializedName("InstanceName")
        private String instanceName;

        /**
         * 框架，值为'Hadoop'|'HDFS'|'MR'|'StarRocks'之一，Hadoop框架包含存储与计算服务，MR集群包含计算服务，HDFS只包含存储服务，StarRocks为StarRocks集群
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

        /**
         * 状态，值为以下其中之一，Running(运行中)|Creating(创建中)|CreateFailed(创建失败)|Deploying(部署中)|Updating(变更中)
         */
        @SerializedName("State")
        private String state;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
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

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
