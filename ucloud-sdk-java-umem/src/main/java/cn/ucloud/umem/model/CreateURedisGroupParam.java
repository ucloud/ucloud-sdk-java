package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;
import org.apache.commons.codec.binary.Base64;

import javax.validation.constraints.NotEmpty;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description : 创建主备redis 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CreateURedisGroupParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    @NotEmpty(message = "zone can not be empty")
    private String zone;
    /**
     * 请求创建组的名称 (范围[6-63],只能包含英文、数字以及符号-和_)
     */
    @UcloudParam("Name")
    @NotEmpty(message = "name can not be empty")
    private String name;
    /**
     * 是否开启高可用,enable或disable
     */
    @UcloudParam("HighAvailability")
    @NotEmpty(message = "highAvailability can not be empty")
    private String highAvailability;
    /**
     * 每个节点的内存大小,单位GB,默认1GB,目前仅支持1/2/4/8/16/32,六种
     */
    @UcloudParam("Size")
    private Integer size;
    /**
     * 是否自动备份,enable或disable，默认disable
     */
    @UcloudParam("AutoBackup")
    private String autoBackup;
    /**
     * 自动备份开始时间,范围[0-23],默认3点
     */
    @UcloudParam("BackupTime")
    private Integer backupTime;
    /**
     * 配置ID,目前仅支持默认配置id 默认配置id:"03f58ca9-b64d-4bdd-abc7-c6b9a46fd801"，如果从备份创建，为必填项。
     */
    @UcloudParam("ConfigId")
    private String configId;
    /**
     * Redis版本信息(详见DescribeURedisVersion返回结果),默认版本3.0
     */
    @UcloudParam("Version")
    private String version;
    /**
     * 计费模式，Year , Month, Dynamic 默认: Month
     */
    @UcloudParam("ChargeType")
    private String chargeType;
    /**
     * 购买时长，默认为1
     */
    @UcloudParam("Quantity")
    private Integer quantity;
    /**
     * 业务组名称
     */
    @UcloudParam("Tag")
    private String tag;
    /**
     * 初始化密码,需要 base64 编码
     */
    private String password;
    /**
     * 有此项代表从备份中创建，无代表正常创建
     */
    @UcloudParam("BackupId")
    private String backupId;
    /**
     * 跨机房URedis，slave所在可用区（必须和Zone在同一Region，且不可相同）
     */
    @UcloudParam("SlaveZone")
    private String slaveZone;
    /**
     * Master Redis Group的ID，创建只读Slave时，必须填写
     */
    @UcloudParam("MasterGroupId")
    private String masterGroupId;
    /**
     * 代金券ID
     */
    @UcloudParam("CouponId")
    private String couponId;


    public CreateURedisGroupParam(String region
            , String zone
            , String name
            , String highAvailability
    ) {
        super("CreateURedisGroup");
        this.region = region;
        this.zone = zone;
        this.name = name;
        this.highAvailability = highAvailability;
    }
    @UcloudParam("Password")
    public List<Param> checkPassword() throws UnsupportedEncodingException {
        List<Param> params = new ArrayList<>();
        if (password != null && password.length() > 0) {
            params.add(new Param("Password", new
                    String(Base64.encodeBase64((password).getBytes("utf-8")))));
        }
        return params;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHighAvailability() {
        return this.highAvailability;
    }

    public void setHighAvailability(String highAvailability) {
        this.highAvailability = highAvailability;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
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

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBackupId() {
        return this.backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public String getSlaveZone() {
        return this.slaveZone;
    }

    public void setSlaveZone(String slaveZone) {
        this.slaveZone = slaveZone;
    }

    public String getMasterGroupId() {
        return this.masterGroupId;
    }

    public void setMasterGroupId(String masterGroupId) {
        this.masterGroupId = masterGroupId;
    }

    public String getCouponId() {
        return this.couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }


}