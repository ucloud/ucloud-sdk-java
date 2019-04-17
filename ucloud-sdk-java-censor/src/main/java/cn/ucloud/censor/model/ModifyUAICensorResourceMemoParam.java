package cn.ucloud.censor.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 修改UAI安全审查资源备注
 * @Author : codezhang
 * @Date : 2019-04-17 14:20
 **/
public class ModifyUAICensorResourceMemoParam extends BaseRequestParam {

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
     * 修改后的资源备注
     */
    @NotEmpty(message = "resourceMemo can not be empty")
    @UcloudParam("ResourceMemo")
    private String resourceMemo;


    public ModifyUAICensorResourceMemoParam(@NotEmpty(message = "region can not be empty") String region,
                                            @NotEmpty(message = "zone can not be empty") String zone,
                                            @NotEmpty(message = "resourceId can not be empty") String resourceId,
                                            @NotEmpty(message = "resourceMemo can not be empty") String resourceMemo) {
        super("ModifyUAICensorResourceMemo");
        this.region = region;
        this.zone = zone;
        this.resourceId = resourceId;
        this.resourceMemo = resourceMemo;
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

    public String getResourceMemo() {
        return resourceMemo;
    }

    public void setResourceMemo(String resourceMemo) {
        this.resourceMemo = resourceMemo;
    }
}
