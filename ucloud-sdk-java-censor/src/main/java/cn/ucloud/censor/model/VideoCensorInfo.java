package cn.ucloud.censor.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-18 15:06
 **/
public class VideoCensorInfo {

    /**
     * 涉黄/涉恐/涉政的帧信息
     */
    @SerializedName("Frames")
    private List<FrameInfo> frameInfos;

    /**
     * 	结果建议，pass - 放行， forbid - 封禁， check - 人工审核
     */
    @SerializedName("Suggestion")
    private String suggestion;

    public List<FrameInfo> getFrameInfos() {
        return frameInfos;
    }

    public void setFrameInfos(List<FrameInfo> frameInfos) {
        this.frameInfos = frameInfos;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
}
