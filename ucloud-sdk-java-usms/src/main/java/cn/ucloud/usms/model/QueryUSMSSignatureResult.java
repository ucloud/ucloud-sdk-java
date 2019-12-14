package cn.ucloud.usms.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @author: codezhang
 * @date: 2019/12/13 5:08 下午
 * @describe:
 **/
public class QueryUSMSSignatureResult extends BaseResponseResult {

    @SerializedName("Data")
    private OutSignature signature;

    public OutSignature getSignature() {
        return signature;
    }

    public void setSignature(OutSignature signature) {
        this.signature = signature;
    }
}
