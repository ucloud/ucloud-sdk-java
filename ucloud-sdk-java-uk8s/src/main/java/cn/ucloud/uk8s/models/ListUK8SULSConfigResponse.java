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

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListUK8SULSConfigResponse extends Response {

    /** 日志服务配置,见 ClusterLogConfig */
    @SerializedName("LogConfig")
    private List<ULSLogConfig> logConfig;

    public List<ULSLogConfig> getLogConfig() {
        return logConfig;
    }

    public void setLogConfig(List<ULSLogConfig> logConfig) {
        this.logConfig = logConfig;
    }

    public static class ULSExtractRule extends Response {

        /** 采集策略。可选值：full（全量采集存量日志）、increment（从当前时间点增量采集）。默认为 full。 */
        @SerializedName("CollectPolicy")
        private String collectPolicy;

        /** 日志原文的编码格式。可选值：utf-8、gbk。默认为 utf-8。 */
        @SerializedName("Encode")
        private String encode;

        /**
         * 日志解析类型。可选值：json、delimiter、full_regex、multi_line_full_regex、multi_line_delimiter、minimal_list、multi_line。
         */
        @SerializedName("LogType")
        private String logType;

        /** 分隔符。适用于 delimiter 或 multi_line_delimiter，可选值：space、tab、|、;、,。 */
        @SerializedName("Delimiter")
        private String delimiter;

        /** Base64 编码的分隔符。填写时优先于 Delimiter。 */
        @SerializedName("DelimiterBase64")
        private String delimiterBase64;

        /**
         * 行首正则表达式。在 multi_line、multi_line_full_regex 或 multi_line_delimiter 模式下，BeginningRegex 和
         * BeginningRegexBase64 必须至少填写一个。
         */
        @SerializedName("BeginningRegex")
        private String beginningRegex;

        /** Base64 编码的行首正则表达式。填写时优先于 BeginningRegex。 */
        @SerializedName("BeginningRegexBase64")
        private String beginningRegexBase64;

        /**
         * 日志提取正则表达式。在 full_regex 或 multi_line_full_regex 模式下，LogRegex 和 LogRegexBase64 必须至少填写一个。
         */
        @SerializedName("LogRegex")
        private String logRegex;

        /** Base64 编码的日志提取正则表达式。填写时优先于 LogRegex。 */
        @SerializedName("LogRegexBase64")
        private String logRegexBase64;

        /** 包含日志时间的字段名。 */
        @SerializedName("TimeKey")
        private String timeKey;

        /**
         * TimeKey 对应的时间格式。在 json、full_regex 或 multi_line_full_regex 模式下，填写 TimeKey 时必须同时填写
         * TimeFormat。
         */
        @SerializedName("TimeFormat")
        private String timeFormat;

        /** 是否上传解析失败的日志。字符串 true 表示上传，false 表示丢弃。默认为 false。 */
        @SerializedName("UnMatchUpload")
        private String unMatchUpload;

        /** 存放无法解析的日志原文的 Key。UnMatchUpload 为 true 时必须填写。 */
        @SerializedName("UnMatchKey")
        private String unMatchKey;

        /** 提取后的字段名列表。仅适用于 delimiter、full_regex、multi_line_full_regex 和 multi_line_delimiter。 */
        @SerializedName("Keys")
        private List<String> keys;

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

        public String getLogType() {
            return logType;
        }

        public void setLogType(String logType) {
            this.logType = logType;
        }

        public String getDelimiter() {
            return delimiter;
        }

        public void setDelimiter(String delimiter) {
            this.delimiter = delimiter;
        }

        public String getDelimiterBase64() {
            return delimiterBase64;
        }

        public void setDelimiterBase64(String delimiterBase64) {
            this.delimiterBase64 = delimiterBase64;
        }

        public String getBeginningRegex() {
            return beginningRegex;
        }

        public void setBeginningRegex(String beginningRegex) {
            this.beginningRegex = beginningRegex;
        }

        public String getBeginningRegexBase64() {
            return beginningRegexBase64;
        }

        public void setBeginningRegexBase64(String beginningRegexBase64) {
            this.beginningRegexBase64 = beginningRegexBase64;
        }

        public String getLogRegex() {
            return logRegex;
        }

        public void setLogRegex(String logRegex) {
            this.logRegex = logRegex;
        }

        public String getLogRegexBase64() {
            return logRegexBase64;
        }

        public void setLogRegexBase64(String logRegexBase64) {
            this.logRegexBase64 = logRegexBase64;
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

        public List<String> getKeys() {
            return keys;
        }

        public void setKeys(List<String> keys) {
            this.keys = keys;
        }
    }

    public static class ULSFilePaths extends Response {

        /** 定义采集路径 */
        @SerializedName("Path")
        private String path;

        /** 采集文件 */
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

    public static class ULSInputDetail extends Response {

        /** 日志采集路径列表。仅适用于 container_file。 */
        @SerializedName("FilePaths")
        private List<ULSFilePaths> filePaths;

        /** 日志输入类型。可选值：container_file、container_stdout。 */
        @SerializedName("Type")
        private String type;

        /** 容器标准输出流类型。仅适用于 container_stdout，可选值：all、stdout、stderr，默认为 all。 */
        @SerializedName("Stream")
        private String stream;

        /** 定义需要附加到日志中的容器相关元数据。 */
        @SerializedName("InputMetadata")
        private ULSInputMetadata inputMetadata;

        public List<ULSFilePaths> getFilePaths() {
            return filePaths;
        }

        public void setFilePaths(List<ULSFilePaths> filePaths) {
            this.filePaths = filePaths;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getStream() {
            return stream;
        }

        public void setStream(String stream) {
            this.stream = stream;
        }

        public ULSInputMetadata getInputMetadata() {
            return inputMetadata;
        }

        public void setInputMetadata(ULSInputMetadata inputMetadata) {
            this.inputMetadata = inputMetadata;
        }
    }

    public static class ULSInputMetadata extends Response {

        /**
         * 指定具体要采集元数据的容器名。如果留空，则不采集容器的元数据，可选字段：container_name,namespace,pod_name,pod_ip,pod_uid,container_id,image_name。Pod
         * Label 元数据通过指定 InputDetail.Metadata.Labels 字段。
         */
        @SerializedName("Container")
        private String container;

        /**
         * 定义要采集哪些 Pod 的标签 (Labels)。可选值：*：采集所有标签。app,version：仅采集 app 和 version
         * 这两个标签。""（空字符串）：不采集任何标签。
         */
        @SerializedName("Labels")
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

    public static class ULSLabels extends Response {

        /** 要匹配的标签的 Key。 */
        @SerializedName("Key")
        private String key;

        /** 标签值的匹配操作符。可选值: in, notin。 */
        @SerializedName("ValueOperator")
        private String valueOperator;

        /** 要匹配的标签的值。 */
        @SerializedName("Value")
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

    public static class ULSLogConfig extends Response {

        /** uk8s集群id */
        @SerializedName("ClusterId")
        private String clusterId;

        /** 机器组 */
        @SerializedName("MachineGroup")
        private String machineGroup;

        /** 定义日志的提取、解析和格式化规则。见 ULSExtractRule */
        @SerializedName("ExtractRule")
        private ULSExtractRule extractRule;

        /** 定义日志的输入来源（例如容器文件）。见 ULSInputDetail */
        @SerializedName("InputDetail")
        private ULSInputDetail inputDetail;

        /** 定义此采集规则要匹配的目标 Pod 或工作负载。 见 ULSMatchRule */
        @SerializedName("MatchRule")
        private ULSMatchRule matchRule;

        /** 日志服务中用于接收日志的目标 Topic ID。 */
        @SerializedName("TopicID")
        private String topicID;

        /** 采集配置规则名称 */
        @SerializedName("Name")
        private String name;

        public String getClusterId() {
            return clusterId;
        }

        public void setClusterId(String clusterId) {
            this.clusterId = clusterId;
        }

        public String getMachineGroup() {
            return machineGroup;
        }

        public void setMachineGroup(String machineGroup) {
            this.machineGroup = machineGroup;
        }

        public ULSExtractRule getExtractRule() {
            return extractRule;
        }

        public void setExtractRule(ULSExtractRule extractRule) {
            this.extractRule = extractRule;
        }

        public ULSInputDetail getInputDetail() {
            return inputDetail;
        }

        public void setInputDetail(ULSInputDetail inputDetail) {
            this.inputDetail = inputDetail;
        }

        public ULSMatchRule getMatchRule() {
            return matchRule;
        }

        public void setMatchRule(ULSMatchRule matchRule) {
            this.matchRule = matchRule;
        }

        public String getTopicID() {
            return topicID;
        }

        public void setTopicID(String topicID) {
            this.topicID = topicID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class ULSMatchRule extends Response {

        /** 容器名称匹配操作符。支持：in(包含)，notin(不包含) */
        @SerializedName("ContainerOperator")
        private String containerOperator;

        /** 要匹配的容器名称，*表示所有容器，用逗号分隔 */
        @SerializedName("Container")
        private String container;

        /** 按工作负载进行匹配。 */
        @SerializedName("Workloads")
        private List<ULSWorkloadMatch> workloads;

        /** 按 Pod 的标签进行匹配，提供更灵活的选择。 */
        @SerializedName("PodLabels")
        private ULSPodLabelsMatch podLabels;

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

        public List<ULSWorkloadMatch> getWorkloads() {
            return workloads;
        }

        public void setWorkloads(List<ULSWorkloadMatch> workloads) {
            this.workloads = workloads;
        }

        public ULSPodLabelsMatch getPodLabels() {
            return podLabels;
        }

        public void setPodLabels(ULSPodLabelsMatch podLabels) {
            this.podLabels = podLabels;
        }
    }

    public static class ULSPodLabelsMatch extends Response {

        /** 命名空间名称的匹配操作符。可选值: in, notin。 */
        @SerializedName("NamespaceOperator")
        private String namespaceOperator;

        /** 要匹配的命名空间。namespaceOperator 存在时必需。 */
        @SerializedName("Namespace")
        private String namespace;

        /** 一个标签选择器数组，用于定义匹配的标签条件。 */
        @SerializedName("Labels")
        private List<ULSLabels> labels;

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

        public List<ULSLabels> getLabels() {
            return labels;
        }

        public void setLabels(List<ULSLabels> labels) {
            this.labels = labels;
        }
    }

    public static class ULSWorkloadMatch extends Response {

        /** 工作负载所在的命名空间。 */
        @SerializedName("Namespace")
        private String namespace;

        /** 工作负载的类型，例如 deployment, statefulset, daemonset,cronjob,job。 */
        @SerializedName("Type")
        private String type;

        /** 工作负载的名称。 */
        @SerializedName("Name")
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
