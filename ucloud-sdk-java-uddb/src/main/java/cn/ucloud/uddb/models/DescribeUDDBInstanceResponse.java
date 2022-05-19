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
package cn.ucloud.uddb.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUDDBInstanceResponse extends Response {

    /** UDDB实例信息列表, 参见DataSetUDDB项定义 */
    @SerializedName("DataSet")
    private List<DataSetUDDB> dataSet;

    public List<DataSetUDDB> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<DataSetUDDB> dataSet) {
        this.dataSet = dataSet;
    }

    public static class DataNodeInfo extends Response {

        /** 数据节点ID */
        @SerializedName("Id")
        private String id;

        /** 数据节点的内存配置, 单位：MB */
        @SerializedName("Memory")
        private Integer memory;

        /** 数据节点的磁盘大小配置. 单位: GB */
        @SerializedName("DiskSpace")
        private Integer diskSpace;

        /** 数据节点的只读实例个数. */
        @SerializedName("SlaveCount")
        private Integer slaveCount;

        /**
         * 数据分片状态, 状态列表如下: Init: 初始化中 Fail: 安装失败 Starting: 启动中 Running: 系统正常运行中 Shutdown: 关闭中
         * Shutoff: 已关闭 Deleted: 已删除 Upgrading: 系统升级中
         */
        @SerializedName("State")
        private String state;

        /** 只读实例信息列表 */
        @SerializedName("SlaveInfos")
        private List<SlaveInfo> slaveInfos;

        /** 最近一次数据迁移任务id */
        @SerializedName("LastTransTaskId")
        private String lastTransTaskId;

        /** 节点的创建时间 */
        @SerializedName("CreateTime")
        private String createTime;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Integer getMemory() {
            return memory;
        }

        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        public Integer getDiskSpace() {
            return diskSpace;
        }

        public void setDiskSpace(Integer diskSpace) {
            this.diskSpace = diskSpace;
        }

        public Integer getSlaveCount() {
            return slaveCount;
        }

        public void setSlaveCount(Integer slaveCount) {
            this.slaveCount = slaveCount;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public List<SlaveInfo> getSlaveInfos() {
            return slaveInfos;
        }

        public void setSlaveInfos(List<SlaveInfo> slaveInfos) {
            this.slaveInfos = slaveInfos;
        }

        public String getLastTransTaskId() {
            return lastTransTaskId;
        }

        public void setLastTransTaskId(String lastTransTaskId) {
            this.lastTransTaskId = lastTransTaskId;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }
    }

    public static class SlaveInfo extends Response {

        /** 只读实例ID */
        @SerializedName("Id")
        private String id;

        /** 对应数据节点的ID */
        @SerializedName("DataNodeId")
        private String dataNodeId;

        /**
         * 只读实例状态, 状态列表如下: Init: 初始化中 Fail: 安装失败 Starting: 启动中 Running: 系统正常运行中 Shutdown: 关闭中
         * Shutoff: 已关闭 Deleted: 已删除 Upgrading: 系统升级中
         */
        @SerializedName("State")
        private String state;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDataNodeId() {
            return dataNodeId;
        }

        public void setDataNodeId(String dataNodeId) {
            this.dataNodeId = dataNodeId;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }

    public static class DataSetUDDB extends Response {

        /** UDDB实例对应的可用区 */
        @SerializedName("Zone")
        private String zone;

        /** UDDB实例ID */
        @SerializedName("UDDBId")
        private String uddbId;

        /** UDDB实例名称 */
        @SerializedName("Name")
        private String name;

        /** UDDB的数据库版本 */
        @SerializedName("DBTypeId")
        private String dbTypeId;

        /** 管理员帐户名，默认root */
        @SerializedName("AdminUser")
        private String adminUser;

        /** UDDB实例访问的虚IP */
        @SerializedName("VirtualIP")
        private String virtualIP;

        /** UDDB实例访问的端口号 */
        @SerializedName("Port")
        private Integer port;

        /**
         * UDDB状态, 状态列表如下: Init: 初始化中 InitFail: 初始化失败 Starting: 启动中 Running: 系统正常运行中 Abnormal:
         * 系统运行中, 有异常, 还能提供服务 Error: 系统运行中, 但不能正常提供服务 Shutdown: 关闭中 Shutoff: 已关闭 Deleted: 已删除
         * UpgradingUDDB: 升降级UDDB配置中 UpgradingDataNode: 升降级UDDB节点配置中 ChangingSlaveCount: 改变只读实例数量中
         * ScalingOutUDDB: 水平扩展中
         */
        @SerializedName("State")
        private String state;

        /** UDDB实例创建时间，采用UTC计时时间戳 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** UDDB实例过期时间，采用UTC计时时间戳 */
        @SerializedName("ExpiredTime")
        private Integer expiredTime;

        /** 付费类型，可选值如下: Year: 按年付费 Month: 按月付费 Dynamic: 按需付费(单位: 小时) Trial: 免费试用 */
        @SerializedName("ChargeType")
        private String chargeType;

        /**
         * UDDB路由节点的版本。分为三种： Trival(免费版)： 2中间件节点； QPS：1.5W FellFree(标准版)：
         * 固定为4中间件节点，后续将根据业务请求量自动扩展，最多扩展到12个节点，QPS为3w - 10w； EnjoyAlone(物理机版)：专享物理机，节点数让客户可选
         */
        @SerializedName("RouterVersion")
        private String routerVersion;

        /** 各版本下的节点个数。体验版： 固定为2节点； 畅享版：固定为4节点（后续可通过管理API调整）；专享版：物理机台数 */
        @SerializedName("RouterNodeNum")
        private Integer routerNodeNum;

        /** 参考QPS。 免费版： 15000； 畅享版： 30000 - 100000 （根据节点数而定）； 专享版： 节点数 * 10w qps */
        @SerializedName("RefQps")
        private Integer refQps;

        /** 数据节点个数 */
        @SerializedName("DataNodeCount")
        private Integer dataNodeCount;

        /** 数据节点的内存配置, 单位：MB */
        @SerializedName("DataNodeMemory")
        private Integer dataNodeMemory;

        /** 数据节点的磁盘大小配置. 单位: GB */
        @SerializedName("DataNodeDiskSpace")
        private Integer dataNodeDiskSpace;

        /** 每个数据节点的只读实例个数. */
        @SerializedName("DataNodeSlaveCount")
        private Integer dataNodeSlaveCount;

        /** UDDB实例的数据节点的信息列表 */
        @SerializedName("DataNodeList")
        private List<DataNodeInfo> dataNodeList;

        /** 存储节点的高可用模式， 分为高可用UDB（HA）和普通UDB（Normal），如果不填， 则默认为HA */
        @SerializedName("InstanceMode")
        private String instanceMode;

        /** 存储节点和只读实例的磁盘类型。分为：SSD磁盘（SATA_SSD）或普通磁盘(Normal)。 如果不填，则默认为SATA_SSD */
        @SerializedName("InstanceType")
        private String instanceType;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getUDDBId() {
            return uddbId;
        }

        public void setUDDBId(String uddbId) {
            this.uddbId = uddbId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDBTypeId() {
            return dbTypeId;
        }

        public void setDBTypeId(String dbTypeId) {
            this.dbTypeId = dbTypeId;
        }

        public String getAdminUser() {
            return adminUser;
        }

        public void setAdminUser(String adminUser) {
            this.adminUser = adminUser;
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

        public Integer getExpiredTime() {
            return expiredTime;
        }

        public void setExpiredTime(Integer expiredTime) {
            this.expiredTime = expiredTime;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getRouterVersion() {
            return routerVersion;
        }

        public void setRouterVersion(String routerVersion) {
            this.routerVersion = routerVersion;
        }

        public Integer getRouterNodeNum() {
            return routerNodeNum;
        }

        public void setRouterNodeNum(Integer routerNodeNum) {
            this.routerNodeNum = routerNodeNum;
        }

        public Integer getRefQps() {
            return refQps;
        }

        public void setRefQps(Integer refQps) {
            this.refQps = refQps;
        }

        public Integer getDataNodeCount() {
            return dataNodeCount;
        }

        public void setDataNodeCount(Integer dataNodeCount) {
            this.dataNodeCount = dataNodeCount;
        }

        public Integer getDataNodeMemory() {
            return dataNodeMemory;
        }

        public void setDataNodeMemory(Integer dataNodeMemory) {
            this.dataNodeMemory = dataNodeMemory;
        }

        public Integer getDataNodeDiskSpace() {
            return dataNodeDiskSpace;
        }

        public void setDataNodeDiskSpace(Integer dataNodeDiskSpace) {
            this.dataNodeDiskSpace = dataNodeDiskSpace;
        }

        public Integer getDataNodeSlaveCount() {
            return dataNodeSlaveCount;
        }

        public void setDataNodeSlaveCount(Integer dataNodeSlaveCount) {
            this.dataNodeSlaveCount = dataNodeSlaveCount;
        }

        public List<DataNodeInfo> getDataNodeList() {
            return dataNodeList;
        }

        public void setDataNodeList(List<DataNodeInfo> dataNodeList) {
            this.dataNodeList = dataNodeList;
        }

        public String getInstanceMode() {
            return instanceMode;
        }

        public void setInstanceMode(String instanceMode) {
            this.instanceMode = instanceMode;
        }

        public String getInstanceType() {
            return instanceType;
        }

        public void setInstanceType(String instanceType) {
            this.instanceType = instanceType;
        }
    }
}
