package cn.ucloud.censor.model;

import com.google.gson.annotations.SerializedName;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-18 15:04
 **/
public class FrameInfo {

    /**
     * 图像帧号， 视频第一帧图像帧号为0
     */
    @SerializedName("FrameId")
    private Integer frameId;

    /**
     * 得分， 范围[0, 1]， 分数越高，置信度越高
     */
    @SerializedName("Score")
    private Float score;

    public Integer getFrameId() {
        return frameId;
    }

    public void setFrameId(Integer frameId) {
        this.frameId = frameId;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }
}
