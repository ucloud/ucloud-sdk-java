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
package cn.ucloud.uai_modelverse.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListUMInferRequestLogsResponse extends Response {

    /** 日志明细列表返回数据 */
    @SerializedName("Data")
    private ListUMInferRequestLogsData data;

    public ListUMInferRequestLogsData getData() {
        return data;
    }

    public void setData(ListUMInferRequestLogsData data) {
        this.data = data;
    }

    public static class ListUMInferRequestLogsData extends Response {

        /** 汇总信息 */
        @SerializedName("Summary")
        private RequestLogSummary summary;

        /** 日志列表，数组元素为 RequestLogItem */
        @SerializedName("Items")
        private List<RequestLogItem> items;

        public RequestLogSummary getSummary() {
            return summary;
        }

        public void setSummary(RequestLogSummary summary) {
            this.summary = summary;
        }

        public List<RequestLogItem> getItems() {
            return items;
        }

        public void setItems(List<RequestLogItem> items) {
            this.items = items;
        }
    }

    public static class RequestLogItem extends Response {

        /** 请求 ID */
        @SerializedName("RequestId")
        private String requestId;

        /** 请求开始时间，Unix 毫秒时间戳 */
        @SerializedName("StartTime")
        private Integer startTime;

        /** 请求开始时间，可读格式 */
        @SerializedName("StartTimeReadable")
        private String startTimeReadable;

        /** 业务地域 */
        @SerializedName("Region")
        private String region;

        /** 模型名称 */
        @SerializedName("ModelName")
        private String modelName;

        /** API Key ID */
        @SerializedName("ApiKeyId")
        private String apiKeyId;

        /** API Key 名称 */
        @SerializedName("ApiKeyName")
        private String apiKeyName;

        /** 请求总延迟，单位毫秒 */
        @SerializedName("Latency")
        private Integer latency;

        /** 首 Token 延迟，单位毫秒 */
        @SerializedName("FirstTokenLatency")
        private Integer firstTokenLatency;

        /** 输出 Token 吞吐 */
        @SerializedName("OutputTokenThroughput")
        private Double outputTokenThroughput;

        /** HTTP 状态码 */
        @SerializedName("HttpStatusCode")
        private Integer httpStatusCode;

        /** 错误码 */
        @SerializedName("ErrorCode")
        private String errorCode;

        /** 请求是否成功 */
        @SerializedName("IsSuccess")
        private Boolean isSuccess;

        /** 总 Token 数 */
        @SerializedName("TotalTokens")
        private Integer totalTokens;

        /** 输入 Token 数 */
        @SerializedName("PromptTokens")
        private Integer promptTokens;

        /** 输出 Token 数 */
        @SerializedName("CompletionTokens")
        private Integer completionTokens;

        /** 缓存命中 Token 数 */
        @SerializedName("CacheHitTokens")
        private Integer cacheHitTokens;

        /** 缓存写入 Token 数 */
        @SerializedName("CacheCreationTokens")
        private Integer cacheCreationTokens;

        /** 5 分钟缓存写入 Token 数 */
        @SerializedName("CacheCreation5mTokens")
        private Integer cacheCreation5mTokens;

        /** 1 小时缓存写入 Token 数 */
        @SerializedName("CacheCreation1hTokens")
        private Integer cacheCreation1hTokens;

        /** 是否存在推理日志 */
        @SerializedName("HasInferenceLog")
        private Boolean hasInferenceLog;

        public String getRequestId() {
            return requestId;
        }

        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

        public Integer getStartTime() {
            return startTime;
        }

        public void setStartTime(Integer startTime) {
            this.startTime = startTime;
        }

        public String getStartTimeReadable() {
            return startTimeReadable;
        }

        public void setStartTimeReadable(String startTimeReadable) {
            this.startTimeReadable = startTimeReadable;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public String getApiKeyId() {
            return apiKeyId;
        }

        public void setApiKeyId(String apiKeyId) {
            this.apiKeyId = apiKeyId;
        }

        public String getApiKeyName() {
            return apiKeyName;
        }

        public void setApiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
        }

        public Integer getLatency() {
            return latency;
        }

        public void setLatency(Integer latency) {
            this.latency = latency;
        }

        public Integer getFirstTokenLatency() {
            return firstTokenLatency;
        }

        public void setFirstTokenLatency(Integer firstTokenLatency) {
            this.firstTokenLatency = firstTokenLatency;
        }

        public Double getOutputTokenThroughput() {
            return outputTokenThroughput;
        }

        public void setOutputTokenThroughput(Double outputTokenThroughput) {
            this.outputTokenThroughput = outputTokenThroughput;
        }

        public Integer getHttpStatusCode() {
            return httpStatusCode;
        }

        public void setHttpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
        }

        public String getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(String errorCode) {
            this.errorCode = errorCode;
        }

        public Boolean getIsSuccess() {
            return isSuccess;
        }

        public void setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
        }

        public Integer getTotalTokens() {
            return totalTokens;
        }

        public void setTotalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
        }

        public Integer getPromptTokens() {
            return promptTokens;
        }

        public void setPromptTokens(Integer promptTokens) {
            this.promptTokens = promptTokens;
        }

        public Integer getCompletionTokens() {
            return completionTokens;
        }

        public void setCompletionTokens(Integer completionTokens) {
            this.completionTokens = completionTokens;
        }

        public Integer getCacheHitTokens() {
            return cacheHitTokens;
        }

        public void setCacheHitTokens(Integer cacheHitTokens) {
            this.cacheHitTokens = cacheHitTokens;
        }

        public Integer getCacheCreationTokens() {
            return cacheCreationTokens;
        }

        public void setCacheCreationTokens(Integer cacheCreationTokens) {
            this.cacheCreationTokens = cacheCreationTokens;
        }

        public Integer getCacheCreation5mTokens() {
            return cacheCreation5mTokens;
        }

        public void setCacheCreation5mTokens(Integer cacheCreation5mTokens) {
            this.cacheCreation5mTokens = cacheCreation5mTokens;
        }

        public Integer getCacheCreation1hTokens() {
            return cacheCreation1hTokens;
        }

        public void setCacheCreation1hTokens(Integer cacheCreation1hTokens) {
            this.cacheCreation1hTokens = cacheCreation1hTokens;
        }

        public Boolean getHasInferenceLog() {
            return hasInferenceLog;
        }

        public void setHasInferenceLog(Boolean hasInferenceLog) {
            this.hasInferenceLog = hasInferenceLog;
        }
    }

    public static class RequestLogSummary extends Response {

        /** 查询条件命中的总请求数 */
        @SerializedName("TotalRequests")
        private Integer totalRequests;

        /** 查询条件命中的失败请求数 */
        @SerializedName("FailedRequests")
        private Integer failedRequests;

        public Integer getTotalRequests() {
            return totalRequests;
        }

        public void setTotalRequests(Integer totalRequests) {
            this.totalRequests = totalRequests;
        }

        public Integer getFailedRequests() {
            return failedRequests;
        }

        public void setFailedRequests(Integer failedRequests) {
            this.failedRequests = failedRequests;
        }
    }
}
