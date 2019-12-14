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
