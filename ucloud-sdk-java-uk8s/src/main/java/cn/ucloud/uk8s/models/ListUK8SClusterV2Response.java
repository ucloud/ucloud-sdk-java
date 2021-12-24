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
package cn.ucloud.uk8s.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ListUK8SClusterV2Response extends Response {

    /** 满足条件的集群数量: false */
    @SerializedName("ClusterCount")
    private Integer clusterCount;

    /** 集群信息，具体参考ClusterSet: false */
    @SerializedName("ClusterSet")
    private List<ClusterSet> clusterSet;

    public Integer getClusterCount() {
        return clusterCount;
    }

    public void setClusterCount(Integer clusterCount) {
        this.clusterCount = clusterCount;
    }

    public List<ClusterSet> getClusterSet() {
        return clusterSet;
    }

    public void setClusterSet(List<ClusterSet> clusterSet) {
        this.clusterSet = clusterSet;
    }

    public static class ClusterSet extends Response {

        /** 资源名字: false */
        @SerializedName("ClusterName")
        private String clusterName;

        /** 集群ID: false */
        @SerializedName("ClusterId")
        private String clusterId;

        /** 所属VPC: false */
        @SerializedName("VPCId")
        private String vpcId;

        /** 所属子网: false */
        @SerializedName("SubnetId")
        private String subnetId;

        /** Pod网段: false */
        @SerializedName("PodCIDR")
        private String podCIDR;

        /** 服务网段: false */
        @SerializedName("ServiceCIDR")
        private String serviceCIDR;

        /** Master 节点数量: false */
        @SerializedName("MasterCount")
        private Integer masterCount;

        /** 集群apiserver地址: false */
        @SerializedName("ApiServer")
        private String apiServer;

        /** 集群版本: false */
        @SerializedName("K8sVersion")
        private String k8sVersion;

        /** 创建集群时判断如果为NORESOURCE则为没资源，否则为空: false */
        @SerializedName("ClusterLogInfo")
        private String clusterLogInfo;

        /** 创建时间: false */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** Node节点数量: false */
        @SerializedName("NodeCount")
        private Integer nodeCount;

        /** 集群外部apiserver地址 : false */
        @SerializedName("ExternalApiServer")
        private String externalApiServer;

        /**
         * 集群状态，枚举值：初始化："INITIALIZING"；启动中："STARTING"；创建失败："CREATEFAILED"；正常运行："RUNNING"；添加节点："ADDNODE"；删除节点："DELNODE"；删除中："DELETING"；删除失败："DELETEFAILED"；错误："ERROR"；升级插件："UPDATE_PLUGIN"；更新插件信息："UPDATE_PLUGIN_INFO"；异常："ABNORMAL"；升级集群中："UPGRADING"；容器运行时切换："CONVERTING":
         * false
         */
        @SerializedName("Status")
        private String status;

        public String getClusterName() {
            return clusterName;
        }

        public void setClusterName(String clusterName) {
            this.clusterName = clusterName;
        }

        public String getClusterId() {
            return clusterId;
        }

        public void setClusterId(String clusterId) {
            this.clusterId = clusterId;
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

        public String getPodCIDR() {
            return podCIDR;
        }

        public void setPodCIDR(String podCIDR) {
            this.podCIDR = podCIDR;
        }

        public String getServiceCIDR() {
            return serviceCIDR;
        }

        public void setServiceCIDR(String serviceCIDR) {
            this.serviceCIDR = serviceCIDR;
        }

        public Integer getMasterCount() {
            return masterCount;
        }

        public void setMasterCount(Integer masterCount) {
            this.masterCount = masterCount;
        }

        public String getApiServer() {
            return apiServer;
        }

        public void setApiServer(String apiServer) {
            this.apiServer = apiServer;
        }

        public String getK8sVersion() {
            return k8sVersion;
        }

        public void setK8sVersion(String k8sVersion) {
            this.k8sVersion = k8sVersion;
        }

        public String getClusterLogInfo() {
            return clusterLogInfo;
        }

        public void setClusterLogInfo(String clusterLogInfo) {
            this.clusterLogInfo = clusterLogInfo;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getNodeCount() {
            return nodeCount;
        }

        public void setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
        }

        public String getExternalApiServer() {
            return externalApiServer;
        }

        public void setExternalApiServer(String externalApiServer) {
            this.externalApiServer = externalApiServer;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
