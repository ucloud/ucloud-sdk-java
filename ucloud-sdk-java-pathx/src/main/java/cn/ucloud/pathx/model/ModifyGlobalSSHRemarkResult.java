package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 修改GlobalSSH备注 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class ModifyGlobalSSHRemarkResult extends BaseResponseResult {
    /**
     * 接口返回消息
     */
    @SerializedName("Message")
    private String message;


    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}