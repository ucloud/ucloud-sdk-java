package cn.ucloud.censor.model;

import cn.ucloud.common.annotation.UcloudMethod;
import cn.ucloud.common.annotation.UcloudRestParam;
import cn.ucloud.common.http.HttpContentType;
import cn.ucloud.common.http.HttpMethod;
import cn.ucloud.common.http.ParamLocation;
import cn.ucloud.common.pojo.BaseRestRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.File;
import java.util.List;

/**
 * @Description :创建图片审查任务
 * @Author : codezhang
 * @Date : 2019-04-18 09:31
 **/
@UcloudMethod(method = HttpMethod.POST,
        contentType = HttpContentType.MULTIPART_FORM_DATA)
public class CreateImageTaskParam extends BaseRestRequestParam {

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
     * 场景，可选场景： porn - 鉴黄
     */
    @NotEmpty(message = "scenes can not be empty")
    @UcloudRestParam(name = "Scenes",
            location = ParamLocation.BODY)
    private List<String> scenes;

    /**
     * 请求方式，可选方式：
     * url - 传入图片url, file - 传入图片二进制
     */
    @NotEmpty(message = "method can not be empty")
    @UcloudRestParam(name = "Method", location = ParamLocation.BODY)
    private String method;

    /**
     * 图片url
     */
    @UcloudRestParam(name = "Url", location = ParamLocation.BODY, signature = true)
    private String url;

    /**
     * 图片文件
     */
    @UcloudRestParam(name = "Image", location = ParamLocation.BODY)
    private File image;

    public CreateImageTaskParam(@NotEmpty(message = "resourceId can not be empty") String resourceId,
                                @NotEmpty(message = "scenes can not be empty") List<String> scenes,
                                @NotEmpty(message = "method can not be empty") String method) {
        this.resourceId = resourceId;
        this.scenes = scenes;
        this.method = method;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
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

    public List<String> getScenes() {
        return scenes;
    }

    public void setScenes(List<String> scenes) {
        this.scenes = scenes;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
