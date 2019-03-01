package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description : 检查UDB资源余量 参数类
 * @Author : codezhang
 * @Date : 2019-03-01 13:42
 **/
public class CheckUDBInstanceAllowanceParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * DB种类，分为SQL和NOSQL,取值分别为sql、nosql、postgresql
     */
    @NotEmpty(message = "classType can not be empty")
    @UcloudParam("ClassType")
    private String classType;

    /**
     * 申请资源的内存限制
     */
    @NotNull(message = "memoryLimit can not be null")
    @UcloudParam("MemoryLimit")
    private Integer memoryLimit;

    /**
     * 申请资源的磁盘空间
     */
    @NotNull(message = "diskSpace can not be null")
    @UcloudParam("DiskSpace")
    private Integer diskSpace;

    /**
     * 是否使用SSD资源，true代表使用，false代表不使用
     */
    @UcloudParam("UseSSD")
    @NotNull(message = "useSSD can not be null")
    private Boolean useSSD;

    /**
     * 资源申请个数,默认为一个
     */
    @NotNull(message = "count can not be null")
    @UcloudParam("Count")
    private Integer count;

    /**
     *
     * UDB实例的部署模式：可选值为： Normal: 普通单点实例， HA: 高可用部署实例
     */
    @UcloudParam("InstanceMode")
    @NotEmpty(message = "instanceMode can not be empty")
    private String instanceMode;


    /**
     * SSD类型，可选值为"SATA"、"PCI-E"，如果UseSSD为true ，则需要指定SSD类型
     */
    @UcloudParam("SSDType")
    private String ssdType;

    /**
     * 如果是从库创建核查，需要指定SrcId
     */
    @UcloudParam("SrcId")
    private String srcId;

    /**
     * 跨可用区备库所在可用区, 参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("BackupZone")
    private String backupZone;

    /**
     * 专区ID
     */
    @UcloudParam("UDBCId")
    private String udbcId;

    /**
     * 专区里面DB升降级需要原来DB的信息
     */
    @UcloudParam("DBId")
    private String dbId;

    public CheckUDBInstanceAllowanceParam(@NotEmpty(message = "region can not be empty") String region,
                                          @NotEmpty(message = "classType can not be empty") String classType,
                                          @NotNull(message = "memoryLimit can not be null") Integer memoryLimit,
                                          @NotNull(message = "diskSpace can not be null") Integer diskSpace,
                                          @NotNull(message = "useSSD can not be null") Boolean useSSD,
                                          @NotNull(message = "count can not be null") Integer count,
                                          @NotEmpty(message = "instanceMode can not be empty") String instanceMode) {
        super("CheckUDBInstanceAllowance");
        this.region = region;
        this.classType = classType;
        this.memoryLimit = memoryLimit;
        this.diskSpace = diskSpace;
        this.useSSD = useSSD;
        this.count = count;
        this.instanceMode = instanceMode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public Integer getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(Integer memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public Integer getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
    }

    public Boolean getUseSSD() {
        return useSSD;
    }

    public void setUseSSD(Boolean useSSD) {
        this.useSSD = useSSD;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }

    public String getSsdType() {
        return ssdType;
    }

    public void setSsdType(String ssdType) {
        this.ssdType = ssdType;
    }

    public String getSrcId() {
        return srcId;
    }

    public void setSrcId(String srcId) {
        this.srcId = srcId;
    }

    public String getBackupZone() {
        return backupZone;
    }

    public void setBackupZone(String backupZone) {
        this.backupZone = backupZone;
    }

    public String getUdbcId() {
        return udbcId;
    }

    public void setUdbcId(String udbcId) {
        this.udbcId = udbcId;
    }

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    @Override
    public String toString() {
        return "CheckUDBInstanceAllowanceParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", classType='" + classType + '\'' +
                ", memoryLimit=" + memoryLimit +
                ", diskSpace=" + diskSpace +
                ", useSSD=" + useSSD +
                ", count=" + count +
                ", instanceMode='" + instanceMode + '\'' +
                ", ssdType='" + ssdType + '\'' +
                ", srcId='" + srcId + '\'' +
                ", backupZone='" + backupZone + '\'' +
                ", udbcId='" + udbcId + '\'' +
                ", dbId='" + dbId + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
