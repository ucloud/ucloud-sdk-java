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

public class ListUK8SClusterNodeV2Response extends Response {

    /** 节点详细信息，见NodeInfoV2。 */
    @SerializedName("NodeSet")
    private List<NodeInfoV2> nodeSet;

    /** 满足条件的节点数量，包括Master。 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<NodeInfoV2> getNodeSet() {
        return nodeSet;
    }

    public void setNodeSet(List<NodeInfoV2> nodeSet) {
        this.nodeSet = nodeSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class NodeInfoV2 extends Response {

        /** Node所在可用区 */
        @SerializedName("Zone")
        private String zone;

        /** NodeId，Node在UK8S处的唯一标示，如uk8s-reewqe5-sdasadsda */
        @SerializedName("NodeId")
        private String nodeId;

        /** node角色，枚举值为master、node */
        @SerializedName("NodeRole")
        private String nodeRole;

        /**
         * Node的状态：枚举值：初始化："Initializing"；启动中："Starting"；运行："Running"；停止中："Stopping"；停止："Stopped"；待删除："ToBeDeleted"；删除中："Deleting"；异常："Error"；安装失败："Install
         * Fail"；
         */
        @SerializedName("NodeStatus")
        private String nodeStatus;

        /** Node节点的资源类型，枚举值为UHost或UPHost。 */
        @SerializedName("InstanceType")
        private String instanceType;

        /** 资源名称，初始值等于NodeId，用户可在UHost或UPHost处修改。 */
        @SerializedName("InstanceName")
        private String instanceName;

        /** 资源ID，如uhost-xxxx，或uphost-xxxxx。 */
        @SerializedName("InstanceId")
        private String instanceId;

        /** 机型类别，分别对应Uhost的MachineType或PHost的PHostType。 */
        @SerializedName("MachineType")
        private String machineType;

        /** Node节点的操作系统类别，如Linux或Windows。 */
        @SerializedName("OsType")
        private String osType;

        /** Node节点的镜像名称。 */
        @SerializedName("OsName")
        private String osName;

        /** Node节点CPU核数，单位: 个。 */
        @SerializedName("CPU")
        private Integer cpu;

        /** 内存大小，单位: MB。 */
        @SerializedName("Memory")
        private Integer memory;

        /** 节点IP信息，详细信息见 UHostIPSet。 */
        @SerializedName("IPSet")
        private List<UHostIPSet> ipSet;

        /** 节点创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 节点计费到期时间 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 节点所属伸缩组ID，非伸缩组创建出来的节点，伸缩组ID为Default。 */
        @SerializedName("AsgId")
        private String asgId;

        /** 是否允许Pod调度到该节点，枚举值为true或false。 */
        @SerializedName("Unschedulable")
        private Boolean unschedulable;

        /** kubeproxy信息，详细信息见KubeProxy。 */
        @SerializedName("KubeProxy")
        private KubeProxy kubeProxy;

        /** 加节点时判断是否没有资源，如果返回NORESOURCE则代表没有资源了 */
        @SerializedName("NodeLogInfo")
        private String nodeLogInfo;

        /** 节点的GPU颗数。 */
        @SerializedName("GPU")
        private Integer gpu;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public String getNodeRole() {
            return nodeRole;
        }

        public void setNodeRole(String nodeRole) {
            this.nodeRole = nodeRole;
        }

        public String getNodeStatus() {
            return nodeStatus;
        }

        public void setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
        }

        public String getInstanceType() {
            return instanceType;
        }

        public void setInstanceType(String instanceType) {
            this.instanceType = instanceType;
        }

        public String getInstanceName() {
            return instanceName;
        }

        public void setInstanceName(String instanceName) {
            this.instanceName = instanceName;
        }

        public String getInstanceId() {
            return instanceId;
        }

        public void setInstanceId(String instanceId) {
            this.instanceId = instanceId;
        }

        public String getMachineType() {
            return machineType;
        }

        public void setMachineType(String machineType) {
            this.machineType = machineType;
        }

        public String getOsType() {
            return osType;
        }

        public void setOsType(String osType) {
            this.osType = osType;
        }

        public String getOsName() {
            return osName;
        }

        public void setOsName(String osName) {
            this.osName = osName;
        }

        public Integer getCPU() {
            return cpu;
        }

        public void setCPU(Integer cpu) {
            this.cpu = cpu;
        }

        public Integer getMemory() {
            return memory;
        }

        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        public List<UHostIPSet> getIPSet() {
            return ipSet;
        }

        public void setIPSet(List<UHostIPSet> ipSet) {
            this.ipSet = ipSet;
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

        public String getAsgId() {
            return asgId;
        }

        public void setAsgId(String asgId) {
            this.asgId = asgId;
        }

        public Boolean getUnschedulable() {
            return unschedulable;
        }

        public void setUnschedulable(Boolean unschedulable) {
            this.unschedulable = unschedulable;
        }

        public KubeProxy getKubeProxy() {
            return kubeProxy;
        }

        public void setKubeProxy(KubeProxy kubeProxy) {
            this.kubeProxy = kubeProxy;
        }

        public String getNodeLogInfo() {
            return nodeLogInfo;
        }

        public void setNodeLogInfo(String nodeLogInfo) {
            this.nodeLogInfo = nodeLogInfo;
        }

        public Integer getGPU() {
            return gpu;
        }

        public void setGPU(Integer gpu) {
            this.gpu = gpu;
        }
    }

    public static class KubeProxy extends Response {

        /** KubeProxy模式，枚举值为[ipvs,iptables] */
        @SerializedName("Mode")
        private String mode;

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }
    }

    public static class UHostIPSet extends Response {

        /** 国际: Internation，BGP: Bgp，内网: Private */
        @SerializedName("Type")
        private String type;

        /** IP资源ID (内网IP无对应的资源ID) */
        @SerializedName("IPId")
        private String ipId;

        /** IP地址 */
        @SerializedName("IP")
        private String ip;

        /** IP对应的带宽, 单位: Mb (内网IP不显示带宽信息) */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /** IP地址对应的VPC ID */
        @SerializedName("VPCId")
        private String vpcId;

        /** IP地址对应的子网 ID */
        @SerializedName("SubnetId")
        private String subnetId;

        /** Mac地址 */
        @SerializedName("Mac")
        private String mac;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getIPId() {
            return ipId;
        }

        public void setIPId(String ipId) {
            this.ipId = ipId;
        }

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
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

        public String getMac() {
            return mac;
        }

        public void setMac(String mac) {
            this.mac = mac;
        }
    }
}
