package cn.ucloud.umem.model;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;


/**
 * @Description : DescribeUMemcachePrice 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class UMemcachePriceSet {
    /**
     * 计费模式，Year, Month, Dynamic
     */
    @SerializedName("ChargeType")
    private String chargeType;
    /**
     * 价格，单位: 元，保留小数点后两位有效数字
     */
    @SerializedName("Price")
    private BigDecimal price;

    @SerializedName("OriginalPrice")
    private BigDecimal originalPrice;

    @SerializedName("ListPrice")
    private BigDecimal listPrice;


    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

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

    public BigDecimal getListPrice() {
        return listPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }
}