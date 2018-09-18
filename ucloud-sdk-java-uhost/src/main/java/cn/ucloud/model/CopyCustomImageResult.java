package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: 复制用户镜像 结果对象
 * @author: codezhang
 * @date: 2018-09-18 15:59
 **/

public class CopyCustomImageResult extends BaseResponseResult {
    /**
     * 目标镜像Id
     */
    @UcloudParam("TargetImageId")
    private String targetImageId;

    @Override
    public String toString() {
        return "CopyCustomImageResult{" +
                "targetImageId='" + targetImageId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public String getTargetImageId() {
        return targetImageId;
    }

    public void setTargetImageId(String targetImageId) {
        this.targetImageId = targetImageId;
    }
}
