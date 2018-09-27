package cn.ucloud.udisk.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 18:46
 */
public class CloneUDiskSnapshotResult extends BaseResponseResult {
    @SerializedName("UDiskId")
    private List<String> uDiskId;

    public List<String> getuDiskId() {
        return uDiskId;
    }

    public void setuDiskId(List<String> uDiskId) {
        this.uDiskId = uDiskId;
    }
}
