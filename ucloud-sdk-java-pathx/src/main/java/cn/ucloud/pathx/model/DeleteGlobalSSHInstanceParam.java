package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 删除GlobalSSH实例 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class DeleteGlobalSSHInstanceParam extends BaseRequestParam {
    /**
     * 项目ID,如org-xxxx。请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UcloudParam("ProjectId")
    @NotEmpty(message = "projectId can not be empty")
    private String projectId;
    /**
     * 实例Id,资源的唯一标识
     */
    @UcloudParam("InstanceId")
    @NotEmpty(message = "instanceId can not be empty")
    private String instanceId;


    public DeleteGlobalSSHInstanceParam(String projectId
            , String instanceId
    ) {
        super("DeleteGlobalSSHInstance");
        this.projectId = projectId;
        this.instanceId = instanceId;
    }


    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


}