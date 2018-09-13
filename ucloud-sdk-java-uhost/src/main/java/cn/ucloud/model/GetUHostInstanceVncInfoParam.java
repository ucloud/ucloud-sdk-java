package cn.ucloud.model;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取指定UHost实例的管理VNC配置详细信息
 * @author: codezhang
 * @date: 2018-09-13 10:44
 **/

public class GetUHostInstanceVncInfoParam {

    // require 地域，参见https://docs.ucloud.cn/api/summary/regionlist.html
    @NotEmpty(message = "region can not be empty")
    private String region;

    // optional 可用区，参见https://docs.ucloud.cn/api/summary/regionlist.html
    private String zone;

    // require UHost实例ID 参见 DescribeUHostInstance
    @NotEmpty(message = "uHostId can not be empty")
    private String uHostId;

    // optional 项目编号（子帐号用） 请参考GetProjectList接口
    private String projectId;

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

    public String getuHostId() {
        return uHostId;
    }

    public void setuHostId(String uHostId) {
        this.uHostId = uHostId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}
