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
package cn.ucloud.upgsql.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListUPgSQLInstanceResponse extends Response {

    /** 数据库信息列表 */
    @SerializedName("DataSet")
    private List<UDBInstanceSet> dataSet;

    public List<UDBInstanceSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDBInstanceSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class UDBInstanceSet extends Response {

        /** 可用区 */
        @SerializedName("Zone")
        private String zone;

        /** 资源ID */
        @SerializedName("InstanceID")
        private String instanceID;

        /** 实例名称 */
        @SerializedName("Name")
        private String name;

        /** 实例的版本，包括postgresql-10.4,postgresql-13.4 */
        @SerializedName("DBVersion")
        private String dbVersion;

        /** normal/ha/readonly,普通/高可用/只读从库 */
        @SerializedName("InstanceMode")
        private String instanceMode;

        /**
         * 实例状态标记 Initing：初始化中，InitFailed：安装失败，Starting：启动中，
         * Running：运行，Stopping：关闭中，Stopped：已关闭,Deleted: 已删除，Upgrading: 升级中
         * ，Promoting：提升为主库进行中，Recovering：恢复中，RecoverFailed：恢复失败，StartFailed：启动失败，ShutdownFailed：关闭失败，Deleting：删除中，DeleteFailed：删除失败
         */
        @SerializedName("State")
        private String state;

        /** 机器规格，格式为nCmG,n代表cpu核数，m代表内存大小(GB) */
        @SerializedName("MachineType")
        private String machineType;

        /** VPC的ID */
        @SerializedName("VPCID")
        private String vpcid;

        /** 子网ID */
        @SerializedName("SubnetID")
        private String subnetID;

        /** DB实例创建时间，采用UTC计时时间戳 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** DB实例过期时间，采用UTC计时时间戳 */
        @SerializedName("ExpiredTime")
        private Integer expiredTime;

        /** DB实例ip */
        @SerializedName("IP")
        private String ip;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        /** 从库列表 */
        @SerializedName("DataSet")
        private List<UDBReadonlyInstance> dataSet;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getInstanceID() {
            return instanceID;
        }

        public void setInstanceID(String instanceID) {
            this.instanceID = instanceID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDBVersion() {
            return dbVersion;
        }

        public void setDBVersion(String dbVersion) {
            this.dbVersion = dbVersion;
        }

        public String getInstanceMode() {
            return instanceMode;
        }

        public void setInstanceMode(String instanceMode) {
            this.instanceMode = instanceMode;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getMachineType() {
            return machineType;
        }

        public void setMachineType(String machineType) {
            this.machineType = machineType;
        }

        public String getVPCID() {
            return vpcid;
        }

        public void setVPCID(String vpcid) {
            this.vpcid = vpcid;
        }

        public String getSubnetID() {
            return subnetID;
        }

        public void setSubnetID(String subnetID) {
            this.subnetID = subnetID;
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

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public List<UDBReadonlyInstance> getDataSet() {
            return dataSet;
        }

        public void setDataSet(List<UDBReadonlyInstance> dataSet) {
            this.dataSet = dataSet;
        }
    }

    public static class UDBReadonlyInstance extends Response {

        /** 可用区 */
        @SerializedName("Zone")
        private String zone;

        /** 资源ID */
        @SerializedName("InstanceID")
        private String instanceID;

        /** 实例名称 */
        @SerializedName("Name")
        private String name;

        /** 实例的版本，包括postgresql-10.4,postgresql-13.4 */
        @SerializedName("DBVersion")
        private String dbVersion;

        /** normal/ha/readonly,普通/高可用/只读从库 */
        @SerializedName("InstanceMode")
        private String instanceMode;

        /**
         * 实例状态标记 Initing：初始化中，InitFailed：安装失败，Starting：启动中，
         * Running：运行，Stopping：关闭中，Stopped：已关闭,Deleted: 已删除，Upgrading: 升级中
         * ，Promoting：提升为主库进行中，Recovering：恢复中，RecoverFailed：恢复失败，StartFailed：启动失败，ShutdownFailed：关闭失败，Deleting：删除中，DeleteFailed：删除失败
         */
        @SerializedName("State")
        private String state;

        /** 机器规格，格式为nCmG,n代表cpu核数，m代表内存大小(GB) */
        @SerializedName("MachineType")
        private String machineType;

        /** VPC的ID */
        @SerializedName("VPCID")
        private String vpcid;

        /** 子网ID */
        @SerializedName("SubnetID")
        private String subnetID;

        /** DB实例创建时间，采用UTC计时时间戳 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** DB实例过期时间，采用UTC计时时间戳 */
        @SerializedName("ExpiredTime")
        private Integer expiredTime;

        /** DB实例ip */
        @SerializedName("IP")
        private String ip;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getInstanceID() {
            return instanceID;
        }

        public void setInstanceID(String instanceID) {
            this.instanceID = instanceID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDBVersion() {
            return dbVersion;
        }

        public void setDBVersion(String dbVersion) {
            this.dbVersion = dbVersion;
        }

        public String getInstanceMode() {
            return instanceMode;
        }

        public void setInstanceMode(String instanceMode) {
            this.instanceMode = instanceMode;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getMachineType() {
            return machineType;
        }

        public void setMachineType(String machineType) {
            this.machineType = machineType;
        }

        public String getVPCID() {
            return vpcid;
        }

        public void setVPCID(String vpcid) {
            this.vpcid = vpcid;
        }

        public String getSubnetID() {
            return subnetID;
        }

        public void setSubnetID(String subnetID) {
            this.subnetID = subnetID;
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

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}
