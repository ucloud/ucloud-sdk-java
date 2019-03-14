package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-14 10:35
 **/
public class Price {

    @SerializedName("Price")
    private Double price;

    @SerializedName("PurchaseValue")
    private Integer purchaseValue;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(Integer purchaseValue) {
        this.purchaseValue = purchaseValue;
    }
}
