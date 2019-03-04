package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description :  根据备份获取UDB实例信息 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 13:05
 **/
public class DescribeUDBInstanceByBackupParam extends BaseRequestParam {

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
    @NotEmpty(message = "zone can not be empty")
    private String zone;

    /**
     * 备份Id
     */
    @NotEmpty(message = "backupId can not be empty")
    @UcloudParam("BackupId")
    private String backupId;

    /**
     * DB实例Id,该值可通过DescribeUDBInstance获取
     */
    @UcloudParam("DBId")
    private String dbId;


    public DescribeUDBInstanceByBackupParam(@NotEmpty(message = "region can not be empty") String region,
                                            @NotEmpty(message = "zone can not be empty") String zone,
                                            @NotEmpty(message = "backupId can not be empty") String backupId) {
        super("DescribeUDBInstanceByBackup");
        this.region = region;
        this.zone = zone;
        this.backupId = backupId;
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

    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    @Override
    public String toString() {
        return "DescribeUDBInstanceByBackupParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", backupId='" + backupId + '\'' +
                ", dbId='" + dbId + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
