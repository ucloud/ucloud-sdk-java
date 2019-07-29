package cn.ucloud.usms.model;

import com.google.gson.annotations.SerializedName;

/**
 * @Description : 每个目的手机号的发送回执信息
 * @Author : codezhang
 * @Date : 2019-06-04 17:45
 **/
public class ReceiptPerPhone {

    /**
     * 手机号码
     */
    @SerializedName("Phone")
    private String phone;

    /**
     * 消耗短信条数
     */
    @SerializedName("CostCount")
    private Integer costCount;

    /**
     * 回执结果
     */
    @SerializedName("ReceiptResult")
    private String receiptResult;

    /**
     * 回执结果描述
     */
    @SerializedName("ReceiptDesc")
    private String receiptDesc;

    /**
     * 回执返回时间
     */
    @SerializedName("ReceiptTime")
    private Integer receiptTime;

    /**
     * 回执代码
     */
    @SerializedName("ReceiptCode")
    private String receiptCode;

    public String getReceiptCode() {
        return receiptCode;
    }

    public void setReceiptCode(String receiptCode) {
        this.receiptCode = receiptCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getCostCount() {
        return costCount;
    }

    public void setCostCount(Integer costCount) {
        this.costCount = costCount;
    }

    public String getReceiptResult() {
        return receiptResult;
    }

    public void setReceiptResult(String receiptResult) {
        this.receiptResult = receiptResult;
    }

    public String getReceiptDesc() {
        return receiptDesc;
    }

    public void setReceiptDesc(String receiptDesc) {
        this.receiptDesc = receiptDesc;
    }

    public Integer getReceiptTime() {
        return receiptTime;
    }

    public void setReceiptTime(Integer receiptTime) {
        this.receiptTime = receiptTime;
    }
}
