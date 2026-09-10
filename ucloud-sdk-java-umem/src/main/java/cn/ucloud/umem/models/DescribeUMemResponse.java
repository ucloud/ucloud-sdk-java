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
package cn.ucloud.umem.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUMemResponse extends Response {

    /** 根据过滤条件得到的总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** UMem实例列表, 详细参见UMemDataSet */
    @SerializedName("DataSet")
    private List<UMemDataSet> dataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UMemDataSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UMemDataSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class UMemDataSet extends Response {

        /** 实例所在可用区，或者master redis所在可用区，参见 [可用区列表](../summary/regionlist.html) */
        @SerializedName("Zone")
        private String zone;

        /** 是否拥有只读Slave “Yes” 包含 “No” 不包含 */
        @SerializedName("OwnSlave")
        private String ownSlave;

        /** UMEM实例列表 UMemSlaveDataSet 如果没有slave，则没有该字段 */
        @SerializedName("DataSet")
        private List<UMemSlaveDataSet> dataSet;

        /** 表示实例是主库还是从库,master,slave 仅主备redis返回该项参数 */
        @SerializedName("Role")
        private String role;

        /** 主备redis和分布式redis运维时间 0 //0点 1 //1点 以此类推 单机版memcache不返回该项 */
        @SerializedName("RewriteTime")
        private Integer rewriteTime;

        /** vpc */
        @SerializedName("VPCId")
        private String vpcId;

        /** 子网 */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 资源ID */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 资源名称 */
        @SerializedName("Name")
        private String name;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 到期时间 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 空间类型:single(无热备),double(热备) */
        @SerializedName("Type")
        private String type;

        /** 协议类型: memcache, redis */
        @SerializedName("Protocol")
        private String protocol;

        /** 容量单位GB */
        @SerializedName("Size")
        private Integer size;

        /** 使用量单位MB */
        @SerializedName("UsedSize")
        private Integer usedSize;

        /**
         * 实例状态 Starting // 创建中 Creating // 初始化中 Deleting // 删除中 CreateFail // 创建失败 DeleteFail //
         * 删除失败 Resizing // 容量调整中 ResizeFail // 容量调整失败 Disasting // 容灾中 Running // 运行 SetPassword //
         * 设置密码 SetPasswordFail // 设置密码失败 ISolation // 关闭 Replicating // 同步中 ReplicateDone // 数据同步完成
         * ExecTimeout // 待重试 SlaveRecovering // 备库恢复中 ReplicateFail // 同步失败 DelayUpgrade // 待扩容迁移
         * VersionUpgrading // 升级中 VersionUpgradeFail // 升级失败 UpgradeMemInit // 任务初始化
         * ClusterUpgrading // 规格调整中 SSLSwitching // 修改TLS中 SSLSwitchFail // 修改TLS失败
         */
        @SerializedName("State")
        private String state;

        /** 计费模式，Year, Month, Dynamic, Trial */
        @SerializedName("ChargeType")
        private String chargeType;

        /** IP端口信息请，参见UMemSpaceAddressSet */
        @SerializedName("Address")
        private List<UMemSpaceAddressSet> address;

        /** 业务组名称 */
        @SerializedName("Tag")
        private String tag;

        /** distributed: 分布式版Redis,或者分布式Memcache；single：主备版Redis,或者单机Memcache；performance：高性能版 */
        @SerializedName("ResourceType")
        private String resourceType;

        /** 节点的配置ID */
        @SerializedName("ConfigId")
        private String configId;

        /** 是否需要自动备份,enable,disable */
        @SerializedName("AutoBackup")
        private String autoBackup;

        /** 自动备份开始时间,单位小时计,范围[0-23] */
        @SerializedName("BackupTime")
        private Integer backupTime;

        /** 是否开启高可用,enable,disable */
        @SerializedName("HighAvailability")
        private String highAvailability;

        /** Redis版本信息 */
        @SerializedName("Version")
        private String version;

        /** 跨机房URedis，slave redis所在可用区，参见 [可用区列表](../summary/regionlist.html) */
        @SerializedName("SlaveZone")
        private String slaveZone;

        /** URedis是否开启读写分离 */
        @SerializedName("ProxyName")
        private String proxyName;

        /** 判断后端是否快杰资源（非快杰: 0或者1 快杰: 2或者3） */
        @SerializedName("ProductType")
        private Integer productType;

        /** 是否是默认配置文件， true表示默认； false表示非默认 */
        @SerializedName("DefaultConfigId")
        private String defaultConfigId;

        /** 是否是高性能Redis， true表示是； false表示否 */
        @SerializedName("IsHighPerformance")
        private Boolean isHighPerformance;

        /** 实例是否支持回档 */
        @SerializedName("SupportAofRollback")
        private Boolean supportAofRollback;

        /** 实例是否开启了回档 */
        @SerializedName("AofRollbackEnable")
        private Boolean aofRollbackEnable;

        /** 是否是读写分离 */
        @SerializedName("IsRWMode")
        private Boolean isRWMode;

        /** SSL版本 */
        @SerializedName("SSLVersion")
        private String sslVersion;

        /** 实例是否开启SSL */
        @SerializedName("SSLEnable")
        private Boolean sslEnable;

        /** 证书过期时间 */
        @SerializedName("SSLCertExpireTime")
        private Integer sslCertExpireTime;

        /** 安全策略。1:内网隔离，2:加密通信，3:内网隔离+加密通信 */
        @SerializedName("SecPolicy")
        private Integer secPolicy;

        /** 实例是否设置密码 */
        @SerializedName("HasPassword")
        private Boolean hasPassword;

        /** 实例是否有加入到自治中心 */
        @SerializedName("UDACEnable")
        private Boolean udacEnable;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getOwnSlave() {
            return ownSlave;
        }

        public void setOwnSlave(String ownSlave) {
            this.ownSlave = ownSlave;
        }

        public List<UMemSlaveDataSet> getDataSet() {
            return dataSet;
        }

        public void setDataSet(List<UMemSlaveDataSet> dataSet) {
            this.dataSet = dataSet;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public Integer getRewriteTime() {
            return rewriteTime;
        }

        public void setRewriteTime(Integer rewriteTime) {
            this.rewriteTime = rewriteTime;
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

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public Integer getUsedSize() {
            return usedSize;
        }

        public void setUsedSize(Integer usedSize) {
            this.usedSize = usedSize;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public List<UMemSpaceAddressSet> getAddress() {
            return address;
        }

        public void setAddress(List<UMemSpaceAddressSet> address) {
            this.address = address;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getResourceType() {
            return resourceType;
        }

        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        public String getConfigId() {
            return configId;
        }

        public void setConfigId(String configId) {
            this.configId = configId;
        }

        public String getAutoBackup() {
            return autoBackup;
        }

        public void setAutoBackup(String autoBackup) {
            this.autoBackup = autoBackup;
        }

        public Integer getBackupTime() {
            return backupTime;
        }

        public void setBackupTime(Integer backupTime) {
            this.backupTime = backupTime;
        }

        public String getHighAvailability() {
            return highAvailability;
        }

        public void setHighAvailability(String highAvailability) {
            this.highAvailability = highAvailability;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getSlaveZone() {
            return slaveZone;
        }

        public void setSlaveZone(String slaveZone) {
            this.slaveZone = slaveZone;
        }

        public String getProxyName() {
            return proxyName;
        }

        public void setProxyName(String proxyName) {
            this.proxyName = proxyName;
        }

        public Integer getProductType() {
            return productType;
        }

        public void setProductType(Integer productType) {
            this.productType = productType;
        }

        public String getDefaultConfigId() {
            return defaultConfigId;
        }

        public void setDefaultConfigId(String defaultConfigId) {
            this.defaultConfigId = defaultConfigId;
        }

        public Boolean getIsHighPerformance() {
            return isHighPerformance;
        }

        public void setIsHighPerformance(Boolean isHighPerformance) {
            this.isHighPerformance = isHighPerformance;
        }

        public Boolean getSupportAofRollback() {
            return supportAofRollback;
        }

        public void setSupportAofRollback(Boolean supportAofRollback) {
            this.supportAofRollback = supportAofRollback;
        }

        public Boolean getAofRollbackEnable() {
            return aofRollbackEnable;
        }

        public void setAofRollbackEnable(Boolean aofRollbackEnable) {
            this.aofRollbackEnable = aofRollbackEnable;
        }

        public Boolean getIsRWMode() {
            return isRWMode;
        }

        public void setIsRWMode(Boolean isRWMode) {
            this.isRWMode = isRWMode;
        }

        public String getSSLVersion() {
            return sslVersion;
        }

        public void setSSLVersion(String sslVersion) {
            this.sslVersion = sslVersion;
        }

        public Boolean getSSLEnable() {
            return sslEnable;
        }

        public void setSSLEnable(Boolean sslEnable) {
            this.sslEnable = sslEnable;
        }

        public Integer getSSLCertExpireTime() {
            return sslCertExpireTime;
        }

        public void setSSLCertExpireTime(Integer sslCertExpireTime) {
            this.sslCertExpireTime = sslCertExpireTime;
        }

        public Integer getSecPolicy() {
            return secPolicy;
        }

        public void setSecPolicy(Integer secPolicy) {
            this.secPolicy = secPolicy;
        }

        public Boolean getHasPassword() {
            return hasPassword;
        }

        public void setHasPassword(Boolean hasPassword) {
            this.hasPassword = hasPassword;
        }

        public Boolean getUDACEnable() {
            return udacEnable;
        }

        public void setUDACEnable(Boolean udacEnable) {
            this.udacEnable = udacEnable;
        }
    }

    public static class UMemSlaveDataSet extends Response {

        /** 实例所在可用区，或者master redis所在可用区，参见 [可用区列表](../summary/regionlist.html) */
        @SerializedName("Zone")
        private String zone;

        /** 子网 */
        @SerializedName("SubnetId")
        private String subnetId;

        /** vpc */
        @SerializedName("VPCId")
        private String vpcId;

        /** */
        @SerializedName("VirtualIP")
        private String virtualIP;

        /** 主备Redis返回运维时间 0//0点 1 //1点 以此类推 */
        @SerializedName("RewriteTime")
        private Integer rewriteTime;

        /** 主实例id */
        @SerializedName("MasterGroupId")
        private String masterGroupId;

        /** 资源id */
        @SerializedName("GroupId")
        private String groupId;

        /** 端口 */
        @SerializedName("Port")
        private Integer port;

        /** 实力大小 */
        @SerializedName("MemorySize")
        private Integer memorySize;

        /** 资源名称 */
        @SerializedName("GroupName")
        private String groupName;

        /** 表示实例是主库还是从库,master,slave */
        @SerializedName("Role")
        private String role;

        /** 修改时间 */
        @SerializedName("ModifyTime")
        private Integer modifyTime;

        /** 资源名称 */
        @SerializedName("Name")
        private String name;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 到期时间 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 容量单位GB */
        @SerializedName("Size")
        private Integer size;

        /** 使用量单位MB */
        @SerializedName("UsedSize")
        private Integer usedSize;

        /**
         * 实例状态 Starting // 创建中 Creating // 初始化中 CreateFail // 创建失败 Fail // 创建失败 Deleting // 删除中
         * DeleteFail // 删除失败 Running // 运行 Resizing // 容量调整中 ResizeFail // 容量调整失败 Configing // 配置中
         * ConfigFail // 配置失败Restarting // 重启中 SetPasswordFail //设置密码失败
         */
        @SerializedName("State")
        private String state;

        /** 计费模式，Year, Month, Dynamic, Trial */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 业务组名称 */
        @SerializedName("Tag")
        private String tag;

        /** distributed: 分布式版Redis,或者分布式Memcache；single：主备版Redis,或者单机Memcache；performance：高性能版 */
        @SerializedName("ResourceType")
        private String resourceType;

        /** 节点的配置ID */
        @SerializedName("ConfigId")
        private String configId;

        /** Redis版本信息 */
        @SerializedName("Version")
        private String version;

        /** 是否是默认配置文件； true表示默认； false表示非默认 */
        @SerializedName("DefaultConfigId")
        private String defaultConfigId;

        /** 实例是否设置密码 */
        @SerializedName("HasPassword")
        private Boolean hasPassword;

        /** 实例是否有加入到自治中心 */
        @SerializedName("UDACEnable")
        private Boolean udacEnable;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getSubnetId() {
            return subnetId;
        }

        public void setSubnetId(String subnetId) {
            this.subnetId = subnetId;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }

        public String getVirtualIP() {
            return virtualIP;
        }

        public void setVirtualIP(String virtualIP) {
            this.virtualIP = virtualIP;
        }

        public Integer getRewriteTime() {
            return rewriteTime;
        }

        public void setRewriteTime(Integer rewriteTime) {
            this.rewriteTime = rewriteTime;
        }

        public String getMasterGroupId() {
            return masterGroupId;
        }

        public void setMasterGroupId(String masterGroupId) {
            this.masterGroupId = masterGroupId;
        }

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Integer getMemorySize() {
            return memorySize;
        }

        public void setMemorySize(Integer memorySize) {
            this.memorySize = memorySize;
        }

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public Integer getModifyTime() {
            return modifyTime;
        }

        public void setModifyTime(Integer modifyTime) {
            this.modifyTime = modifyTime;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public Integer getUsedSize() {
            return usedSize;
        }

        public void setUsedSize(Integer usedSize) {
            this.usedSize = usedSize;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getResourceType() {
            return resourceType;
        }

        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        public String getConfigId() {
            return configId;
        }

        public void setConfigId(String configId) {
            this.configId = configId;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getDefaultConfigId() {
            return defaultConfigId;
        }

        public void setDefaultConfigId(String defaultConfigId) {
            this.defaultConfigId = defaultConfigId;
        }

        public Boolean getHasPassword() {
            return hasPassword;
        }

        public void setHasPassword(Boolean hasPassword) {
            this.hasPassword = hasPassword;
        }

        public Boolean getUDACEnable() {
            return udacEnable;
        }

        public void setUDACEnable(Boolean udacEnable) {
            this.udacEnable = udacEnable;
        }
    }

    public static class UMemSpaceAddressSet extends Response {

        /** UMem实例内网访问IP */
        @SerializedName("IP")
        private String ip;

        /** UMem实例内网访问域名地址，未开启状态下返回为空 */
        @SerializedName("PrivateDomain")
        private String privateDomain;

        /** 开启外网状态下外网IP，否则为空 */
        @SerializedName("PublicIp")
        private String publicIp;

        /** UMem实例访问Port */
        @SerializedName("Port")
        private Integer port;

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }

        public String getPrivateDomain() {
            return privateDomain;
        }

        public void setPrivateDomain(String privateDomain) {
            this.privateDomain = privateDomain;
        }

        public String getPublicIp() {
            return publicIp;
        }

        public void setPublicIp(String publicIp) {
            this.publicIp = publicIp;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }
    }
}
