package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 更改加速线路名字 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class ModifyUPathNameParam extends BaseRequestParam {
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UcloudParam("ProjectId")
    @NotEmpty(message = "projectId can not be empty")
    private String projectId;
    /**
     * UPath ID
     */
    @UcloudParam("UPathId")
    @NotEmpty(message = "uPathId can not be empty")
    private String uPathId;
    /**
     * 名字
     */
    @UcloudParam("Name")
    @NotEmpty(message = "name can not be empty")
    private String name;


    public ModifyUPathNameParam(String projectId
            , String uPathId
            , String name
    ) {
        super("ModifyUPathName");
        this.projectId = projectId;
        this.uPathId = uPathId;
        this.name = name;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}