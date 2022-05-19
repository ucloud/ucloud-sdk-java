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

public class DescribeUK8SClusterResponse extends Response {

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

    /** Master 节点数量 */
    @SerializedName("MasterCount")
    private Integer masterCount;

    /** Master节点配置信息，具体参考UhostInfo。托管版不返回该信息 */
    @SerializedName("MasterList")
    private List<UhostInfo> masterList;

    /** Node节点配置信息,具体参考UhostInfo */
    @SerializedName("NodeList")
    private List<UhostInfo> nodeList;

    /** 创建时间 */
    @SerializedName("CreateTime")
    private Integer createTime;

    /** Node节点数量 */
    @SerializedName("NodeCount")
    private Integer nodeCount;

    /** 集群apiserver地址 */
    @SerializedName("ApiServer")
    private String apiServer;

    /** 状态 */
    @SerializedName("Status")
    private String status;

    /** 集群外部apiserver地址 */
    @SerializedName("ExternalApiServer")
    private String externalApiServer;

    /** kube-proxy配置 */
    @SerializedName("KubeProxy")
    private KubeProxy kubeProxy;

    /** K8S版本 */
    @SerializedName("Version")
    private String version;

    /** 自定义或者默认的clusterdomain */
    @SerializedName("ClusterDomain")
    private String clusterDomain;

    /** 集群etcd服务证书 */
    @SerializedName("EtcdCert")
    private String etcdCert;

    /** 集群etcd服务密钥 */
    @SerializedName("EtcdKey")
    private String etcdKey;

    /** 集群CA根证书 */
    @SerializedName("CACert")
    private String caCert;

    /** Master配置预警：Normal正常； Warning 需要升级； Error 需要紧急升级； */
    @SerializedName("MasterResourceStatus")
    private String masterResourceStatus;

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

    public List<UhostInfo> getMasterList() {
        return masterList;
    }

    public void setMasterList(List<UhostInfo> masterList) {
        this.masterList = masterList;
    }

    public List<UhostInfo> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<UhostInfo> nodeList) {
        this.nodeList = nodeList;
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

    public String getApiServer() {
        return apiServer;
    }

    public void setApiServer(String apiServer) {
        this.apiServer = apiServer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExternalApiServer() {
        return externalApiServer;
    }

    public void setExternalApiServer(String externalApiServer) {
        this.externalApiServer = externalApiServer;
    }

    public KubeProxy getKubeProxy() {
        return kubeProxy;
    }

    public void setKubeProxy(KubeProxy kubeProxy) {
        this.kubeProxy = kubeProxy;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getClusterDomain() {
        return clusterDomain;
    }

    public void setClusterDomain(String clusterDomain) {
        this.clusterDomain = clusterDomain;
    }

    public String getEtcdCert() {
        return etcdCert;
    }

    public void setEtcdCert(String etcdCert) {
        this.etcdCert = etcdCert;
    }

    public String getEtcdKey() {
        return etcdKey;
    }

    public void setEtcdKey(String etcdKey) {
        this.etcdKey = etcdKey;
    }

    public String getCACert() {
        return caCert;
    }

    public void setCACert(String caCert) {
        this.caCert = caCert;
    }

    public String getMasterResourceStatus() {
        return masterResourceStatus;
    }

    public void setMasterResourceStatus(String masterResourceStatus) {
        this.masterResourceStatus = masterResourceStatus;
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

    public static class UhostInfo extends Response {

        /** 所在机房 */
        @SerializedName("Zone")
        private String zone;

        /** 主机名称 */
        @SerializedName("Name")
        private String name;

        /** Cpu数量 */
        @SerializedName("CPU")
        private Integer cpu;

        /** 内存 */
        @SerializedName("Memory")
        private Integer memory;

        /** 节点IP信息 */
        @SerializedName("IPSet")
        private List<IPSet> ipSet;

        /** 节点磁盘信息 */
        @SerializedName("DiskSet")
        private List<DiskSet> diskSet;

        /** 主机ID */
        @SerializedName("NodeId")
        private String nodeId;

        /** 镜像信息 */
        @SerializedName("OsName")
        private String osName;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 到期时间 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 主机状态 */
        @SerializedName("State")
        private String state;

        /** 节点类型：uhost表示云主机;uphost表示物理云主机 */
        @SerializedName("NodeType")
        private String nodeType;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public List<IPSet> getIPSet() {
            return ipSet;
        }

        public void setIPSet(List<IPSet> ipSet) {
            this.ipSet = ipSet;
        }

        public List<DiskSet> getDiskSet() {
            return diskSet;
        }

        public void setDiskSet(List<DiskSet> diskSet) {
            this.diskSet = diskSet;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public String getOsName() {
            return osName;
        }

        public void setOsName(String osName) {
            this.osName = osName;
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

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getNodeType() {
            return nodeType;
        }

        public void setNodeType(String nodeType) {
            this.nodeType = nodeType;
        }
    }

    public static class DiskSet extends Response {

        /** 磁盘类型。系统盘: Boot，数据盘: Data,网络盘：Udisk */
        @SerializedName("Type")
        private String type;

        /** 磁盘长ID */
        @SerializedName("DiskId")
        private String diskId;

        /** UDisk名字（仅当磁盘是UDisk时返回） */
        @SerializedName("Name")
        private String name;

        /** 磁盘盘符 */
        @SerializedName("Drive")
        private String drive;

        /** 磁盘大小，单位: GB */
        @SerializedName("Size")
        private Integer size;

        /** 备份方案，枚举类型：BASIC_SNAPSHOT,普通快照；DATAARK,方舟。无快照则不返回该字段。 */
        @SerializedName("BackupType")
        private String backupType;

        /** 当前主机的IOPS值 */
        @SerializedName("IOPS")
        private Integer iops;

        /** Yes: 加密 No: 非加密 */
        @SerializedName("Encrypted")
        private String encrypted;

        /** LOCAL_NOMAL| CLOUD_NORMAL| LOCAL_SSD| CLOUD_SSD|EXCLUSIVE_LOCAL_DISK */
        @SerializedName("DiskType")
        private String diskType;

        /** True| False */
        @SerializedName("IsBoot")
        private String isBoot;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getDiskId() {
            return diskId;
        }

        public void setDiskId(String diskId) {
            this.diskId = diskId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDrive() {
            return drive;
        }

        public void setDrive(String drive) {
            this.drive = drive;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public String getBackupType() {
            return backupType;
        }

        public void setBackupType(String backupType) {
            this.backupType = backupType;
        }

        public Integer getIOPS() {
            return iops;
        }

        public void setIOPS(Integer iops) {
            this.iops = iops;
        }

        public String getEncrypted() {
            return encrypted;
        }

        public void setEncrypted(String encrypted) {
            this.encrypted = encrypted;
        }

        public String getDiskType() {
            return diskType;
        }

        public void setDiskType(String diskType) {
            this.diskType = diskType;
        }

        public String getIsBoot() {
            return isBoot;
        }

        public void setIsBoot(String isBoot) {
            this.isBoot = isBoot;
        }
    }

    public static class IPSet extends Response {

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

        /** 是否默认的弹性网卡的信息。true: 是默认弹性网卡；其他值：不是。 */
        @SerializedName("Default")
        private String fDefault;

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

        public String getDefault() {
            return fDefault;
        }

        public void setDefault(String fDefault) {
            this.fDefault = fDefault;
        }
    }
}
