package cn.ucloud.usms.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @author: codezhang
 * @date: 2019/12/13 5:50 下午
 * @describe:
 **/
public class CreateUSMSTemplateResult extends BaseResponseResult {

    /**
     * 短信模板ID（短信模板申请时的工单ID）
     */
    @SerializedName("TemplateId")
    private String templateId;

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }
}
