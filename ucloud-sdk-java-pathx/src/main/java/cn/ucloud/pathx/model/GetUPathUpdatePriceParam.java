package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @Description : 获取UPath升级价格 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class GetUPathUpdatePriceParam extends BaseRequestParam {
    /**
     *
     */
    @UcloudParam("ResourceId")
    @NotEmpty(message = "resourceId can not be empty")
    private String resourceId;
    /**
     *
     */
    @UcloudParam("Bandwidth")
    @NotNull(message = "bandwidth can not be null")
    private Integer bandwidth;
    /**
     *
     */
    @NotEmpty(message = "lineId can not be empty")
    @UcloudParam("LineId")
    private String lineId;


    public GetUPathUpdatePriceParam(String projectId
            , String resourceId
            , Integer bandwidth
            , String lineId
    ) {
        super("GetUPathUpdatePrice");
        this.projectId = projectId;
        this.resourceId = resourceId;
        this.bandwidth = bandwidth;
        this.lineId = lineId;
    }


    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getLineId() {
        return this.lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }


}