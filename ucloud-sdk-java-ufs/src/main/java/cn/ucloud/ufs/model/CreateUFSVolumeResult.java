package cn.ucloud.ufs.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 创建文件系统 结果类
 * @author: codezhang
 * @date: 2018-10-08 16:07
 **/

public class CreateUFSVolumeResult extends BaseResponseResult {

    /**
     * 文件系统名称
     */
    @SerializedName("VolumeName")
    private String volumeName;

    /**
     * 文件系统ID
     */
    @SerializedName("VolumeId")
    private String volumeId;

    /**
     * 文件系统挂载点状态
     */
    @SerializedName("VolumeStatus")
    private String volumeStatus;


    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public String getVolumeStatus() {
        return volumeStatus;
    }

    public void setVolumeStatus(String volumeStatus) {
        this.volumeStatus = volumeStatus;
    }

    @Override
    public String toString() {
        return "CreateUFSVolumeResult{" +
                "volumeName='" + volumeName + '\'' +
                ", volumeId='" + volumeId + '\'' +
                ", volumeStatus='" + volumeStatus + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
