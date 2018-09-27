package cn.ucloud.uhost.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 复制用户镜像 参数类
 * @author: codezhang
 * @date: 2018-09-18 15:52
 **/

public class CopyCustomImageParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * optional 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * require 源镜像Id, 参见 DescribeImage
     */
    @NotEmpty(message = "sourceImageId can not be empty")
    @UcloudParam("SourceImageId")
    private String sourceImageId;

    /**
     * require 目标项目Id, 参见 GetProjectList
     */
    @NotEmpty(message = "targetProjectId can not be empty")
    @UcloudParam("TargetProjectId")
    private String targetProjectId;

    /**
     * optional 目标地域，不跨地域不用填
     */
    @UcloudParam("TargetRegion")
    private String targetRegion;

    /**
     * optional 目标镜像名称
     */
    @UcloudParam("TargetImageName")
    private String targetImageName;

    /**
     * optional 目标镜像描述
     */
    @UcloudParam("TargetImageDescription")
    private String targetImageDescription;


    public CopyCustomImageParam(@NotEmpty(message = "region can not be empty") String region,
                                @NotEmpty(message = "sourceImageId can not be empty") String sourceImageId,
                                @NotEmpty(message = "targetProjectId can not be empty") String targetProjectId) {
        super("CopyCustomImage");
        this.region = region;
        this.sourceImageId = sourceImageId;
        this.targetProjectId = targetProjectId;
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

    public String getSourceImageId() {
        return sourceImageId;
    }

    public void setSourceImageId(String sourceImageId) {
        this.sourceImageId = sourceImageId;
    }

    public String getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
    }

    public String getTargetRegion() {
        return targetRegion;
    }

    public void setTargetRegion(String targetRegion) {
        this.targetRegion = targetRegion;
    }

    public String getTargetImageName() {
        return targetImageName;
    }

    public void setTargetImageName(String targetImageName) {
        this.targetImageName = targetImageName;
    }

    public String getTargetImageDescription() {
        return targetImageDescription;
    }

    public void setTargetImageDescription(String targetImageDescription) {
        this.targetImageDescription = targetImageDescription;
    }
}
