package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @Description : 获取UPath升级价格 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class GetUPathUpdatePriceParam extends BaseRequestParam {
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UcloudParam("ProjectId")
    @NotEmpty(message = "projectId can not be empty")
    private String projectId;
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
    @UcloudParam("LineId")
    private String lineId;


    public GetUPathUpdatePriceParam(String projectId
            , String resourceId
            , Integer bandwidth
    ) {
        super("GetUPathUpdatePrice");
        this.projectId = projectId;
        this.resourceId = resourceId;
        this.bandwidth = bandwidth;
    }


    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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