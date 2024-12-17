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

public class GetUFileDailyReportResponse extends Response {

    /** 消费情况 */
    @SerializedName("DataSet")
    private List<UFileReportItem> dataSet;

    public List<UFileReportItem> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UFileReportItem> dataSet) {
        this.dataSet = dataSet;
    }

    public static class UFileDailyReportItem extends Response {

        /** 标准-存储总容量；单位GB */
        @SerializedName("Storage")
        private Double storage;

        /** 低频-存储总容量；单位GB */
        @SerializedName("IaStorage")
        private Double iaStorage;

        /** 归档-存储总容量；单位GB */
        @SerializedName("AcStorage")
        private Double acStorage;

        /** 低频-数据取回量，即低频文件的数据取回量；单位GB */
        @SerializedName("IaGetSize")
        private Double iaGetSize;

        /** 归档-标准解冻量，即归档文件的解冻类型为标准（Strandard）的解冻量；单位GB */
        @SerializedName("AcRestore")
        private Double acRestore;

        /** 归档-高优先级解冻量，即归档文件的解冻类型为高优先级（Expedited）的解冻量；单位GB */
        @SerializedName("AcExpeditedRetrieval")
        private Double acExpeditedRetrieval;

        /** 低频-短期存储量，即补足未满最短存储期限的剩余天数的存储量；单位GB */
        @SerializedName("IaShortStorage")
        private Double iaShortStorage;

        /** 归档-短期存储量，即补足未满最短存储期限的剩余天数的存储量；单位GB */
        @SerializedName("AcShortStorage")
        private Double acShortStorage;

        /** 基础图片处理量；单位GB */
        @SerializedName("ImageHandleFlow")
        private Double imageHandleFlow;

        /** 图片高级压缩次数；单位千次 */
        @SerializedName("ImageCompressCount")
        private Double imageCompressCount;

        /** 忙时流量；单位GB；海外无此字段 */
        @SerializedName("BusyFlow")
        private Double busyFlow;

        /** 闲时流量；单位GB；海外无此字段 */
        @SerializedName("IdleFlow")
        private Double idleFlow;

        /** cdn回源流量;单位GB */
        @SerializedName("CdnFlow")
        private Double cdnFlow;

        /** 下载流量：单位GB；国内无此字段 */
        @SerializedName("Flow")
        private Double flow;

        /** 配额消费时间，unix时间戳；单位s，精确到日期 */
        @SerializedName("Date")
        private Integer date;

        /** 请求次数；单位万次 */
        @SerializedName("ApiTimes")
        private Double apiTimes;

        /** 对象标签个数; 单位万个 */
        @SerializedName("ObjectTagCount")
        private Double objectTagCount;

        public Double getStorage() {
            return storage;
        }

        public void setStorage(Double storage) {
            this.storage = storage;
        }

        public Double getIaStorage() {
            return iaStorage;
        }

        public void setIaStorage(Double iaStorage) {
            this.iaStorage = iaStorage;
        }

        public Double getAcStorage() {
            return acStorage;
        }

        public void setAcStorage(Double acStorage) {
            this.acStorage = acStorage;
        }

        public Double getIaGetSize() {
            return iaGetSize;
        }

        public void setIaGetSize(Double iaGetSize) {
            this.iaGetSize = iaGetSize;
        }

        public Double getAcRestore() {
            return acRestore;
        }

        public void setAcRestore(Double acRestore) {
            this.acRestore = acRestore;
        }

        public Double getAcExpeditedRetrieval() {
            return acExpeditedRetrieval;
        }

        public void setAcExpeditedRetrieval(Double acExpeditedRetrieval) {
            this.acExpeditedRetrieval = acExpeditedRetrieval;
        }

        public Double getIaShortStorage() {
            return iaShortStorage;
        }

        public void setIaShortStorage(Double iaShortStorage) {
            this.iaShortStorage = iaShortStorage;
        }

        public Double getAcShortStorage() {
            return acShortStorage;
        }

        public void setAcShortStorage(Double acShortStorage) {
            this.acShortStorage = acShortStorage;
        }

        public Double getImageHandleFlow() {
            return imageHandleFlow;
        }

        public void setImageHandleFlow(Double imageHandleFlow) {
            this.imageHandleFlow = imageHandleFlow;
        }

        public Double getImageCompressCount() {
            return imageCompressCount;
        }

        public void setImageCompressCount(Double imageCompressCount) {
            this.imageCompressCount = imageCompressCount;
        }

        public Double getBusyFlow() {
            return busyFlow;
        }

        public void setBusyFlow(Double busyFlow) {
            this.busyFlow = busyFlow;
        }

        public Double getIdleFlow() {
            return idleFlow;
        }

        public void setIdleFlow(Double idleFlow) {
            this.idleFlow = idleFlow;
        }

        public Double getCdnFlow() {
            return cdnFlow;
        }

        public void setCdnFlow(Double cdnFlow) {
            this.cdnFlow = cdnFlow;
        }

        public Double getFlow() {
            return flow;
        }

        public void setFlow(Double flow) {
            this.flow = flow;
        }

        public Integer getDate() {
            return date;
        }

        public void setDate(Integer date) {
            this.date = date;
        }

        public Double getApiTimes() {
            return apiTimes;
        }

        public void setApiTimes(Double apiTimes) {
            this.apiTimes = apiTimes;
        }

        public Double getObjectTagCount() {
            return objectTagCount;
        }

        public void setObjectTagCount(Double objectTagCount) {
            this.objectTagCount = objectTagCount;
        }
    }

    public static class UFileReportItem extends Response {

        /** 总消费情况 */
        @SerializedName("Total")
        private List<UFileTotalReportItem> total;

        /** 日消费情况 */
        @SerializedName("Daily")
        private List<UFileDailyReportItem> daily;

        public List<UFileTotalReportItem> getTotal() {
            return total;
        }

        public void setTotal(List<UFileTotalReportItem> total) {
            this.total = total;
        }

        public List<UFileDailyReportItem> getDaily() {
            return daily;
        }

        public void setDaily(List<UFileDailyReportItem> daily) {
            this.daily = daily;
        }
    }

    public static class UFileTotalReportItem extends Response {

        /** 下载流量：单位GB；国内无此字段 */
        @SerializedName("Flow")
        private Double flow;

        /** 闲时流量；单位GB；海外无此字段 */
        @SerializedName("IdleFlow")
        private Double idleFlow;

        /** 忙时流量；单位GB；海外无此字段 */
        @SerializedName("BusyFlow")
        private Double busyFlow;

        /** cdn回源流量;单位GB */
        @SerializedName("CdnFlow")
        private Double cdnFlow;

        /** API请求次数（万次） */
        @SerializedName("ApiTimes")
        private Double apiTimes;

        public Double getFlow() {
            return flow;
        }

        public void setFlow(Double flow) {
            this.flow = flow;
        }

        public Double getIdleFlow() {
            return idleFlow;
        }

        public void setIdleFlow(Double idleFlow) {
            this.idleFlow = idleFlow;
        }

        public Double getBusyFlow() {
            return busyFlow;
        }

        public void setBusyFlow(Double busyFlow) {
            this.busyFlow = busyFlow;
        }

        public Double getCdnFlow() {
            return cdnFlow;
        }

        public void setCdnFlow(Double cdnFlow) {
            this.cdnFlow = cdnFlow;
        }

        public Double getApiTimes() {
            return apiTimes;
        }

        public void setApiTimes(Double apiTimes) {
            this.apiTimes = apiTimes;
        }
    }
}
