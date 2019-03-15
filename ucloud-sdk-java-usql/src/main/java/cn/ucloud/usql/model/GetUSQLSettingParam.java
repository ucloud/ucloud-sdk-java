package cn.ucloud.usql.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 获取用户USQL配置 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class GetUSQLSettingParam extends BaseRequestParam {
    /**
     * 服务区域
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;


    public GetUSQLSettingParam(String region
    ) {
        super("GetUSQLSetting");
        this.region = region;
    }


    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }


}