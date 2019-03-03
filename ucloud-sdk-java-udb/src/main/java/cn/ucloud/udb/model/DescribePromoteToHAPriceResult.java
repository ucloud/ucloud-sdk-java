package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 获取普通单点实例升级高可用实例的差价
 * @Author : codezhang
 * @Date : 2019-03-03 17:00
 **/
public class DescribePromoteToHAPriceResult extends BaseResponseResult {

    /**
     * 普通升级高可用的差价，单位为分
     */
    @SerializedName("Price")
    private Integer price;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "DescribePromoteToHAPriceResult{" +
                "price=" + price +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
