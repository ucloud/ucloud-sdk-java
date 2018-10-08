package cn.ucloud.ufs.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: 文件系统扩容价格 参数类
 * @author: codezhang
 * @date: 2018-10-08 16:33
 **/

public class DescribeUFSVolumeUpgradePriceParam extends BaseRequestParam {

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

    /**
     * require 文件系统大小，大小1024G ~ 25600G (1T ~ 25T)，必须为1024的整数倍。
     */
    @NotNull(message = "size can not be null")
    @UcloudParam("Size")
    private Integer size;

    public DescribeUFSVolumeUpgradePriceParam(@NotEmpty(message = "region can not be empty") String region,
                                              @NotEmpty(message = "volumeId can not be empty") String volumeId,
                                              @NotEmpty(message = "size can not be null") Integer size) {
        super("DescribeUFSVolumeUpgradePrice");
        this.region = region;
        this.volumeId = volumeId;
        this.size = size;
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

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
