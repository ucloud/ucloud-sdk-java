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
package cn.ucloud.ufile.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GetUFileReportResponse extends Response {

    /** 报表内容 参数见 UFileReportSet */
    @SerializedName("DataSet")
    private List<UFileReportSet> dataSet;

    public List<UFileReportSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UFileReportSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class UFileReportSet extends Response {

        /** 配额消费时间，unix时间戳，精确到日期 */
        @SerializedName("Time")
        private Integer time;

        /** 配额消费当日使用的存储容量，单位：GB*天 */
        @SerializedName("StorageVolume")
        private Double storageVolume;

        /** 配额消费当日使用的下载流量，单位：GB */
        @SerializedName("DownloadTraffic")
        private Double downloadTraffic;

        /** 配额消费当日使用的请求次数，单位：万次 */
        @SerializedName("RequestCount")
        private Double requestCount;

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        public Double getStorageVolume() {
            return storageVolume;
        }

        public void setStorageVolume(Double storageVolume) {
            this.storageVolume = storageVolume;
        }

        public Double getDownloadTraffic() {
            return downloadTraffic;
        }

        public void setDownloadTraffic(Double downloadTraffic) {
            this.downloadTraffic = downloadTraffic;
        }

        public Double getRequestCount() {
            return requestCount;
        }

        public void setRequestCount(Double requestCount) {
            this.requestCount = requestCount;
        }
    }
}
