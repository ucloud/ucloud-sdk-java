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

public class GetUFileDailyBillResponse extends Response {

    /** 消费情况 */
    @SerializedName("DataSet")
    private List<BucketBills> dataSet;

    public List<BucketBills> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<BucketBills> dataSet) {
        this.dataSet = dataSet;
    }

    public static class BucketBills extends Response {

        /** */
        @SerializedName("BucketBills")
        private List<UFileDailyBillItem> bucketBills;

        public List<UFileDailyBillItem> getBucketBills() {
            return bucketBills;
        }

        public void setBucketBills(List<UFileDailyBillItem> bucketBills) {
            this.bucketBills = bucketBills;
        }
    }

    public static class UFileDailyBillItem extends Response {

        /** 下载低频存储次数费用；分 */
        @SerializedName("GetCountIaBill")
        private Double getCountIaBill;

        /** 下载标准存储次数费用；分 */
        @SerializedName("GetCountBill")
        private Double getCountBill;

        /** 上传归档存储次数费用；分 */
        @SerializedName("PutCountAcBill")
        private Double putCountAcBill;

        /** 上传低频存储次数费用；分 */
        @SerializedName("PutCountIaBill")
        private Double putCountIaBill;

        /** 上传标准存储次数费用；分 */
        @SerializedName("PutCountBill")
        private Double putCountBill;

        /** 对象标签费用: 分 */
        @SerializedName("ObjectTagCountBill")
        private Double objectTagCountBill;

        /** 标准-存储总容量费用；分 */
        @SerializedName("StorageBill")
        private Double storageBill;

        /** 低频-存储总容量费用；分 */
        @SerializedName("IaStorageBill")
        private Double iaStorageBill;

        /** 归档-存储总容量费用；分 */
        @SerializedName("AcStorageBill")
        private Double acStorageBill;

        /** 低频-数据取回量，即低频文件的数据取回量费用；分 */
        @SerializedName("IaGetSizeBill")
        private Double iaGetSizeBill;

        /** 归档-标准解冻量，即归档文件的解冻类型为标准（Strandard）的解冻量费用； 分 */
        @SerializedName("AcRestoreBill")
        private Double acRestoreBill;

        /** 归档-高优先级解冻量，即归档文件的解冻类型为高优先级（Expedited）的解冻量费用； 分 */
        @SerializedName("AcExpeditedRetrievalBill")
        private Double acExpeditedRetrievalBill;

        /** 低频-短期存储量，即补足未满最短存储期限的剩余天数的存储量费用；分 */
        @SerializedName("IaShortStorageBill")
        private Double iaShortStorageBill;

        /** 归档-短期存储量，即补足未满最短存储期限的剩余天数的存储量费用；分 */
        @SerializedName("AcShortStorageBill")
        private Double acShortStorageBill;

        /** 基础图片处理量费用；分 */
        @SerializedName("ImageHandleFlowBill")
        private Double imageHandleFlowBill;

        /** 图片高级压缩次数费用；分 */
        @SerializedName("ImageCompressCountBill")
        private Double imageCompressCountBill;

        /** 忙时流量费用；分；海外无此字段 */
        @SerializedName("BusyFlowBill")
        private Double busyFlowBill;

        /** 闲时流量费用；分；海外无此字段 */
        @SerializedName("IdleFlowBill")
        private Double idleFlowBill;

        /** cdn回源流量费用;分 */
        @SerializedName("CdnFlowBill")
        private Double cdnFlowBill;

        /** 下载流量费用：分；国内无此字段 */
        @SerializedName("FlowBill")
        private Double flowBill;

        /** 配额消费时间，unix时间戳；单位s，精确到日期 */
        @SerializedName("Date")
        private Integer date;

        /** 下载归档存储次数费用；分 */
        @SerializedName("GetCountAcBill")
        private Double getCountAcBill;

        public Double getGetCountIaBill() {
            return getCountIaBill;
        }

        public void setGetCountIaBill(Double getCountIaBill) {
            this.getCountIaBill = getCountIaBill;
        }

        public Double getGetCountBill() {
            return getCountBill;
        }

        public void setGetCountBill(Double getCountBill) {
            this.getCountBill = getCountBill;
        }

        public Double getPutCountAcBill() {
            return putCountAcBill;
        }

        public void setPutCountAcBill(Double putCountAcBill) {
            this.putCountAcBill = putCountAcBill;
        }

        public Double getPutCountIaBill() {
            return putCountIaBill;
        }

        public void setPutCountIaBill(Double putCountIaBill) {
            this.putCountIaBill = putCountIaBill;
        }

        public Double getPutCountBill() {
            return putCountBill;
        }

        public void setPutCountBill(Double putCountBill) {
            this.putCountBill = putCountBill;
        }

        public Double getObjectTagCountBill() {
            return objectTagCountBill;
        }

        public void setObjectTagCountBill(Double objectTagCountBill) {
            this.objectTagCountBill = objectTagCountBill;
        }

        public Double getStorageBill() {
            return storageBill;
        }

        public void setStorageBill(Double storageBill) {
            this.storageBill = storageBill;
        }

        public Double getIaStorageBill() {
            return iaStorageBill;
        }

        public void setIaStorageBill(Double iaStorageBill) {
            this.iaStorageBill = iaStorageBill;
        }

        public Double getAcStorageBill() {
            return acStorageBill;
        }

        public void setAcStorageBill(Double acStorageBill) {
            this.acStorageBill = acStorageBill;
        }

        public Double getIaGetSizeBill() {
            return iaGetSizeBill;
        }

        public void setIaGetSizeBill(Double iaGetSizeBill) {
            this.iaGetSizeBill = iaGetSizeBill;
        }

        public Double getAcRestoreBill() {
            return acRestoreBill;
        }

        public void setAcRestoreBill(Double acRestoreBill) {
            this.acRestoreBill = acRestoreBill;
        }

        public Double getAcExpeditedRetrievalBill() {
            return acExpeditedRetrievalBill;
        }

        public void setAcExpeditedRetrievalBill(Double acExpeditedRetrievalBill) {
            this.acExpeditedRetrievalBill = acExpeditedRetrievalBill;
        }

        public Double getIaShortStorageBill() {
            return iaShortStorageBill;
        }

        public void setIaShortStorageBill(Double iaShortStorageBill) {
            this.iaShortStorageBill = iaShortStorageBill;
        }

        public Double getAcShortStorageBill() {
            return acShortStorageBill;
        }

        public void setAcShortStorageBill(Double acShortStorageBill) {
            this.acShortStorageBill = acShortStorageBill;
        }

        public Double getImageHandleFlowBill() {
            return imageHandleFlowBill;
        }

        public void setImageHandleFlowBill(Double imageHandleFlowBill) {
            this.imageHandleFlowBill = imageHandleFlowBill;
        }

        public Double getImageCompressCountBill() {
            return imageCompressCountBill;
        }

        public void setImageCompressCountBill(Double imageCompressCountBill) {
            this.imageCompressCountBill = imageCompressCountBill;
        }

        public Double getBusyFlowBill() {
            return busyFlowBill;
        }

        public void setBusyFlowBill(Double busyFlowBill) {
            this.busyFlowBill = busyFlowBill;
        }

        public Double getIdleFlowBill() {
            return idleFlowBill;
        }

        public void setIdleFlowBill(Double idleFlowBill) {
            this.idleFlowBill = idleFlowBill;
        }

        public Double getCdnFlowBill() {
            return cdnFlowBill;
        }

        public void setCdnFlowBill(Double cdnFlowBill) {
            this.cdnFlowBill = cdnFlowBill;
        }

        public Double getFlowBill() {
            return flowBill;
        }

        public void setFlowBill(Double flowBill) {
            this.flowBill = flowBill;
        }

        public Integer getDate() {
            return date;
        }

        public void setDate(Integer date) {
            this.date = date;
        }

        public Double getGetCountAcBill() {
            return getCountAcBill;
        }

        public void setGetCountAcBill(Double getCountAcBill) {
            this.getCountAcBill = getCountAcBill;
        }
    }
}
