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

public class GetUK8SPluginInfoResponse extends Response {

    /** 集群ID */
    @SerializedName("ClusterId")
    private String clusterId;

    /** CNI插件信息, 参看NodePlugin */
    @SerializedName("CNIInfoSet")
    private NodePlugin cniInfoSet;

    /** 集群状态信息 */
    @SerializedName("ClusterStatus")
    private String clusterStatus;

    /** 集群升级相关信息 */
    @SerializedName("ClusterUpgradeInfo")
    private ClusterUpgradeInfo clusterUpgradeInfo;

    /** 集群容器运行时转换信息。 */
    @SerializedName("RuntimeConvertInfo")
    private RuntimeConvertInfo runtimeConvertInfo;

    /** vk插件信息 */
    @SerializedName("VKInfo")
    private VKNode vkInfo;

    /** CSI 插件版本与状态。 */
    @SerializedName("CSIInfo")
    private CSIInfo csiInfo;

    /** CloudProvider 插件版本与状态。 */
    @SerializedName("CloudProviderInfo")
    private CloudProviderInfo cloudProviderInfo;

    /** 监控插件信息。 */
    @SerializedName("MonitorInfo")
    private MonitorInfo monitorInfo;

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public NodePlugin getCNIInfoSet() {
        return cniInfoSet;
    }

    public void setCNIInfoSet(NodePlugin cniInfoSet) {
        this.cniInfoSet = cniInfoSet;
    }

    public String getClusterStatus() {
        return clusterStatus;
    }

