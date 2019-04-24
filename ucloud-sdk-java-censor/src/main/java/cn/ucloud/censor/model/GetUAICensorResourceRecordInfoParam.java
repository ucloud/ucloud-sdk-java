package cn.ucloud.censor.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import com.google.gson.annotations.SerializedName;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description :获取UAI安全审查资源请求记录
 * @Author : codezhang
 * @Date : 2019-04-18 16:42
 **/
public class GetUAICensorResourceRecordInfoParam extends BaseRequestParam {


    /**
     * 地域。 参见 [地域和可用区列表]
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表]
     */
    @NotEmpty(message = "zone can not be empty")
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
     * 资源ID，若不提供则给出当前账号下所有资源的请求记录信息。
     */
    @UcloudParam("ResourceId")
    private String resourceId;

    public GetUAICensorResourceRecordInfoParam(@NotEmpty(message = "region can not be empty") String region,
                                               @NotEmpty(message = "zone can not be empty") String zone,
                                               @NotNull(message = "beginTime can not be null") Long beginTime,
                                               @NotNull(message = "endTime can not be null") Long endTime) {
        super("GetUAICensorResourceRecordInfo");
        this.region = region;
        this.zone = zone;
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
}
