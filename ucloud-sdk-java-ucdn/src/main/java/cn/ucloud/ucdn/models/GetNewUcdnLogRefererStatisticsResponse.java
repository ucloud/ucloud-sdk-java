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
package cn.ucloud.ucdn.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GetNewUcdnLogRefererStatisticsResponse extends Response {

    /** 按天统计实例: false */
    @SerializedName("RefererStatistics")
    private List<RefererStatistics> refererStatistics;

    public List<RefererStatistics> getRefererStatistics() {
        return refererStatistics;
    }

    public void setRefererStatistics(List<RefererStatistics> refererStatistics) {
        this.refererStatistics = refererStatistics;
    }

    public static class RefererStatistics extends Response {

        /** 日期: false */
        @SerializedName("Date")
        private String date;

        /** Referer实例表: false */
        @SerializedName("RefererList")
        private List<RefererList> refererList;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public List<RefererList> getRefererList() {
            return refererList;
        }

        public void setRefererList(List<RefererList> refererList) {
            this.refererList = refererList;
        }
    }

    public static class RefererList extends Response {

        /** 客户端请求的referer: false */
        @SerializedName("Referer")
        private String referer;

        /** 次数: false */
        @SerializedName("RequestTimes")
        private Integer requestTimes;

        /** 次数占比，单位%: false */
        @SerializedName("Percent")
        private Double percent;

        public String getReferer() {
            return referer;
        }

        public void setReferer(String referer) {
            this.referer = referer;
        }

        public Integer getRequestTimes() {
            return requestTimes;
        }

        public void setRequestTimes(Integer requestTimes) {
            this.requestTimes = requestTimes;
        }

        public Double getPercent() {
            return percent;
        }

        public void setPercent(Double percent) {
            this.percent = percent;
        }
    }
}
