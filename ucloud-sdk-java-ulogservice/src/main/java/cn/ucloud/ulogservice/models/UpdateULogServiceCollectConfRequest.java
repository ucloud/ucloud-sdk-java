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

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class UpdateULogServiceCollectConfRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 日志主题ID */
    @NotEmpty
    @UCloudParam("TopicId")
    private String topicId;

    /** 日志主题采集配置ID */
    @NotEmpty
    @UCloudParam("CollectConfId")
    private Integer collectConfId;

    /**
     * 日志解析类型，决定了如何结构化日志。可选值: json:json
     * 格式，delimiter:分隔符，full_regex:完全正则，multi_line_full_regex:多行完全正则，multi_line_delimiter:
     * 多行分隔符正则，minimal_list:单行全文日志,multi_line:多行全文日志
     */
    @NotEmpty
    @UCloudParam("LogType")
    private String logType;

    /** 采集策略。可选值: full (全量采集存量日志), increment (从当前时间点增量采集)。默认为 full。 */
    @NotEmpty
    @UCloudParam("CollectPolicy")
    private String collectPolicy;

    /** 日志原文的编码格式。可选值: utf-8, gbk。默认为 utf-8。 */
    @UCloudParam("Encode")
    private String encode;

    /** 索引字段key，是一个数组 */
    @UCloudParam("Keys")
    private List<String> keys;

    /** 当 LogType 为delimiter 或multi_line_delimiter时可选，支持多字符分隔，需要转换成Base64 */
    @UCloudParam("Delimiter")
    private String delimiter;

    /**
     * 行首正则表达式。当 logType 为多行模式 (如 multi_line 或 multi_line_full_regex或multi_line_delimiter)
     * 时，用于标识一条新日志的开始。需要转换成Base64
     */
    @UCloudParam("MatchRule")
    private String matchRule;

    /** 日志提取正则表达式。当 logType 为正则模式 (如 full_regex,multi_line_full_regex) 时，用于从日志中提取字段。需要转换成Base64 */
    @UCloudParam("ExtractRule")
    private String extractRule;

    /** 如果 UnMatchUpload 为 true，无法解析的日志原文将被存放在此字段指定的 Key 下。默认为 LogParseFailure。 */
    @UCloudParam("UnMatchKey")
    private String unMatchKey;

    /** */
    @UCloudParam("FilePaths")
    private List<FilePaths> filePaths;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public Integer getCollectConfId() {
        return collectConfId;
    }

    public void setCollectConfId(Integer collectConfId) {
        this.collectConfId = collectConfId;
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

    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
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

    public List<FilePaths> getFilePaths() {
        return filePaths;
    }

    public void setFilePaths(List<FilePaths> filePaths) {
        this.filePaths = filePaths;
    }

    public static class FilePaths extends Request {

        /** 定义采集路径，数组类型 */
        @UCloudParam("Path")
        private String path;

        /** 定义采集路径的文件名，数组类型 */
        @UCloudParam("File")
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
}
