package cn.ucloud.ufs.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 初始化文件系统白名单 结果类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/10/8 14:55
 */
public class InitUFSVolumeWhiteListResult extends BaseResponseResult {
    /**
     * 挂载点信息
     */
    @SerializedName("MountPoint")
    private String mountPoint;

    public String getMountPoint() {
        return mountPoint;
    }

    public void setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
    }
}
