package cn.ucloud.usms.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @author: codezhang
 * @date: 2019/12/13 6:30 下午
 * @describe: 修改未通过审核的短信模板，并重新提交审核
 **/
public class UpdateUSMSTemplateParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * 短信模板ID
     */
    @NotEmpty(message = "templateId can not be empty")
    @UcloudParam("TemplateId")
    private String templateId;

    /**
     * 新的模板内容。模板名称和模板内容必须提供一个，否则会报错。小于等于600个字
     */
    @NotEmpty(message = "template can not be empty")
    @UcloudParam("Template")
    private String template;

    /**
     * 新的模板名称。小于等于32个字，每个中文、英文、数组、符合都计为一个字
     */
    @NotEmpty(message = "templateName can not be empty")
    @UcloudParam("TemplateName")
    private String templateName;

    /**
     * 短信模板申请原因说明，字数不超过128，每个中文、符号、英文、数字等都计为1个字。
     */
    @UcloudParam("Remark")
    private String remark;

    /**
     * 当Purpose为3时，也即会员推广类短信模板，该项必填。
     * 枚举值：
     * TD退订、回T退订、
     * 回N退订、回TD退订、
     * 退订回T、退订回D、
     * 退订回TD、退订回复T、
     * 退订回复D、退订回复N、
     * 退订回复TD、拒收回T
     */
    @UcloudParam("UnsubscribeInfo")
    private String unsubscribeInfo;

    public UpdateUSMSTemplateParam(@NotEmpty(message = "templateId can not be empty") String templateId,
                                   @NotEmpty(message = "template can not be empty") String template,
                                   @NotEmpty(message = "templateName can not be empty") String templateName) {
        super("UpdateUSMSTemplate");
        this.templateId = templateId;
        this.template = template;
        this.templateName = templateName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUnsubscribeInfo() {
        return unsubscribeInfo;
    }

    public void setUnsubscribeInfo(String unsubscribeInfo) {
        this.unsubscribeInfo = unsubscribeInfo;
    }
}