    public void setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
    }

    public ClusterUpgradeInfo getClusterUpgradeInfo() {
        return clusterUpgradeInfo;
    }

    public void setClusterUpgradeInfo(ClusterUpgradeInfo clusterUpgradeInfo) {
        this.clusterUpgradeInfo = clusterUpgradeInfo;
    }

    public RuntimeConvertInfo getRuntimeConvertInfo() {
        return runtimeConvertInfo;
    }

    public void setRuntimeConvertInfo(RuntimeConvertInfo runtimeConvertInfo) {
        this.runtimeConvertInfo = runtimeConvertInfo;
    }

    public VKNode getVKInfo() {
        return vkInfo;
    }

    public void setVKInfo(VKNode vkInfo) {
        this.vkInfo = vkInfo;
    }

    public CSIInfo getCSIInfo() {
        return csiInfo;
    }

    public void setCSIInfo(CSIInfo csiInfo) {
        this.csiInfo = csiInfo;
    }

    public CloudProviderInfo getCloudProviderInfo() {
        return cloudProviderInfo;
    }

    public void setCloudProviderInfo(CloudProviderInfo cloudProviderInfo) {
        this.cloudProviderInfo = cloudProviderInfo;
    }

    public MonitorInfo getMonitorInfo() {
        return monitorInfo;
    }

    public void setMonitorInfo(MonitorInfo monitorInfo) {
        this.monitorInfo = monitorInfo;
    }

    public static class CSIInfo extends Response {

        /** 插件名称。 */
        @SerializedName("Name")
        private String name;

        /** 最新可用插件版本。 */
        @SerializedName("AvailableVersion")
        private String availableVersion;

        /** 最新可用版本的发布时间。 */
        @SerializedName("ReleaseTime")
        private String releaseTime;

        /** 是否开启插件托管。 */
        @SerializedName("ManageEnabled")
        private Boolean manageEnabled;

        /** 当前插件版本。 */
        @SerializedName("Version")
        private String version;

        /** 插件状态。 */
        @SerializedName("Status")
        private Integer status;

        /** 更新时间，Unix 时间戳，单位秒。 */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        /** 上次插件操作结果。 */
        @SerializedName("OperationResult")
        private Integer operationResult;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAvailableVersion() {
            return availableVersion;
        }

        public void setAvailableVersion(String availableVersion) {
            this.availableVersion = availableVersion;
        }

        public String getReleaseTime() {
            return releaseTime;
        }

        public void setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
        }

        public Boolean getManageEnabled() {
            return manageEnabled;
        }

        public void setManageEnabled(Boolean manageEnabled) {
            this.manageEnabled = manageEnabled;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }

        public Integer getOperationResult() {
            return operationResult;
        }

        public void setOperationResult(Integer operationResult) {
            this.operationResult = operationResult;
        }
    }

    public static class CloudProviderInfo extends Response {

        /** 插件名称。 */
        @SerializedName("Name")
        private String name;

        /** 最新可用插件版本。 */
        @SerializedName("AvailableVersion")
        private String availableVersion;

        /** 最新可用版本的发布时间。 */
        @SerializedName("ReleaseTime")
        private String releaseTime;

        /** 是否开启插件托管。 */
        @SerializedName("ManageEnabled")
        private Boolean manageEnabled;

        /** 当前插件版本。 */
        @SerializedName("Version")
        private String version;

        /** 插件状态。 */
        @SerializedName("Status")
        private Integer status;

        /** 更新时间，Unix 时间戳，单位秒。 */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        /** 上次插件操作结果。 */
        @SerializedName("OperationResult")
        private Integer operationResult;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAvailableVersion() {
            return availableVersion;
        }

        public void setAvailableVersion(String availableVersion) {
            this.availableVersion = availableVersion;
        }

        public String getReleaseTime() {
            return releaseTime;
        }

        public void setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
        }

        public Boolean getManageEnabled() {
            return manageEnabled;
        }

        public void setManageEnabled(Boolean manageEnabled) {
            this.manageEnabled = manageEnabled;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }

        public Integer getOperationResult() {
            return operationResult;
        }

        public void setOperationResult(Integer operationResult) {
            this.operationResult = operationResult;
        }
    }

    public static class ClusterUpdateNodeInfo extends Response {

        /** Node节点名称 */
        @SerializedName("Node")
        private String node;

        /** 插件版本 */
        @SerializedName("Version")
        private String version;

        /** 插件工作状态，0：未知，1：正常， 2：异常, 3: 升级中 */
        @SerializedName("Status")
        private Integer status;

        /** 插件信息更新时间 */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        /** 上次插件操作结果，0：没有上次操作结果，或当前正在执行升级或查询 1：获取成功 2 获取失败 3 升级成功 4 升级失败 */
        @SerializedName("OperationResult")
        private Integer operationResult;

        /** Node节点IP */
        @SerializedName("IP")
        private String ip;

        /** 节点角色， master 或者 node */
        @SerializedName("Role")
        private String role;

        public String getNode() {
            return node;
        }

        public void setNode(String node) {
            this.node = node;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }

        public Integer getOperationResult() {
            return operationResult;
        }

        public void setOperationResult(Integer operationResult) {
            this.operationResult = operationResult;
        }

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }
    }

    public static class ClusterUpgradeInfo extends Response {

        /** 集群信息更新时间戳，单位 s */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        /**
         * string，集群升级所处阶段 Unknown、Precheck、MasterUpdating、NodeUpdating、Failed、Success
         *
         * <p>集群从未进行过升级则返回 Unknown
         *
         * <p>集群开始升级过程几个阶段 Precheck->MasterUpdating->NodeUpdating→Success
         *
         * <p>如果升级失败则为 Failed
         */
        @SerializedName("Stage")
        private String stage;

        /** string， 集群当前版本 */
        @SerializedName("Version")
        private String version;

        /** string，集群升级目标版本 */
        @SerializedName("TargetVersion")
        private String targetVersion;

        /** string 数组，可用新版本，例如 ["1.15.12","1.16.15","1.17.4","1.18.9"] */
        @SerializedName("AvailableVersions")
        private List<String> availableVersions;

        /** 各个节点升级信息, 参照 ClusterUpdateNodeInfo */
        @SerializedName("NodeInfoSet")
        private List<ClusterUpdateNodeInfo> nodeInfoSet;

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }

        public String getStage() {
            return stage;
        }

        public void setStage(String stage) {
            this.stage = stage;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getTargetVersion() {
            return targetVersion;
        }

        public void setTargetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
        }

        public List<String> getAvailableVersions() {
            return availableVersions;
        }

        public void setAvailableVersions(List<String> availableVersions) {
            this.availableVersions = availableVersions;
        }

        public List<ClusterUpdateNodeInfo> getNodeInfoSet() {
            return nodeInfoSet;
        }

        public void setNodeInfoSet(List<ClusterUpdateNodeInfo> nodeInfoSet) {
            this.nodeInfoSet = nodeInfoSet;
        }
    }

    public static class MonitorInfo extends Response {

        /** 最新可用监控插件版本。 */
        @SerializedName("AvailableVersion")
        private String availableVersion;

        public String getAvailableVersion() {
            return availableVersion;
        }

        public void setAvailableVersion(String availableVersion) {
            this.availableVersion = availableVersion;
        }
    }

    public static class NodePlugin extends Response {

        /** 插件名称, 如 CNI, CSI, Flexv, CloudProvider */
        @SerializedName("Name")
        private String name;

        /** 各个节点插件信息, 参照NodePluginInfo */
        @SerializedName("PluginInfoSet")
        private List<NodePluginInfo> pluginInfoSet;

        /** 最新插件版本 */
        @SerializedName("AvailableVersion")
        private String availableVersion;

        /** 最新插件发布时间 */
        @SerializedName("ReleaseTime")
        private String releaseTime;

        /** 插件管理是否开启 */
        @SerializedName("ManageEnabled")
        private Boolean manageEnabled;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<NodePluginInfo> getPluginInfoSet() {
            return pluginInfoSet;
        }

        public void setPluginInfoSet(List<NodePluginInfo> pluginInfoSet) {
            this.pluginInfoSet = pluginInfoSet;
        }

        public String getAvailableVersion() {
            return availableVersion;
        }

        public void setAvailableVersion(String availableVersion) {
            this.availableVersion = availableVersion;
        }

        public String getReleaseTime() {
            return releaseTime;
        }

        public void setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
        }

        public Boolean getManageEnabled() {
            return manageEnabled;
        }

        public void setManageEnabled(Boolean manageEnabled) {
            this.manageEnabled = manageEnabled;
        }
    }

    public static class NodePluginInfo extends Response {

        /** Node节点名称 */
        @SerializedName("Node")
        private String node;

        /** 插件版本 */
        @SerializedName("Version")
        private String version;

        /** 插件工作状态，0：未知，1：正常， 2：异常, 3: 升级中 */
        @SerializedName("Status")
        private Integer status;

        /** 插件信息更新时间 */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        /** 上次插件操作结果，0：没有上次操作结果，或当前正在执行升级或查询 1：获取成功 2 获取失败 3 升级成功 4 升级失败 */
        @SerializedName("OperationResult")
        private Integer operationResult;

        /** Node节点IP */
        @SerializedName("IP")
        private String ip;

        public String getNode() {
            return node;
        }

        public void setNode(String node) {
            this.node = node;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }

        public Integer getOperationResult() {
            return operationResult;
        }

        public void setOperationResult(Integer operationResult) {
            this.operationResult = operationResult;
        }

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }
    }

    public static class RuntimeConvertInfo extends Response {

        /** 各节点的运行时转换状态。 */
        @SerializedName("NodeInfoSet")
        private List<NodePluginInfo> nodeInfoSet;

        /**
         * 集群从未进行过运行时转换则返回 Unknown
         *
         * <p>集群运行时转换几个阶段 Precheck->Updating→Success
         *
         * <p>如果转换失败则为 Failed
         */
        @SerializedName("Stage")
        private String stage;

        /** 运行时转换信息更新时间，Unix 时间戳，单位秒。 */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        /** 容器运行时名称。 */
        @SerializedName("RuntimeName")
        private String runtimeName;

        /** 容器运行时版本。 */
        @SerializedName("RuntimeVersion")
        private String runtimeVersion;

        public List<NodePluginInfo> getNodeInfoSet() {
            return nodeInfoSet;
        }

        public void setNodeInfoSet(List<NodePluginInfo> nodeInfoSet) {
            this.nodeInfoSet = nodeInfoSet;
        }

        public String getStage() {
            return stage;
        }

        public void setStage(String stage) {
            this.stage = stage;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
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
    }

    public static class VKNode extends Response {

        /** 插件名称 */
        @SerializedName("Name")
        private String name;

        /** 各虚拟节点的插件信息。 */
        @SerializedName("PluginInfoSet")
        private List<VKNodeInfo> pluginInfoSet;

        /** 最新版本 */
        @SerializedName("AvailableVersion")
        private String availableVersion;

        /** 发布时间 */
        @SerializedName("ReleaseTime")
        private String releaseTime;

        /** 插件管理是否开启 */
        @SerializedName("ManageEnabled")
        private Boolean manageEnabled;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<VKNodeInfo> getPluginInfoSet() {
            return pluginInfoSet;
        }

        public void setPluginInfoSet(List<VKNodeInfo> pluginInfoSet) {
            this.pluginInfoSet = pluginInfoSet;
        }

        public String getAvailableVersion() {
            return availableVersion;
        }

        public void setAvailableVersion(String availableVersion) {
            this.availableVersion = availableVersion;
        }

        public String getReleaseTime() {
            return releaseTime;
        }

        public void setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
        }

        public Boolean getManageEnabled() {
            return manageEnabled;
        }

        public void setManageEnabled(Boolean manageEnabled) {
            this.manageEnabled = manageEnabled;
        }
    }

    public static class VKNodeInfo extends Response {

        /** 节点 ID。 */
        @SerializedName("Node")
        private String node;

        /** 插件版本。 */
        @SerializedName("Version")
        private String version;

        /** 插件状态：0 未知，1 正常，2 异常，3 升级中。 */
        @SerializedName("Status")
        private Integer status;

        /** 更新时间，Unix 时间戳，单位秒。 */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        /** 上次插件操作结果：0 无结果，1 查询成功，2 查询失败，3 升级成功，4 升级失败。 */
        @SerializedName("OperationResult")
        private Integer operationResult;

        public String getNode() {
            return node;
        }

        public void setNode(String node) {
            this.node = node;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }

        public Integer getOperationResult() {
            return operationResult;
        }

        public void setOperationResult(Integer operationResult) {
            this.operationResult = operationResult;
        }
    }
}
