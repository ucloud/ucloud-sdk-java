package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: 修改弹性IP的外网出口权重 参数类
 * @author: codezhang
 * @date: 2018-09-27 12:20
 **/

public class ModifyEIPWeightParam extends BaseRequestParam {

    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require EIP资源ID
     */
    @NotEmpty(message = "eipId can not be empty")
    @UcloudParam("EIPId")
    private String eipId;

    /**
     * require
     * 外网出口权重, 范围[0-100] 取值为0时, 该弹性IP不会被使用. 取值为100时, 同主机下只会使用这个弹性IP，
     * 其他弹性IP不会被使用 请勿将多个绑定在同一资源的弹性IP设置为相同权重
     */
    @NotNull(message = "weight can not be null")
    @UcloudParam("Weight")
    private Integer weight;

    public ModifyEIPWeightParam( @NotEmpty(message = "region can not be empty") String region,
                                 @NotEmpty(message = "eipId can not be empty") String eipId,
                                 @NotNull(message = "weight can not be null") Integer weight) {
        super("ModifyEIPWeight");
        this.region = region;
        this.eipId = eipId;
        this.weight = weight;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
