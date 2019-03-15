package cn.ucloud.umem.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description : DescribeUMem 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class UMemSlaveDataSet {
    /**
     * 实例所在可用区，或者master redis所在可用区，参见 [可用区列表](../summary/regionlist.html)
     */
    @SerializedName("Zone")
    private String zone;
    /**
     * 表示实例是主库还是从库,master,slave
     */
    @SerializedName("Role")
    private String role;
    /**
     * 资源名称
     */
    @SerializedName("Name")
    private String name;
    /**
     * 创建时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;
    /**
     * 到期时间
     */
    @SerializedName("ExpireTime")
    private Integer expireTime;
    /**
     * 容量单位GB
     */
    @SerializedName("Size")
    private Integer size;
    /**
     * 使用量单位MB
     */
    @SerializedName("UsedSize")
    private Integer usedSize;
    /**
     * 实例状态
     * Starting                  // 创建中
     * Creating                  // 初始化中
     * CreateFail                // 创建失败
     * Fail                      // 创建失败
     * Deleting                  // 删除中
     * DeleteFail                // 删除失败
     * Running                   // 运行
     * Resizing                  // 容量调整中
     * ResizeFail                // 容量调整失败
     * Configing                 // 配置中
     * ConfigFail                // 配置失败
     * Restarting                // 重启中
     */
    @SerializedName("State")
    private String state;
    /**
     * 计费模式，Year, Month, Dynamic, Trial
     */
    @SerializedName("ChargeType")
    private String chargeType;
    /**
     * 业务组名称
     */
    @SerializedName("Tag")
    private String tag;
    /**
     * distributed: 分布式版Redis,或者分布式Memcache；single：主备版Redis,或者单机Memcache；performance：高性能版
     */
    @SerializedName("ResourceType")
    private String resourceType;
    /**
     * 节点的配置ID
     */
    @SerializedName("ConfigId")
    private String configId;
    /**
     * Redis版本信息
     */
    @SerializedName("Version")
    private String version;


    public String getZone() {
        return this.zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getUsedSize() {
        return this.usedSize;
    }

    public void setUsedSize(Integer usedSize) {
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

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getConfigId() {
        return this.configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


}