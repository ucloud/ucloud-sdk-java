package cn.ucloud.ucdn.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


/**
 * @description: 切换账号计费方式 param
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 15:59
 */
public class SwitchUcdnChargeTypeParam extends BaseRequestParam {

    /**
     * 计费方式。traffic代表按流量包计费，bandwidth按带宽付费
     */
    @UcloudParam("ChargeType")
    @NotEmpty(message = "ChargeType can not be empty")
    private String chargeType;

    public SwitchUcdnChargeTypeParam(@NotEmpty(message = "ChargeType can not be empty") String chargeType) {
        super("SwitchUcdnChargeType");
        this.chargeType = chargeType;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }
}
