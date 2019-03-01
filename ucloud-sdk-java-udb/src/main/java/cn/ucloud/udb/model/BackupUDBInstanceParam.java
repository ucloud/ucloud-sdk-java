package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 备份云数据库 参数类
 * @Author : codezhang
 * @Date : 2019-03-01 10:56
 **/
public class BackupUDBInstanceParam extends BaseRequestParam {

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
     * 备份名称
     */
    @NotEmpty(message = "backupName can not be empty")
    @UcloudParam("BackupName")
    private String backupName;

    /**
     * 是否使用黑名单备份，默认false
     */
    @UcloudParam("UseBlackList")
    private Boolean useBlackList;


    public BackupUDBInstanceParam( @NotEmpty(message = "region can not be empty") String region,
                                   @NotEmpty(message = "dbId can not be empty") String dbId,
                                   @NotEmpty(message = "backupName can not be empty") String backupName) {
        super("BackupUDBInstance");
        this.region = region;
        this.dbId = dbId;
        this.backupName = backupName;
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

    public String getBackupName() {
        return backupName;
    }

    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    public Boolean getUseBlackList() {
        return useBlackList;
    }

    public void setUseBlackList(Boolean useBlackList) {
        this.useBlackList = useBlackList;
    }

    @Override
    public String toString() {
        return "BackupUDBInstanceParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", dbId='" + dbId + '\'' +
                ", backupName='" + backupName + '\'' +
                ", useBlackList=" + useBlackList +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
