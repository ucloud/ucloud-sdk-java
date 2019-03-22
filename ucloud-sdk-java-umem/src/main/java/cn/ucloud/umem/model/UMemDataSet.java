package cn.ucloud.umem.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : DescribeUMem 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class UMemDataSet {
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
     * UMEM实例列表 UMemSlaveDataSet 如果没有slave，则没有该字段
     */
    @SerializedName("DataSet")
    private List<UMemSlaveDataSet> dataSet;
    /**
     * 是否拥有只读Slave
     */
    @SerializedName("OwnSlave")
    private String ownSlave;
    /**
     * 资源ID
     */
    @SerializedName("ResourceId")
    private String resourceId;
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
     * 空间类型:single(无热备),double(热备)
     */
    @SerializedName("Type")
    private String type;
    /**
     * 协议类型: memcache, redis
     */
    @SerializedName("Protocol")
    private String protocol;
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
     * IP端口信息请，参见UMemSpaceAddressSet
     */
    @SerializedName("Address")
    private List<UMemSpaceAddressSet> address;
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
     * 是否需要自动备份,enable,disable
     */
    @SerializedName("AutoBackup")
    private String autoBackup;
    /**
     * 自动备份开始时间,单位小时计,范围[0-23]
     */
    @SerializedName("BackupTime")
    private Integer backupTime;

    @SerializedName("ModifyTime")
    private Integer modifyTime;

    /**
     * 是否开启高可用,enable,disable
     */
    @SerializedName("HighAvailability")
    private String highAvailability;
    /**
     * Redis版本信息
     */
    @SerializedName("Version")
    private String version;
    /**
     * 主备Redis，提供两种类型：同机房高可用Redis，和同地域跨机房高可用Redis
     */
    @SerializedName("URedisType")
    private String uRedisType;
    /**
     * 跨机房URedis，slave redis所在可用区，参见 [可用区列表](../summary/regionlist.html)
     */
    @SerializedName("SlaveZone")
    private String slaveZone;

    @SerializedName("SubnetId")
    private String subnetId;

    @SerializedName("VPCId")
    private String vpcId;

    public String getOwnSlave() {
        return ownSlave;
    }

    public Integer getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Integer modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setOwnSlave(String ownSlave) {
        this.ownSlave = ownSlave;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

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


    public List<UMemSlaveDataSet> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<UMemSlaveDataSet> dataSet) {
        this.dataSet = dataSet;
    }


    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
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

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
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


    public List<UMemSpaceAddressSet> getAddress() {
        return this.address;
    }

    public void setAddress(List<UMemSpaceAddressSet> address) {
        this.address = address;
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

    public String getAutoBackup() {
        return this.autoBackup;
    }

    public void setAutoBackup(String autoBackup) {
        this.autoBackup = autoBackup;
    }

    public Integer getBackupTime() {
        return this.backupTime;
    }

    public void setBackupTime(Integer backupTime) {
        this.backupTime = backupTime;
    }

    public String getHighAvailability() {
        return this.highAvailability;
    }

    public void setHighAvailability(String highAvailability) {
        this.highAvailability = highAvailability;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getuRedisType() {
        return this.uRedisType;
    }

    public void setuRedisType(String uRedisType) {
        this.uRedisType = uRedisType;
    }

    public String getSlaveZone() {
        return this.slaveZone;
    }

    public void setSlaveZone(String slaveZone) {
        this.slaveZone = slaveZone;
    }


}