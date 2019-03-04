package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 获取指定ClassType的udb实例从库信息 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 15:56
 **/
public class DescribeUDBSlaveOrSecondaryInstanceResult extends BaseResponseResult {

    public static class UDBSlaveOrSecondaryInstance {

        /**
         * DB实例id
         */
        @SerializedName("DBId")
        private String dbId;

        /**
         * 实例名称，至少6位
         */
        @SerializedName("Name")
        private String name;

        /**
         * DB类型id，mysql/mongodb按版本细分各有一个id
         * 目前id的取值范围为[1,7],数值对应的版本如下：
         * 1：mysql-5.5，2：mysql-5.1，
         * 3：percona-5.5 4：mongodb-2.4，
         * 5：mongodb-2.6，6：mysql-5.6， 7：percona-5.6
         */
        @SerializedName("DBTypeId")
        private String dbTypeId;

        /**
         * DB实例使用的配置参数组id
         */
        @SerializedName("ParamGroupId")
        private Integer paramGroupId;

        /**
         * 管理员帐户名，默认root
         */
        @SerializedName("AdminUser")
        private String adminUser;

        /**
         * DB实例虚ip
         */
        @SerializedName("VirtualIP")
        private String virtualIP;

        /**
         * DB实例虚ip的mac地址
         */
        @SerializedName("VirtualMAC")
        private String virtualMAC;

        /**
         * 端口号，mysql默认3306，mongodb默认27017
         */
        @SerializedName("Port")
        private Integer port;

        /**
         * 对mysql的slave而言是master的DBId，对master则为空， 对mongodb则是副本集id
         */
        @SerializedName("SrcDBId")
        private String srcDBId;

        /**
         * 备份策略，不可修改，备份文件保留的数量，默认7次
         */
        @SerializedName("BackupCount")
        private Integer backupCount;

        /**
         * 备份策略，不可修改，开始时间，单位小时计，默认3点
         */
        @SerializedName("BackupBeginTime")
        private Integer backupBeginTime;

        /**
         * 备份策略，一天内备份时间间隔，单位小时，默认24小时
         */
        @SerializedName("BackupDuration")
        private Integer backupDuration;

        /**
         * 备份策略，备份黑名单，mongodb则不适用
         */
        @SerializedName("BackupBlacklist")
        private String backupBlacklist;

        /**
         * DB状态标记
         * Init：初始化中，
         * Fail：安装失败，
         * Starting：启动中，
         * Running：运行，
         * Shutdown：关闭中，
         * Shutoff：已关闭，
         * Delete：已删除，
         * Upgrading：升级中，
         * Promoting：提升为独库进行中，
         * Recovering：恢复中，
         * Recover fail：恢复失败
         */
        @SerializedName("State")
        private String state;

        /**
         * DB实例创建时间，采用UTC计时时间戳
         */
        @SerializedName("CreateTime")
        private Integer createTime;

        /**
         * DB实例修改时间，采用UTC计时时间戳
         */
        @SerializedName("ModifyTime")
        private Integer modifyTime;

        /**
         * DB实例过期时间，采用UTC计时时间戳
         */
        @SerializedName("ExpiredTime")
        private Integer expiredTime;

        /**
         * Year， Month， Dynamic，Trial，默认: Dynamic
         */
        @SerializedName("ChargeType")
        private String chargeType;

        /**
         * 内存限制(MB)，默认根据配置机型
         */
        @SerializedName("MemoryLimit")
        private Integer memoryLimit;

        /**
         * 磁盘空间(GB), 默认根据配置机型
         */
        @SerializedName("DiskSpace")
        private Integer diskSpace;

        /**
         * 是否使用SSD
         */
        @SerializedName("UseSSD")
        private Boolean useSSD;

        /**
         * SSD类型，SATA/PCI-E
         */
        @SerializedName("SSDType")
        private String ssdType;

        /**
         * DB实例角色，mysql区分master/slave，mongodb多种角色
         */
        @SerializedName("Role")
        private String role;

        /**
         * DB实例磁盘已使用空间，单位GB
         */
        @SerializedName("DiskUsedSize")
        private Integer diskUsedSize;

        /**
         * DB实例数据文件大小，单位GB
         */
        @SerializedName("DataFileSize")
        private Integer dataFileSize;

        /**
         * 从库备份开关
         */
        @SerializedName("IsSlaveBackup")
        private Integer isSlaveBackup;

        /**
         * 备份日期标记位。共7位,每一位为一周中一天的备份情况
         * 0表示关闭当天备份,1表示打开当天备份。
         * 最右边的一位 为星期天的备份开关，
         * 其余从右到左依次为星期一到星期 六的备份配置开关，
         * 每周必须至少设置两天备份。
         * 例如：1100000 表示打开星期六和星期五的自动备份功能
         */
        @SerializedName("BackupDate")
        private String backupDate;

        public String getDbId() {
            return dbId;
        }

