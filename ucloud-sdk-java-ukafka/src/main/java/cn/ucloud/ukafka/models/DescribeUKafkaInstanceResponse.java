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

import java.util.List;

public class DescribeUKafkaInstanceResponse extends Response {

    /** 集群信息列表 */
    @SerializedName("ClusterSet")
    private List<ClusterInfo> clusterSet;

    public List<ClusterInfo> getClusterSet() {
        return clusterSet;
    }

    public void setClusterSet(List<ClusterInfo> clusterSet) {
        this.clusterSet = clusterSet;
    }

    public static class Broker extends Response {

        /** broker 访问端点 */
        @SerializedName("Endpoints")
        private Endpoints endpoints;

        /** broker id */
        @SerializedName("BrokerId")
        private String brokerId;

        /** broker 关联topic 信息 */
        @SerializedName("BrokerInfo")
        private List<BrokerOfTopicInfo> brokerInfo;

        /** broker 创建信息 */
        @SerializedName("CreateTime")
        private String createTime;

        /** broker 域名 */
        @SerializedName("DomainName")
        private String domainName;

        /** broker 过期时间 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** broker IP 信息 */
        @SerializedName("IPSet")
        private List<IP> ipSet;

        /** broker 机型信息 */
        @SerializedName("InstanceGroupType")
        private String instanceGroupType;

        /** kafka 服务端口 */
        @SerializedName("KafkaPort")
        private Integer kafkaPort;

        /** broker 备注信息 */
        @SerializedName("Remark")
        private String remark;

        /** broker 注册资源信息 */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 安全组 id */
        @SerializedName("SecurityGroupId")
        private String securityGroupId;

        /** broker 当前状态 */
        @SerializedName("State")
        private String state;

        /** broker 节点配置 */
        @SerializedName("UHostConfig")
        private UHostConfig uHostConfig;

        /** 节点 id */
        @SerializedName("UHostId")
        private String uHostId;

        /** 节点名称 */
        @SerializedName("UHostName")
        private String uHostName;

        /** 节点类型 */
        @SerializedName("UHostRole")
        private String uHostRole;

        /** 节点是否部署 zookeeper */
        @SerializedName("ZooKeeper")
        private String zooKeeper;

        /** zookeeper 服务端口 */
        @SerializedName("ZooKeeperPort")
        private Integer zooKeeperPort;

        public Endpoints getEndpoints() {
            return endpoints;
        }

        public void setEndpoints(Endpoints endpoints) {
            this.endpoints = endpoints;
        }

        public String getBrokerId() {
            return brokerId;
        }

        public void setBrokerId(String brokerId) {
            this.brokerId = brokerId;
        }

        public List<BrokerOfTopicInfo> getBrokerInfo() {
            return brokerInfo;
        }

