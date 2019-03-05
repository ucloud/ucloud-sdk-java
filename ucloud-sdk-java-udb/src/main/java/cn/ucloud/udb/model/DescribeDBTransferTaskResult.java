package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 获取迁移任务信息 结果类
 * 获取Task信息，支持两类操作：
 * （1）指定TaskId用于获取该Task的信息；
 * （2）指定Offset、Limit用于列表操作，查询某一个任务。
 * @Author : codezhang
 * @Date : 2019-03-03 16:34
 **/
public class DescribeDBTransferTaskResult extends BaseResponseResult {


    public static class DBTransferTask {

        /**
         * 任务Id
         */
        @SerializedName("TaskId")
        private String taskId;

        /**
         * 任务名称
         */
        @SerializedName("TaskName")
        private String taskName;

        /**
         * full表示全量,full_incr表示迁移+增量
         */
        @SerializedName("MigrateType")
        private String migrateType;

        /**
         * 任务创建时间
         */
        @SerializedName("CreateTime")
        private Integer cretaeTime;

        /**
         * 源库DB类型id(包括MySQL, MongoDB, PostgreSQL)
         */
        @SerializedName("SrcDBTypeId")
        private String srcDBTypeId;

        /**
         * 源库DB实例类型（uhost-db表示云主机自建）
         */
        @SerializedName("SrcInstanceTypeId")
        private String srcInstanceTypeId;

        /**
         * 源库DB虚ip
         */
        @SerializedName("SrcIP")
        private String srcIP;

        /**
         * 源库使用的端口
         */
        @SerializedName("SrcPort")
        private Integer srcPort;

        /**
         * 源库用户名
         */
        @SerializedName("SrcUser")
        private String srcUser;

        /**
         * 源库密码
         */
        @SerializedName("SrcPassword")
        private String srcPassword;

        /**
         * DB类型id（包括MySQL, MongoDB, PostgreSQL)
         */
        @SerializedName("DstDBTypeId")
        private String dstDBTypeId;

        /**
         * 目标库DB实例名
         */
        @SerializedName("DstDBInstanceName")
        private String dstDBInstanceName;

        /**
         * 目标库虚ip
         */
        @SerializedName("DstIP")
        private String dstIP;

        /**
         * 目标库DBId
         */
        @SerializedName("DstDBId")
        private String dstDBId;

        /**
         * 目标库用户
         */
        @SerializedName("DstUser")
        private String dstUser;

        /**
         * 目标库密码
         */
        @SerializedName("DstPassword")
        private String dstPassowrd;

        /**
         * 目标库所在region
         */
        @SerializedName("DstRegion")
        private String dstRegion;

        /**
         * 目标库Zone
         */
        @SerializedName("DstZone")
        private String dstZone;

        /**
         * 数据迁移状态
         * 任务初始化：TRANSFER_TASK_INIT
         * 预检查中：PRE_CHECK_RUNNING
         * 预检查成功：PRE_CHECK_SUCCESS
         * 预检查失败：PRE_CHECK_FAIL
         * 数据迁移中：TRANSFER_RUNNING
         * 迁移成功：TRANSFER_SUCCESS
         * 迁移失败：TRANSFER_FAILED
         * 任务完成：TASK_COMPLETE
         * 任务取消：TASK_CANCELED
         */
        @SerializedName("TaskState")
        private String taskState;

        /**
         * 迁移进度(百分比)
         */
        @SerializedName("MigratePercentage")
        private String migratePercentage;

        /**
         * 可用区
         */
        @SerializedName("Zone")
        private String zone;

        /**
         * 错误码
         * preError1 : 目标库用户名或密码错误！
         * preError2 : 源库无法连通！
         * preError3 : 目标库非空！
         * preError4 : 源库和目标库的数据库版本不一致！
         * preError5 : 源库和目标库的gtid_mode不一致！
         * preError6 : 源库用户权限不足！
         * preError7 : 源库和目标库的lower_case_table_names设置不一致！
         * preError8 : 源库与目标库server_id不能相同！
         * preError9 : 源库binlog未开启！
         * preError10 : 源库sql_log_bin未开启！
         * preError11 : 源库存在非innodb引擎！
         * preError12 : 源库与目标库event_scheduler设置不一致！
         * preError13 : 源库存在复制过滤设置binlog_do_db！
         * preError14 : 源库存在复制过滤设置binlog_ignore_db！
         * preError15 : 目标库未打开log_slave_updates参数！
         * preError16 : 源库表结构有问题！
         * preError50 : 内部错误！
         * preError86 : 目标库存在复制过滤设置binlog_ignore_db！
         * preError87 : 目标库存在复制过滤设置binlog_do_db！
         * preError90 : 目标库sql_log_bin未开启！
         * preError91 : 目标库binlog未开启！
         * preError98 : 目标库无法连通！
         */
        @SerializedName("ErrorCode")
        private String errorCode;

