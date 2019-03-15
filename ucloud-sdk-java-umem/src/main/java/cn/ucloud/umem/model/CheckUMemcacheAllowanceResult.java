package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 检查UMemcache剩余资源 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CheckUMemcacheAllowanceResult extends BaseResponseResult {
    /**
     * 可创建的数量
     */
    @SerializedName("Count")
    private Integer count;


    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


}