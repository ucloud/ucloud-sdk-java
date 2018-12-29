package cn.ucloud.uhost.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:  创建自制镜像
 * 从指定UHost实例，生成自定义镜像。
 * @author: codezhang
 * @date: 2018-09-18 18:23
 **/

public class CreateCustomImageParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * optional 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("zone")
    private String zone;

    /**
     * require UHost实例ID 参见 [DescribeUHostInstance](describe_uhost_instance.html)
     */
    @NotEmpty(message = "uhostId can not be empty")
    @UcloudParam("UHostId")
    private String uhostId;

    /**
     * require 镜像名称
     */
    @UcloudParam("ImageName")
    @NotEmpty(message = "imageName can not be empty")
    private String imageName;

    /**
     * optional 镜像描述
     */
    @UcloudParam("ImageDescription")
    private String imageDescription;

    public CreateCustomImageParam( @NotEmpty(message = "region can not be empty") String region,
                                   @NotEmpty(message = "uhostId can not be empty") String uhostId,
                                   @NotEmpty(message = "imageName can not be empty") String imageName) {
        super("CreateCustomImage");
        this.region = region;
        this.uhostId = uhostId;
        this.imageName = imageName;
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

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }
}
