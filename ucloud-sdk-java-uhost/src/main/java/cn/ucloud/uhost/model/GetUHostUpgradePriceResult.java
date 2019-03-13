package cn.ucloud.uhost.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * @description: 获取主机配置升级价格 结果对象
 * @author: codezhang
 * @date: 2018-09-18 17:52
 **/

public class GetUHostUpgradePriceResult extends BaseResponseResult {

    /**
     * 升级差价
     */
    @SerializedName("Price")
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
