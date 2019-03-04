package cn.ucloud.udpn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 获取 UDPN 价格 结果类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-04 11:28
 */
public class GetUDPNPriceResult extends BaseResponseResult {
    /**
     * 资源有效期 unix 时间戳
     */
    @SerializedName("PurchaseValue")
    private Integer purchaseValue;

    /**
     * 专线价格
     */
    @SerializedName("Price")
    private Float price;

    public Integer getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(Integer purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
