package cn.ucloud.uhost.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 删除用户镜像 结果类
 * @author: codezhang
 * @date: 2018-09-18 16:53
 **/

public class TerminateCustomImageResult extends BaseResponseResult {

    /**
     * 自制镜像Id
     */@SerializedName("ImageId")
    private String imageId;

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @Override
    public String toString() {
        return "TerminateCustomImageResult{" +
                "imageId='" + imageId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
