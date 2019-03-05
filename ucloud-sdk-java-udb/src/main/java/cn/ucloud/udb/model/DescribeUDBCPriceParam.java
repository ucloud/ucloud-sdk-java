package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description :获得专区价格信息 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 10:56
 **/
public class DescribeUDBCPriceParam extends BaseRequestParam {

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
    @NotEmpty(message = "zone can not be empty")
    private String zone;

    /**
     * One:机型一|Two:机型二
     */
    @UcloudParam("Type")
    private String type;

    /**
     * Year，按年付费； Month，按月付费 默认为月付
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * 个数
     */
    @UcloudParam("Count")
    private Integer count;

    /**
     * 购买的方式的个数
     */
    @UcloudParam("Quantity")
    private Integer quantity;

    public DescribeUDBCPriceParam(@NotEmpty(message = "region can not be empty") String region,
                                  @NotEmpty(message = "zone can not be empty") String zone) {
        super("DescribeUDBCPrice");
        this.region = region;
        this.zone = zone;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
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

}
