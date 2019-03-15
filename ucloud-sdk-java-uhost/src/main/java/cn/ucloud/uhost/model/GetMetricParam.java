package cn.ucloud.uhost.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description : 获取Uhost监控信息
 * @Author : codezhang
 * @Date : 2019-03-15 15:49
 **/
public class GetMetricParam extends BaseRequestParam {

    /**
     * 地域
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * 可用区
     */
    @UcloudParam("Zone")
    @NotEmpty(message = "zone can not be empty")
    private String zone;

    /**
     * 主机实例ID
     */
    @NotEmpty(message = "resourceId can not be empty")
    @UcloudParam("ResourceId")
    private String resourceId;

    /**
     * 指标名称
     * CPUUtilization
     * IORead IOWrite
     * DiskReadOps DiskWriteOps
     * NICIn NICOut
     * NetPacketIn NetPacketOut
     * MemUsage
     * DataSpaceUsage
     * RootSpaceUsage
     * RunnableProcessCount
     * BlockProcessCount
     * ReadonlyDiskCount
     * ProcessCount
     * TcpConnectCount
     * LoadAvg1m LoadAvg5m LoadAvg15m
     */
    private List<String> metricNames;

    /**
     * 开始时间
     */
    @UcloudParam("BeginTime")
    private Integer beginTime;

    /**
     * 结束时间
     */
    @UcloudParam("EndTime")
    private Integer endTime;

    /**
     * 资源类型
     */
    @NotEmpty(message = "resourceType can not be empty")
    @UcloudParam("ResourceType")
    private String resourceType;

    public GetMetricParam(@NotEmpty(message = "region can not be empty") String region,
                          @NotEmpty(message = "zone can not be empty") String zone,
                          @NotEmpty(message = "resourceId can not be empty") String resourceId,
                          @NotEmpty(message = "resourceType can not be empty") String resourceType,
                          List<String> metricNames) {
        super("GetMetric");
        this.region = region;
        this.zone = zone;
        this.resourceId = resourceId;
        this.metricNames = metricNames;
        this.resourceType = resourceType;
    }

    @UcloudParam("MetricName")
    public List<Param> checkMetricNames() throws ValidationException {
        List<Param> params = new ArrayList<>();
        if (metricNames == null || metricNames.isEmpty()) {
            throw new ValidationException("metricName can not be empty");
        }
        int size = metricNames.size();
        for (int i = 0; i < size; i++) {
            String metricName = metricNames.get(i);
            if (metricName == null || metricName.length() <= 0) {
                throw new ValidationException(String.format("metricNames[%d] can not be empty", i));
            }
            params.add(new Param(String.format("MetricName.%d", i), metricName));
        }
        return params;
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

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public List<String> getMetricNames() {
        return metricNames;
    }

    public void setMetricNames(List<String> metricNames) {
        this.metricNames = metricNames;
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

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}
