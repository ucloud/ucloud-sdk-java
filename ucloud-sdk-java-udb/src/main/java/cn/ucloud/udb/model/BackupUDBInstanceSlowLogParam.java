package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description : 备份UDB指定时间段的slowlog分析结果 参数类
 * @Author : codezhang
 * @Date : 2019-03-01 11:27
 **/
public class BackupUDBInstanceSlowLogParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html)
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
     * 过滤条件:起始时间(时间戳)
     */
    @UcloudParam("BeginTime")
    @NotNull(message = "beginTime can not be null")
    private Integer beginTime;

    /**
     * 过滤条件:结束时间(时间戳)
     */
    @NotNull(message = "endTime can not be null")
    @UcloudParam("EndTime")
    private Integer endTime;

    /**
     * 备份文件名称
     */
    @UcloudParam("BackupName")
    @NotEmpty(message = "backupName can not be empty")
    private String backupName;

    public BackupUDBInstanceSlowLogParam(@NotEmpty(message = "region can not be empty") String region,
                                         @NotEmpty(message = "dbId can not be empty") String dbId,
                                         @NotNull(message = "beginTime can not be null") Integer beginTime,
                                         @NotNull(message = "endTime can not be null") Integer endTime,
                                         @NotEmpty(message = "backupName can not be empty") String backupName) {
        super("BackupUDBInstanceSlowLog");
        this.region = region;
        this.dbId = dbId;
        this.beginTime = beginTime;
        this.endTime = endTime;
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

    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getBackupName() {
        return backupName;
    }

    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    @Override
    public String toString() {
        return "BackupUDBInstanceSlowLogParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", dbId='" + dbId + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", backupName='" + backupName + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
