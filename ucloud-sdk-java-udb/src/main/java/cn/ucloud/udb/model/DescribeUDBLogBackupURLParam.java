package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 获取UDB的slowlog备份地址 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 15:14
 **/
public class DescribeUDBLogBackupURLParam extends BaseRequestParam {
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
     * 实例的Id,该值可以通过DescribeUDBInstance获取
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    /**
     * DB实例备份ID
     */
    @NotEmpty(message = "backupId can not be empty")
    @UcloudParam("BackupId")
    private String backupId;

    public DescribeUDBLogBackupURLParam(@NotEmpty(message = "region can not be empty") String region,
                                        @NotEmpty(message = "dbId can not be empty") String dbId,
                                        @NotEmpty(message = "backupId can not be empty") String backupId) {
        super("DescribeUDBLogBackupURL");
        this.region = region;
        this.dbId = dbId;
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

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

}
