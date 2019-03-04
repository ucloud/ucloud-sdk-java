package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description :  获取UDB错误日志或慢查询日志 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 13:58
 **/
public class DescribeUDBInstanceLogParam extends BaseRequestParam {

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
     * 实例ID
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    /**
     * 查询的日志开始的时间戳（Unix Timestamp）。
     * 对于实时查询，这个参数应该是上次轮询请求时的时间戳，后台会返回从该值到当前时间的日志内容。
     */
    @NotNull(message = "beginTime can not be null")
    @UcloudParam("BeginTime")
    private Integer beginTime;

    /**
     * 查询日志的结束时间戳(Unix Timestamp），
     * 对于实时查询不传该值，与BeginTime的差值不超过24小时：(EndTime-BeginTime) < 24*60*60
     */
    //@NotNull(message = "endTime can not be null")
    @UcloudParam("EndTime")
    private Integer endTime;

    /**
     * 查询日志的类型
     */
    @NotEmpty(message = "logType can not be empty")
    @UcloudParam("LogType")
    private String logType;

    public DescribeUDBInstanceLogParam(@NotEmpty(message = "region can not be empty") String region,
                                       @NotEmpty(message = "dbId can not be empty") String dbId,
                                       @NotNull(message = "beginTime can not be null") Integer beginTime,
                                       @NotEmpty(message = "logType can not be empty") String logType) {
        super("DescribeUDBInstanceLog");
        this.region = region;
        this.dbId = dbId;
        this.beginTime = beginTime;
        this.logType = logType;
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

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    @Override
    public String toString() {
        return "DescribeUDBInstanceLogParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", dbId='" + dbId + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", logType='" + logType + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
