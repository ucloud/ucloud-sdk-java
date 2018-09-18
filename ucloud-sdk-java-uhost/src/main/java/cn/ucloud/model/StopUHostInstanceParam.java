package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 关闭主机实例参数类
 * @author: codezhang
 * @date: 2018-09-17 13:41
 **/

public class StopUHostInstanceParam extends BaseRequestParam {

    /**
     * require 地域，https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * optional 可用区，https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @UcloudParam("Zone")
    private String zone;
    /**
     * require UHost实例ID 参见 DescribeUHostInstance
     */
    @UcloudParam("UHostId")
    @NotEmpty(message = "uhostId can not be empty")
    private String uhostId;

    public StopUHostInstanceParam(@NotEmpty(message = "region can not be empty") String region,
                                  @NotEmpty(message = "uhostId can not be empty") String uhostId) {
        super("StopUHostInstance");
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


}
