package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 13:58
 */
public class CreateUDiskResult extends BaseResponseResult {
    @SerializedName("UDiskId")
    private List<String> uDiskId;

    public List<String> getuDiskId() {
        return uDiskId;
    }

    public void setuDiskId(List<String> uDiskId) {
        this.uDiskId = uDiskId;
    }

}
