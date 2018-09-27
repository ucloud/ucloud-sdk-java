package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * @description: 获取弹性IP带宽改动价格 结果类
 * @author: codezhang
 * @date: 2018-09-27 13:52
 **/

public class GetEIPUpgradePriceResult extends BaseResponseResult {

    /**
     * 调整带宽后的EIP价格, 单位为"元", 如需退费此处为负值
     */
    @SerializedName("Price")
    private BigDecimal price;

    @Override
    public String toString() {
        return "GetEIPUpgradePriceResult{" +
                "price=" + price +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
