package cn.ucloud.umem.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description : 主备Redis配置文件信息 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class URedisConfigSet {
    /**
     * 配置ID
     */
    @SerializedName("ConfigId")
    private String configId;
    /**
     * 配置名称
     */
    @SerializedName("Name")
    private String name;
    /**
     * 配置描述
     */
    @SerializedName("Description")
    private String description;
    /**
     * 配置对应的Redis版本
     */
    @SerializedName("Version")
    private String version;
    /**
     * 置是否可以修改
     */
    @SerializedName("IsModify")
    private String isModify;
    /**
     * 配置所处的状态
     */
    @SerializedName("State")
    private String state;
    /**
     * 创建时间 (UNIX时间戳)
     */
    @SerializedName("CreateTime")
    private Integer createTime;
    /**
     * 修改时间 (UNIX时间戳)
     */
    @SerializedName("ModifyTime")
    private Integer modifyTime;
    /**
     * 是否是跨机房URedis(默认false)
     */
    @SerializedName("RegionFlag")
    private Boolean regionFlag;


    public String getConfigId() {
        return this.configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getIsModify() {
        return this.isModify;
    }

    public void setIsModify(String isModify) {
        this.isModify = isModify;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getModifyTime() {
        return this.modifyTime;
    }

    public void setModifyTime(Integer modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Boolean getRegionFlag() {
        return this.regionFlag;
    }

    public void setRegionFlag(Boolean regionFlag) {
        this.regionFlag = regionFlag;
    }


}