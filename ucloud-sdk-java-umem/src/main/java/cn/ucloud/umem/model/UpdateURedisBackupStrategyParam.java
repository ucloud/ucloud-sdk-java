package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 更改zhubeiredis的备份策略 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class UpdateURedisBackupStrategyParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;
    /**
     * 组的ID
     */
    @UcloudParam("GroupId")
    @NotEmpty(message = "groupId can not be empty")
    private String groupId;
    /**
     * 备份时间，默认为0
     */
    @UcloudParam("BackupTime")
    @NotEmpty(message = "backupTime can not be empty")
    private String backupTime;
    /**
     * 是否打开默认备份功能。enable(打开)，disable(关闭)，默认enable
     */
    @UcloudParam("AutoBackup")
    private String autoBackup;


    public UpdateURedisBackupStrategyParam(String region
            , String groupId
            , String backupTime
    ) {
        super("UpdateURedisBackupStrategy");
        this.region = region;
        this.groupId = groupId;
        this.backupTime = backupTime;
    }


    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return this.zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getBackupTime() {
        return this.backupTime;
    }

    public void setBackupTime(String backupTime) {
        this.backupTime = backupTime;
    }

    public String getAutoBackup() {
        return this.autoBackup;
    }

    public void setAutoBackup(String autoBackup) {
        this.autoBackup = autoBackup;
    }


}