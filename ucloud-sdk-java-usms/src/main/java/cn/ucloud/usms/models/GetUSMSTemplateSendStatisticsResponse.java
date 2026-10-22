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
package cn.ucloud.usms.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUSMSTemplateSendStatisticsResponse extends Response {

    /** 返回记录数 */
    @SerializedName("Total")
    private Integer total;

    /** 符合查询条件的发送数据统计求和集，具体字段信息见StatisticsData模型 */
    @SerializedName("StatisticsData")
    private StatisticsData statisticsData;

    /** 以天为统计维度的发送数据统计集合，每天的统计数据字段详见TemplateStatisticsDataInfo模型 */
    @SerializedName("Data")
    private List<TemplateStatisticsDataInfo> data;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public StatisticsData getStatisticsData() {
        return statisticsData;
    }

    public void setStatisticsData(StatisticsData statisticsData) {
        this.statisticsData = statisticsData;
    }

    public List<TemplateStatisticsDataInfo> getData() {
        return data;
    }

    public void setData(List<TemplateStatisticsDataInfo> data) {
        this.data = data;
    }

    public static class StatisticsData extends Response {

        /** 状态未知数（提交条数） */
        @SerializedName("UnknownCount")
        private Integer unknownCount;

        /** 发送成功数（提交条数） */
        @SerializedName("SuccessCount")
        private Integer successCount;

        /** 发送总数（拆分条数） */
        @SerializedName("SendCostCount")
        private Integer sendCostCount;

        /** 发送失败数（提交条数） */
        @SerializedName("FailCount")
        private Integer failCount;

        /** 发送总数（提交条数） */
        @SerializedName("SendCount")
        private Integer sendCount;

        /** 发送成功数（拆分条数） */
        @SerializedName("SuccessCostCount")
        private Integer successCostCount;

        /** 发送失败数（拆分条数） */
        @SerializedName("FailCostCount")
        private Integer failCostCount;

        /** 状态未知数（拆分条数） */
        @SerializedName("UnknownCostCount")
        private Integer unknownCostCount;

        /** 提交失败数（提交条数） */
        @SerializedName("SubmitFailCount")
        private Integer submitFailCount;

        /** 提交失败数（拆分条数） */
        @SerializedName("SubmitFailCostCount")
        private Integer submitFailCostCount;

        public Integer getUnknownCount() {
            return unknownCount;
        }

        public void setUnknownCount(Integer unknownCount) {
            this.unknownCount = unknownCount;
        }

        public Integer getSuccessCount() {
            return successCount;
        }

        public void setSuccessCount(Integer successCount) {
            this.successCount = successCount;
        }

        public Integer getSendCostCount() {
            return sendCostCount;
        }

        public void setSendCostCount(Integer sendCostCount) {
            this.sendCostCount = sendCostCount;
        }

        public Integer getFailCount() {
            return failCount;
        }

        public void setFailCount(Integer failCount) {
            this.failCount = failCount;
        }

        public Integer getSendCount() {
            return sendCount;
        }

        public void setSendCount(Integer sendCount) {
            this.sendCount = sendCount;
        }

        public Integer getSuccessCostCount() {
            return successCostCount;
        }

        public void setSuccessCostCount(Integer successCostCount) {
            this.successCostCount = successCostCount;
        }

        public Integer getFailCostCount() {
            return failCostCount;
        }

        public void setFailCostCount(Integer failCostCount) {
            this.failCostCount = failCostCount;
        }

        public Integer getUnknownCostCount() {
            return unknownCostCount;
        }

        public void setUnknownCostCount(Integer unknownCostCount) {
            this.unknownCostCount = unknownCostCount;
        }

        public Integer getSubmitFailCount() {
            return submitFailCount;
        }

        public void setSubmitFailCount(Integer submitFailCount) {
            this.submitFailCount = submitFailCount;
        }

        public Integer getSubmitFailCostCount() {
            return submitFailCostCount;
        }

        public void setSubmitFailCostCount(Integer submitFailCostCount) {
            this.submitFailCostCount = submitFailCostCount;
        }
    }

    public static class TemplateStatisticsDataInfo extends Response {

        /** 发送时间 */
        @SerializedName("SendDate")
        private String sendDate;

        /** 国际/地区标识码 */
        @SerializedName("BrevityCode")
        private String brevityCode;

        /** 短信模板ID */
        @SerializedName("TemplateId")
        private String templateId;

        /** 发送总数（提交条数） */
        @SerializedName("Count")
        private Integer count;

        /** 发送总数（拆分条数） */
        @SerializedName("CostCount")
        private Integer costCount;

        /** 发送成功数（提交条数） */
        @SerializedName("SuccessCount")
        private Integer successCount;

        /** 发送成功数（拆分条数） */
        @SerializedName("SuccessCostCount")
        private Integer successCostCount;

        /** 发送失败数（提交条数） */
        @SerializedName("FailedCount")
        private Integer failedCount;

        /** 发送失败数（拆分条数） */
        @SerializedName("FailedCostCount")
        private Integer failedCostCount;

        /** 状态未知数（提交条数） */
        @SerializedName("UnknownCount")
        private Integer unknownCount;

        /** 状态未知数（拆分条数） */
        @SerializedName("UnknownCostCount")
        private Integer unknownCostCount;

        /** 提交失败数（提交条数） */
        @SerializedName("SubmitFailedCount")
        private Integer submitFailedCount;

        /** 提交失败数（拆分条数） */
        @SerializedName("SubmitFailedCostCount")
        private Integer submitFailedCostCount;

        public String getSendDate() {
            return sendDate;
        }

        public void setSendDate(String sendDate) {
            this.sendDate = sendDate;
        }

        public String getBrevityCode() {
            return brevityCode;
        }

        public void setBrevityCode(String brevityCode) {
            this.brevityCode = brevityCode;
        }

        public String getTemplateId() {
            return templateId;
        }

        public void setTemplateId(String templateId) {
            this.templateId = templateId;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Integer getCostCount() {
            return costCount;
        }

        public void setCostCount(Integer costCount) {
            this.costCount = costCount;
        }

        public Integer getSuccessCount() {
            return successCount;
        }

        public void setSuccessCount(Integer successCount) {
            this.successCount = successCount;
        }

        public Integer getSuccessCostCount() {
            return successCostCount;
        }

        public void setSuccessCostCount(Integer successCostCount) {
            this.successCostCount = successCostCount;
        }

        public Integer getFailedCount() {
            return failedCount;
        }

        public void setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
        }

        public Integer getFailedCostCount() {
            return failedCostCount;
        }

        public void setFailedCostCount(Integer failedCostCount) {
            this.failedCostCount = failedCostCount;
        }

        public Integer getUnknownCount() {
            return unknownCount;
        }

        public void setUnknownCount(Integer unknownCount) {
            this.unknownCount = unknownCount;
        }

        public Integer getUnknownCostCount() {
            return unknownCostCount;
        }

        public void setUnknownCostCount(Integer unknownCostCount) {
            this.unknownCostCount = unknownCostCount;
        }

        public Integer getSubmitFailedCount() {
            return submitFailedCount;
        }

        public void setSubmitFailedCount(Integer submitFailedCount) {
            this.submitFailedCount = submitFailedCount;
        }

        public Integer getSubmitFailedCostCount() {
            return submitFailedCostCount;
        }

        public void setSubmitFailedCostCount(Integer submitFailedCostCount) {
            this.submitFailedCostCount = submitFailedCostCount;
        }
    }
}
