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
package cn.ucloud.uddb.models;


import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;

public class DescribeUDDBInstanceUpgradePriceResponse extends Response {

    /** 价格明细, 参考PriceInfo对象定义 */
    @SerializedName("PriceInfo")
    private PriceInfo priceInfo;

    public PriceInfo getPriceInfo() {
        return priceInfo;
    }

    public void setPriceInfo(PriceInfo priceInfo) {
        this.priceInfo = priceInfo;
    }

    public static class PriceInfo extends Response {

        /** 中间件路由节点费用 */
        @SerializedName("MiddlewarePrice")
        private Double middlewarePrice;

        /** 存储节点费用 */
        @SerializedName("DataNodePrice")
        private Double dataNodePrice;

        /** 只读实例费用 */
        @SerializedName("DataNodeSlavePrice")
        private Double dataNodeSlavePrice;

        public Double getMiddlewarePrice() {
            return middlewarePrice;
        }

        public void setMiddlewarePrice(Double middlewarePrice) {
            this.middlewarePrice = middlewarePrice;
        }

        public Double getDataNodePrice() {
            return dataNodePrice;
        }

        public void setDataNodePrice(Double dataNodePrice) {
            this.dataNodePrice = dataNodePrice;
        }

        public Double getDataNodeSlavePrice() {
            return dataNodeSlavePrice;
        }

        public void setDataNodeSlavePrice(Double dataNodeSlavePrice) {
            this.dataNodeSlavePrice = dataNodeSlavePrice;
        }
    }
}
