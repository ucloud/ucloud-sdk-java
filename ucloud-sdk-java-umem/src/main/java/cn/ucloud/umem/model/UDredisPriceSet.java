package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : UDredisPriceSet 模型类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class UDredisPriceSet  {
            /**
            * Year， Month， Dynamic，Trial
            */
            @SerializedName("ChargeType")
                private String chargeType;
            /**
            * 价格，单位: 元，保留小数点后两位有效数字
            */
            @SerializedName("Price")
                private String price;


                public String getChargeType() {
                return this.chargeType;
                }

                public void setChargeType(String chargeType) {
                this.chargeType = chargeType;
                }
                public String getPrice() {
                return this.price;
                }

                public void setPrice(String price) {
                this.price = price;
                }


}