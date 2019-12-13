package cn.ucloud.usms.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.exception.ValidatorException;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: codezhang
 * @date: 2019/12/13 6:20 下午
 * @describe: 删除短信模板
 **/
public class DeleteUSMSTemplateParam extends BaseRequestParam {


    /**
     * 模板ID（也即短信模板申请时的工单ID），支持以数组的方式，
     * 举例，以TemplateIds.0、TemplateIds.1...TemplateIds.N方式传入
     */
    private List<String> templateIds;

    @UcloudParam("TemplateIds")
    public List<Param> checkSigIds() throws ValidatorException {
        List<Param> params = new ArrayList<>();
        if (templateIds == null || templateIds.isEmpty()) {
            throw new ValidatorException("templateIds can not be empty");
        }
        int size = templateIds.size();
        String templateIdFormat = "TemplateIds.%d";
        for (int i = 0; i < size; i++) {
            String templateId = templateIds.get(i);
            if (templateId == null || templateId.isEmpty()) {
                throw new ValidatorException(String.format("templateIds[%d] can not be empty", i));
            }
            params.add(new Param(String.format(templateIdFormat, i), templateId));
        }
        return params;
    }

    public DeleteUSMSTemplateParam(List<String> templateIds) {
        super("DeleteUSMSTemplate");
        this.templateIds = templateIds;
    }

    public List<String> getTemplateIds() {
        return templateIds;
    }

    public void setTemplateIds(List<String> templateIds) {
        this.templateIds = templateIds;
    }
}
