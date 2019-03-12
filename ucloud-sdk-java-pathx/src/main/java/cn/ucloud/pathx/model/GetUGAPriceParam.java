package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotNull;


/**
 * @Description : 获取UGA价格 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class GetUGAPriceParam extends BaseRequestParam {
    /**
     * 绑定到UPath的数量
     */
    @UcloudParam("UPathNum")
    @NotNull(message = "uPathNum can not be null")
    private Integer uPathNum;
    /**
     * 购买周期
     */
    @UcloudParam("Quantity")
    private Integer quantity;
    /**
     * 计费类型
     */
    @UcloudParam("ChargeType")
    private String chargeType;


    public GetUGAPriceParam(String projectId
            , Integer uPathNum
    ) {
        super("GetUGAPrice");
        this.projectId = projectId;
        this.uPathNum = uPathNum;
    }


    public Integer getuPathNum() {
        return this.uPathNum;
    }

    public void setuPathNum(Integer uPathNum) {
        this.uPathNum = uPathNum;
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