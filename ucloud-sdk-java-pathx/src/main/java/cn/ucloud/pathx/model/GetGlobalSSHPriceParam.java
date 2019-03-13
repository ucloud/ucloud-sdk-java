package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @Description : 获取GlobalSSH价格 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class GetGlobalSSHPriceParam extends BaseRequestParam {
    /**
     * 购买周期
     */
    @UcloudParam("Quantity")
    @NotNull(message = "quantity can not be null")
    private Integer quantity;
    /**
     * 计费类型：Dynamic，Month，Year
     */
    @UcloudParam("ChargeType")
    @NotEmpty(message = "chargeType can not be empty")
    private String chargeType;


    public GetGlobalSSHPriceParam(Integer quantity
            , String chargeType
    ) {
        super("GetGlobalSSHPrice");
        this.quantity = quantity;
        this.chargeType = chargeType;
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


}