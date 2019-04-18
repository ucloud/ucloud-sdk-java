package cn.ucloud.censor.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 创建异步视频任务
 * @Author : codezhang
 * @Date : 2019-04-18 14:36
 **/
public class CreateSyncVideoTaskResult extends BaseResponseResult {

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
     * 当前unix时间戳
     */
    @SerializedName("Timestamp")
    private Long timestamp;

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
     * 鉴别结果
     */
    @SerializedName("Result")
    private VideoCensorResult result;

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
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

    public VideoCensorResult getResult() {
        return result;
    }

    public void setResult(VideoCensorResult result) {
        this.result = result;
    }
}
