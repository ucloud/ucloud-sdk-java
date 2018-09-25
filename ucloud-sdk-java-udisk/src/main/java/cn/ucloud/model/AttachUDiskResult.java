package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 13:58
 */
public class AttachUDiskResult extends BaseResponseResult {
    @SerializedName("UHostId")
    private String uHostId;

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

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
