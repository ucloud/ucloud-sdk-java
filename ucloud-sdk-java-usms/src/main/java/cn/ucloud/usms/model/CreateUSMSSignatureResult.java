package cn.ucloud.usms.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @author: codezhang
 * @date: 2019/12/13 4:53 下午
 * @describe:
 **/
public class CreateUSMSSignatureResult extends BaseResponseResult {

    /**
     * 短信签名名称
     */
    @SerializedName("SigContent")
    private String sigContent;

    /**
     * 短信签名ID（短信签名申请时的工单ID）
     */
    @SerializedName("SigId")
    private String sigId;

    public String getSigContent() {
        return sigContent;
    }

    public void setSigContent(String sigContent) {
        this.sigContent = sigContent;
    }

    public String getSigId() {
        return sigId;
    }

    public void setSigId(String sigId) {
        this.sigId = sigId;
    }
}
