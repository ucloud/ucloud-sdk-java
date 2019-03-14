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
 * @Description : 获取UDB实例价格信息 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 14:19
 **/
public class DescribeUDBInstancePriceParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * 内存限制(MB)，单位为MB. 目前支持：1000-96000
     */
    @UcloudParam("MemoryLimit")
    @NotNull(message = "memoryLimit can not be null")
    private Integer memoryLimit;

    /**
     * 磁盘空间(GB),暂时支持20(GB) - 3000(GB), 输入不带单位
     */
    @NotNull(message = "diskSpace can not be null")
    @UcloudParam("DiskSpace")
    private Integer diskSpace;

    /**
     * UDB实例的DB版本字符串
     */
    @NotEmpty(message = "dbTypeId can not be empty")
    @UcloudParam("DBTypeId")
    private String dbTypeId;

    /**
     * 购买DB实例数量,最大数量为10台, 默认为1台
     */
    @UcloudParam("Count")
    private Integer count;

    /**
     * DB购买多少个"计费时间单位"，默认值为1。
     * 比如：买2个月，Quantity就是2。 如果计费单位是“按月”，
     * 并且Quantity为0，表示“购买到月底”
     */
    @UcloudParam("Quantity")
    private Integer quantity;

    /**
     * Year，按年付费； Month，按月付费
     * Dynamic，按需付费（需开启权限) Trial，
     * 试用（需开启权限） 默认为月付
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * 是否使用SSD，默认为false
     */
    @UcloudParam("UseSSD")
    private Boolean useSSD;

    /**
     * SSD类型，可选值为"SATA"、"PCI-E"，如果UseSSD为true ，则必填
     */
    private String ssdType;

    /**
     * 实例的部署类型。可选值为： Normal: 普通单点实例， HA: 高可用部署实例， 默认是Normal
     */
    @UcloudParam("InstanceMode")
    private String instanceMode;

    public DescribeUDBInstancePriceParam(@NotEmpty(message = "region can not be empty") String region,
                                         @NotEmpty(message = "zone can not be empty") String zone,
                                         @NotNull(message = "memoryLimit can not be null") Integer memoryLimit,
                                         @NotNull(message = "diskSpace can not be null") Integer diskSpace,
                                         @NotEmpty(message = "dbTypeId can not be empty") String dbTypeId) {
        super("DescribeUDBInstancePrice");
        this.region = region;
        this.zone = zone;
        this.memoryLimit = memoryLimit;
        this.diskSpace = diskSpace;
        this.dbTypeId = dbTypeId;
    }

    @UcloudParam("SSDType")
    public List<Param> checkSSDType() throws ValidationException {
        List<Param> list = new ArrayList<>();
        if (useSSD != null && useSSD) {
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

    public String getDbTypeId() {
        return dbTypeId;
    }

    public void setDbTypeId(String dbTypeId) {
        this.dbTypeId = dbTypeId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
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

    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }
}
