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

public class UpdateUK8SULSConfigRequest extends Request {

    /** 地域。参见地域和可用区列表：https://docs.ucloud.cn/api/summary/regionlist */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见地域和可用区列表：https://docs.ucloud.cn/api/summary/regionlist */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。请参考GetProjectList接口：https://docs.ucloud.cn/api/summary/get_project_list
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 要修改的日志采集规则名称。名称长度不能超过253个字符，只能包含小写字母、数字、破折号和点，并且必须以字母或数字开头和结尾。 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** UK8S集群ID。 */
    @NotEmpty
    @UCloudParam("ClusterId")
    private String clusterId;

    /** 日志服务中用于接收日志的目标Topic ID。不填写时保持原Topic ID不变。 */
    @UCloudParam("TopicID")
    private String topicID;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public String getTopicID() {
        return topicID;
    }

    public void setTopicID(String topicID) {
        this.topicID = topicID;
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

        /** 采集策略。可选值：full（全量采集存量日志）、increment（从当前时间点增量采集）。默认为full。 */
        @UCloudParam("CollectPolicy")
        private String collectPolicy;

        /** 日志原文的编码格式。可选值：utf-8、gbk。默认为utf-8。 */
        @UCloudParam("Encode")
        private String encode;

        /**
         * 日志解析类型。可选值：json、delimiter、full_regex、multi_line_full_regex、multi_line_delimiter、minimal_list、multi_line。
         */
        @NotEmpty
        @UCloudParam("LogType")
        private String logType;

        /**
         * 行首正则表达式。multi_line、multi_line_full_regex或multi_line_delimiter模式下，BeginningRegex和BeginningRegexBase64必须至少填写一个。
         */
        @UCloudParam("BeginningRegex")
        private String beginningRegex;

        /** Base64编码的行首正则表达式。填写时优先于BeginningRegex。 */
        @UCloudParam("BeginningRegexBase64")
        private String beginningRegexBase64;

        /** 日志提取正则表达式。full_regex或multi_line_full_regex模式下，LogRegex和LogRegexBase64必须至少填写一个。 */
        @UCloudParam("LogRegex")
        private String logRegex;

        /** Base64编码的日志提取正则表达式。填写时优先于LogRegex。 */
        @UCloudParam("LogRegexBase64")
        private String logRegexBase64;

        /** 分隔符。delimiter或multi_line_delimiter模式下可用。可选值：space、tab、|、;、,。 */
        @UCloudParam("Delimiter")
        private String delimiter;

        /** Base64编码的分隔符。填写时优先于Delimiter。 */
        @UCloudParam("DelimiterBase64")
        private String delimiterBase64;

        /** 包含日志时间的字段名。 */
        @UCloudParam("TimeKey")
        private String timeKey;

        /** TimeKey对应的时间格式。json、full_regex或multi_line_full_regex模式下，填写TimeKey时必须同时填写TimeFormat。 */
        @UCloudParam("TimeFormat")
        private String timeFormat;

        /** 是否上传解析失败的日志。字符串true表示上传，false表示丢弃。默认为false。 */
        @UCloudParam("UnMatchUpload")
        private String unMatchUpload;

        /** 存放无法解析的日志原文的Key。UnMatchUpload为true时必须填写。 */
        @UCloudParam("UnMatchKey")
        private String unMatchKey;

        /** 提取后的字段名。仅适用于delimiter、full_regex、multi_line_full_regex和multi_line_delimiter。 */
        @UCloudParam("Keys")
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

    public static class InputDetail extends Request {

        /** 日志输入类型。可选值：container_file、container_stdout。 */
        @NotEmpty
        @UCloudParam("Type")
        private String type;

        /** 容器标准输出流类型。仅适用于container_stdout，可选值：all、stdout、stderr，默认为all。 */
        @UCloudParam("Stream")
        private String stream;

        /** */
        @UCloudParam("Metadata")
        private InputDetailMetadata metadata;

        /** */
        @UCloudParam("FilePaths")
        private List<InputDetailFilePaths> filePaths;

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
    }

    public static class InputDetailFilePaths extends Request {

        /** 日志采集路径。仅适用于container_file。 */
        @UCloudParam("Path")
        private String path;

        /** 要采集的文件名。仅适用于container_file。 */
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
         * 要附加到日志中的容器元数据字段，多个字段使用逗号分隔。可选字段：container_name、namespace、pod_name、pod_ip、pod_uid、container_id、image_name。留空表示不采集容器元数据。
         */
        @UCloudParam("Container")
        private String container;

        /** 要采集的Pod标签。*表示采集所有标签，app,version表示仅采集指定标签，空字符串表示不采集标签。 */
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

        /** 要匹配的容器名称，*表示所有容器，多个名称使用逗号分隔。 */
        @UCloudParam("Container")
        private String container;

        /** 容器名称匹配操作符。可选值：in、notin。填写该参数时必须同时填写MatchRule.Container。 */
        @UCloudParam("ContainerOperator")
        private String containerOperator;

        /** */
        @UCloudParam("Workloads")
        private List<MatchRuleWorkloads> workloads;

        /** */
        @UCloudParam("PodLabels")
        private MatchRulePodLabels podLabels;

        public String getContainer() {
            return container;
        }

        public void setContainer(String container) {
            this.container = container;
        }

        public String getContainerOperator() {
            return containerOperator;
        }

        public void setContainerOperator(String containerOperator) {
            this.containerOperator = containerOperator;
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

        /**
         * 按Pod标签匹配时，命名空间名称的匹配操作符。可选值：in、notin。填写该参数时必须同时填写MatchRule.PodLabels.Namespace。PodLabels和Workloads不能同时设置。
         */
        @UCloudParam("NamespaceOperator")
        private String namespaceOperator;

        /** 按Pod标签匹配时要匹配的命名空间。 */
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

        /** 按Pod标签匹配时，要匹配的标签Key。 */
        @UCloudParam("Key")
        private String key;

        /** 标签值匹配操作符。可选值：in、notin。 */
        @UCloudParam("ValueOperator")
        private String valueOperator;

        /** 要匹配的标签值。 */
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

        /** 按工作负载匹配时，工作负载所在的命名空间。Workloads和PodLabels不能同时设置。 */
        @UCloudParam("Namespace")
        private String namespace;

        /** 工作负载类型。可选值：deployment、statefulset、daemonset、job、cronjob。 */
        @UCloudParam("Type")
        private String type;

        /** 工作负载名称。 */
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
