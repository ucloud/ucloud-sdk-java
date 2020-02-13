package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;
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

    @SerializedName("PurchaseValue")
    private Integer purchaseValue;

    /**
     * 请求UUID
     */
    @SerializedName("Request_uuid")
    private String requestUuid;

    @SerializedName("OriginalPrice")
    private BigDecimal originalPrice;

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getRequestUuid() {
        return requestUuid;
    }

    public void setRequestUuid(String requestUuid) {
        this.requestUuid = requestUuid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(Integer purchaseValue) {
        this.purchaseValue = purchaseValue;
    }
}
