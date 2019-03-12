package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @Description : 创建GlobalSSH实例 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class CreateGlobalSSHInstanceParam extends BaseRequestParam {
    /**
     * 填写支持SSH访问IP的地区名称，如“洛杉矶”，“新加坡”，“香港”，“东京”，“华盛顿”，“法兰克福”。Area和AreaCode两者必填一个
     */
    @UcloudParam("Area")
    @NotEmpty(message = "area can not be empty")
    private String area;
    /**
     * 被SSH访问的IP
     */
    @UcloudParam("TargetIP")
    @NotEmpty(message = "targetIP can not be empty")
    private String targetIP;
    /**
     * SSH端口，1-65535且不能使用80，443端口
     */
    @UcloudParam("Port")
    @NotNull(message = "port can not be null")
    private Integer port;
    /**
     * AreaCode, 区域航空港国际通用代码。Area和AreaCode两者必填一个
     */
    @UcloudParam("AreaCode")
    @NotEmpty(message = "areaCode can not be empty")
    private String areaCode;
    /**
     * 备注信息
     */
    @UcloudParam("Remark")
    private String remark;
    /**
     * 支付方式，如按月、按年、按时
     */
    @UcloudParam("ChargeType")
    private String chargeType;
    /**
     * 购买数量
     */
    @UcloudParam("Quantity")
    private Integer quantity;
    /**
     * 使用代金券可冲抵部分费用
     */
    @UcloudParam("CouponId")
    private String couponId;


    public CreateGlobalSSHInstanceParam(String projectId
            , String area
            , String targetIP
            , Integer port
            , String areaCode
    ) {
        super("CreateGlobalSSHInstance");
        this.projectId = projectId;
        this.area = area;
        this.targetIP = targetIP;
        this.port = port;
        this.areaCode = areaCode;
    }


    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTargetIP() {
        return this.targetIP;
    }

    public void setTargetIP(String targetIP) {
        this.targetIP = targetIP;
    }

    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCouponId() {
        return this.couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }


}