package cn.ucloud.censor.model;

import com.google.gson.annotations.SerializedName;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-18 10:07
 **/
public class ImageResultInfo {
    /**
     * 得分，范围[0, 1], 得分越高，置信度越高
     */
    @SerializedName("Score")
    private Float score;

    /**
     * 建议， pass-放行， forbid-封禁， check-人工审核
     */
    @SerializedName("Suggestion")
    private String suggestion;

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
}
