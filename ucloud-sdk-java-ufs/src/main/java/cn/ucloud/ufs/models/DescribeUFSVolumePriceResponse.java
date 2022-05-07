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
package cn.ucloud.ufs.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUFSVolumePriceResponse extends Response {

    /** ufs 价格信息 */
    @SerializedName("DataSet")
    private List<UFSPriceDataSet> dataSet;

    public List<UFSPriceDataSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UFSPriceDataSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class UFSPriceDataSet extends Response {

        /** Year， Month， Dynamic，Trial */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 价格 (单位: 分) */
        @SerializedName("Price")
        private Double price;

        /** “UFS” */
        @SerializedName("ChargeName")
        private String chargeName;

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

        public String getChargeName() {
            return chargeName;
        }

        public void setChargeName(String chargeName) {
            this.chargeName = chargeName;
        }
    }
}
