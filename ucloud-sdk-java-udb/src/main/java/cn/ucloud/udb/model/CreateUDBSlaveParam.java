package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description : 创建UDB实例的slave 参数类
 * @Author : codezhang
 * @Date : 2019-03-03 14:31
 **/
public class CreateUDBSlaveParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    @NotEmpty(message = "srcId can not be empty")
    @UcloudParam("SrcId")
    private String srcId;


    /**
     * 实例名称，至少6位
     */
    @NotEmpty(message = "name can not be empty")
    @UcloudParam("Name")
    private String name;

    /**
     * 端口号，mysql默认3306
     */
    @UcloudParam("Port")
    private Integer port;

    /**
     * 是否使用SSD，默认为false
     */
    @UcloudParam("UseSSD")
    private Boolean useSSD;

    /**
     * SSD类型，可选值为"SATA"、"PCI-E"，如果UseSSD为true ，则必选
     */
    private String ssdType;

    /**
     * 内存限制(MB)，目前支持以下几档
     * 1000M/2000M/4000M/
     * 6000M/8000M/12000M/16000M/
     * 24000M/32000M/48000M/
     * 64000M/96000M
     */
    @UcloudParam("MemoryLimit")
    private Integer memoryLimit;

    /**
     * 磁盘空间(GB), 暂时支持20G - 3000G（API支持，前端暂时只开放内存定制）
     */
    @UcloudParam("DiskSpace")
    private Integer diskSpace;

    /**
     * 是否锁主库，默认为true
     */
    @UcloudParam("IsLock")
    private Boolean isLock;

    /**
     * UDB实例部署模式，可选值如下： Normal: 普通单点实例 HA: 高可用部署实例
     */
    @UcloudParam("InstanceMode")
    private String instanceMode;

    /**
     * UDB实例类型：Normal和SATA_SSD
     */
    @UcloudParam("InstanceType")
    private String instanceType;

    /**
     * 使用的代金券id
     */
    @UcloudParam("CouponId")
    private String couponId;

    public CreateUDBSlaveParam(@NotEmpty(message = "region can not be empty") String region,
                               @NotEmpty(message = "srcId can not be empty") String srcId,
                               @NotEmpty(message = "name can not be empty") String name) {
        super("CreateUDBSlaveParam");
        this.region = region;
        this.srcId = srcId;
        this.name = name;
    }

    @UcloudParam("SSDType")
    public List<Param> checkSSDType() throws Exception {
        List<Param> list = new ArrayList<>();
        if (useSSD) {
            if (ssdType == null) {
                throw new ValidationException("ssdType can not be empty when useSSD is true");
            } else {
                Param param = new Param("SSDType", ssdType);
                list.add(param);
            }
        }
        return list;
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

    public String getSrcId() {
        return srcId;
    }

    public void setSrcId(String srcId) {
        this.srcId = srcId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Boolean getUseSSD() {
        return useSSD;
    }

    public void setUseSSD(Boolean useSSD) {
        this.useSSD = useSSD;
    }

    public String getSsdType() {
        return ssdType;
    }

    public void setSsdType(String ssdType) {
        this.ssdType = ssdType;
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

    public Boolean getLock() {
        return isLock;
    }

    public void setLock(Boolean lock) {
        isLock = lock;
    }

    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    @Override
    public String toString() {
        return "CreateUDBSlaveParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", srcId='" + srcId + '\'' +
                ", name='" + name + '\'' +
                ", port=" + port +
                ", useSSD=" + useSSD +
                ", ssdType='" + ssdType + '\'' +
                ", memoryLimit=" + memoryLimit +
                ", diskSpace=" + diskSpace +
                ", isLock=" + isLock +
                ", instanceMode='" + instanceMode + '\'' +
                ", instanceType='" + instanceType + '\'' +
                ", couponId='" + couponId + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}

