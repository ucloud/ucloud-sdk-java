package cn.ucloud.usms.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 获取短信发送回执信息 结果类
 * 获取短信发送回执信息。下游服务提供商回执信息返回会有一定延时，建议发送完短信以后，
 * 5-10分钟后再调用该接口拉取回执信息。
 * 若超过12小时未返回，则请联系技术支持确认原因
 * @Author : codezhang
 * @Date : 2019-06-04 17:52
 **/
public class GetUSMSSendReceiptResult extends BaseResponseResult {

    /**
     * 回执信息集合
     */
    @SerializedName("Data")
    private List<ReceiptPerSession> receiptData;

    public List<ReceiptPerSession> getReceiptData() {
        return receiptData;
    }

    public void setReceiptData(List<ReceiptPerSession> receiptData) {
        this.receiptData = receiptData;
    }
}
