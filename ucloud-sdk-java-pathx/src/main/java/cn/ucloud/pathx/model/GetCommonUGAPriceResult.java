package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;


/**
 * @Description : 获取苹果加速通道价格 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class GetCommonUGAPriceResult extends BaseResponseResult {
    /**
     * 价格
     */
    @SerializedName("Price")
    private BigDecimal price;


    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


}