package cn.ucloud.udisk.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: 获取云硬盘价格 参数类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/18 10:01
 */
public class DescribeUDiskPriceParam extends BaseRequestParam {

    /**
     * require region 地域，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require zone 可用区，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * require size 购买UDisk大小,单位:GB,范围[1~1000]
     */
    @NotNull(message = "size can not be empty")
    @UcloudParam("Size")
    private Integer size = 1;

    /**
     * optional chargeType Year， Month， Dynamic，Trial，默认: Dynamic 如果不指定，则一次性获取三种计费
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * optional quantity 购买UDisk的时长，默认值为1
     */
    @UcloudParam("Quantity")
    private Integer quantity;

    /**
     * optional uDataArkMode 是否打开数据方舟, 打开"Yes",关闭"No", 默认关闭
     */
    @UcloudParam("UDataArkMode")
    private String uDataArkMode = "No";

    /**
     * optional diskType UDisk 类型: DataDisk（普通数据盘），SSDDataDisk（SSD数据盘），默认值（DataDisk）
     */
    @UcloudParam("DiskType")
    private String diskType;

    public DescribeUDiskPriceParam(@NotEmpty(message = "region can not be empty") String region,
                                   @NotEmpty(message = "zone can not be empty") String zone,
                                   @NotEmpty(message = "size can not be empty") Integer size) {
        super("DescribeUDiskPrice");
        this.region = region;
        this.zone = zone;
        this.size = size;
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

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
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

    public String getuDataArkMode() {
        return uDataArkMode;
    }

    public void setuDataArkMode(String uDataArkMode) {
        this.uDataArkMode = uDataArkMode;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }
}
