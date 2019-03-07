package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 获取苹果加速通道信息 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class DescribeCommonUGAInstanceParam extends BaseRequestParam {
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UcloudParam("ProjectId")
    @NotEmpty(message = "projectId can not be empty")
    private String projectId;
    /**
     * AppStore: 苹果审核加速, GlobalSSH: 全球运维通道
     */
    @UcloudParam("UGAType")
    @NotEmpty(message = "uGAType can not be empty")
    private String uGAType;
    /**
     * 全球加速实例ID
     */
    @UcloudParam("UGAId")
    private String uGAId;


    public DescribeCommonUGAInstanceParam(String projectId
            , String uGAType
    ) {
        super("DescribeCommonUGAInstance");
        this.projectId = projectId;
        this.uGAType = uGAType;
    }


    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getUGAType() {
        return this.uGAType;
    }

    public void setUGAType(String uGAType) {
        this.uGAType = uGAType;
    }

    public String getUGAId() {
        return this.uGAId;
    }

    public void setUGAId(String uGAId) {
        this.uGAId = uGAId;
    }


}