package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 解绑PathX SSL 证书 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class UnBindPathXSSLParam extends BaseRequestParam {
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UcloudParam("ProjectId")
    private String projectId;
    /**
     * UGA实例ID。
     */
    @UcloudParam("UGAId")
    @NotEmpty(message = "uGAId can not be empty")
    private String uGAId;
    /**
     * SSL证书ID。
     */
    @UcloudParam("SSLId")
    @NotEmpty(message = "sSLId can not be empty")
    private String sSLId;
    // TODO 需要人工接入 UnBindPathXSSL =》 Port.n


    public UnBindPathXSSLParam(String uGAId
            , String sSLId
    ) {
        super("UnBindPathXSSL");
        this.uGAId = uGAId;
        this.sSLId = sSLId;
        // TODO 需要人工接入 UnBindPathXSSL =》 Port.n is required
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

    public String getSSLId() {
        return this.sSLId;
    }

    public void setSSLId(String sSLId) {
        this.sSLId = sSLId;
    }


}