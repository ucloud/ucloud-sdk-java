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
package cn.ucloud.ulb.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class UpdateLoadBalancerAttributeRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 负载均衡实例的ID */
    @NotEmpty
    @UCloudParam("LoadBalancerId")
    private String loadBalancerId;

    /** 负载均衡实例的名称，不传则默认不修改 */
    @UCloudParam("Name")
    private String name;

    /** 负载均衡实例所属的业务组ID，不传则默认不修改 */
    @UCloudParam("Tag")
    private String tag;

    /** 负载均衡实例的备注信息，不传则默认不修改，限定字符长度：[0-255] */
    @UCloudParam("Remark")
    private String remark;

    /** */
    @UCloudParam("AccessLogConfig")
    private AccessLogConfig accessLogConfig;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public AccessLogConfig getAccessLogConfig() {
        return accessLogConfig;
    }

    public void setAccessLogConfig(AccessLogConfig accessLogConfig) {
        this.accessLogConfig = accessLogConfig;
    }

    public static class AccessLogConfig extends Request {

        /** （应用型专用）是否开启访问日志记录功能 */
        @UCloudParam("Enabled")
        private Boolean enabled;

        /** （应用型专用）用于存储访问日志的bucket */
        @UCloudParam("US3BucketName")
        private String us3BucketName;

        /** （应用型专用）上传访问日志到bucket所需的token */
        @UCloudParam("US3TokenId")
        private String us3TokenId;

        /** （应用型专用）上传访问日志的目标；us3,elasticsearch,logstash,kafka,uls */
        @UCloudParam("Destination")
        private String destination;

        /** （应用型专用）是否开启自定义日志功能 */
        @UCloudParam("EnableCustomLog")
        private Boolean enableCustomLog;

        /** （应用型专用）日志参数列表 */
        @UCloudParam("Params")
        private List<String> params;

        /** （应用型专用）日志内容格式，space,json; */
        @UCloudParam("ContentType")
        private String contentType;

        /** （应用型专用）是否开启日志聚合功能 */
        @UCloudParam("EnableAggregate")
        private Boolean enableAggregate;

        /** （应用型专用）日志聚合频率 */
        @UCloudParam("Frequency")
        private Integer frequency;

        /** （应用型专用）日志上传目标地址；仅对elasticsearch,logstash,kafka生效，最多支持五个 */
        @UCloudParam("DestinationAddrs")
        private String destinationAddrs;

        /** （应用型专用）kafka topic；仅对kafka生效 */
        @UCloudParam("Topic")
        private String topic;

        /** （应用型专用）uls topic；仅对上传目标为uls生效 */
        @UCloudParam("ULSTopic")
        private String ulsTopic;

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public String getUS3BucketName() {
            return us3BucketName;
        }

        public void setUS3BucketName(String us3BucketName) {
            this.us3BucketName = us3BucketName;
        }

        public String getUS3TokenId() {
            return us3TokenId;
        }

        public void setUS3TokenId(String us3TokenId) {
            this.us3TokenId = us3TokenId;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public Boolean getEnableCustomLog() {
            return enableCustomLog;
        }

        public void setEnableCustomLog(Boolean enableCustomLog) {
            this.enableCustomLog = enableCustomLog;
        }

        public List<String> getParams() {
            return params;
        }

        public void setParams(List<String> params) {
            this.params = params;
        }

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }

        public Boolean getEnableAggregate() {
            return enableAggregate;
        }

        public void setEnableAggregate(Boolean enableAggregate) {
            this.enableAggregate = enableAggregate;
        }

        public Integer getFrequency() {
            return frequency;
        }

        public void setFrequency(Integer frequency) {
            this.frequency = frequency;
        }

        public String getDestinationAddrs() {
            return destinationAddrs;
        }

        public void setDestinationAddrs(String destinationAddrs) {
            this.destinationAddrs = destinationAddrs;
        }

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public String getULSTopic() {
            return ulsTopic;
        }

        public void setULSTopic(String ulsTopic) {
            this.ulsTopic = ulsTopic;
        }
    }
}
