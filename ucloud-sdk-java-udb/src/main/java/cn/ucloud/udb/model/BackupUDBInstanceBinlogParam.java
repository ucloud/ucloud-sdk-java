package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 备份UDB指定时间段的binlog列表 参数类
 * @Author : codezhang
 * @Date : 2019-03-01 11:10
 **/
public class BackupUDBInstanceBinlogParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * DB实例Id,该值可以通过DescribeUDBInstance获取
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    /**
     * 需要备份文件,可通过DescribeUDBInstanceBinlog获得 如果要传入多个文件名，以空格键分割,用单引号包含.
     */
    @NotEmpty(message = "backupFile can not be empty")
    @UcloudParam("BackupFile")
    private String backupFile;

    /**
     * DB备份文件名称
     */
    @UcloudParam("BackupName")
    private String backupName;

    public BackupUDBInstanceBinlogParam(@NotEmpty(message = "region can not be empty") String region,
                                        @NotEmpty(message = "dbId can not be empty") String dbId,
                                        @NotEmpty(message = "backupFile can not be empty") String backupFile) {
        super("BackupUDBInstanceBinlog");
        this.region = region;
        this.dbId = dbId;
        this.backupFile = backupFile;
    }

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

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    public String getBackupFile() {
        return backupFile;
    }

    public void setBackupFile(String backupFile) {
        this.backupFile = backupFile;
    }

    public String getBackupName() {
        return backupName;
    }

    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    @Override
    public String toString() {
        return "BackupUDBInstanceBinlogParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", dbId='" + dbId + '\'' +
                ", backupFile='" + backupFile + '\'' +
                ", backupName='" + backupName + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
