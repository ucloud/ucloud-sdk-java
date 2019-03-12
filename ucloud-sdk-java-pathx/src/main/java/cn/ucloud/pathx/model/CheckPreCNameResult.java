package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : （deprecated）检查三级域名合法性和唯一性 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class CheckPreCNameResult extends BaseResponseResult {
    /**
     * 布尔值，三级域名是否可用
     */
    @SerializedName("CheckResult")
    private Boolean checkResult;


    public Boolean getCheckResult() {
        return this.checkResult;
    }

    public void setCheckResult(Boolean checkResult) {
        this.checkResult = checkResult;
    }


}