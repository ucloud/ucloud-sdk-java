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

public class DescribeUESInstanceV2Response extends Response {

    /** 返回结果 */
    @SerializedName("Result")
    private ClusterNodeV2Info result;

    public ClusterNodeV2Info getResult() {
        return result;
    }

    public void setResult(ClusterNodeV2Info result) {
        this.result = result;
    }

    public static class ClusterNodeV2Info extends Response {

        /** */
        @SerializedName("RequestId")
        private String requestId;

        /** */
        @SerializedName("ClusterInfo")
        private ClusterV2Info clusterInfo;

        /** */
        @SerializedName("NodeInfoList")
        private List<NodeV2Info> nodeInfoList;

        public String getRequestId() {
            return requestId;
        }

        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

        public ClusterV2Info getClusterInfo() {
            return clusterInfo;
        }

        public void setClusterInfo(ClusterV2Info clusterInfo) {
            this.clusterInfo = clusterInfo;
        }

        public List<NodeV2Info> getNodeInfoList() {
            return nodeInfoList;
        }

        public void setNodeInfoList(List<NodeV2Info> nodeInfoList) {
            this.nodeInfoList = nodeInfoList;
        }
    }

    public static class ClusterV2Info extends Response {

        /** 地域 */
        @SerializedName("Region")
        private String region;

        /** 可用区 */
        @SerializedName("Zone")
        private String zone;

        /** 服务集群ID标识 */
        @SerializedName("UESInstanceId")
        private String uesInstanceId;

        /** 服务集群名称 */
        @SerializedName("UESInstanceName")
        private String uesInstanceName;

        /** 服务版本号 */
        @SerializedName("ServiceVersion")
        private String serviceVersion;

        /** VPCID标识 */
        @SerializedName("VPCId")
        private String vpcId;

        /** 服务集群状态 */
        @SerializedName("State")
        private String state;

        /** 项目组ID标识 */
        @SerializedName("BusinessId")
        private String businessId;

        /** 子网ID标识 */
        @SerializedName("SubnetId")
        private String subnetId;

        /** Vip */
        @SerializedName("Vip")
        private String vip;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
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

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getBusinessId() {
            return businessId;
        }

        public void setBusinessId(String businessId) {
            this.businessId = businessId;
        }

        public String getSubnetId() {
            return subnetId;
        }

        public void setSubnetId(String subnetId) {
            this.subnetId = subnetId;
        }

        public String getVip() {
            return vip;
        }

        public void setVip(String vip) {
            this.vip = vip;
        }
    }

    public static class NodeV2Info extends Response {

        /** 节点ID */
        @SerializedName("NodeId")
        private String nodeId;

        /** 节点名称 */
        @SerializedName("NodeName")
        private String nodeName;

        /** 节点类型 */
        @SerializedName("NodeRole")
        private String nodeRole;

        /** 节点IP */
        @SerializedName("NodeIP")
        private String nodeIP;

        /** 节点配置标识 */
        @SerializedName("NodeConf")
        private String nodeConf;

        /** 节点状态 */
        @SerializedName("NodeState")
        private String nodeState;

        /** 节点磁盘类型 */
        @SerializedName("DiskType")
        private String diskType;

        /** 节点磁盘大小 */
        @SerializedName("DiskSize")
        private Integer diskSize;

        /** 节点内存大小 */
        @SerializedName("Memory")
        private Integer memory;

        /** 节点cpu数量 */
        @SerializedName("CPU")
        private Integer cpu;

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public String getNodeName() {
            return nodeName;
        }

        public void setNodeName(String nodeName) {
            this.nodeName = nodeName;
        }

        public String getNodeRole() {
            return nodeRole;
        }

        public void setNodeRole(String nodeRole) {
            this.nodeRole = nodeRole;
        }

        public String getNodeIP() {
            return nodeIP;
        }

        public void setNodeIP(String nodeIP) {
            this.nodeIP = nodeIP;
        }

        public String getNodeConf() {
            return nodeConf;
        }

        public void setNodeConf(String nodeConf) {
            this.nodeConf = nodeConf;
        }

        public String getNodeState() {
            return nodeState;
        }

        public void setNodeState(String nodeState) {
            this.nodeState = nodeState;
        }

        public String getDiskType() {
            return diskType;
        }

        public void setDiskType(String diskType) {
            this.diskType = diskType;
        }

        public Integer getDiskSize() {
            return diskSize;
        }

        public void setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
        }

        public Integer getMemory() {
            return memory;
        }

        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        public Integer getCPU() {
            return cpu;
        }

        public void setCPU(Integer cpu) {
            this.cpu = cpu;
        }
    }
}
