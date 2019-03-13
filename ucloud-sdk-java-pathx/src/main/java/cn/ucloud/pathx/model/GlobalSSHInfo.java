package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description : GlobalSSH实例信息 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class GlobalSSHInfo {
    /**
     * 实例ID，资源唯一标识
     */
    @SerializedName("InstanceId")
    private String instanceId;
    /**
     * 加速域名
     */
    @SerializedName("AcceleratingDomain")
    private String acceleratingDomain;
    /**
     * 被SSH访问的IP所在地区
     */
    @SerializedName("Area")
    private String area;
    /**
     * 被SSH访问的EIP
     */
    @SerializedName("TargetIP")
    private String targetIP;
    /**
     * 备注信息
     */
    @SerializedName("Remark")
    private String remark;
    /**
     * SSH登陆端口
     */
    @SerializedName("Port")
    private Integer port;
    /**
     * 支付周期，如Month,Year等
     */
    @SerializedName("ChargeType")
    private String chargeType;
    /**
     * 资源创建时间戳
     */
    @SerializedName("CreateTime")
    private Integer createTime;
    /**
     * 资源过期时间戳
     */
    @SerializedName("ExpireTime")
    private Integer expireTime;


    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    public String getAcceleratingDomain() {
        return this.acceleratingDomain;
    }

    public void setAcceleratingDomain(String acceleratingDomain) {
        this.acceleratingDomain = acceleratingDomain;
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


    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }


    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }


    public Integer getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }


    public Integer getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }


}