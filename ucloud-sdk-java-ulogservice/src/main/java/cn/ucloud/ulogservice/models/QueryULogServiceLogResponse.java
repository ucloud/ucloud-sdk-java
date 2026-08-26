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
package cn.ucloud.ulogservice.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QueryULogServiceLogResponse extends Response {

    /** 请求结果 */
    @SerializedName("Data")
    private LogQueryResult data;

    public LogQueryResult getData() {
        return data;
    }

    public void setData(LogQueryResult data) {
        this.data = data;
    }

    public static class AnalysisField extends Response {

        /** 字段名 */
        @SerializedName("Name")
        private String name;

        /** 字段类型 */
        @SerializedName("Type")
        private String type;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class LogContent extends Response {

        /** 日志标识ID */
        @SerializedName("LogId")
        private String logId;

        /** 日志来源主机 */
        @SerializedName("HostName")
        private String hostName;

        /** 日志文件路径 */
        @SerializedName("FileName")
        private String fileName;

        /** 日志时间 */
        @SerializedName("Timestamp")
        private Integer timestamp;

        /** JSON格式的日志内容 */
        @SerializedName("LogJson")
        private String logJson;

        public String getLogId() {
            return logId;
        }

        public void setLogId(String logId) {
            this.logId = logId;
        }

        public String getHostName() {
            return hostName;
        }

        public void setHostName(String hostName) {
            this.hostName = hostName;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public Integer getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
        }

        public String getLogJson() {
            return logJson;
        }

        public void setLogJson(String logJson) {
            this.logJson = logJson;
        }
    }

    public static class LogQueryResult extends Response {

        /** 所属日志ID */
        @SerializedName("TopicId")
        private String topicId;

        /** 所属日志名称 */
        @SerializedName("TopicName")
        private String topicName;

        /** 检索结果是否到底 */
        @SerializedName("IsOver")
        private Boolean isOver;

        /** 日志内容 */
        @SerializedName("Contents")
        private LogContent contents;

        /** 滚动检索Id Deprecated */
        @SerializedName("ScrollId")
        private String scrollId;

        /** 滚动检索,当前页最后一条数据ID */
        @SerializedName("LastId")
        private String lastId;

        /** 滚动检索,当前页最后一条数据Timestamp */
        @SerializedName("LastTimestamp")
        private String lastTimestamp;

        /** 当使用SQL语句查询时，数据通过AnalysisRecords字段返回，Columns字段返回的是字段名和类型 */
        @SerializedName("Columns")
        private List<AnalysisField> columns;

        /** 当使用SQL语句查询时，数据通过该字段返回 */
        @SerializedName("AnalysisRecords")
        private List<String> analysisRecords;

        public String getTopicId() {
            return topicId;
        }

        public void setTopicId(String topicId) {
            this.topicId = topicId;
        }

        public String getTopicName() {
            return topicName;
        }

        public void setTopicName(String topicName) {
            this.topicName = topicName;
        }

        public Boolean getIsOver() {
            return isOver;
        }

        public void setIsOver(Boolean isOver) {
            this.isOver = isOver;
        }

        public LogContent getContents() {
            return contents;
        }

        public void setContents(LogContent contents) {
            this.contents = contents;
        }

        public String getScrollId() {
            return scrollId;
        }

        public void setScrollId(String scrollId) {
            this.scrollId = scrollId;
        }

        public String getLastId() {
            return lastId;
        }

        public void setLastId(String lastId) {
            this.lastId = lastId;
        }

        public String getLastTimestamp() {
            return lastTimestamp;
        }

        public void setLastTimestamp(String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
        }

        public List<AnalysisField> getColumns() {
            return columns;
        }

        public void setColumns(List<AnalysisField> columns) {
            this.columns = columns;
        }

        public List<String> getAnalysisRecords() {
            return analysisRecords;
        }

        public void setAnalysisRecords(List<String> analysisRecords) {
            this.analysisRecords = analysisRecords;
        }
    }
}
