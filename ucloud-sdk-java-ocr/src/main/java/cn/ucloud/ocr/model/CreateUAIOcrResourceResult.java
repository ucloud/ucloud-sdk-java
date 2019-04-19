package cn.ucloud.ocr.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description :创建UAI-OCR资源
 * @Author : codezhang
 * @Date : 2019-04-19 15:39
 **/
public class CreateUAIOcrResourceResult extends BaseResponseResult {


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
