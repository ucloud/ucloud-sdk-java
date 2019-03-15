package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @Description : 获取umemcache组价格 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeUMemcachePriceParam extends BaseRequestParam {
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
     * 容量大小,单位:GB 取值范围[1-32]
     */
    @UcloudParam("Size")
    @NotNull(message = "size can not be null")
    private Integer size;
    /**
     * 计费模式，Year， Month， Dynamic，默认: Dynamic 默认: 获取所有计费模式的价格
     */
    @UcloudParam("ChargeType")
    private String chargeType;
    /**
     * 购买umemcache的时长，默认值为1
     */
    @UcloudParam("Quantity")
    private Integer quantity;
    /**
     * 空间类型:single(无热备),double(热备)(默认: double)
     */
    @UcloudParam("Type")
    private String type;


    public DescribeUMemcachePriceParam(String region
            , String zone
            , Integer size
    ) {
        super("DescribeUMemcachePrice");
        this.region = region;
        this.zone = zone;
        this.size = size;
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

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
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

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }


}