package cn.ucloud.udisk.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 创建云硬盘 结果类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 13:58
 */
public class CreateUDiskResult extends BaseResponseResult {
    /**
     * 云磁盘ID
     */
    @SerializedName("UDiskId")
    private List<String> uDiskId;

    public List<String> getuDiskId() {
        return uDiskId;
    }

    public void setuDiskId(List<String> uDiskId) {
        this.uDiskId = uDiskId;
    }

}
