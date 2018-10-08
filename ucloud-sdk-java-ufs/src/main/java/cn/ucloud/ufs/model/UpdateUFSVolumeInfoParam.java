package cn.ucloud.ufs.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/10/8 15:09
 */
public class UpdateUFSVolumeInfoParam extends BaseRequestParam {
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
     * optional 文件系统名称（文件系统名称／备注至少传入其中一个）
     */
    @UcloudParam("VolumeName")
    private String volumeName;

    /**
     * optional 文件系统备注（文件系统名称／备注至少传入其中一个）
     */
    @UcloudParam("Remark")
    private String remark;

    public UpdateUFSVolumeInfoParam(@NotEmpty(message = "region can not be empty") String region,
                                    @NotEmpty(message = "volumeId can not be empty") String volumeId) {
        super("UpdateUFSVolumeInfo");
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

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
