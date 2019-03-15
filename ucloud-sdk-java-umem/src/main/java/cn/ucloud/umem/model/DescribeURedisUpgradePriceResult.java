package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 获取uredis升级价格信息 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeURedisUpgradePriceResult extends BaseResponseResult {
    /**
     * 扩容差价，单位: 元，保留小数点后两位有效数字
     */
    @SerializedName("Price")
    private Double price;


    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


}