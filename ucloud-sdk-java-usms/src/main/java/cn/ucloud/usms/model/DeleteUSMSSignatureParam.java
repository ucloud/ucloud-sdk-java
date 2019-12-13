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
 * @date: 2019/12/13 5:11 下午
 * @describe: 删除短信签名
 **/
public class DeleteUSMSSignatureParam extends BaseRequestParam {

    /**
     * 签名ID（也即短信签名申请时的工单ID），支持以数组的方式
     */
    private List<String> sigIds;


    @UcloudParam("SigIds")
    public List<Param> checkSigIds() throws ValidatorException {
        List<Param> params = new ArrayList<>();
        if (sigIds == null || sigIds.isEmpty()) {
            throw new ValidatorException("sigIds can not be empty");
        }
        int size = sigIds.size();
        String sigIdFormat = "SigIds.%d";
        for (int i = 0; i < size; i++) {
            String sigId = sigIds.get(i);
            if (sigId == null || sigId.isEmpty()) {
                throw new ValidatorException(String.format("sigIds[%d] can not be empty", i));
            }
            params.add(new Param(String.format(sigIdFormat, i), sigId));
        }
        return params;
    }

    public DeleteUSMSSignatureParam(List<String> sigIds) {
        super("DeleteUSMSSignature");
        this.sigIds = sigIds;
    }

    public List<String> getSigIds() {
        return sigIds;
    }

    public void setSigIds(List<String> sigIds) {
        this.sigIds = sigIds;
    }
}
