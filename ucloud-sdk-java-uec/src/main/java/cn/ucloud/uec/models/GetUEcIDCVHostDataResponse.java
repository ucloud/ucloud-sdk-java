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

public class GetUEcIDCVHostDataResponse extends Response {

    /** 监控数据集合 */
    @SerializedName("DataSets")
    private DataSet dataSets;

    public DataSet getDataSets() {
        return dataSets;
    }

    public void setDataSets(DataSet dataSets) {
        this.dataSets = dataSets;
    }

    public static class DataSet extends Response {

        /** cpu使用率 */
        @SerializedName("CPUUtilization")
        private List<MonitorInfo> cpuUtilization;

        /** 内存使用率 */
        @SerializedName("MemUtilization")
        private List<MonitorInfo> memUtilization;

        /** 网卡出带宽 */
        @SerializedName("NICOut")
        private List<MonitorInfo> nicOut;

        /** 网卡入带宽 */
        @SerializedName("NICIn")
        private List<MonitorInfo> nicIn;

        /** 网卡出包量 */
        @SerializedName("NetPacketOut")
        private List<MonitorInfo> netPacketOut;

        /** 网卡入包量 */
        @SerializedName("NetPacketIn")
        private List<MonitorInfo> netPacketIn;

        /** 磁盘读取量 */
        @SerializedName("IORead")
        private List<MonitorInfo> ioRead;

        /** 磁盘写入量 */
        @SerializedName("IOWrite")
        private List<MonitorInfo> ioWrite;

        /** 磁盘读取次数 */
        @SerializedName("DiskReadOps")
        private List<MonitorInfo> diskReadOps;

        /** 磁盘写入次数 */
        @SerializedName("DiskWriteOps")
        private List<MonitorInfo> diskWriteOps;

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

        public List<MonitorInfo> getIORead() {
            return ioRead;
        }

        public void setIORead(List<MonitorInfo> ioRead) {
            this.ioRead = ioRead;
        }

        public List<MonitorInfo> getIOWrite() {
            return ioWrite;
        }

        public void setIOWrite(List<MonitorInfo> ioWrite) {
            this.ioWrite = ioWrite;
        }

        public List<MonitorInfo> getDiskReadOps() {
            return diskReadOps;
        }

        public void setDiskReadOps(List<MonitorInfo> diskReadOps) {
            this.diskReadOps = diskReadOps;
        }

        public List<MonitorInfo> getDiskWriteOps() {
            return diskWriteOps;
        }

        public void setDiskWriteOps(List<MonitorInfo> diskWriteOps) {
            this.diskWriteOps = diskWriteOps;
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
