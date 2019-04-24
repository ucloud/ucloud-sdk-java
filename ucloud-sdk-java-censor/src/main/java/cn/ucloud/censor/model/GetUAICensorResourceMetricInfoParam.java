package cn.ucloud.censor.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description : 获取UAI安全审查资源监控信息
 * @Author : codezhang
 * @Date : 2019-04-18 17:20
 **/
public class GetUAICensorResourceMetricInfoParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表]
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表]
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * 开始查询时间，时间戳形式
     */
    @NotNull(message = "beginTime can not be null")
    @UcloudParam("BeginTime")
    private Long beginTime;

    /**
     * 结束查询时间，时间戳形式
     */
    @NotNull(message = "endTime can not be null")
    @UcloudParam("EndTime")
    private Long endTime;

    /**
     * 资源ID
     */
    @NotEmpty(message = "resourceId can not be empty")
    @UcloudParam("ResourceId")
    private String resourceId;

    /**
     * 统计时间间隔，单位s。
     * 若统计时间超过24小时，
     * 默认按照小时（3600s）统计,
     * 否则默认按分钟（60s）统计。
     */
    @UcloudParam("Interval")
    private Integer interval;

    public GetUAICensorResourceMetricInfoParam(@NotEmpty(message = "region can not be empty") String region,
                                               @NotNull(message = "beginTime can not be null") Long beginTime,
                                               @NotNull(message = "endTime can not be null") Long endTime,
                                               @NotEmpty(message = "resourceId can not be empty") String resourceId) {
        super("GetUAICensorResourceMetricInfo");
        this.region = region;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.resourceId = resourceId;
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

    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }
}
