/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.udisk.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeUDiskPriceResponse extends Response {

    /** 价格参数列表，具体说明见 UDiskPriceDataSet */
    @SerializedName("DataSet")
    private List<UDiskPriceDataSet> dataSet;

    public List<UDiskPriceDataSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDiskPriceDataSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class UDiskPriceDataSet extends Response {

        /** Year， Month， Dynamic，Trial */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 实际价格 (单位: 分) */
        @SerializedName("Price")
        private Integer price;

        /** "UDataArk","SnapshotService","UDisk","Total" */
        @SerializedName("ChargeName")
        private String chargeName;

        /** 用户折后价(对应计费CustomPrice) */
        @SerializedName("OriginalPrice")
        private Integer originalPrice;

        /** 原价(对应计费OriginalPrice) */
        @SerializedName("ListPrice")
        private Integer listPrice;

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public String getChargeName() {
            return chargeName;
        }

        public void setChargeName(String chargeName) {
            this.chargeName = chargeName;
        }

        public Integer getOriginalPrice() {
            return originalPrice;
        }

        public void setOriginalPrice(Integer originalPrice) {
            this.originalPrice = originalPrice;
        }

        public Integer getListPrice() {
            return listPrice;
        }

        public void setListPrice(Integer listPrice) {
            this.listPrice = listPrice;
        }
    }
}
