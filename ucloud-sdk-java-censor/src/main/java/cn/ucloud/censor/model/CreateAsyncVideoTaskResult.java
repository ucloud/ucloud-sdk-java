package cn.ucloud.censor.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 创建异步视频任务
 * @Author : codezhang
 * @Date : 2019-04-18 14:36
 **/
public class CreateAsyncVideoTaskResult extends BaseResponseResult {

    /**
     * 当前unix时间戳
     */
    @SerializedName("Timestamp")
    private Long timestamp;

    /**
     * 任务ID，用于接收、查询结果
     */
    @SerializedName("JobId")
    private String jobId;

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
}
