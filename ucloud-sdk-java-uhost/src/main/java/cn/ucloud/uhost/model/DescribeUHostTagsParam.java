package cn.ucloud.uhost.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:  获取主机业务组列表参数类
 * @author: codezhang
 * @date: 2018-09-17 14:29
 **/

public class DescribeUHostTagsParam extends BaseRequestParam {
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

    public DescribeUHostTagsParam(@NotEmpty(message = "region can not be empty") String region) {
        super("DescribeUHostTags");
        this.region = region;
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
