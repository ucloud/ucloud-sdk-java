package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 更新弹性IP属性 参数类
 * @author: codezhang
 * @date: 2018-09-27 11:00
 **/

public class UpdateEIPAttributeParam extends BaseRequestParam {

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
     * optional 业务组名称, 默认为 "Default"
     */
    @UcloudParam("Tag")
    private String tag;

    /**
     * optional 弹性IP的名称, 默认为 "EIP"
     */
    @UcloudParam("Name")
    private String name;

    /**
     * optional 弹性IP的备注, 默认为空
     */
    @UcloudParam("Remark")
    private String remark;

    public UpdateEIPAttributeParam( @NotEmpty(message = "region can not be empty") String region,
                                    @NotEmpty(message = "eipId can not be empty") String eipId) {
        super("UpdateEIPAttribute");
        this.region = region;
        this.eipId = eipId;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
