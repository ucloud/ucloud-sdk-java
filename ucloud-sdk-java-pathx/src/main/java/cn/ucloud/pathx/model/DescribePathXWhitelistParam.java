package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 获取入口白名单列表 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class DescribePathXWhitelistParam extends BaseRequestParam {
    /**
     * 项目ID,如org-xxxx。请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UcloudParam("ProjectId")
    @NotEmpty(message = "projectId can not be empty")
    private String projectId;
    /**
     * 实例ID, 不填返回项目下全部实例配置的白名单规则
     */
    @UcloudParam("InstanceId")
    private String instanceId;


    public DescribePathXWhitelistParam(String projectId
    ) {
        super("DescribePathXWhitelist");
        this.projectId = projectId;
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