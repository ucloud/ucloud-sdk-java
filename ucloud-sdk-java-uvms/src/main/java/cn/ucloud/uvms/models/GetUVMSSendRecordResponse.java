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
package cn.ucloud.uvms.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUVMSSendRecordResponse extends Response {

    /** 总数 */
    @SerializedName("Total")
    private Integer total;

    /** 发送数据 */
    @SerializedName("Data")
    private List<SendRecordItem> data;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<SendRecordItem> getData() {
        return data;
    }

    public void setData(List<SendRecordItem> data) {
        this.data = data;
    }

    public static class SendRecordItem extends Response {

        /** 任务编号 */
        @SerializedName("TaskNo")
        private String taskNo;

        /** 被叫号码 */
        @SerializedName("Phone")
        private String phone;

        /** 主叫号码，如果是随机，可能为空 */
        @SerializedName("ShowNumber")
        private String showNumber;

        /** 预扣量 */
        @SerializedName("PreCost")
        private Integer preCost;

        /** 目标1验证码2通知3营销 */
        @SerializedName("Purpose")
        private Integer purpose;

        /** 国际码 */
        @SerializedName("BrevityCode")
        private String brevityCode;

        /** 国家码 */
        @SerializedName("CountryCode")
        private String countryCode;

        /** 模板ID */
        @SerializedName("TemplateId")
        private String templateId;

        /** 呼叫开始时间(毫秒时间戳) */
        @SerializedName("CallStartTime")
        private Double callStartTime;

        /** 呼叫结束时间(毫秒时间戳) */
        @SerializedName("CallEndTime")
        private Double callEndTime;

        /** 呼叫持续时间 */
        @SerializedName("Duration")
        private Integer duration;

        /** 通道ID */
        @SerializedName("ChannelId")
        private String channelId;

        /** 回执结果1成功2失败3未知 */
        @SerializedName("ReceiptResult")
        private Integer receiptResult;

        /** 回执描述 */
        @SerializedName("ReceiptDesc")
        private String receiptDesc;

        /** 回执时间 */
        @SerializedName("ReceiveTime")
        private Double receiveTime;

        /** 主叫所属城市码 */
        @SerializedName("CallingCityCode")
        private String callingCityCode;

        /** 被叫所属城市码 */
        @SerializedName("CalledCityCode")
        private String calledCityCode;

        /** 被叫供应商码 cmcc中国移动，cucc中国联通,ctcc中国电信 */
        @SerializedName("CalledOperatorCode")
        private String calledOperatorCode;

        /** 客户提交时间 */
        @SerializedName("SubmitTime")
        private Double submitTime;

        /** 1随机号码组2专属号码组 */
        @SerializedName("GroupType")
        private Integer groupType;

        /** 计费时长（秒） */
        @SerializedName("BillSecond")
        private Integer billSecond;

        /** 计费周期（秒） */
        @SerializedName("BillPeriod")
        private Integer billPeriod;

        public String getTaskNo() {
            return taskNo;
        }

        public void setTaskNo(String taskNo) {
            this.taskNo = taskNo;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getShowNumber() {
            return showNumber;
        }

        public void setShowNumber(String showNumber) {
            this.showNumber = showNumber;
        }

        public Integer getPreCost() {
            return preCost;
        }

        public void setPreCost(Integer preCost) {
            this.preCost = preCost;
        }

        public Integer getPurpose() {
            return purpose;
        }

        public void setPurpose(Integer purpose) {
            this.purpose = purpose;
        }

        public String getBrevityCode() {
            return brevityCode;
        }

        public void setBrevityCode(String brevityCode) {
            this.brevityCode = brevityCode;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getTemplateId() {
            return templateId;
        }

        public void setTemplateId(String templateId) {
            this.templateId = templateId;
        }

        public Double getCallStartTime() {
            return callStartTime;
        }

        public void setCallStartTime(Double callStartTime) {
            this.callStartTime = callStartTime;
        }

        public Double getCallEndTime() {
            return callEndTime;
        }

        public void setCallEndTime(Double callEndTime) {
            this.callEndTime = callEndTime;
        }

        public Integer getDuration() {
            return duration;
        }

        public void setDuration(Integer duration) {
            this.duration = duration;
        }

        public String getChannelId() {
            return channelId;
        }

        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public Integer getReceiptResult() {
            return receiptResult;
        }

        public void setReceiptResult(Integer receiptResult) {
            this.receiptResult = receiptResult;
        }

        public String getReceiptDesc() {
            return receiptDesc;
        }

        public void setReceiptDesc(String receiptDesc) {
            this.receiptDesc = receiptDesc;
        }

        public Double getReceiveTime() {
            return receiveTime;
        }

        public void setReceiveTime(Double receiveTime) {
            this.receiveTime = receiveTime;
        }

        public String getCallingCityCode() {
            return callingCityCode;
        }

        public void setCallingCityCode(String callingCityCode) {
            this.callingCityCode = callingCityCode;
        }

        public String getCalledCityCode() {
            return calledCityCode;
        }

        public void setCalledCityCode(String calledCityCode) {
            this.calledCityCode = calledCityCode;
        }

        public String getCalledOperatorCode() {
            return calledOperatorCode;
        }

        public void setCalledOperatorCode(String calledOperatorCode) {
            this.calledOperatorCode = calledOperatorCode;
        }

        public Double getSubmitTime() {
            return submitTime;
        }

        public void setSubmitTime(Double submitTime) {
            this.submitTime = submitTime;
        }

        public Integer getGroupType() {
            return groupType;
        }

        public void setGroupType(Integer groupType) {
            this.groupType = groupType;
        }

        public Integer getBillSecond() {
            return billSecond;
        }

        public void setBillSecond(Integer billSecond) {
            this.billSecond = billSecond;
        }

        public Integer getBillPeriod() {
            return billPeriod;
        }

        public void setBillPeriod(Integer billPeriod) {
            this.billPeriod = billPeriod;
        }
    }
}
