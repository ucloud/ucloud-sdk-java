package cn.ucloud.ufs.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取文件系统白名单 参数类
 * @author: codezhang
 * @date: 2018-10-08 16:56
 **/

public class DescribeUFSVolumeWhiteListParam extends BaseRequestParam {


    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 文件系统ID
     */
    @NotEmpty(message = "volumeId can not be empty")
    @UcloudParam("VolumeId")
    private String volumeId;

    public DescribeUFSVolumeWhiteListParam( @NotEmpty(message = "region can not be empty") String region,
                                           @NotEmpty(message = "volumeId can not be empty") String volumeId) {
        super("DescribeUFSVolumeWhiteList");
        this.region = region;
        this.volumeId = volumeId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
}
