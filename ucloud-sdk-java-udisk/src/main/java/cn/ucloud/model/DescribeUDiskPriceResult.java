package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/18 10:01
 */
public class DescribeUDiskPriceResult extends BaseResponseResult {

    @SerializedName("DataSet")
    private List<UdiskPriceData> dataSet;

    public List<UdiskPriceData> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UdiskPriceData> dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public class UdiskPriceData {
        /**
         * Year， Month， Dynamic，Trial
         */
        @SerializedName("ChargeType")
        private String chargeType;

        /**
         * 价格
         */
        @SerializedName("Price")
        private float price;

        /**
         * "UDataArk","UDisk"
         */
        @SerializedName("ChargeName")
        private String chargeName;

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
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
}
