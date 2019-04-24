package cn.ucloud.censor.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 修改UAI安全审查资源名称
 * @Author : codezhang
 * @Date : 2019-04-17 14:33
 **/
public class ModifyUAICensorResourceNameParam extends BaseRequestParam {

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
     * 资源ID
     */
    @NotEmpty(message = "resourceId can not be empty")
    @UcloudParam("ResourceId")
    private String resourceId;

    /**
     * 修改后的资源名称
     */
    @NotEmpty(message = "resourceName can not be empty")
    @UcloudParam("ResourceName")
    private String resourceName;

    public ModifyUAICensorResourceNameParam(@NotEmpty(message = "region can not be empty") String region,
                                            @NotEmpty(message = "zone can not be empty") String zone,
                                            @NotEmpty(message = "resourceId can not be empty") String resourceId,
                                            @NotEmpty(message = "resourceName can not be empty") String resourceName) {
        super("ModifyUAICensorResourceName");
        this.region = region;
        this.zone = zone;
        this.resourceId = resourceId;
        this.resourceName = resourceName;
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

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
}
