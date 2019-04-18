package cn.ucloud.censor.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-18 10:06
 **/
public class CreateImageTaskResult extends BaseResponseResult {

    /**
     * 当前unix时间戳
     */
    @SerializedName("Timestamp")
    private Long timestamp;

    /**
     * 任务ID
     */
    @SerializedName("JobId")
    private String jobId;


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
     * 结果
     */
    @SerializedName("Result")
    private CensorResult result;

    /**
     * 状态
     */
    @SerializedName("Status")
    private String status;


    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
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

    public CensorResult getResult() {
        return result;
    }

    public void setResult(CensorResult result) {
        this.result = result;
    }
}
