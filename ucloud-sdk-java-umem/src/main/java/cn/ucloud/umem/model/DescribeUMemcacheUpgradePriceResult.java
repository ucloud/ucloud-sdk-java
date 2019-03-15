package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 获取umemcache升级价格 结果类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DescribeUMemcacheUpgradePriceResult extends BaseResponseResult {
            /**
            * 价格，单位：元
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