package cn.ucloud.usql.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 开通USQL服务 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class OpenUSQLServiceParam extends BaseRequestParam {
    /**
     * 申请开通USQL服务的区域
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * 可用区
     */
    @UcloudParam("Zone")
    @NotEmpty(message = "zone can not be empty")
    private String zone;
    /**
     * 联系人姓名
     */
    @UcloudParam("Username")
    @NotEmpty(message = "username can not be empty")
    private String username;
    /**
     * 联系人手机号
     */
    @UcloudParam("Mobile")
    @NotEmpty(message = "mobile can not be empty")
    private String mobile;
    /**
     * 联系人电子邮箱
     */
    @UcloudParam("Email")
    @NotEmpty(message = "email can not be empty")
    private String email;
    /**
     * 业务场景描述
     */
    @UcloudParam("Description")
    private String description;


    public OpenUSQLServiceParam(String region
            , String zone
            , String username
            , String mobile
            , String email
    ) {
        super("OpenUSQLService");
        this.region = region;
        this.zone = zone;
        this.username = username;
        this.mobile = mobile;
        this.email = email;
    }


    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return this.zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}