package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 加速线路信息 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class UPathInfo {
    /**
     * UPath名字
     */
    @SerializedName("Name")
    private String name;
    /**
     * UPath ID 号
     */
    @SerializedName("UPathId")
    private String uPathId;
    /**
     * 带宽
     */
    @SerializedName("Bandwidth")
    private String bandwidth;
    /**
     * 线路ID
     */
    @SerializedName("LineId")
    private String lineId;
    /**
     * 与该UPath绑定的UGA列表
     */
    @SerializedName("UGAList")
    private List<UGAAInfo> uGAList;
    /**
     * UPath创建的时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;
    /**
     * UPath的过期时间
     */
    @SerializedName("ExpireTime")
    private Integer expireTime;
    /**
     * 支付方式
     */
    @SerializedName("ChargeType")
    private String chargeType;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getuPathId() {
        return this.uPathId;
    }

    public void setuPathId(String uPathId) {
        this.uPathId = uPathId;
    }


    public String getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }


    public String getLineId() {
        return this.lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
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


    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }


}