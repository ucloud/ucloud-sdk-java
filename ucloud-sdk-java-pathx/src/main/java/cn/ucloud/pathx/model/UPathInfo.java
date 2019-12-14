package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 加速线路信息 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
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
    private Integer bandwidth;
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

    @SerializedName("PostPaid")
    private Boolean postPaid;

    @SerializedName("LineFromName")
    private String lineFromName;

    @SerializedName("LineToName")
    private String lineToName;

    @SerializedName("OutPublicIpList")
    private List<OutPublicIpInfo> outPublicIpInfos;

    public Boolean getPostPaid() {
        return postPaid;
    }

    public void setPostPaid(Boolean postPaid) {
        this.postPaid = postPaid;
    }

    public String getLineFromName() {
        return lineFromName;
    }

    public void setLineFromName(String lineFromName) {
        this.lineFromName = lineFromName;
    }

    public String getLineToName() {
        return lineToName;
    }

    public void setLineToName(String lineToName) {
        this.lineToName = lineToName;
    }

    public List<OutPublicIpInfo> getOutPublicIpInfos() {
        return outPublicIpInfos;
    }

    public void setOutPublicIpInfos(List<OutPublicIpInfo> outPublicIpInfos) {
        this.outPublicIpInfos = outPublicIpInfos;
    }

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

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getLineId() {
        return this.lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }


    public List<UGAAInfo> getuGAList() {
        return this.uGAList;
    }

    public void setuGAList(List<UGAAInfo> uGAList) {
        this.uGAList = uGAList;
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