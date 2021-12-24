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
package cn.ucloud.uec.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;

public class GetUEcPodPriceResponse extends Response {

    /** 容器组价格: false */
    @SerializedName("HolderPrice")
    private Double holderPrice;

    /** IP和带宽价格: false */
    @SerializedName("IpPrice")
    private Double ipPrice;

    public Double getHolderPrice() {
        return holderPrice;
    }

    public void setHolderPrice(Double holderPrice) {
        this.holderPrice = holderPrice;
    }

    public Double getIpPrice() {
        return ipPrice;
    }

    public void setIpPrice(Double ipPrice) {
        this.ipPrice = ipPrice;
    }
}