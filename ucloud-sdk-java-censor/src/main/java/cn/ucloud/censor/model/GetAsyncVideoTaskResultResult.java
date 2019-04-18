package cn.ucloud.censor.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description :查询异步视频任务执行结果
 * @Author : codezhang
 * @Date : 2019-04-18 14:56
 **/
public class GetAsyncVideoTaskResultResult extends BaseResponseResult {

    /**
     * 任务执行状态：
     * Unknown-未知,
     * Waiting-等待中,
     * Running-执行中,
     * Success-成功, Fail-失败, Abort-中止
     */
    @SerializedName("Status")
    private String status;

    /**
     * 视频源地址
     */
    @SerializedName("Url")
    private String url;

    /**
     * 任务开始时间unix时间戳
     */
    @SerializedName("StartTime")
    private Long startTime;

    /**
     * 任务结束时间unix时间戳
     */
    @SerializedName("EndTime")
    private Long endTime;

    /**
     * 鉴别结果保存失效时间unix时间戳
     */
    @SerializedName("ExpiredTime")
    private Long expiredTime;

    /**
     * 当前unix时间戳
     */
    @SerializedName("Timestamp")
    private Long timestamp;


    /**
     * 鉴别结果
     */
    @SerializedName("Result")
    private VideoCensorResult result;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public VideoCensorResult getResult() {
        return result;
    }

    public void setResult(VideoCensorResult result) {
        this.result = result;
    }
}
