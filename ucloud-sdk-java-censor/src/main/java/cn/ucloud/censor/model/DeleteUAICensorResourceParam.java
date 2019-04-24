package cn.ucloud.censor.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description :删除UAI安全审查资源
 * @Author : codezhang
 * @Date : 2019-04-17 14:40
 **/
public class DeleteUAICensorResourceParam extends BaseRequestParam {

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

    public DeleteUAICensorResourceParam(@NotEmpty(message = "region can not be empty") String region,
                                        @NotEmpty(message = "zone can not be empty") String zone,
                                        @NotEmpty(message = "resourceId can not be empty") String resourceId) {
        super("DeleteUAICensorResource");
        this.region = region;
        this.zone = zone;
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

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
