package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 获取全球加速服务加速配置信息 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class DescribeUGAInstanceParam extends BaseRequestParam {
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UcloudParam("ProjectId")
    @NotEmpty(message = "projectId can not be empty")
    private String projectId;
    /**
     * 全球加速实例ID
     */
    @UcloudParam("UGAAId")
    private String uGAAId;


    public DescribeUGAInstanceParam(String projectId
    ) {
        super("DescribeUGAInstance");
        this.projectId = projectId;
    }


    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getUGAAId() {
        return this.uGAAId;
    }

    public void setUGAAId(String uGAAId) {
        this.uGAAId = uGAAId;
    }


}