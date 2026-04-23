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
package cn.ucloud.umon.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class GetMetricResponse extends Response {

    /** 数据 */
    @SerializedName("DataSets")
    private DataSet dataSets;

    public DataSet getDataSets() {
        return dataSets;
    }

    public void setDataSets(DataSet dataSets) {
        this.dataSets = dataSets;
    }

    public static class DataSet extends Response {

        /** 时间戳 */
        @SerializedName("Timestamp")
        private Integer timestamp;

        /** 值 */
        @SerializedName("Value")
        private Integer value;

        /** 数据源IP地址 */
        @SerializedName("IP")
        private String ip;

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

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }
    }
}
