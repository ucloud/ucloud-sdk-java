package cn.ucloud.udisk.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

/**
 * @description: 获取云硬盘价格 结果类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/18 10:01
 */
public class DescribeUDiskPriceResult extends BaseResponseResult {

    /**
     * 价格参数列表，具体说明见 UDiskPriceDataSet
     */
    @SerializedName("DataSet")
    private List<UDiskPriceDataSet> dataSet;


    public class UDiskPriceDataSet {
        /**
         * Year， Month， Dynamic，Trial
         */
        @SerializedName("ChargeType")
        private String chargeType;

        /**
         * 实际价格 (单位: 分)
         */
        @SerializedName("Price")
        private BigDecimal price;

        /**
         * 用户折后价(对应计费CustomPrice)
         */
        @SerializedName("OriginalPrice")
        private BigDecimal originalPrice;

        /**
         * "UDataArk","UDisk"
         */
        @SerializedName("ChargeName")
        private String chargeName;

        /**
         * 原价(对应计费OriginalPrice)
         */
        @SerializedName("ListPrice")
        private BigDecimal listPrice;

        public BigDecimal getListPrice() {
            return listPrice;
        }

        public void setListPrice(BigDecimal listPrice) {
            this.listPrice = listPrice;
        }

        public BigDecimal getOriginalPrice() {
            return originalPrice;
        }

        public void setOriginalPrice(BigDecimal originalPrice) {
            this.originalPrice = originalPrice;
        }

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

        public String getChargeName() {
            return chargeName;
        }

        public void setChargeName(String chargeName) {
            this.chargeName = chargeName;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }

    public List<UDiskPriceDataSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDiskPriceDataSet> dataSet) {
        this.dataSet = dataSet;
    }
}
