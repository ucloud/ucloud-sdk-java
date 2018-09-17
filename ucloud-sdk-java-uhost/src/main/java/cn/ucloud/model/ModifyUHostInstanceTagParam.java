package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 修改主机业务组 参数类
 * @author: codezhang
 * @date: 2018-09-17 18:27
 **/

public class ModifyUHostInstanceTagParam extends BaseRequestParam {

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
     * require UHost实例ID 参见 [DescribeUHostInstance](describe_uhost_instance.html)
     */
    @UcloudParam("UHostId")
    @NotEmpty(message = "uhostId can not be empty")
    private String uhostId;


    /**
     * optional 业务组名称
     */
    @UcloudParam("Tag")
    private String tag;

    public ModifyUHostInstanceTagParam(@NotEmpty(message = "region can not be empty") String region,
                                       @NotEmpty(message = "uhostId can not be empty") String uhostId) {
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
