package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 添加加速配置端口 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class AddUGATaskParam extends BaseRequestParam {
    /**
     * 项目ID。请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UcloudParam("ProjectId")
    @NotEmpty(message = "projectId can not be empty")
    private String projectId;
    /**
     * 全球加速实例ID
     */
    @UcloudParam("UGAId")
    @NotEmpty(message = "uGAId can not be empty")
    private String uGAId;
    // TODO 需要人工接入 AddUGATask =》 TCP.n
    // TODO 需要人工接入 AddUGATask =》 UDP.n
    // TODO 需要人工接入 AddUGATask =》 HTTP.n
    // TODO 需要人工接入 AddUGATask =》 HTTPS.n


    public AddUGATaskParam(String projectId
            , String uGAId
    ) {
        super("AddUGATask");
        this.projectId = projectId;
        this.uGAId = uGAId;
    }


    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getUGAId() {
        return this.uGAId;
    }

    public void setUGAId(String uGAId) {
        this.uGAId = uGAId;
    }


}