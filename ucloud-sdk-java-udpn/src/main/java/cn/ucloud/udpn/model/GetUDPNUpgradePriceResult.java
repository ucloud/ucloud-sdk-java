package cn.ucloud.udpn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 获取专线升级价格 结果类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-04 11:28
 */
public class GetUDPNUpgradePriceResult extends BaseResponseResult {
    /**
     * 专线价格
     */
    @SerializedName("Price")
    private Float price;

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
