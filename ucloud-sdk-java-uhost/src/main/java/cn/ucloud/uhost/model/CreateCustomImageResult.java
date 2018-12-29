package cn.ucloud.uhost.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 创建用户镜像
 * @author: codezhang
 * @date: 2018-09-18 18:28
 **/

public class CreateCustomImageResult extends BaseResponseResult {

    /**
     * 镜像编号
     */
    @SerializedName("ImageId")
    private String imageId;

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @Override
    public String toString() {
        return "CreateCustomImageResult{" +
                "imageId='" + imageId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
