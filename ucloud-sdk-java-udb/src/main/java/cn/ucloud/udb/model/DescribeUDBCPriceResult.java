package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 获得专区价格信息 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 10:59
 **/
public class DescribeUDBCPriceResult extends BaseResponseResult {

    public static class UDBCInstancePrice {

        /**
         * Year， Month
         */
        @SerializedName("ChargeType")
        private String chargeType;

        /**
         * 价格，单位为分，保留小数点后两位
         */
        @SerializedName("Price")
        private Double price;

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
    }

    /**
     * 价格 参照UDBCInstancePrice
     */
    @SerializedName("DataSet")
    private List<UDBCInstancePrice> prices;

    public List<UDBCInstancePrice> getPrices() {
        return prices;
    }

    public void setPrices(List<UDBCInstancePrice> prices) {
        this.prices = prices;
    }

}
