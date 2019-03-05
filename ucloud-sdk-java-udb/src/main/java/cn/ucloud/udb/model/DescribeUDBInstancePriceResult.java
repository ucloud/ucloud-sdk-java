package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 获取UDB实例价格信息 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 14:26
 **/
public class DescribeUDBInstancePriceResult extends BaseResponseResult {

    public static class UDBInstancePrice {

        /**
         * Year， Month， Dynamic，Trial
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
     * 价格 参照UDBInstancePrice
     */
    @SerializedName("DateSet")
    private List<UDBInstancePrice> udbInstancePrices;

    public List<UDBInstancePrice> getUdbInstancePrices() {
        return udbInstancePrices;
    }

    public void setUdbInstancePrices(List<UDBInstancePrice> udbInstancePrices) {
        this.udbInstancePrices = udbInstancePrices;
    }
}
