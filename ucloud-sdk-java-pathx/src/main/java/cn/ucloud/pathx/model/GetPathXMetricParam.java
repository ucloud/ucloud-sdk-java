package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 获取全球加速监控信息 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class GetPathXMetricParam extends BaseRequestParam {
            /**
            * ResourceId，如upath ID  和 uga ID 
            */
            @UcloudParam("ResourceId")
                    @NotEmpty(message = "resourceId can not be empty")
                private String resourceId;
            /**
            * 查询起始时间
            */
            @UcloudParam("BeginTime")
                    @NotNull(message ="beginTime can not be null")
                private Integer beginTime;
            /**
            * 查询结束时间
            */
            @UcloudParam("EndTime")
                    @NotNull(message ="endTime can not be null")
                private Integer endTime;
            // TODO 需要人工接入 GetPathXMetric =》 MetricName.n
            /**
            * upath:加速线路,uga:加速实例
            */
            @UcloudParam("ResourceType")
                    @NotEmpty(message = "resourceType can not be empty")
                private String resourceType;
            /**
            * 具体线路id
            */
            @UcloudParam("LineId")
                    @NotEmpty(message = "lineId can not be empty")
                private String lineId;


public GetPathXMetricParam(                    String projectId
                    ,String resourceId
                    ,Integer beginTime
                    ,Integer endTime
                    ,String resourceType
                    ,String lineId
){
    super("GetPathXMetric");
                this.projectId = projectId;
                this.resourceId = resourceId;
                this.beginTime = beginTime;
                this.endTime = endTime;
                // TODO 需要人工接入 GetPathXMetric =》 MetricName.n is required
                this.resourceType = resourceType;
                this.lineId = lineId;
}


                public String getResourceId() {
                return this.resourceId;
                }

                public void setResourceId(String resourceId) {
                this.resourceId = resourceId;
                }

                public Integer getBeginTime() {
                return this.beginTime;
                }

                public void setBeginTime(Integer beginTime) {
                this.beginTime = beginTime;
                }

                public Integer getEndTime() {
                return this.endTime;
                }

                public void setEndTime(Integer endTime) {
                this.endTime = endTime;
                }

                public String getResourceType() {
                return this.resourceType;
                }

                public void setResourceType(String resourceType) {
                this.resourceType = resourceType;
                }

                public String getLineId() {
                return this.lineId;
                }

                public void setLineId(String lineId) {
                this.lineId = lineId;
                }



}