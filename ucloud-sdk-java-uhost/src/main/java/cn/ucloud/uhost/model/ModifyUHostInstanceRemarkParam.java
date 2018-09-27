package cn.ucloud.uhost.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:  修改主机备注 参数类
 * @author: codezhang
 * @date: 2018-09-18 18:12
 **/

public class ModifyUHostInstanceRemarkParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * optional 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * require UHost实例ID 参见 [DescribeUHostInstance](describe_uhost_instance.html)
     */
    @NotEmpty(message = "uhostId can not be empty")
    @UcloudParam("UHostId")
    private String uhostId;

    /**
     * optional 备注
     */
    @UcloudParam("Remark")
    private String remark;

    public ModifyUHostInstanceRemarkParam(@NotEmpty(message = "region can not be empty") String region,
                                          @NotEmpty(message = "uhostId can not be empty") String uhostId) {
        super("ModifyUHostInstanceRemark");
        this.region = region;
        this.uhostId = uhostId;
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

    public String getUhostId() {
        return uhostId;
    }

    public void setUhostId(String uhostId) {
        this.uhostId = uhostId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
