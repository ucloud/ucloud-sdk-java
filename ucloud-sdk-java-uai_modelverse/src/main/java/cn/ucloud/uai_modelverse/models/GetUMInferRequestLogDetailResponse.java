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

public class GetUMInferRequestLogDetailResponse extends Response {

    /** 请求日志详情 */
    @SerializedName("Data")
    private RequestLogDetail data;

    public RequestLogDetail getData() {
        return data;
    }

    public void setData(RequestLogDetail data) {
        this.data = data;
    }

    public static class RequestLogDetail extends Response {

        /** 请求 ID */
        @SerializedName("RequestId")
        private String requestId;

        /** 顶级组织 ID */
        @SerializedName("TopOrganizationId")
        private String topOrganizationId;

        /** 组织 ID */
        @SerializedName("OrganizationId")
        private String organizationId;

        /** 客户端 IP */
        @SerializedName("ClientIp")
        private String clientIp;

        /** 业务地域 */
        @SerializedName("Region")
        private String region;

        /** 请求开始时间，Unix 毫秒时间戳 */
        @SerializedName("StartTime")
        private Integer startTime;

        /** 请求开始时间，可读格式 */
        @SerializedName("StartTimeReadable")
        private String startTimeReadable;

        /** 模型名称 */
        @SerializedName("ModelName")
        private String modelName;

        /** 是否流式请求 */
        @SerializedName("IsStream")
        private Boolean isStream;

        /** API Key ID */
        @SerializedName("ApiKeyId")
        private String apiKeyId;

        /** HTTP 状态码 */
        @SerializedName("HttpStatusCode")
        private Integer httpStatusCode;

        /** 错误码 */
        @SerializedName("ErrorCode")
        private String errorCode;

        /** 错误信息 */
        @SerializedName("ErrorMessage")
        private String errorMessage;

        /** 请求是否成功 */
        @SerializedName("IsSuccess")
        private Boolean isSuccess;

        /** 请求总延迟，单位毫秒 */
        @SerializedName("Latency")
        private Integer latency;

        /** 首 Token 延迟，单位毫秒 */
        @SerializedName("FirstTokenLatency")
        private Integer firstTokenLatency;

        /** 输出 Token 吞吐 */
        @SerializedName("OutputTokenThroughput")
        private Double outputTokenThroughput;

        /** 模型返回的 usage 原文 JSON */
        @SerializedName("Usage")
        private String usage;

        /** 请求原文，本期返回为空 */
        @SerializedName("Request")
        private String request;

        /** 响应原文，本期返回为空 */
        @SerializedName("Response")
        private String response;

        /** 扩展信息，本期返回为空 */
        @SerializedName("Extras")
        private String extras;

        public String getRequestId() {
            return requestId;
        }

        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

        public String getTopOrganizationId() {
            return topOrganizationId;
        }

        public void setTopOrganizationId(String topOrganizationId) {
            this.topOrganizationId = topOrganizationId;
        }

        public String getOrganizationId() {
            return organizationId;
        }

        public void setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
        }

        public String getClientIp() {
            return clientIp;
        }

        public void setClientIp(String clientIp) {
            this.clientIp = clientIp;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
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

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public Boolean getIsStream() {
            return isStream;
        }

        public void setIsStream(Boolean isStream) {
            this.isStream = isStream;
        }

        public String getApiKeyId() {
            return apiKeyId;
        }

        public void setApiKeyId(String apiKeyId) {
            this.apiKeyId = apiKeyId;
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

        public String getErrorMessage() {
            return errorMessage;
        }

        public void setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public Boolean getIsSuccess() {
            return isSuccess;
        }

        public void setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
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

        public String getUsage() {
            return usage;
        }

        public void setUsage(String usage) {
            this.usage = usage;
        }

        public String getRequest() {
            return request;
        }

        public void setRequest(String request) {
            this.request = request;
        }

        public String getResponse() {
            return response;
        }

        public void setResponse(String response) {
            this.response = response;
        }

        public String getExtras() {
            return extras;
        }

        public void setExtras(String extras) {
            this.extras = extras;
        }
    }
}
