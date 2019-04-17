package cn.ucloud.censor.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description :  创建UAI安全审查资源
 * @Author : codezhang
 * @Date : 2019-04-17 14:02
 **/
public class CreateUAICensorResourceResult extends BaseResponseResult {
    /**
     * 创建的资源ID
     */
    @SerializedName("ResourceId")
    private String resourceId;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
