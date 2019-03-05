package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description : 获取UDB备份下载地址 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 11:58
 **/
public class DescribeUDBInstanceBackupURLParam extends BaseRequestParam {

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
     * DB实例Id,该值可通过DescribeUDBInstance获取
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    /**
     * 备份记录ID
     */
    @NotNull(message = "backupId can not be null")
    @UcloudParam("BackupId")
    private Integer backupId;


    public DescribeUDBInstanceBackupURLParam(@NotEmpty(message = "region can not be empty") String region,
                                             @NotNull(message = "backupId can not be null") Integer backupId,
                                             @NotEmpty(message = "dbId can not be empty") String dbId) {
        super("DescribeUDBInstanceBackupURL");
        this.region = region;
        this.backupId = backupId;
        this.dbId = dbId;
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

    public Integer getBackupId() {
        return backupId;
    }

    public void setBackupId(Integer backupId) {
        this.backupId = backupId;
    }

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

}
