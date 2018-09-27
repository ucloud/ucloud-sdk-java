package cn.ucloud.uhost.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 导入镜像 结果对象
 * @author: codezhang
 * @date: 2018-09-18 15:30
 **/

public class ImportCustomImageResult extends BaseResponseResult {

    /**
     * 镜像ID
     */
    @SerializedName("ImageId")
    private String imageId;

    @Override
    public String toString() {
        return "ImportCustomImageResult{" +
                "imageId='" + imageId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
}
