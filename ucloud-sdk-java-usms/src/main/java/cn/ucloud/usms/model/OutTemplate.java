package cn.ucloud.usms.model;

import com.google.gson.annotations.SerializedName;

/**
 * @author: codezhang
 * @date: 2019/12/13 6:05 下午
 * @describe: 短信模板
 **/
public class OutTemplate {

    /**
     * 短信模板ID
     */
    @SerializedName("TemplateId")
    private String templateId;

    /**
     * 模板类型，选项：
     * 1-验证码类
     * 2-通知类
     * 3-会员推广类
     */
    @SerializedName("Purpose")
    private Integer purpose;

    /**
     * 短信模板名称
     */
    @SerializedName("TemplateName")
    private String templateName;

    /**
     * 短信模板内容
     */
    @SerializedName("Template")
    private String template;

    /**
     * 退订信息
     */
    @SerializedName("UnsubscribeInfo")
    private String unsubscribeInfo;

    /**
     * 短信模板状态；状态说明：
     * 0-待审核，
     * 1-审核中，
     * 2-审核通过，
     * 3-审核未通过，
     * 4-被禁用
     */
    @SerializedName("Status")
    private Integer status;

    /**
     * 模板说明
     */
    @SerializedName("Remark")
    private String remark;

    /**
     * 审核失败原因
     */
    @SerializedName("ErrDesc")
    private String errDesc;

    /**
     * 创建时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
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

    public String getUnsubscribeInfo() {
        return unsubscribeInfo;
    }

    public void setUnsubscribeInfo(String unsubscribeInfo) {
        this.unsubscribeInfo = unsubscribeInfo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getErrDesc() {
        return errDesc;
    }

    public void setErrDesc(String errDesc) {
        this.errDesc = errDesc;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
}
