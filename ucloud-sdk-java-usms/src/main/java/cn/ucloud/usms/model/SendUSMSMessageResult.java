package cn.ucloud.usms.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 发送短信息 结果类
 * 发送短信息。短信字数超过70个后，按照每66个进行切割(因为要加上1/3), 2/3)等字样，占用4个字长)。
 * 短信最大长度不能超过600个字。每个汉字、数字、字母、字符都按一个字计
 * @Author : codezhang
 * @Date : 2019-06-04 17:31
 **/
public class SendUSMSMessageResult extends BaseResponseResult {

    /**
     * 本次提交发送的短信的唯一ID，可根据该值查询本次发送的短信列表
     */
    @SerializedName("SessionNo")
    private String sessionNo;


    public String getSessionNo() {
        return sessionNo;
    }

    public void setSessionNo(String sessionNo) {
        this.sessionNo = sessionNo;
    }
}
