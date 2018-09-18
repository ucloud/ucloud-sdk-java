package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

/**
 * @description: 获取主机价格 结果类
 * @author: codezhang
 * @date: 2018-09-18 11:36
 **/

public class GetUHostInstancePriceResult extends BaseResponseResult {

    public class Price{
        /**
         * 付费方式
         */
        @SerializedName("ChargeType")
        private String chargeType;

        /**
         * 价格
         */
        @SerializedName("Price")
        private BigDecimal price;

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Price{" +
                    "chargeType='" + chargeType + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    /**
     * 价格列表 UHostPriceSet
     */
    @SerializedName("PriceSet")
    private List<Price> prices;

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "GetUHostInstancePriceResult{" +
                "prices=" + prices +
                '}';
    }
}
