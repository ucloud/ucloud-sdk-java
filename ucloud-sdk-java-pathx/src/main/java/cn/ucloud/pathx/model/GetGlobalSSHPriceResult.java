package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 获取GlobalSSH价格 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class GetGlobalSSHPriceResult extends BaseResponseResult {
    /**
     * 价格,返回单位为元
     */
    @SerializedName("Price")
    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}