package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取指定UHost实例的管理VNC配置详细信息
 * @author: codezhang
 * @date: 2018-09-13 10:44
 **/

public class GetUhostInstanceVncInfoParam extends BaseRequestParam {

    /**
     * require 地域，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * optional 可用区，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * require UHost实例ID 参见 DescribeUHostInstance
     */
    @UcloudParam("UHostId")
    @NotEmpty(message = "uHostId can not be empty")
    private String uhostId;


    public GetUhostInstanceVncInfoParam(@NotEmpty(message = "region can not be empty") String region,
                                        @NotEmpty(message = "uHostId can not be empty") String uhostId) {
        this.region = region;
        this.uhostId = uhostId;
    }

    public String getUhostId() {
        return uhostId;
    }

    public void setUhostId(String uhostId) {
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


    @Override
    public String toString() {
        return "GetUhostInstanceVncInfoParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", uhostId='" + uhostId + '\'' +
                '}';
    }
}
