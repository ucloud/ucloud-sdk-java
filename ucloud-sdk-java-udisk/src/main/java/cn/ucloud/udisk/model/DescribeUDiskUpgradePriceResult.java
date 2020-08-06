package cn.ucloud.udisk.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * @description: 获取云磁盘配置改变的价格 结果类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 18:28
 */
public class DescribeUDiskUpgradePriceResult extends BaseResponseResult {

    /**
     * 价格
     */
    @SerializedName("Price")
    private BigDecimal price;

    /**
     * 原始价格
     */
    @SerializedName("OriginalPrice")
    private BigDecimal originalPrice;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }
}
