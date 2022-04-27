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

import java.util.List;

public class GetUEcHolderMetricsResponse extends Response {

    /** 获得的监控数据（详情参考MetricisDataSet） */
    @SerializedName("DataSets")
    private MetricisDataSet dataSets;

    public MetricisDataSet getDataSets() {
        return dataSets;
    }

    public void setDataSets(MetricisDataSet dataSets) {
        this.dataSets = dataSets;
    }

    public static class MetricisDataSet extends Response {

        /** cpu利用率（详情参考MonitorInfo） */
        @SerializedName("CPUUtilization")
        private List<MonitorInfo> cpuUtilization;

        /** 内存使用率（详情参考MonitorInfo） */
        @SerializedName("MemUtilization")
        private List<MonitorInfo> memUtilization;

        /** 网卡出包数（详情参考MonitorInfo） */
        @SerializedName("NetPacketOut")
        private List<MonitorInfo> netPacketOut;

        /** 网卡入包数（详情参考MonitorInfo） */
        @SerializedName("NetPacketIn")
        private List<MonitorInfo> netPacketIn;

        /** 网卡出带宽（详情参考MonitorInfo） */
        @SerializedName("NICOut")
        private List<MonitorInfo> nicOut;

        /** 网卡入带宽（详情参考MonitorInfo） */
        @SerializedName("NICIn")
        private List<MonitorInfo> nicIn;

        public List<MonitorInfo> getCPUUtilization() {
            return cpuUtilization;
        }

        public void setCPUUtilization(List<MonitorInfo> cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
        }

        public List<MonitorInfo> getMemUtilization() {
            return memUtilization;
        }

        public void setMemUtilization(List<MonitorInfo> memUtilization) {
            this.memUtilization = memUtilization;
        }

        public List<MonitorInfo> getNetPacketOut() {
            return netPacketOut;
        }

        public void setNetPacketOut(List<MonitorInfo> netPacketOut) {
            this.netPacketOut = netPacketOut;
        }

        public List<MonitorInfo> getNetPacketIn() {
            return netPacketIn;
        }

        public void setNetPacketIn(List<MonitorInfo> netPacketIn) {
            this.netPacketIn = netPacketIn;
        }

        public List<MonitorInfo> getNICOut() {
            return nicOut;
        }

        public void setNICOut(List<MonitorInfo> nicOut) {
            this.nicOut = nicOut;
        }

        public List<MonitorInfo> getNICIn() {
            return nicIn;
        }

        public void setNICIn(List<MonitorInfo> nicIn) {
            this.nicIn = nicIn;
        }
    }

    public static class MonitorInfo extends Response {

        /** 时间戳 */
        @SerializedName("TimeStamp")
        private Integer timeStamp;

        /** 值 */
        @SerializedName("Value")
        private Integer value;

        public Integer getTimeStamp() {
            return timeStamp;
        }

        public void setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }
}
