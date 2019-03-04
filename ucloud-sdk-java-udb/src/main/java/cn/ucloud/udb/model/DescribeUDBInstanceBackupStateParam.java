package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description : 获取实例备份状态 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 11:58
 **/
public class DescribeUDBInstanceBackupStateParam extends BaseRequestParam {

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
     * 备份记录ID
     */
    @NotNull(message = "backupId can not be null")
    @UcloudParam("BackupId")
    private Integer backupId;

    /**
     * 跨可用区高可用备库所在可用区，参见［可用区列表］
     */
    @UcloudParam("BackupZone")
    private String backupZone;


    public DescribeUDBInstanceBackupStateParam(@NotEmpty(message = "region can not be empty") String region,
                                               @NotEmpty(message = "zone can not be empty") String zone,
                                               @NotNull(message = "backupId can not be null") Integer backupId) {
        super("DescribeUDBInstanceBackupState");
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

    public Integer getBackupId() {
        return backupId;
    }

    public void setBackupId(Integer backupId) {
        this.backupId = backupId;
    }

    public String getBackupZone() {
        return backupZone;
    }

    public void setBackupZone(String backupZone) {
        this.backupZone = backupZone;
    }

    @Override
    public String toString() {
        return "DescribeUDBInstanceBackupStateParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", backupId=" + backupId +
                ", backupZone='" + backupZone + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
