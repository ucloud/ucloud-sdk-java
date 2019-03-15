package cn.ucloud.usql.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 更新USQL设置 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class UpdateUSQLSettingParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * 结果输出位置
     */
    @UcloudParam("OutputLocation")
    @NotEmpty(message = "outputLocation can not be empty")
    private String outputLocation;


    public UpdateUSQLSettingParam(String region
            , String outputLocation
    ) {
        super("UpdateUSQLSetting");
        this.region = region;
        this.outputLocation = outputLocation;
    }


    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getOutputLocation() {
        return this.outputLocation;
    }

    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }


}