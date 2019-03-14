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
 * @Description : 创建mongos实例 参数类
 * @Author : codezhang
 * @Date : 2019-03-03 14:08
 **/
public class CreateUDBRouteInstanceParam extends BaseRequestParam {

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
     * DB类型id，mongodb按版本细分有
     * 1：mongodb-2.4，
     * 2：mongodb-2.6,
     * 3：mongodb-3.0，
     * 4：mongodb-3.2
     */
    @NotEmpty(message = "dbTypeId can not be empty")
    @UcloudParam("DBTypeId")
    private String dbTypeId;

    /**
     * 实例名称，至少6位
     */
    @NotEmpty(message = "name can not be empty")
    @UcloudParam("Name")
    private String name;

    /**
     * 端口号，mongodb默认27017
     */
    @NotNull(message = "port can not be null")
    @UcloudParam("Port")
    private Integer port;

    /**
     * DB实例使用的配置参数组id
     */
    @NotNull(message = "paramGroupId can not be null")
    @UcloudParam("ParamGroupId")
    private Integer paramGroupId;

    /**
     * 内存限制(MB)，目前支持以下几档 600M/1500M/3000M /6000M/15000M/30000M
     */
    @NotNull(message = "memoryLimit can not be null")
    @UcloudParam("MemoryLimit")
    private Integer memoryLimit;

    @NotNull(message = "diskSpace can not be null")
    @UcloudParam("DiskSpace")
    private Integer diskSpace;

    /**
     * 配置服务器的dbid，允许一个或者三个
     */
    private List<String> configsvrId;

    /**
     * Year， Month， Dynamic，Trial，默认: Month
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * 购买时长，默认值1
     */
    @UcloudParam("Quantity")
    private Integer quantity;

    /**
     * 是否使用SSD，默认为false
     */
    @UcloudParam("useSSD")
    private String useSSD;

    /**
     * 使用的代金券id
     */
    @UcloudParam("CouponId")
    private String couponId;

    public CreateUDBRouteInstanceParam(@NotEmpty(message = "region can not be empty") String region,
                                       @NotEmpty(message = "dbTypeId can not be empty") String dbTypeId,
                                       @NotEmpty(message = "name can not be empty") String name,
                                       @NotNull(message = "port can not be null") Integer port,
                                       @NotNull(message = "paramGroupId can not be null") Integer paramGroupId,
                                       @NotNull(message = "memoryLimit can not be null") Integer memoryLimit,
                                       @NotNull(message = "diskSpace can not be null") Integer diskSpace,
                                       List<String> configsvrId) {
        super("CreateUDBRouteInstance");
        this.region = region;
        this.dbTypeId = dbTypeId;
        this.name = name;
        this.port = port;
        this.paramGroupId = paramGroupId;
        this.memoryLimit = memoryLimit;
        this.diskSpace = diskSpace;
        this.configsvrId = configsvrId;
    }

    @UcloudParam("ConfigsvrId")
    public List<Param> checkConfigsvrId() throws ValidationException {
        List<Param> params = new ArrayList<>();
        if (configsvrId == null || configsvrId.isEmpty()) {
            throw new ValidationException("configsvrId can not be empty");
        } else {
            for (int i = 0; i < configsvrId.size(); i++) {
                if (configsvrId.get(i) == null || configsvrId.get(i).length() <= 0) {
                    throw new ValidationException(String.format("configsvrId.%d can not be empty", i));
                } else {
                    params.add(new Param(String.format("ConfigsvrId.%d", i), configsvrId.get(i)));
                }
            }
        }
        return params;
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

    public String getDbTypeId() {
        return dbTypeId;
    }

    public void setDbTypeId(String dbTypeId) {
        this.dbTypeId = dbTypeId;
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

    public Integer getParamGroupId() {
        return paramGroupId;
    }

    public void setParamGroupId(Integer paramGroupId) {
        this.paramGroupId = paramGroupId;
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

    public List<String> getConfigsvrId() {
        return configsvrId;
    }

    public void setConfigsvrId(List<String> configsvrId) {
        this.configsvrId = configsvrId;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUseSSD() {
        return useSSD;
    }

    public void setUseSSD(String useSSD) {
        this.useSSD = useSSD;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
