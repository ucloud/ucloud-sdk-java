package cn.ucloud.umem.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description :  模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class UDredisSpaceSet {
    /**
     * 内存空间ID
     */
    @SerializedName("SpaceId")
    private String spaceId;
    /**
     * 内存空间名称
     */
    @SerializedName("Name")
    private String name;
    /**
     * 可用区，参见[可用区列表](../summary/regionlist.html)
     */
    @SerializedName("Zone")
    private String zone;
    /**
     * 创建时间
     */
    @SerializedName("CreateTime")
    private String createTime;
    /**
     * 到期时间
     */
    @SerializedName("ExpireTime")
    private String expireTime;
    /**
     * 容量单位GB
     */
    @SerializedName("Size")
    private String size;
    /**
     * 使用量单位MB
     */
    @SerializedName("UsedSize")
    private String usedSize;
    /**
     * Starting:创建中 Running:运行中 Fail:失败
     */
    @SerializedName("State")
    private String state;
    /**
     * Year, Month, Dynamic, Trial
     */
    @SerializedName("ChargeType")
    private String chargeType;
    /**
     * IP端口信息请参见 UDredisSpaceAddressSet
     */
    @SerializedName("Address")
    private List<UDredisSpaceAddressSet> address;


    public String getSpaceId() {
        return this.spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZone() {
        return this.zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUsedSize() {
        return this.usedSize;
    }

    public void setUsedSize(String usedSize) {
        this.usedSize = usedSize;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }


    public List<UDredisSpaceAddressSet> getAddress() {
        return this.address;
    }

    public void setAddress(List<UDredisSpaceAddressSet> address) {
        this.address = address;
    }


}