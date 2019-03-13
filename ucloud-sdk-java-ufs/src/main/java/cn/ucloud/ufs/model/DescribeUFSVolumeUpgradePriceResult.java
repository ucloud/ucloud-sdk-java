package cn.ucloud.ufs.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * @description: 文件系统扩容价格 结果类
 * @author: codezhang
 * @date: 2018-10-08 16:33
 **/

public class DescribeUFSVolumeUpgradePriceResult extends BaseResponseResult {

    /**
     * 价格（单位：分)
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
