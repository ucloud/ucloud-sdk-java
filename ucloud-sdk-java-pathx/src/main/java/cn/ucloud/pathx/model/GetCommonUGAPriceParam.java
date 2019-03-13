package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;


/**
 * @Description : 获取苹果加速通道价格 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class GetCommonUGAPriceParam extends BaseRequestParam {
    /**
     * 购买周期
     */
    @UcloudParam("Quantity")
    private Integer quantity;
    /**
     * 计费模式
     */
    @UcloudParam("ChargeType")
    private String chargeType;


    public GetCommonUGAPriceParam(String projectId
    ) {
        super("GetCommonUGAPrice");
        this.projectId = projectId;
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