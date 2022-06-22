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
         * 实例状态 Starting // 创建中 Creating // 初始化中 CreateFail // 创建失败 Fail // 创建失败 Deleting // 删除中
         * DeleteFail // 删除失败 Running // 运行 Resizing // 容量调整中 ResizeFail // 容量调整失败 Configing // 配置中
         * ConfigFail // 配置失败Restarting // 重启中 SetPasswordFail //设置密码失败
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
    }

    public static class UMemSpaceAddressSet extends Response {

        /** UMem实例访问IP */
        @SerializedName("IP")
        private String ip;

        /** UMem实例访问Port */
        @SerializedName("Port")
        private Integer port;

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }
    }
}
