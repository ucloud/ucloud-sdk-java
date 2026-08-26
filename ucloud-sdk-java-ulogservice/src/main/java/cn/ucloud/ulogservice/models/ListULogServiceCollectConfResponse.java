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

public class ListULogServiceCollectConfResponse extends Response {

    /** 日志采集配置列表 */
    @SerializedName("CollectConfs")
    private CollectConf collectConfs;

    public CollectConf getCollectConfs() {
        return collectConfs;
    }

    public void setCollectConfs(CollectConf collectConfs) {
        this.collectConfs = collectConfs;
    }

    public static class CollectConf extends Response {

        /** 日志主题ID */
        @SerializedName("TopicId")
        private Integer topicId;

        /** State */
        @SerializedName("State")
        private Integer state;

        /** 机器组ID，是一个数组 */
        @SerializedName("MachineGroups")
        private List<MachineGroup> machineGroups;

        /** Id */
        @SerializedName("Id")
        private Integer id;

        /** 日志采集配置名称 */
        @SerializedName("Name")
        private String name;

        /**
         * 日志解析类型，决定了如何结构化日志。可选值: json:json
         * 格式，delimiter:分隔符，full_regex:完全正则，multi_line_full_regex:多行完全正则，multi_line_delimiter:
         * 多行分隔符正则，minimal_list:单行全文日志,multi_line:多行全文日志
         */
        @SerializedName("LogType")
        private String logType;

        /** 采集策略。可选值: full (全量采集存量日志), increment (从当前时间点增量采集)。默认为 full。 */
        @SerializedName("CollectPolicy")
        private String collectPolicy;

        /** 日志原文的编码格式。可选值: utf-8, gbk。默认为 utf-8。 */
        @SerializedName("Encode")
        private String encode;

        /** 索引字段key，是一个数组 */
        @SerializedName("Keys")
        private String keys;

        /** 当 LogType 为delimiter 或multi_line_delimiter时可选，支持多字符分隔，需要转换成Base64 */
        @SerializedName("Delimiter")
        private String delimiter;

        /**
         * 行首正则表达式。当 logType 为多行模式 (如 multi_line 或 multi_line_full_regex或multi_line_delimiter)
         * 时，用于标识一条新日志的开始。需要转换成Base64
         */
        @SerializedName("MatchRule")
        private String matchRule;

        /**
         * 日志提取正则表达式。当 logType 为正则模式 (如 full_regex,multi_line_full_regex) 时，用于从日志中提取字段。需要转换成Base64
         */
        @SerializedName("ExtractRule")
        private String extractRule;

        /** 如果 UnMatchUpload 为 true，无法解析的日志原文将被存放在此字段指定的 Key 下。默认为 LogParseFailure。 */
        @SerializedName("UnMatchKey")
        private String unMatchKey;

        /** FilePaths */
        @SerializedName("FilePaths")
        private List<FilePath> filePaths;

        /** CreateTime */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** updateTime */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        public Integer getTopicId() {
            return topicId;
        }

        public void setTopicId(Integer topicId) {
            this.topicId = topicId;
        }

        public Integer getState() {
            return state;
        }

        public void setState(Integer state) {
            this.state = state;
        }

        public List<MachineGroup> getMachineGroups() {
            return machineGroups;
        }

        public void setMachineGroups(List<MachineGroup> machineGroups) {
            this.machineGroups = machineGroups;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLogType() {
            return logType;
        }

        public void setLogType(String logType) {
            this.logType = logType;
        }

        public String getCollectPolicy() {
            return collectPolicy;
        }

        public void setCollectPolicy(String collectPolicy) {
            this.collectPolicy = collectPolicy;
        }

        public String getEncode() {
            return encode;
        }

        public void setEncode(String encode) {
            this.encode = encode;
        }

        public String getKeys() {
            return keys;
        }

        public void setKeys(String keys) {
            this.keys = keys;
        }

        public String getDelimiter() {
            return delimiter;
        }

        public void setDelimiter(String delimiter) {
            this.delimiter = delimiter;
        }

        public String getMatchRule() {
            return matchRule;
        }

        public void setMatchRule(String matchRule) {
            this.matchRule = matchRule;
        }

        public String getExtractRule() {
            return extractRule;
        }

        public void setExtractRule(String extractRule) {
            this.extractRule = extractRule;
        }

        public String getUnMatchKey() {
            return unMatchKey;
        }

        public void setUnMatchKey(String unMatchKey) {
            this.unMatchKey = unMatchKey;
        }

        public List<FilePath> getFilePaths() {
            return filePaths;
        }

        public void setFilePaths(List<FilePath> filePaths) {
            this.filePaths = filePaths;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }
    }

    public static class FilePath extends Response {

        /** 路径 */
        @SerializedName("Path")
        private String path;

        /** 文件名 */
        @SerializedName("File")
        private String file;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }
    }

    public static class MachineGroup extends Response {

        /** 机器组ID */
        @SerializedName("Id")
        private String id;

        /** 机器组名称 */
        @SerializedName("Name")
        private String name;

        /** 采集器识别类型：LABEL：机器标识，IP：IP类型 */
        @SerializedName("Type")
        private String type;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 修改时间 */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

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

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }
    }
}