        /**
         * 同步延时
         */
        @SerializedName("DelaySeconds")
        private String delaySeconds;

        /**
         * preWarn1: 由于没有mysql.proc的SELECT权限，因此不迁移存储
         * preWarn2: 由于没有所有库的EVENT权限，因此不迁移事件！
         * preWarn3: 由于没有所有库的TRIGGER权限，因此不迁移触发器！
         */
        @SerializedName("WarningCode")
        private String warningCode;


        public String getTaskId() {
            return taskId;
        }

        public void setTaskId(String taskId) {
            this.taskId = taskId;
        }

        public String getTaskName() {
            return taskName;
        }

        public void setTaskName(String taskName) {
            this.taskName = taskName;
        }

        public String getMigrateType() {
            return migrateType;
        }

        public void setMigrateType(String migrateType) {
            this.migrateType = migrateType;
        }

        public Integer getCretaeTime() {
            return cretaeTime;
        }

        public void setCretaeTime(Integer cretaeTime) {
            this.cretaeTime = cretaeTime;
        }

        public String getSrcDBTypeId() {
            return srcDBTypeId;
        }

        public void setSrcDBTypeId(String srcDBTypeId) {
            this.srcDBTypeId = srcDBTypeId;
        }

        public String getSrcInstanceTypeId() {
            return srcInstanceTypeId;
        }

        public void setSrcInstanceTypeId(String srcInstanceTypeId) {
            this.srcInstanceTypeId = srcInstanceTypeId;
        }

        public String getSrcIP() {
            return srcIP;
        }

        public void setSrcIP(String srcIP) {
            this.srcIP = srcIP;
        }

        public Integer getSrcPort() {
            return srcPort;
        }

        public void setSrcPort(Integer srcPort) {
            this.srcPort = srcPort;
        }

        public String getSrcUser() {
            return srcUser;
        }

        public void setSrcUser(String srcUser) {
            this.srcUser = srcUser;
        }

        public String getSrcPassword() {
            return srcPassword;
        }

        public void setSrcPassword(String srcPassword) {
            this.srcPassword = srcPassword;
        }

        public String getDstDBTypeId() {
            return dstDBTypeId;
        }

        public void setDstDBTypeId(String dstDBTypeId) {
            this.dstDBTypeId = dstDBTypeId;
        }

        public String getDstDBInstanceName() {
            return dstDBInstanceName;
        }

        public void setDstDBInstanceName(String dstDBInstanceName) {
            this.dstDBInstanceName = dstDBInstanceName;
        }

        public String getDstIP() {
            return dstIP;
        }

        public void setDstIP(String dstIP) {
            this.dstIP = dstIP;
        }

        public String getDstDBId() {
            return dstDBId;
        }

        public void setDstDBId(String dstDBId) {
            this.dstDBId = dstDBId;
        }

        public String getDstUser() {
            return dstUser;
        }

        public void setDstUser(String dstUser) {
            this.dstUser = dstUser;
        }

        public String getDstPassowrd() {
            return dstPassowrd;
        }

        public void setDstPassowrd(String dstPassowrd) {
            this.dstPassowrd = dstPassowrd;
        }

        public String getDstRegion() {
            return dstRegion;
        }

        public void setDstRegion(String dstRegion) {
            this.dstRegion = dstRegion;
        }

        public String getDstZone() {
            return dstZone;
        }

        public void setDstZone(String dstZone) {
            this.dstZone = dstZone;
        }

        public String getTaskState() {
            return taskState;
        }

        public void setTaskState(String taskState) {
            this.taskState = taskState;
        }

        public String getMigratePercentage() {
            return migratePercentage;
        }

        public void setMigratePercentage(String migratePercentage) {
            this.migratePercentage = migratePercentage;
        }

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(String errorCode) {
            this.errorCode = errorCode;
        }

        public String getDelaySeconds() {
            return delaySeconds;
        }

        public void setDelaySeconds(String delaySeconds) {
            this.delaySeconds = delaySeconds;
        }

        public String getWarningCode() {
            return warningCode;
        }

        public void setWarningCode(String warningCode) {
            this.warningCode = warningCode;
        }

    }

    /**
     * 用户任务数量
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * Task信息
     */
    @SerializedName("DataSet")
    private List<DBTransferTask> tasks;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<DBTransferTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<DBTransferTask> tasks) {
        this.tasks = tasks;
    }

}
