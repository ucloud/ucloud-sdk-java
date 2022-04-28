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

public class GetPathXMetricResponse extends Response {

    /** 监控数据结果集 */
    @SerializedName("DataSet")
    private MetricPeriod dataSet;

    public MetricPeriod getDataSet() {
        return dataSet;
    }

    public void setDataSet(MetricPeriod dataSet) {
        this.dataSet = dataSet;
    }

    public static class MetricPeriod extends Response {

        /** 出向带宽 */
        @SerializedName("NetworkOut")
        private List<MatricPoint> networkOut;

        /** 入向带宽 */
        @SerializedName("NetworkIn")
        private List<MatricPoint> networkIn;

        /** 出向带宽使用率 */
        @SerializedName("NetworkOutUsage")
        private List<MatricPoint> networkOutUsage;

        /** 入向带宽使用率 */
        @SerializedName("NetworkInUsage")
        private List<MatricPoint> networkInUsage;

        public List<MatricPoint> getNetworkOut() {
            return networkOut;
        }

        public void setNetworkOut(List<MatricPoint> networkOut) {
            this.networkOut = networkOut;
        }

        public List<MatricPoint> getNetworkIn() {
            return networkIn;
        }

        public void setNetworkIn(List<MatricPoint> networkIn) {
            this.networkIn = networkIn;
        }

        public List<MatricPoint> getNetworkOutUsage() {
            return networkOutUsage;
        }

        public void setNetworkOutUsage(List<MatricPoint> networkOutUsage) {
            this.networkOutUsage = networkOutUsage;
        }

        public List<MatricPoint> getNetworkInUsage() {
            return networkInUsage;
        }

        public void setNetworkInUsage(List<MatricPoint> networkInUsage) {
            this.networkInUsage = networkInUsage;
        }
    }

    public static class MatricPoint extends Response {

        /** 时间戳 */
        @SerializedName("Timestamp")
        private Integer timestamp;

        /** 监控点数值 */
        @SerializedName("Value")
        private Integer value;

        public Integer getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }
}
