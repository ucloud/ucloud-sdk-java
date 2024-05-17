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

public class GetGlobalSSHTrafficResponse extends Response {

    /** 资源ID */
    @SerializedName("UGAId")
    private String ugaId;

    /** 流量统计数据 */
    @SerializedName("DataSet")
    private List<TrafficDaily> dataSet;

    /** 最近3个月日流量统计数据 */
    @SerializedName("TrafficDailyRecently")
    private List<TrafficDailyRecently> trafficDailyRecently;

    public String getUGAId() {
        return ugaId;
    }

    public void setUGAId(String ugaId) {
        this.ugaId = ugaId;
    }

    public List<TrafficDaily> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<TrafficDaily> dataSet) {
        this.dataSet = dataSet;
    }

    public List<TrafficDailyRecently> getTrafficDailyRecently() {
        return trafficDailyRecently;
    }

    public void setTrafficDailyRecently(List<TrafficDailyRecently> trafficDailyRecently) {
        this.trafficDailyRecently = trafficDailyRecently;
    }

    public static class TrafficDaily extends Response {

        /** 日期 */
        @SerializedName("Date")
        private Integer date;

        /** 流量（单位GB） */
        @SerializedName("Traffic")
        private Integer traffic;

        /** Yes:已扣费, No:未扣费 */
        @SerializedName("BillingState")
        private String billingState;

        public Integer getDate() {
            return date;
        }

        public void setDate(Integer date) {
            this.date = date;
        }

        public Integer getTraffic() {
            return traffic;
        }

        public void setTraffic(Integer traffic) {
            this.traffic = traffic;
        }

        public String getBillingState() {
            return billingState;
        }

        public void setBillingState(String billingState) {
            this.billingState = billingState;
        }
    }

    public static class TrafficDailyRecently extends Response {

        /** 日期 */
        @SerializedName("Day")
        private String day;

        /** 日流量(单位MB) */
        @SerializedName("TrafficUnitMB")
        private String trafficUnitMB;

        /** 日流量(单位GB) */
        @SerializedName("TrafficUnitGB")
        private String trafficUnitGB;

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public String getTrafficUnitMB() {
            return trafficUnitMB;
        }

        public void setTrafficUnitMB(String trafficUnitMB) {
            this.trafficUnitMB = trafficUnitMB;
        }

        public String getTrafficUnitGB() {
            return trafficUnitGB;
        }

        public void setTrafficUnitGB(String trafficUnitGB) {
            this.trafficUnitGB = trafficUnitGB;
        }
    }
}
