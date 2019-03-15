package cn.ucloud.umem.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description : DescribeURedisSlaveGroup 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class URedisSlaveGroupSet {
    /**
     * 组ID
     */
    @SerializedName("GroupId")
    private String groupId;
    /**
     * 组名称
     */
    @SerializedName("Name")
    private String name;
    /**
     * 节点的配置ID
     */
    @SerializedName("ConfigId")
    private String configId;
    /**
     * 节点的虚拟IP地址
     */
    @SerializedName("VirtualIP")
    private String virtualIP;
    /**
     * 节点分配的服务端口
     */
    @SerializedName("Port")
    private Integer port;
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
     * Redis版本信息
     */
    @SerializedName("Version")
    private String version;
    /**
     * 过期时间 (UNIX时间戳)
     */
    @SerializedName("ExpireTime")
    private Integer expireTime;
    /**
     * 计费类型:Year,Month,Dynamic 默认Dynamic
     */
    @SerializedName("ChargeType")
    private String chargeType;
    /**
     * 状态标记 Creating // 初始化中 CreateFail // 创建失败 Deleting // 删除中 DeleteFail // 删除失败 Running // 运行 Resizing // 容量调整中 ResizeFail // 容量调整失败 Configing // 配置中 ConfigFail // 配置失败
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
     * 业务组名称
     */
    @SerializedName("Tag")
    private String tag;
    /**
     * 实例所在可用区，或者master redis所在可用区，参见 [可用区列表](../summary/regionlist.html)
     */
    @SerializedName("Zone")
    private String zone;


    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConfigId() {
        return this.configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public String getVirtualIP() {
        return this.virtualIP;
    }

    public void setVirtualIP(String virtualIP) {
        this.virtualIP = virtualIP;
    }

    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
        this.port = port;
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

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
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

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getZone() {
        return this.zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }


}