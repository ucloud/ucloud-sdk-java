package cn.ucloud.usms.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 每个提交的回执结果集合
 * @Author : codezhang
 * @Date : 2019-06-04 17:50
 **/
public class ReceiptPerSession {

    /**
     * 发送短信时返回的SessionNo
     */
    @SerializedName("SessionNo")
    private String sessionNo;

    /**
     * 每个手机号的短信回执信息集合
     */
    @SerializedName("ReceiptSet")
    private List<ReceiptPerPhone> receiptSet;

    public String getSessionNo() {
        return sessionNo;
    }

    public void setSessionNo(String sessionNo) {
        this.sessionNo = sessionNo;
    }

    public List<ReceiptPerPhone> getReceiptSet() {
        return receiptSet;
    }

    public void setReceiptSet(List<ReceiptPerPhone> receiptSet) {
        this.receiptSet = receiptSet;
    }
}
