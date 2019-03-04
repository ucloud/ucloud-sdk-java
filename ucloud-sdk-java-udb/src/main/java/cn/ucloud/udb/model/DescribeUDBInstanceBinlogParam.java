package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description :  获取UDBbinlog列表 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 13:05
 **/
public class DescribeUDBInstanceBinlogParam extends BaseRequestParam {

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
     * 过滤条件:起始时间(时间戳)
     */
    @NotNull(message = "beginTime can not be null")
    @UcloudParam("BeginTime")
    private Integer beginTime;

    /**
     * 过滤条件:结束时间(时间戳)
     */
    @NotNull(message = "endTime can not be null")
    @UcloudParam("EndTime")
    private Integer endTime;

    public DescribeUDBInstanceBinlogParam(@NotEmpty(message = "region can not be empty") String region,
                                          @NotEmpty(message = "dbId can not be empty") String dbId,
                                          @NotNull(message = "beginTime can not be null") Integer beginTime,
                                          @NotNull(message = "endTime can not be null") Integer endTime) {
        super("DescribeUDBInstanceBinlog");
        this.region = region;
        this.dbId = dbId;
        this.beginTime = beginTime;
        this.endTime = endTime;
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

    @Override
    public String toString() {
        return "DescribeUDBInstanceBinlogParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", dbId='" + dbId + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
