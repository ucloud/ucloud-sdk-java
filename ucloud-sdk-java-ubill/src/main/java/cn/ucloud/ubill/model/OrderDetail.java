package cn.ucloud.ubill.model;

import com.google.gson.annotations.SerializedName;

/**
 * @author: codezhang
 * @date: 2020/2/13 11:34 上午
 * @describe: 配置详情
 **/
public class OrderDetail {

    /**
     * 产品名
     */
    @SerializedName("ProductName")
    private String productName;

    /**
     * 配置
     */
    @SerializedName("Value")
    private String value;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
