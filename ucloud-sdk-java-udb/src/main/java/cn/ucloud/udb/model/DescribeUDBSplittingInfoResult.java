package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 描述读写分离功能的详细信息 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 16:07
 **/
public class DescribeUDBSplittingInfoResult extends BaseResponseResult {

    public static class UDBRWSplitting {

        /**
         * DB实例ID
         */
        @SerializedName("DBId")
        private String dbId;

        /**
         * 主库/从库
         */
        @SerializedName("Role")
        private String role;

        /**
         * DBIP
         */
        @SerializedName("VirtualIP")
        private String virtualIP;

        /**
         * 读写分离比重
         */
        @SerializedName("ReadWeight")
        private Integer readWeight;

        /**
         * DB状态
         */
        @SerializedName("State")
        private String state;

        public String getDbId() {
            return dbId;
        }

        public void setDbId(String dbId) {
            this.dbId = dbId;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getVirtualIP() {
            return virtualIP;
        }

        public void setVirtualIP(String virtualIP) {
            this.virtualIP = virtualIP;
        }

        public Integer getReadWeight() {
            return readWeight;
        }

        public void setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        @Override
        public String toString() {
            return "UDBRWSplitting{" +
                    "dbId='" + dbId + '\'' +
                    ", role='" + role + '\'' +
                    ", virtualIP='" + virtualIP + '\'' +
                    ", readWeight=" + readWeight +
                    ", state='" + state + '\'' +
                    '}';
        }
    }

    /**
     * 地域
     */
    @SerializedName("Region")
    private String region;

    /**
     * 可用区
     */
    @SerializedName("Zone")
    private String zone;

    /**
     * DB实例ID
     */
    @SerializedName("MasterDBId")
    private String masterDBId;

    /**
     * 读写分离IP
     */
    @SerializedName("RWIP")
    private String rwIP;

    /**
     * 时间阈值
     */
    @SerializedName("DelayThreshold")
    private Integer delayThreshold;

    /**
     * 端口号
     */
    @SerializedName("Port")
    private Integer port;

    /**
     * 读写分离策略
     */
    @SerializedName("ReadModel")
    private String readMode;

    /**
     * 数据库版本
     */
    @SerializedName("DBTypeId")
    private String dbTypeId;

    /**
     * 读写分离状态
     */
    @SerializedName("RWState")
    private String rwState;

    /**
     * 读写分离从库信息
     */
    @SerializedName("DataSet")
    private List<UDBRWSplitting> splittings;

    /**
     * 可用区。跨机房读写分离的主可用区
     */
    @SerializedName("MainZone")
    private String mainZone;

    /**
     * 可用区。跨机房读写分离的备可用区
     */
    @SerializedName("BackupZone")
    private String backupZone;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getMasterDBId() {
        return masterDBId;
    }

    public void setMasterDBId(String masterDBId) {
        this.masterDBId = masterDBId;
    }

    public String getRwIP() {
        return rwIP;
    }

    public void setRwIP(String rwIP) {
        this.rwIP = rwIP;
    }

    public Integer getDelayThreshold() {
        return delayThreshold;
    }

    public void setDelayThreshold(Integer delayThreshold) {
        this.delayThreshold = delayThreshold;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getReadMode() {
        return readMode;
    }

    public void setReadMode(String readMode) {
        this.readMode = readMode;
    }

    public String getDbTypeId() {
        return dbTypeId;
    }

    public void setDbTypeId(String dbTypeId) {
        this.dbTypeId = dbTypeId;
    }

    public String getRwState() {
        return rwState;
    }

    public void setRwState(String rwState) {
        this.rwState = rwState;
    }

    public List<UDBRWSplitting> getSplittings() {
        return splittings;
    }

    public void setSplittings(List<UDBRWSplitting> splittings) {
        this.splittings = splittings;
    }

    public String getMainZone() {
        return mainZone;
    }

    public void setMainZone(String mainZone) {
        this.mainZone = mainZone;
    }

    public String getBackupZone() {
        return backupZone;
    }

    public void setBackupZone(String backupZone) {
        this.backupZone = backupZone;
    }

    @Override
    public String toString() {
        return "DescribeUDBSplittingInfoResult{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", masterDBId='" + masterDBId + '\'' +
                ", rwIP='" + rwIP + '\'' +
                ", delayThreshold=" + delayThreshold +
                ", port=" + port +
                ", readMode='" + readMode + '\'' +
                ", dbTypeId='" + dbTypeId + '\'' +
                ", rwState='" + rwState + '\'' +
                ", splittings=" + splittings +
                ", mainZone='" + mainZone + '\'' +
                ", backupZone='" + backupZone + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
