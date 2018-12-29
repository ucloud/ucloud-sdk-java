package cn.ucloud.ufs.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 删除文件系统 参数类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/10/8 15:19
 */
public class RemoveUFSVolumeParam extends BaseRequestParam {
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

    public RemoveUFSVolumeParam(@NotEmpty(message = "region can not be empty") String region,
                                @NotEmpty(message = "volumeId can not be empty") String volumeId) {
        super("RemoveUFSVolume");
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
