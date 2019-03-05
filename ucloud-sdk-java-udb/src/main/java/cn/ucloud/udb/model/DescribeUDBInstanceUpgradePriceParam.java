package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description : 获取UDB实例升降级价格信息 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 15:06
 **/
public class DescribeUDBInstanceUpgradePriceParam extends BaseRequestParam {

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

    /**
     * 实例的Id,该值可以通过DescribeUDBInstance获取
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    /**
     * 内存限制(MB)
     */
    @UcloudParam("Memory")
    @NotNull(message = "memoryLimit can not be null")
    private Integer memoryLimit;

    /**
     * 磁盘空间(GB), 暂时支持20G - 500G
     */
    @NotNull(message = "diskSpace can not be null")
    @UcloudParam("DiskSpace")
    private Integer diskSpace;

    /**
     * 是否使用SSD，默认为false
     */
    @UcloudParam("useSSD")
    private Boolean useSSD;

    /**
     * SSD类型，可选值为"SATA"、"PCI-E"，如果UseSSD为true ，则必选
     */
    private String ssdType;

    public DescribeUDBInstanceUpgradePriceParam(@NotEmpty(message = "region can not be empty") String region,
                                                @NotEmpty(message = "dbId can not be empty") String dbId,
                                                @NotNull(message = "memoryLimit can not be null") Integer memoryLimit,
                                                @NotNull(message = "diskSpace can not be null") Integer diskSpace) {
        super("DescribeUDBInstanceUpgradePrice");
        this.region = region;
        this.dbId = dbId;
        this.memoryLimit = memoryLimit;
        this.diskSpace = diskSpace;
    }

    @UcloudParam("SSDType")
    public List<Param> checkSSDType() throws ValidationException {
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

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
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

    public String getSsdType() {
        return ssdType;
    }

    public void setSsdType(String ssdType) {
        this.ssdType = ssdType;
    }
}
