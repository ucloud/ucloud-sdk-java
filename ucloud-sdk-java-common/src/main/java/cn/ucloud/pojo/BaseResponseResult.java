package cn.ucloud.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * @description: 基础请求结果
 * @author: codezhang
 * @date: 2018-09-14 11:03
 **/

public class BaseResponseResult {
    /**
     * 返回码 0 成功，其他失败
     */
    @SerializedName("RetCode")
    protected Integer retCode;

    /**
     * 操作名称 = 请求参数Action+"Response"
     */
    @SerializedName("Action")
    protected String action;
    /**
     * 提示信息，发生错误时
     */
    @SerializedName("Message")
    protected String message;

    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BaseResponseResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
