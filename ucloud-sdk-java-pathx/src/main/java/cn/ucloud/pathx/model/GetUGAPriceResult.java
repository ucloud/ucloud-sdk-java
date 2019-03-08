package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 获取UGA价格 结果类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class GetUGAPriceResult extends BaseResponseResult {
            /**
            * 价格
            */
            @SerializedName("Price")
                private Integer price;


                public Integer getPrice() {
                return this.price;
                }

                public void setPrice(Integer price) {
                this.price = price;
                }






}