        public void setBrokerInfo(List<BrokerOfTopicInfo> brokerInfo) {
            this.brokerInfo = brokerInfo;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getDomainName() {
            return domainName;
        }

        public void setDomainName(String domainName) {
            this.domainName = domainName;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public List<IP> getIPSet() {
            return ipSet;
        }

        public void setIPSet(List<IP> ipSet) {
            this.ipSet = ipSet;
        }

        public String getInstanceGroupType() {
            return instanceGroupType;
        }

        public void setInstanceGroupType(String instanceGroupType) {
            this.instanceGroupType = instanceGroupType;
        }

        public Integer getKafkaPort() {
            return kafkaPort;
        }

        public void setKafkaPort(Integer kafkaPort) {
            this.kafkaPort = kafkaPort;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getSecurityGroupId() {
            return securityGroupId;
        }

        public void setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public UHostConfig getUHostConfig() {
            return uHostConfig;
        }

        public void setUHostConfig(UHostConfig uHostConfig) {
            this.uHostConfig = uHostConfig;
        }

        public String getUHostId() {
            return uHostId;
        }

        public void setUHostId(String uHostId) {
            this.uHostId = uHostId;
        }

        public String getUHostName() {
            return uHostName;
        }

        public void setUHostName(String uHostName) {
            this.uHostName = uHostName;
        }

        public String getUHostRole() {
            return uHostRole;
        }

        public void setUHostRole(String uHostRole) {
            this.uHostRole = uHostRole;
        }

        public String getZooKeeper() {
            return zooKeeper;
        }

        public void setZooKeeper(String zooKeeper) {
            this.zooKeeper = zooKeeper;
        }

        public Integer getZooKeeperPort() {
            return zooKeeperPort;
        }

        public void setZooKeeperPort(Integer zooKeeperPort) {
            this.zooKeeperPort = zooKeeperPort;
        }
    }

    public static class BrokerOfTopicInfo extends Response {

        /** topic 在 broker 上分布的 partition 数量 */
        @SerializedName("PartitionOnBroker")
        private String partitionOnBroker;

        /** topic 在 broker上 partition 列表 */
        @SerializedName("Partitions")
        private String partitions;

        /** Topic 副本数 */
        @SerializedName("Replication")
        private Integer replication;

        /** topic 名称 */
        @SerializedName("TopicName")
        private String topicName;

        /** partition 数量 */
        @SerializedName("TotalPartitions")
        private Integer totalPartitions;

        public String getPartitionOnBroker() {
            return partitionOnBroker;
        }

        public void setPartitionOnBroker(String partitionOnBroker) {
            this.partitionOnBroker = partitionOnBroker;
        }

        public String getPartitions() {
            return partitions;
        }

        public void setPartitions(String partitions) {
            this.partitions = partitions;
        }

        public Integer getReplication() {
            return replication;
        }

        public void setReplication(Integer replication) {
            this.replication = replication;
        }

        public String getTopicName() {
            return topicName;
        }

        public void setTopicName(String topicName) {
            this.topicName = topicName;
        }

        public Integer getTotalPartitions() {
            return totalPartitions;
        }

        public void setTotalPartitions(Integer totalPartitions) {
            this.totalPartitions = totalPartitions;
        }
    }

    public static class ClusterInfo extends Response {

        /** 所属可用区 */
        @SerializedName("Zone")
        private String zone;

        /** 是否开启自动续费 */
        @SerializedName("AutoRenew")
        private String autoRenew;

        /** 业务组 ID */
        @SerializedName("BusinessId")
        private String businessId;

        /** 付费类型 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 实例id */
        @SerializedName("ClusterInstanceId")
        private String clusterInstanceId;

        /** 实例名称 */
        @SerializedName("ClusterInstanceName")
        private String clusterInstanceName;

        /** 实例创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 实例过期时间 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 实例框架 */
        @SerializedName("Framework")
        private String framework;

        /** 实例框架版本 */
        @SerializedName("FrameworkVersion")
        private String frameworkVersion;

        /** 网络 id（已废弃） */
        @SerializedName("NetworkId")
        private String networkId;

        /** 实例备注 */
        @SerializedName("Remark")
        private String remark;

        /** 实例运行时间 */
        @SerializedName("RunningTime")
        private Integer runningTime;

        /**
         * 实例当前状态,实例状态："Running"| "Abnormal"| "Creating"| "Deleting"| "CreateFailed"|
         * "DeleteFailed"| "Unavailable"| "Deleted"| "Updating"| "Deploying"| "Migrating"|
         * "ExpandFailed"
         */
        @SerializedName("State")
        private String state;

        /** 所属子网 id */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 实例标记 */
        @SerializedName("Tag")
        private String tag;

        /** 实例节点个数 */
        @SerializedName("UHostCount")
        private Integer uHostCount;

        /** 节点信息列表 */
        @SerializedName("UHostSet")
        private List<Broker> uHostSet;

        /** 所属 VPC id */
        @SerializedName("VPCId")
        private String vpcId;

        /** 可用节点个数 */
        @SerializedName("ValidBrokerNum")
        private Integer validBrokerNum;

        /** 是否开启安全组 */
        @SerializedName("IsOpenSecgroup")
        private String isOpenSecgroup;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getAutoRenew() {
            return autoRenew;
        }

        public void setAutoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
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

        public String getNetworkId() {
            return networkId;
        }

        public void setNetworkId(String networkId) {
            this.networkId = networkId;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public Integer getRunningTime() {
            return runningTime;
        }

        public void setRunningTime(Integer runningTime) {
            this.runningTime = runningTime;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
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

        public Integer getUHostCount() {
            return uHostCount;
        }

        public void setUHostCount(Integer uHostCount) {
            this.uHostCount = uHostCount;
        }

        public List<Broker> getUHostSet() {
            return uHostSet;
        }

        public void setUHostSet(List<Broker> uHostSet) {
            this.uHostSet = uHostSet;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }

        public Integer getValidBrokerNum() {
            return validBrokerNum;
        }

        public void setValidBrokerNum(Integer validBrokerNum) {
            this.validBrokerNum = validBrokerNum;
        }

        public String getIsOpenSecgroup() {
            return isOpenSecgroup;
        }

        public void setIsOpenSecgroup(String isOpenSecgroup) {
            this.isOpenSecgroup = isOpenSecgroup;
        }
    }

    public static class Endpoints extends Response {

        /** PLAINTEXT 协议访问信息 */
        @SerializedName("PlainText")
        private Url plainText;

        /** SASL_PLAINTEXT 协议访问信息 */
        @SerializedName("SaslPlainText")
        private Url saslPlainText;

        public Url getPlainText() {
            return plainText;
        }

        public void setPlainText(Url plainText) {
            this.plainText = plainText;
        }

        public Url getSaslPlainText() {
            return saslPlainText;
        }

        public void setSaslPlainText(Url saslPlainText) {
            this.saslPlainText = saslPlainText;
        }
    }

    public static class IP extends Response {

        /** IP地址 */
        @SerializedName("IP")
        private String ip;

        /** IP类型 */
        @SerializedName("Type")
        private String type;

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class UHostConfig extends Response {

        /** 节点数据盘类型 */
        @SerializedName("DiskType")
        private String diskType;

        /** 节点系统盘大小（单位G)【删除】 */
        @SerializedName("BootDiskSize")
        private Integer bootDiskSize;

        /** 节点 CPU 核心数 */
        @SerializedName("CPU")
        private Integer cpu;

        /** 节点数据盘大小（单位G) */
        @SerializedName("DataDiskSize")
        private Integer dataDiskSize;

        /** 节点内存(单位MB) */
        @SerializedName("Memory")
        private Integer memory;

        /** 节点内部系统名称【删除】 */
        @SerializedName("OS")
        private String os;

        public String getDiskType() {
            return diskType;
        }

        public void setDiskType(String diskType) {
            this.diskType = diskType;
        }

        public Integer getBootDiskSize() {
            return bootDiskSize;
        }

        public void setBootDiskSize(Integer bootDiskSize) {
            this.bootDiskSize = bootDiskSize;
        }

        public Integer getCPU() {
            return cpu;
        }

        public void setCPU(Integer cpu) {
            this.cpu = cpu;
        }

        public Integer getDataDiskSize() {
            return dataDiskSize;
        }

        public void setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
        }

        public Integer getMemory() {
            return memory;
        }

        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        public String getOS() {
            return os;
        }

        public void setOS(String os) {
            this.os = os;
        }
    }

    public static class Url extends Response {

        /** 访问协议 */
        @SerializedName("Protocal")
        private String protocal;

        /** 访问地址 */
        @SerializedName("Addr")
        private String addr;

        public String getProtocal() {
            return protocal;
        }

        public void setProtocal(String protocal) {
            this.protocal = protocal;
        }

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }
    }
}
