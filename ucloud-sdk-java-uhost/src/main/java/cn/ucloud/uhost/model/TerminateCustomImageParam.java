package cn.ucloud.uhost.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 删除用户镜像
 * @author: codezhang
 * @date: 2018-09-18 16:49
 **/

public class TerminateCustomImageParam extends BaseRequestParam {

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
     * require 自制镜像ID 参见 [DescribeImage](describe_image.html)
     */
    @NotEmpty(message = "imageId can not be empty")
    @UcloudParam("ImageId")
    private String imageId;

    public TerminateCustomImageParam(@NotEmpty(message = "region can not be empty") String region,
                                     @NotEmpty(message = "imageId can not be empty") String imageId) {
        super("TerminateCustomImage");
        this.region = region;
        this.imageId = imageId;
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

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
}
