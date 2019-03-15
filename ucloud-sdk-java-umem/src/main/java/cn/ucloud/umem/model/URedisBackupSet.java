package cn.ucloud.umem.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description : DescribeURedisBackup 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class URedisBackupSet {
    /**
     * 备份ID
     */
    @SerializedName("BackupId")
    private String backupId;
    /**
     * 可用区，参见[可用区列表](../summary/regionlist.html)
     */
    @SerializedName("Zone")
    private String zone;
    /**
     * 对应的实例ID
     */
    @SerializedName("GroupId")
    private String groupId;
    /**
     * 组名称
     */
    @SerializedName("GroupName")
    private String groupName;
    /**
     * 备份的名称
     */
    @SerializedName("BackupName")
    private String backupName;
    /**
     * 备份时间 (UNIX时间戳)
     */
    @SerializedName("BackupTime")
    private Integer backupTime;
    /**
     * 备份文件大小, 以字节为单位
     */
    @SerializedName("BackupSize")
    private Integer backupSize;
    /**
     * 备份类型: Manual 手动 Auto 自动
     */
    @SerializedName("BackupType")
    private String backupType;
    /**
     * 备份的状态: Backuping 备份中 Success 备份成功 Error 备份失败 Expired 备份过期
     */
    @SerializedName("State")
    private String state;


    public String getBackupId() {
        return this.backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
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

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getBackupName() {
        return this.backupName;
    }

    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    public Integer getBackupTime() {
        return this.backupTime;
    }

    public void setBackupTime(Integer backupTime) {
        this.backupTime = backupTime;
    }

    public Integer getBackupSize() {
        return this.backupSize;
    }

    public void setBackupSize(Integer backupSize) {
        this.backupSize = backupSize;
    }

    public String getBackupType() {
        return this.backupType;
    }

    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }


}