package cn.ucloud.udisk.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 卸载云硬盘 结果类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 13:58
 */
public class DetachUDiskResult extends BaseResponseResult {
    /**
     * 主机ID
     */
    @SerializedName("UHostId")
    private String uHostId;

    /**
     * 云磁盘ID
     */
    @SerializedName("UDiskId")
    private String uDiskId;

    public String getuHostId() {
        return uHostId;
    }

    public void setuHostId(String uHostId) {
        this.uHostId = uHostId;
    }

    public String getuDiskId() {
        return uDiskId;
    }

    public void setuDiskId(String uDiskId) {
        this.uDiskId = uDiskId;
    }

}
