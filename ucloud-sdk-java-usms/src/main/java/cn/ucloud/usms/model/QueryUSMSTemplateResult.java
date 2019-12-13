package cn.ucloud.usms.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @author: codezhang
 * @date: 2019/12/13 6:16 下午
 * @describe:
 **/
public class QueryUSMSTemplateResult extends BaseResponseResult {

    /**
     * 短信模板明细信息，各字段说明详见OutTemplate
     */
    @SerializedName("Data")
    private OutTemplate template;

    public OutTemplate getTemplate() {
        return template;
    }

    public void setTemplate(OutTemplate template) {
        this.template = template;
    }
}
