package cn.ucloud.ufs.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/10/8 15:09
 */
public class ExtendUFSVolumeParam extends BaseRequestParam {
    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * require 文件系统ID
     */
    @UcloudParam("VolumeId")
    @NotEmpty(message = "volumeId can not be empty")
    private String volumeId;

    /**
     * require 文件系统大小，大小1024G ~ 25600G (1T ~ 25T)，必须为1024的整数倍。
     */
    @UcloudParam("Size")
    @NotNull(message = "size can not be null")
    private Integer size;


    public ExtendUFSVolumeParam(@NotEmpty(message = "region can not be empty") String region,
                                @NotEmpty(message = "volumeId can not be empty") String volumeId,
                                @NotNull(message = "size can not be null") Integer size) {
        super("ExtendUFSVolume");
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
