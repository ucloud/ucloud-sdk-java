package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @Description : 获取UPath价格 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class GetUPathPriceParam extends BaseRequestParam {
    /**
     * 带宽(Mbps)
     */
    @UcloudParam("Bandwidth")
    @NotNull(message = "bandwidth can not be null")
    private Integer bandwidth;
    /**
     *
     */
    @UcloudParam("Quantity")
    @NotNull(message = "quantity can not be null")
    private Integer quantity;
    /**
     *
     */
    @UcloudParam("ChargeType")
    @NotEmpty(message = "chargeType can not be empty")
    private String chargeType;
    /**
     *
     */
    @UcloudParam("LineId")
    @NotEmpty(message = "lineId can not be empty")
    private String lineId;


    public GetUPathPriceParam(String projectId
            , Integer bandwidth
            , Integer quantity
            , String chargeType
            , String lineId
    ) {
        super("GetUPathPrice");
        this.projectId = projectId;
        this.bandwidth = bandwidth;
        this.quantity = quantity;
        this.chargeType = chargeType;
        this.lineId = lineId;
    }


    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getLineId() {
        return this.lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }


}