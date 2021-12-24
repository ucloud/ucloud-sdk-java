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

public class DescribeURedisGroupResponse extends Response {

    /** 组的总的节点个数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 组列表 参见 URedisGroupSet */
    @SerializedName("DataSet")
    private List<URedisGroupSet> dataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<URedisGroupSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<URedisGroupSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class URedisGroupSet extends Response {

        /** 实例所在可用区，或者master redis所在可用区，参见 [可用区列表](../summary/regionlist.html) */
        @SerializedName("Zone")
        private String zone;

        /** 返回运维时间 0 //0点 1 //1点 以此类推 */
        @SerializedName("RewriteTime")
        private Integer rewriteTime;

        /** 实例类型 */
        @SerializedName("Role")
        private String role;

        /** vpcid */
        @SerializedName("VPCId")
        private String vpcId;

        /** subnetid */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 组ID */
        @SerializedName("GroupId")
        private String groupId;

        /** 组名称 */
        @SerializedName("Name")
        private String name;

        /** 空间类型:single(无热备),double(热备) */
        @SerializedName("Type")
        private String type;

        /** 协议 */
        @SerializedName("Protocol")
        private String protocol;

        /** 容量单位GB */
        @SerializedName("MemorySize")
        private Integer memorySize;

        /** 组名称 */
        @SerializedName("GroupName")
        private String groupName;

        /** 节点的配置ID */
        @SerializedName("ConfigId")
        private String configId;

        /** 节点的虚拟IP地址 */
        @SerializedName("VirtualIP")
        private String virtualIP;

        /** 节点分配的服务端口 */
        @SerializedName("Port")
        private Integer port;

        /** 容量单位GB */
        @SerializedName("Size")
        private Integer size;

        /** 使用量单位MB */
        @SerializedName("UsedSize")
        private Integer usedSize;

        /** 是否需要自动备份,enable,disable */
        @SerializedName("AutoBackup")
        private String autoBackup;

        /** 组自动备份开始时间,单位小时计,范围[0-23] */
        @SerializedName("BackupTime")
        private Integer backupTime;

        /** 是否开启高可用,enable,disable */
        @SerializedName("HighAvailability")
        private String highAvailability;

        /** Redis版本信息 */
        @SerializedName("Version")
        private String version;

        /** 过期时间 (UNIX时间戳) */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 计费类型:Year,Month,Dynamic 默认Dynamic */
        @SerializedName("ChargeType")
        private String chargeType;

        /**
         * 状态标记 Creating // 初始化中 CreateFail // 创建失败 Deleting // 删除中 DeleteFail // 删除失败 Running // 运行
         * Resizing // 容量调整中 ResizeFail // 容量调整失败 Configing // 配置中 ConfigFail // 配置失败
         */
        @SerializedName("State")
        private String state;

        /** 创建时间 (UNIX时间戳) */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 修改时间 (UNIX时间戳) */
        @SerializedName("ModifyTime")
        private Integer modifyTime;

        /** 业务组名称 */
        @SerializedName("Tag")
        private String tag;

        /** 跨机房URedis，slave redis所在可用区，参见 [可用区列表](../summary/regionlist.html) */
        @SerializedName("SlaveZone")
        private String slaveZone;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public Integer getRewriteTime() {
            return rewriteTime;
        }

        public void setRewriteTime(Integer rewriteTime) {
            this.rewriteTime = rewriteTime;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
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

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public String getConfigId() {
            return configId;
        }

        public void setConfigId(String configId) {
            this.configId = configId;
        }

        public String getVirtualIP() {
            return virtualIP;
        }

        public void setVirtualIP(String virtualIP) {
            this.virtualIP = virtualIP;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
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

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getModifyTime() {
            return modifyTime;
        }

        public void setModifyTime(Integer modifyTime) {
            this.modifyTime = modifyTime;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getSlaveZone() {
            return slaveZone;
        }

        public void setSlaveZone(String slaveZone) {
            this.slaveZone = slaveZone;
        }
    }
}
