package cn.ucloud.usms.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author: codezhang
 * @date: 2019/12/13 5:44 下午
 * @describe: 申请短信模板
 **/
public class CreateUSMSTemplateParam extends BaseRequestParam {

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
     * 短信模板用途类型：
     * 1-验证码类短信模板；
     * 2-系统通知类短信模板；
     * 3-会员推广类短信模板；
     */
    @NotNull(message = "purpose can not be null")
    @UcloudParam("Purpose")
    private Integer purpose;

    /**
     * 短信模板名称，不超过32个字符，每个中文、符号、英文、数字等都计为1个字。
     */
    @NotEmpty(message = "templateName can not be empty")
    @UcloudParam("TemplateName")
    private String templateName;

    /**
     * 短信模板内容，说明如下：字数不超过500，每个中文、符号、英文、数组等都计为一个字；
     * 模板中的变量填写格式：{N}，其中N为大于1的整数，有多个参数时，建议N从1开始顺次，
     * 例如：{1}、{2}等；短信模板禁止仅包括变量的情况；
     */
    @NotEmpty(message = "template can not be empty")
    @UcloudParam("Template")
    private String template;

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

    public CreateUSMSTemplateParam(@NotNull(message = "purpose can not be null") Integer purpose,
                                   @NotEmpty(message = "templateName can not be empty") String templateName,
                                   @NotEmpty(message = "template can not be empty") String template) {
        super("CreateUSMSTemplate");
        this.purpose = purpose;
        this.templateName = templateName;
        this.template = template;
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

    public Integer getPurpose() {
        return purpose;
    }

    public void setPurpose(Integer purpose) {
        this.purpose = purpose;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
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
