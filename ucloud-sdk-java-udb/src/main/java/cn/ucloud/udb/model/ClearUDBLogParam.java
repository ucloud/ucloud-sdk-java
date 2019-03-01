package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description : 清除UDB实例的log 参数类
 * @Author : codezhang
 * @Date : 2019-03-01 15:01
 **/
public class ClearUDBLogParam extends BaseRequestParam {

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
     * DB实例的id,该值可以通过DescribeUDBInstance获取
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    /**
     * 日志类型，10-error（暂不支持）、20-slow（暂不支持 ）、30-binlog
     */
    @UcloudParam("LogType")
    @NotNull(message = "logType can not be null")
    private Integer logType;

    /**
     * 删除时间点(至少前一天)之前log，采用时间戳(秒)，默认当 前时间点前一天
     */
    @UcloudParam("BeforeTime")
    private Integer beforeTime;

    public ClearUDBLogParam(@NotEmpty(message = "region can not be empty") String region,
                            @NotEmpty(message = "dbId can not be empty") String dbId,
                            @NotNull(message = "logType can not be null") Integer logType) {
        super("ClearUDBLog");
        this.region = region;
        this.dbId = dbId;
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

    public Integer getLogType() {
        return logType;
    }

    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    public Integer getBeforeTime() {
        return beforeTime;
    }

    public void setBeforeTime(Integer beforeTime) {
        this.beforeTime = beforeTime;
    }

    @Override
    public String toString() {
        return "ClearUDBLogParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", dbId='" + dbId + '\'' +
                ", logType=" + logType +
                ", beforeTime=" + beforeTime +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
