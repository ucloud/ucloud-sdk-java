package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 开通USQL服务 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class OpenUSQLServiceResult extends BaseResponseResult {
    /**
     * 请求的Id
     */
    @SerializedName("Request")
    private String request;
    /**
     * 服务开通申请ID
     */
    @SerializedName("ApplyId")
    private Integer applyId;
    /**
     * 联系人姓名
     */
    @SerializedName("Username")
    private String username;
    /**
     * 联系人手机号
     */
    @SerializedName("Mobile")
    private String mobile;
    /**
     * 联系人电子邮件
     */
    @SerializedName("Email")
    private String email;
    /**
     * 服务开通申请当前状态。
     * 0: 审核中， 1: 审核不通过， 2: 审核通过正在开通， 3: 服务已开通
     */
    @SerializedName("State")
    private Integer state;


    public String getRequest() {
        return this.request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public Integer getApplyId() {
        return this.applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }


}