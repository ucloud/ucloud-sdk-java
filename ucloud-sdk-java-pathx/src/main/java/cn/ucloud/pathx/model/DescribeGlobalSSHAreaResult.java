package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取GlobalSSH覆盖的地区列表 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class DescribeGlobalSSHAreaResult extends BaseResponseResult {
    /**
     * 支持GlobalSSH的地区
     */
    @SerializedName("AreaSet")
    private List<GlobalSSHArea> areaSet;
    /**
     * 提示信息
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