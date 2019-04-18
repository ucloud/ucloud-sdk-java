package cn.ucloud.censor.model;

import cn.ucloud.common.annotation.UcloudMethod;
import cn.ucloud.common.annotation.UcloudRestParam;
import cn.ucloud.common.http.HttpContentType;
import cn.ucloud.common.http.HttpMethod;
import cn.ucloud.common.http.ParamLocation;
import cn.ucloud.common.pojo.BaseRestRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Description :创建同步视频任务
 * @Author : codezhang
 * @Date : 2019-04-18 13:37
 **/
@UcloudMethod(method = HttpMethod.POST,
        contentType = HttpContentType.APPLICATION_JSON)
public class CreateSyncVideoTaskParam extends BaseRestRequestParam {

    /**
     * 资源ID
     */
    @NotEmpty(message = "resourceId can not be empty")
    @UcloudRestParam(name = "ResourceId",
            location = ParamLocation.HEADER,
            signature = true)
    private String resourceId;

    /**
     * 场景，可选场景： porn - 鉴黄
     */
    @NotEmpty(message = "scenes can not be empty")
    @UcloudRestParam(name = "Scenes",
            location = ParamLocation.BODY)
    private List<String> scenes;

    /**
     * 当前unix时间戳
     */
    @NotNull(message = "timestamp can not be null")
    @UcloudRestParam(name = "Timestamp",
            location = ParamLocation.HEADER,
            signature = true)
    private Long timestamp = System.currentTimeMillis();


    /**
     * 图片url
     */
    @NotEmpty(message = "url can not be null")
    @UcloudRestParam(name = "Url", location = ParamLocation.BODY, signature = true)
    private String url;

    /**
     * 抽帧间隔， 默认值25
     */
    @NotNull(message = "interval can not be null")
    @UcloudRestParam(name = "Interval", location = ParamLocation.BODY)
    private Integer interval;

    /**
     * 鉴别结果通知回调（公网域名，任务完成后向callback post鉴别结果）
     */
    @UcloudRestParam(name = "Callback", location = ParamLocation.BODY)
    private String callback;


    public CreateSyncVideoTaskParam(@NotEmpty(message = "resourceId can not be empty") String resourceId,
                                    @NotEmpty(message = "scenes can not be empty") List<String> scenes,
                                    @NotNull(message = "interval can not be null") Integer interval,
                                    @NotNull(message = "url can not be null") String url) {
        this.resourceId = resourceId;
        this.scenes = scenes;
        this.interval = interval;
        this.url = url;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public List<String> getScenes() {
        return scenes;
    }

    public void setScenes(List<String> scenes) {
        this.scenes = scenes;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
