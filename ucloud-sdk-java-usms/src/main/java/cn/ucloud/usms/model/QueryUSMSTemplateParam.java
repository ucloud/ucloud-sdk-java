package cn.ucloud.usms.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @author: codezhang
 * @date: 2019/12/13 6:03 下午
 * @describe: 查询短信模板申请状态
 **/
public class QueryUSMSTemplateParam extends BaseRequestParam {

    /**
     * 模板ID
     */
    @UcloudParam("TemplateId")
    @NotEmpty(message = "templateId can not be empty")
    private String templateId;

    public QueryUSMSTemplateParam(@NotEmpty(message = "templateId can not be empty") String templateId) {
        super("QueryUSMSTemplate");
        this.templateId = templateId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }
}
