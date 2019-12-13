package cn.ucloud.usms.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;


/**
 * @author: codezhang
 * @date: 2019/12/13 5:02 下午
 * @describe: 查询短信签名申请状态
 **/
public class QueryUSMSSignatureParam extends BaseRequestParam {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UcloudParam("ProjectId")
    private String projectId;

    /**
     * 已申请的短信签名ID（短信签名申请时的工单ID）；
     * 签名ID和签名至少需填写1项；
     */
    @UcloudParam("SigId")
    private String sigId;

    /**
     * 签名内容；签名ID和签名至少需填写1项；
     */
    @UcloudParam("SigContent")
    private String sigContent;

    public QueryUSMSSignatureParam() {
        super("QueryUSMSSignature");
    }

    @Override
    public String getProjectId() {
        return projectId;
    }

    @Override
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getSigId() {
        return sigId;
    }

    public void setSigId(String sigId) {
        this.sigId = sigId;
    }

    public String getSigContent() {
        return sigContent;
    }

    public void setSigContent(String sigContent) {
        this.sigContent = sigContent;
    }
}
