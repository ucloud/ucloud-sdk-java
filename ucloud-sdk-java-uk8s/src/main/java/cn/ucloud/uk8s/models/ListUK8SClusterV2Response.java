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

    /** 满足条件的集群数量 */
    @SerializedName("ClusterCount")
    private Integer clusterCount;

    /** 集群信息，具体参考ClusterSet */
    @SerializedName("ClusterSet")
    private List<ClusterSet> clusterSet;

    /** 总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

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

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class ClusterSet extends Response {

        /** 资源名字 */
        @SerializedName("ClusterName")
        private String clusterName;

        /** 集群ID */
        @SerializedName("ClusterId")
        private String clusterId;

        /** 所属VPC */
        @SerializedName("VPCId")
        private String vpcId;

        /** 所属子网 */
        @SerializedName("SubnetId")
        private String subnetId;

        /** Pod网段 */
        @SerializedName("PodCIDR")
        private String podCIDR;

        /** 服务网段 */
        @SerializedName("ServiceCIDR")
        private String serviceCIDR;

        /** CNI网络模式 */
        @SerializedName("CNIMode")
        private String cniMode;

        /** Master 节点数量 */
        @SerializedName("MasterCount")
        private Integer masterCount;

        /** 集群apiserver地址 */
        @SerializedName("ApiServer")
        private String apiServer;

        /** 集群版本 */
        @SerializedName("K8sVersion")
        private String k8sVersion;

        /** 删除保护开关。0表示不开启，1表示开启。默认不开启 */
        @SerializedName("DeleteProtection")
        private Integer deleteProtection;

        /** 容器运行时名称 */
        @SerializedName("RuntimeName")
        private String runtimeName;

        /** 容器运行时版本号，docker 或 containerd 版本 */
        @SerializedName("RuntimeVersion")
        private String runtimeVersion;

        /** 计费/管理形态，区分"专有版"和"托管版"两种售卖形态 */
        @SerializedName("ClusterType")
        private String clusterType;

        /** API Server 内部回环客户端证书 */
        @SerializedName("LoopbackClientCert")
        private LoopbackClientCert loopbackClientCert;

        /** 创建集群时判断如果为NORESOURCE则为没资源，否则为空 */
        @SerializedName("ClusterLogInfo")
        private String clusterLogInfo;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** Node节点数量 */
        @SerializedName("NodeCount")
        private Integer nodeCount;

        /** 集群外部apiserver地址 */
        @SerializedName("ExternalApiServer")
        private String externalApiServer;

        /**
         * 集群状态，枚举值：初始化："INITIALIZING"；启动中："STARTING"；创建失败："CREATEFAILED"；正常运行："RUNNING"；添加节点："ADDNODE"；删除节点："DELNODE"；删除中："DELETING"；删除失败："DELETEFAILED"；错误："ERROR"；升级插件："UPDATE_PLUGIN"；更新插件信息："UPDATE_PLUGIN_INFO"；异常："ABNORMAL"；升级集群中："UPGRADING"；容器运行时切换："CONVERTING"
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

        public String getCNIMode() {
            return cniMode;
        }

        public void setCNIMode(String cniMode) {
            this.cniMode = cniMode;
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

        public Integer getDeleteProtection() {
            return deleteProtection;
        }

        public void setDeleteProtection(Integer deleteProtection) {
            this.deleteProtection = deleteProtection;
        }

        public String getRuntimeName() {
            return runtimeName;
        }

        public void setRuntimeName(String runtimeName) {
            this.runtimeName = runtimeName;
        }

        public String getRuntimeVersion() {
            return runtimeVersion;
        }

        public void setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
        }

        public String getClusterType() {
            return clusterType;
        }

        public void setClusterType(String clusterType) {
            this.clusterType = clusterType;
        }

        public LoopbackClientCert getLoopbackClientCert() {
            return loopbackClientCert;
        }

        public void setLoopbackClientCert(LoopbackClientCert loopbackClientCert) {
            this.loopbackClientCert = loopbackClientCert;
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

    public static class LoopbackClientCert extends Response {

        /** 证书到期时间 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 证书是否进入过期告警状态 */
        @SerializedName("Warn")
        private Boolean warn;

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public Boolean getWarn() {
            return warn;
        }

        public void setWarn(Boolean warn) {
            this.warn = warn;
        }
    }
}
