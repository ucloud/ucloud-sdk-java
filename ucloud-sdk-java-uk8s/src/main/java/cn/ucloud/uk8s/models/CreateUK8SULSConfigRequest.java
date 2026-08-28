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
package cn.ucloud.uk8s.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class CreateUK8SULSConfigRequest extends Request {

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

    /** 日志服务中用于接收日志的目标 Topic ID。 */
    @NotEmpty
    @UCloudParam("TopicID")
    private String topicID;

    /** UK8S 集群ID。 */
    @NotEmpty
    @UCloudParam("ClusterId")
    private String clusterId;

    /**
     * 要创建的日志的采集规则的名称，不能重复。总长度不能超过
     * 253个字符。字符类型：只能包含小写字母（a-z）、数字（0-9）、破折号（-）和点（.）。开头和结尾字符：必须以小写字母或数字开头，并且也必须以小写字母或数字结尾。不允许以 - 或 .
     * 开头或结尾。连续特殊字符：不能连续出现点（.）或破折号（-）。
     */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** */
    @UCloudParam("ExtractRule")
    private ExtractRule extractRule;

    /** */
    @UCloudParam("InputDetail")
    private InputDetail inputDetail;

    /** */
    @UCloudParam("MatchRule")
    private MatchRule matchRule;

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

    public String getTopicID() {
        return topicID;
    }

    public void setTopicID(String topicID) {
        this.topicID = topicID;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExtractRule getExtractRule() {
        return extractRule;
    }

    public void setExtractRule(ExtractRule extractRule) {
        this.extractRule = extractRule;
    }

    public InputDetail getInputDetail() {
        return inputDetail;
    }

    public void setInputDetail(InputDetail inputDetail) {
        this.inputDetail = inputDetail;
    }

    public MatchRule getMatchRule() {
        return matchRule;
    }

    public void setMatchRule(MatchRule matchRule) {
        this.matchRule = matchRule;
    }

    public static class ExtractRule extends Request {

        /**
         * 日志解析类型，决定了如何结构化日志。可选值:
         * multi_line_delimiter：多行分隔符，delimiter:分隔符，full_regex:完全正则，multi_line_full_regex:多行完全正则，minimal_list:单行全文日志,multi_line:多行全文日志
         */
        @NotEmpty
        @UCloudParam("LogType")
        private String logType;

        /** 采集策略。可选值: full (全量采集存量日志), increment (从当前时间点增量采集)。默认为 full。 */
        @UCloudParam("CollectPolicy")
        private String collectPolicy;

        /** 日志原文的编码格式。可选值: utf-8, gbk。默认为 utf-8。 */
        @UCloudParam("Encode")
        private String encode;

        /** 当LogType 为分隔符、正则、多行正则时可用 */
        @UCloudParam("Keys")
        private List<String> keys;

        /** 当 LogType 为delimiter 时可选，接收 "space"、"tab"、"|"、";"、","。 */
        @UCloudParam("Delimiter")
        private String delimiter;

        /** 行首正则表达式。当 logType 为多行模式 (如 multi_line 或 multi_line_full_regex) 时，用于标识一条新日志的开始。 */
        @UCloudParam("BeginningRegex")
        private String beginningRegex;

        /** 日志提取正则表达式。当 logType 为正则模式 (如 full_regex,multi_line_full_regex) 时，用于从日志中提取字段。 */
        @UCloudParam("LogRegex")
        private String logRegex;

        /** */
        @UCloudParam("ExtractRule")
        private ExtractRuleExtractRule extractRule;

        /** 当日志为 json 或正则提取时，指定包含日志时间的字段名 (Key)。 */
        @UCloudParam("TimeKey")
        private String timeKey;

        /** timeKey 对应的时间格式。 */
        @UCloudParam("TimeFormat")
        private String timeFormat;

        /** 是否上传解析失败的日志。true 表示上传，false 表示丢弃。默认为 false。 */
        @UCloudParam("UnMatchUpload")
        private String unMatchUpload;

        /** 没有设置默认值；UnMatchUpload="true" 时强制要求填写 */
        @UCloudParam("UnMatchKey")
        private String unMatchKey;

        /** Base64 编码的分隔符，优先级高于 Delimiter */
        @UCloudParam("DelimiterBase64")
        private String delimiterBase64;

        /** Base64 编码的行首正则，优先级高于 BeginningRegex */
        @UCloudParam("BeginningRegexBase64")
        private String beginningRegexBase64;

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

        public String getBeginningRegex() {
            return beginningRegex;
        }

        public void setBeginningRegex(String beginningRegex) {
            this.beginningRegex = beginningRegex;
        }

        public String getLogRegex() {
            return logRegex;
        }

        public void setLogRegex(String logRegex) {
            this.logRegex = logRegex;
        }

        public ExtractRuleExtractRule getExtractRule() {
            return extractRule;
        }

        public void setExtractRule(ExtractRuleExtractRule extractRule) {
            this.extractRule = extractRule;
        }

        public String getTimeKey() {
            return timeKey;
        }

        public void setTimeKey(String timeKey) {
            this.timeKey = timeKey;
        }

        public String getTimeFormat() {
            return timeFormat;
        }

        public void setTimeFormat(String timeFormat) {
            this.timeFormat = timeFormat;
        }

        public String getUnMatchUpload() {
            return unMatchUpload;
        }

        public void setUnMatchUpload(String unMatchUpload) {
            this.unMatchUpload = unMatchUpload;
        }

        public String getUnMatchKey() {
            return unMatchKey;
        }

        public void setUnMatchKey(String unMatchKey) {
            this.unMatchKey = unMatchKey;
        }

        public String getDelimiterBase64() {
            return delimiterBase64;
        }

        public void setDelimiterBase64(String delimiterBase64) {
            this.delimiterBase64 = delimiterBase64;
        }

        public String getBeginningRegexBase64() {
            return beginningRegexBase64;
        }

        public void setBeginningRegexBase64(String beginningRegexBase64) {
            this.beginningRegexBase64 = beginningRegexBase64;
        }
    }

    public static class ExtractRuleExtractRule extends Request {

        /** Base64 编码的日志提取正则表达式。 */
        @UCloudParam("LogRegexBase64")
        private String logRegexBase64;

        public String getLogRegexBase64() {
            return logRegexBase64;
        }

        public void setLogRegexBase64(String logRegexBase64) {
            this.logRegexBase64 = logRegexBase64;
        }
    }

    public static class InputDetail extends Request {

        /** 日志输入类型。支持 container_file 和 container_stdout */
        @NotEmpty
        @UCloudParam("Type")
        private String type;

        /** */
        @UCloudParam("Metadata")
        private InputDetailMetadata metadata;

        /** */
        @UCloudParam("FilePaths")
        private List<InputDetailFilePaths> filePaths;

        /** all、stdout、stderr，默认 all (用于 InputDetail.Type = container_stdout) */
        @UCloudParam("Stream")
        private String stream;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public InputDetailMetadata getMetadata() {
            return metadata;
        }

        public void setMetadata(InputDetailMetadata metadata) {
            this.metadata = metadata;
        }

        public List<InputDetailFilePaths> getFilePaths() {
            return filePaths;
        }

        public void setFilePaths(List<InputDetailFilePaths> filePaths) {
            this.filePaths = filePaths;
        }

        public String getStream() {
            return stream;
        }

        public void setStream(String stream) {
            this.stream = stream;
        }
    }

    public static class InputDetailFilePaths extends Request {

        /** 定义采集路径 */
        @UCloudParam("Path")
        private String path;

        /** 定义采集路径的文件名 */
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

    public static class InputDetailMetadata extends Request {

        /**
         * 指定具体要采集元数据的容器名。如果留空，则不采集容器的元数据,可选字段：container_name,namespace,pod_name,pod_ip,pod_uid,container_id,image_name。Pod
         * Label 元数据通过指定 InputDetail.Metadata.Labels字段。
         */
        @UCloudParam("Container")
        private String container;

        /**
         * 定义要采集哪些 Pod 的标签 (Labels)。可选值: * (采集所有标签), "app,version" (仅采集 app 和 version), ""
         * (不采集任何标签)。
         */
        @UCloudParam("Labels")
        private String labels;

        public String getContainer() {
            return container;
        }

        public void setContainer(String container) {
            this.container = container;
        }

        public String getLabels() {
            return labels;
        }

        public void setLabels(String labels) {
            this.labels = labels;
        }
    }

    public static class MatchRule extends Request {

        /** 容器名称匹配操作符。支持：in(包含)，notin(不包含) */
        @UCloudParam("ContainerOperator")
        private String containerOperator;

        /** 要匹配的容器名称，*表示所有容器，用逗号分隔 */
        @UCloudParam("Container")
        private String container;

        /** */
        @UCloudParam("Workloads")
        private List<MatchRuleWorkloads> workloads;

        /** */
        @UCloudParam("PodLabels")
        private MatchRulePodLabels podLabels;

        public String getContainerOperator() {
            return containerOperator;
        }

        public void setContainerOperator(String containerOperator) {
            this.containerOperator = containerOperator;
        }

        public String getContainer() {
            return container;
        }

        public void setContainer(String container) {
            this.container = container;
        }

        public List<MatchRuleWorkloads> getWorkloads() {
            return workloads;
        }

        public void setWorkloads(List<MatchRuleWorkloads> workloads) {
            this.workloads = workloads;
        }

        public MatchRulePodLabels getPodLabels() {
            return podLabels;
        }

        public void setPodLabels(MatchRulePodLabels podLabels) {
            this.podLabels = podLabels;
        }
    }

    public static class MatchRulePodLabels extends Request {

        /** 指定/排除命名空间, 可选值: in/notin */
        @UCloudParam("NamespaceOperator")
        private String namespaceOperator;

        /** 命名空间名称 */
        @UCloudParam("Namespace")
        private String namespace;

        /** */
        @UCloudParam("Labels")
        private List<MatchRulePodLabelsLabels> labels;

        public String getNamespaceOperator() {
            return namespaceOperator;
        }

        public void setNamespaceOperator(String namespaceOperator) {
            this.namespaceOperator = namespaceOperator;
        }

        public String getNamespace() {
            return namespace;
        }

        public void setNamespace(String namespace) {
            this.namespace = namespace;
        }

        public List<MatchRulePodLabelsLabels> getLabels() {
            return labels;
        }

        public void setLabels(List<MatchRulePodLabelsLabels> labels) {
            this.labels = labels;
        }
    }

    public static class MatchRulePodLabelsLabels extends Request {

        /** 按 Pod 标签匹配时，要匹配的标签的 Key。 */
        @UCloudParam("Key")
        private String key;

        /** 按 Pod 标签匹配时，标签值的匹配操作符。可选值: in, notin。 */
        @UCloudParam("ValueOperator")
        private String valueOperator;

        /** 按 Pod 标签匹配时，要匹配的标签的值。 */
        @UCloudParam("Value")
        private String value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValueOperator() {
            return valueOperator;
        }

        public void setValueOperator(String valueOperator) {
            this.valueOperator = valueOperator;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class MatchRuleWorkloads extends Request {

        /** 按工作负载匹配时，工作负载所在的命名空间。 */
        @UCloudParam("Namespace")
        private String namespace;

        /** 按工作负载匹配时，工作负载的类型，例如 deployment, statefulset, daemonset,job, cronjob。 */
        @UCloudParam("Type")
        private String type;

        /** 按工作负载匹配时，工作负载的名称。 */
        @UCloudParam("Name")
        private String name;

        public String getNamespace() {
            return namespace;
        }

        public void setNamespace(String namespace) {
            this.namespace = namespace;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
