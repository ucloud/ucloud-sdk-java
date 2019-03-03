package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description : 获取备份列表 参数类
 * @Author : codezhang
 * @Date : 2019-03-03 17:31
 **/
public class DescribeUDBBackupParam extends BaseRequestParam {

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
     * 返回数据长度，默认为0
     */
    @NotNull(message = "limit can not be null")
    @UcloudParam("Limit")
    private Integer limit;

    /**
     * 列表起始位置偏移量，默认为0
     */
    @NotNull(message = "offset can not be null")
    @UcloudParam("Offset")
    private Integer offset;


    /**
     * DB实例Id，如果指定，则只获取该db的备份信息 该值可以通过DescribeUDBInstance获取
     */
    @UcloudParam("DBId")
    private String dbId;

    /**
     * 备份类型,取值为0或1，0表示自动，1表示手动
     */
    @UcloudParam("backupType")
    private Integer backupType;

    /**
     * 过滤条件:起始时间(Unix时间戳)
     */
    @UcloudParam("BeginTime")
    private Integer beginTime;

    /**
     * 过滤条件:结束时间(Unix时间戳)
     */
    @UcloudParam("EndTime")
    private Integer endTime;

    /**
     * 如果未指定GroupId，则可选是否选取特定DB类型的配置(sql, nosql, postgresql, sqlserver)
     */
    @UcloudParam("ClassType")
    private String classType;

    /**
     * 如果填了BackupId, 那么只拉取这个备份的记录
     */
    @UcloudParam("BackupId")
    private Integer backupId;

    public DescribeUDBBackupParam(@NotEmpty(message = "region can not be empty") String region,
                                  @NotNull(message = "limit can not be null") Integer limit,
                                  @NotNull(message = "offset can not be null") Integer offset) {
        super("DescribeUDBBackup");
        this.region = region;
        this.limit = limit;
        this.offset = offset;
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

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    public Integer getBackupType() {
        return backupType;
    }

    public void setBackupType(Integer backupType) {
        this.backupType = backupType;
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

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public Integer getBackupId() {
        return backupId;
    }

    public void setBackupId(Integer backupId) {
        this.backupId = backupId;
    }

    @Override
    public String toString() {
        return "DescribeUDBBackupParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", limit=" + limit +
                ", offset=" + offset +
                ", dbId='" + dbId + '\'' +
                ", backupType=" + backupType +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", classType='" + classType + '\'' +
                ", backupId=" + backupId +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
