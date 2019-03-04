package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-04 19:47
 **/
public class UpdateUDBInstanceSlaveBackupSwitchParam extends BaseRequestParam {

    /**
     * 目标库所在地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 目标库所在可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * 主库的Id
     */
    @NotEmpty(message = "masterDBId can not be empty")
    @UcloudParam("MasterDBId")
    private String masterDBId;

    /**
     * 从库的备份开关，范围[0,1],0表示从库备份功能关闭,1 表示从库备份开关打开。
     */
    @NotEmpty(message = "backupSwitch can not be empty")
    @UcloudParam("BackupSwitch")
    private Integer backupSwitch;

    /**
     * 从库的Id,如果从库备份开关设定为打开，则必须赋值。
     */
    @UcloudParam("SlaveDBId")
    private String slaveDBId;

    public UpdateUDBInstanceSlaveBackupSwitchParam(@NotEmpty(message = "region can not be empty") String region,
                                                   @NotEmpty(message = "masterDBId can not be empty") String masterDBId,
                                                   @NotEmpty(message = "backupSwitch can not be empty") Integer backupSwitch) {
        super("UpdateUDBInstanceSlaveBackupSwitch");
        this.region = region;
        this.masterDBId = masterDBId;
        this.backupSwitch = backupSwitch;
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

    public String getMasterDBId() {
        return masterDBId;
    }

    public void setMasterDBId(String masterDBId) {
        this.masterDBId = masterDBId;
    }

    public Integer getBackupSwitch() {
        return backupSwitch;
    }

    public void setBackupSwitch(Integer backupSwitch) {
        this.backupSwitch = backupSwitch;
    }

    public String getSlaveDBId() {
        return slaveDBId;
    }

    public void setSlaveDBId(String slaveDBId) {
        this.slaveDBId = slaveDBId;
    }

    @Override
    public String toString() {
        return "UpdateUDBInstanceSlaveBackupSwitchParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", masterDBId='" + masterDBId + '\'' +
                ", backupSwitch=" + backupSwitch +
                ", slaveDBId='" + slaveDBId + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
