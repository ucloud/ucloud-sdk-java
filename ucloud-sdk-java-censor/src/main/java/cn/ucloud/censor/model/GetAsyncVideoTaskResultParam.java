package cn.ucloud.censor.model;

import cn.ucloud.common.annotation.UcloudMethod;
import cn.ucloud.common.annotation.UcloudRestParam;
import cn.ucloud.common.http.HttpMethod;
import cn.ucloud.common.http.ParamLocation;
import cn.ucloud.common.pojo.BaseRestRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description :查询异步视频任务执行结果
 * @Author : codezhang
 * @Date : 2019-04-18 14:53
 **/
@UcloudMethod(method = HttpMethod.GET)
public class GetAsyncVideoTaskResultParam extends BaseRestRequestParam {
    /**
     * 资源ID
     */
    @NotEmpty(message = "resourceId can not be empty")
    @UcloudRestParam(name = "ResourceId",
            location = ParamLocation.HEADER,
            signature = true)
    private String resourceId;

    /**
     * 当前unix时间戳
     */
    @NotNull(message = "timestamp can not be null")
    @UcloudRestParam(name = "Timestamp",
            location = ParamLocation.HEADER,
            signature = true)
    private Long timestamp = System.currentTimeMillis();


    /**
     * 任务ID
     */
    @NotEmpty(message = "jobId can not be empty")
    @UcloudRestParam(name = "JobId", location = ParamLocation.URL,signature = true)
    private String jobId;

    public GetAsyncVideoTaskResultParam(@NotEmpty(message = "resourceId can not be empty") String resourceId,
                                        @NotEmpty(message = "jobId can not be empty") String jobId) {
        this.resourceId = resourceId;
        this.jobId = jobId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

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
