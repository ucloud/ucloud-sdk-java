package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 删除UDB实例备份 参数类
 * @Author : codezhang
 * @Date : 2019-03-03 15:15
 **/
public class DeleteUDBBackupParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * 备份id，可通过DescribeUDBBackup获得
     */
    @NotEmpty(message = "backupId can not be empty")
    @UcloudParam("BackupId")
    private String backupId;

    /**
     * 跨可用区高可用备库所在可用区，参见［可用区列表］
     */
    @NotEmpty(message = "backupZone can not be empty")
    @UcloudParam("BackupZone")
    private String backupZone;

    public DeleteUDBBackupParam(@NotEmpty(message = "region can not be empty") String region,
                                @NotEmpty(message = "zone can not be empty") String zone,
                                @NotEmpty(message = "backupId can not be empty") String backupId) {
        super("DeleteUDBBackup");
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

    public String getBackupZone() {
        return backupZone;
    }

    public void setBackupZone(String backupZone) {
        this.backupZone = backupZone;
    }

    @Override
    public String toString() {
        return "DeleteUDBBackupParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", backupId='" + backupId + '\'' +
                ", backupZone='" + backupZone + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
