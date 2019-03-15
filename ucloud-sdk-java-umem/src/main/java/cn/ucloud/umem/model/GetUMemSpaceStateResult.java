package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 获取空间状态 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class GetUMemSpaceStateResult extends BaseResponseResult {
    /**
     * Starting:创建中 Running:运行中 Fail:失败
     */
    @SerializedName("State")
    private String state;


    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }


}