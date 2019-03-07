package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 查询UPath的监控模板 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class DescribeUPathTemplateParam extends BaseRequestParam {
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UcloudParam("ProjectId")
    @NotEmpty(message = "projectId can not be empty")
    private String projectId;
    /**
     * 加速线路ID
     */
    @UcloudParam("UPathId")
    @NotEmpty(message = "uPathId can not be empty")
    private String uPathId;


    public DescribeUPathTemplateParam(String projectId
            , String uPathId
    ) {
        super("DescribeUPathTemplate");
        this.projectId = projectId;
        this.uPathId = uPathId;
    }


    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getUPathId() {
        return this.uPathId;
    }

    public void setUPathId(String uPathId) {
        this.uPathId = uPathId;
    }


}