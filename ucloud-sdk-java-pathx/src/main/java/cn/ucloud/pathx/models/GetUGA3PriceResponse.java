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
package cn.ucloud.pathx.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUGA3PriceResponse extends Response {

    /** 加速大区对应价格 */
    @SerializedName("UGA3Price")
    private List<UGA3Price> uga3Price;

    public List<UGA3Price> getUGA3Price() {
        return uga3Price;
    }

    public void setUGA3Price(List<UGA3Price> uga3Price) {
        this.uga3Price = uga3Price;
    }

    public static class UGA3Price extends Response {

        /** 加速大区代码 */
        @SerializedName("AccelerationArea")
        private String accelerationArea;

        /** 加速大区名称 */
        @SerializedName("AccelerationAreaName")
        private String accelerationAreaName;

        /** 转发配置价格 */
        @SerializedName("AccelerationForwarderPrice")
        private Double accelerationForwarderPrice;

        /** 加速配置带宽价格 */
        @SerializedName("AccelerationBandwidthPrice")
        private Double accelerationBandwidthPrice;

        public String getAccelerationArea() {
            return accelerationArea;
        }

        public void setAccelerationArea(String accelerationArea) {
            this.accelerationArea = accelerationArea;
        }

        public String getAccelerationAreaName() {
            return accelerationAreaName;
        }

        public void setAccelerationAreaName(String accelerationAreaName) {
            this.accelerationAreaName = accelerationAreaName;
        }

        public Double getAccelerationForwarderPrice() {
            return accelerationForwarderPrice;
        }

        public void setAccelerationForwarderPrice(Double accelerationForwarderPrice) {
            this.accelerationForwarderPrice = accelerationForwarderPrice;
        }

        public Double getAccelerationBandwidthPrice() {
            return accelerationBandwidthPrice;
        }

        public void setAccelerationBandwidthPrice(Double accelerationBandwidthPrice) {
            this.accelerationBandwidthPrice = accelerationBandwidthPrice;
        }
    }
}
