package cn.ucloud.censor.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 获取可用的UAI安全审查资源类型
 * @Author : codezhang
 * @Date : 2019-04-17 10:41
 **/
public class GetUAICensorAvailResourceTypeParam extends BaseRequestParam {

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

    public GetUAICensorAvailResourceTypeParam(@NotEmpty(message = "region can not be empty") String region,
                                              @NotEmpty(message = "zone can not be empty") String zone) {
        super("GetUAICensorAvailResourceType");
        this.region = region;
        this.zone = zone;
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
}
