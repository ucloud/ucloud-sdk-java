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

public class GetNewUcdnLogUrlStatisticsResponse extends Response {

    /** 按天统计实例。: false */
    @SerializedName("UrlStatisticsList")
    private List<UrlStatistics> urlStatisticsList;

    public List<UrlStatistics> getUrlStatisticsList() {
        return urlStatisticsList;
    }

    public void setUrlStatisticsList(List<UrlStatistics> urlStatisticsList) {
        this.urlStatisticsList = urlStatisticsList;
    }

    public static class UrlStatistics extends Response {

        /** : false */
        @SerializedName("UrlList")
        private List<DownloadStatisticInfo> urlList;

        /** 日期: false */
        @SerializedName("Date")
        private String date;

        public List<DownloadStatisticInfo> getUrlList() {
            return urlList;
        }

        public void setUrlList(List<DownloadStatisticInfo> urlList) {
            this.urlList = urlList;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }

    public static class DownloadStatisticInfo extends Response {

        /** 下载链接的url: false */
        @SerializedName("Url")
        private String url;

        /** 流量（单位为G）: false */
        @SerializedName("Traffic")
        private Double traffic;

        /** 下载次数: false */
        @SerializedName("DownloadTimes")
        private Integer downloadTimes;

        /** 流量占比，单位%: false */
        @SerializedName("Percent")
        private Double percent;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Double getTraffic() {
            return traffic;
        }

        public void setTraffic(Double traffic) {
            this.traffic = traffic;
        }

        public Integer getDownloadTimes() {
            return downloadTimes;
        }

        public void setDownloadTimes(Integer downloadTimes) {
            this.downloadTimes = downloadTimes;
        }

        public Double getPercent() {
            return percent;
        }

        public void setPercent(Double percent) {
            this.percent = percent;
        }
    }
}