        public void setDbId(String dbId) {
            this.dbId = dbId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDbTypeId() {
            return dbTypeId;
        }

        public void setDbTypeId(String dbTypeId) {
            this.dbTypeId = dbTypeId;
        }

        public Integer getParamGroupId() {
            return paramGroupId;
        }

        public void setParamGroupId(Integer paramGroupId) {
            this.paramGroupId = paramGroupId;
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

        public String getVirtualMAC() {
            return virtualMAC;
        }

        public void setVirtualMAC(String virtualMAC) {
            this.virtualMAC = virtualMAC;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getSrcDBId() {
            return srcDBId;
        }

        public void setSrcDBId(String srcDBId) {
            this.srcDBId = srcDBId;
        }

        public Integer getBackupCount() {
            return backupCount;
        }

        public void setBackupCount(Integer backupCount) {
            this.backupCount = backupCount;
        }

        public Integer getBackupBeginTime() {
            return backupBeginTime;
        }

        public void setBackupBeginTime(Integer backupBeginTime) {
            this.backupBeginTime = backupBeginTime;
        }

        public Integer getBackupDuration() {
            return backupDuration;
        }

        public void setBackupDuration(Integer backupDuration) {
            this.backupDuration = backupDuration;
        }

        public String getBackupBlacklist() {
            return backupBlacklist;
        }

        public void setBackupBlacklist(String backupBlacklist) {
            this.backupBlacklist = backupBlacklist;
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

        public Integer getMemoryLimit() {
            return memoryLimit;
        }

        public void setMemoryLimit(Integer memoryLimit) {
            this.memoryLimit = memoryLimit;
        }

        public Integer getDiskSpace() {
            return diskSpace;
        }

        public void setDiskSpace(Integer diskSpace) {
            this.diskSpace = diskSpace;
        }

        public Boolean getUseSSD() {
            return useSSD;
        }

        public void setUseSSD(Boolean useSSD) {
            this.useSSD = useSSD;
        }

        public String getSsdType() {
            return ssdType;
        }

        public void setSsdType(String ssdType) {
            this.ssdType = ssdType;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public Integer getDiskUsedSize() {
            return diskUsedSize;
        }

        public void setDiskUsedSize(Integer diskUsedSize) {
            this.diskUsedSize = diskUsedSize;
        }

        public Integer getDataFileSize() {
            return dataFileSize;
        }

        public void setDataFileSize(Integer dataFileSize) {
            this.dataFileSize = dataFileSize;
        }

        public Integer getIsSlaveBackup() {
            return isSlaveBackup;
        }

        public void setIsSlaveBackup(Integer isSlaveBackup) {
            this.isSlaveBackup = isSlaveBackup;
        }

        public String getBackupDate() {
            return backupDate;
        }

        public void setBackupDate(String backupDate) {
            this.backupDate = backupDate;
        }

        @Override
        public String toString() {
            return "UDBInstance{" +
                    "dbId='" + dbId + '\'' +
                    ", name='" + name + '\'' +
                    ", dbTypeId='" + dbTypeId + '\'' +
                    ", paramGroupId=" + paramGroupId +
                    ", adminUser='" + adminUser + '\'' +
                    ", virtualIP='" + virtualIP + '\'' +
                    ", virtualMAC='" + virtualMAC + '\'' +
                    ", port=" + port +
                    ", srcDBId='" + srcDBId + '\'' +
                    ", backupCount=" + backupCount +
                    ", backupBeginTime=" + backupBeginTime +
                    ", backupDuration=" + backupDuration +
                    ", backupBlacklist='" + backupBlacklist + '\'' +
                    ", state='" + state + '\'' +
                    ", createTime=" + createTime +
                    ", modifyTime=" + modifyTime +
                    ", expiredTime=" + expiredTime +
                    ", chargeType='" + chargeType + '\'' +
                    ", memoryLimit=" + memoryLimit +
                    ", diskSpace=" + diskSpace +
                    ", useSSD=" + useSSD +
                    ", ssdType='" + ssdType + '\'' +
                    ", role='" + role + '\'' +
                    ", diskUsedSize=" + diskUsedSize +
                    ", dataFileSize=" + dataFileSize +
                    ", isSlaveBackup=" + isSlaveBackup +
                    ", backupDate='" + backupDate + '\'' +
                    '}';
        }
    }


    /**
     * DB实例信息列表 UDBSlaveOrSecondaryInstance
     */
    @SerializedName("DataSet")
    private List<UDBSlaveOrSecondaryInstance> instances;

    public List<UDBSlaveOrSecondaryInstance> getInstances() {
        return instances;
    }

    public void setInstances(List<UDBSlaveOrSecondaryInstance> instances) {
        this.instances = instances;
    }

    @Override
    public String toString() {
        return "DescribeUDBSlaveOrSecondaryInstanceResult{" +
                "instances=" + instances +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
