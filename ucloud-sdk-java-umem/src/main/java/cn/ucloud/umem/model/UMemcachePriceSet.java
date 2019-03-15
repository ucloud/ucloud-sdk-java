package cn.ucloud.umem.model;

import com.google.gson.annotations.SerializedName;


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
    private Double price;


    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


}