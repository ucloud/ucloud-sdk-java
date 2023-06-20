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
package cn.ucloud.unet.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetThroughputDailyBillingInfoResponse extends Response {

    /** EIP流量计费信息，详见模型ThroughputDailyBillingInfo */
    @SerializedName("Stats")
    private List<ThroughputDailyBillingInfo> stats;

    /** 计费总流量 */
    @SerializedName("TotalOut")
    private Integer totalOut;

    /** 资源ID */
    @SerializedName("EIPId")
    private String eipId;

    public List<ThroughputDailyBillingInfo> getStats() {
        return stats;
    }

    public void setStats(List<ThroughputDailyBillingInfo> stats) {
        this.stats = stats;
    }

    public Integer getTotalOut() {
        return totalOut;
    }

    public void setTotalOut(Integer totalOut) {
        this.totalOut = totalOut;
    }

    public String getEIPId() {
        return eipId;
    }

    public void setEIPId(String eipId) {
        this.eipId = eipId;
    }

    public static class ThroughputDailyBillingInfo extends Response {

        /** 计费开始时间 */
        @SerializedName("StartTime")
        private Integer startTime;

        /** 计费结束时间 */
        @SerializedName("EndTime")
        private Integer endTime;

        /** 计费流量，单位“GB” */
        @SerializedName("QuantityOut")
        private Integer quantityOut;

        /** 是否已计费，“Yes”或者“No” */
        @SerializedName("BillingState")
        private String billingState;

        public Integer getStartTime() {
            return startTime;
        }

        public void setStartTime(Integer startTime) {
            this.startTime = startTime;
        }

        public Integer getEndTime() {
            return endTime;
        }

        public void setEndTime(Integer endTime) {
            this.endTime = endTime;
        }

        public Integer getQuantityOut() {
            return quantityOut;
        }

        public void setQuantityOut(Integer quantityOut) {
            this.quantityOut = quantityOut;
        }

        public String getBillingState() {
            return billingState;
        }

        public void setBillingState(String billingState) {
            this.billingState = billingState;
        }
    }
}
