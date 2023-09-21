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

public class CreateListenerRequest extends Request {

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

    /** 监听器的名称。限定字符长度：[1-255]；限定特殊字符，仅支持：“-”，“_”，“.”；默认值：listener */
    @UCloudParam("Name")
    private String name;

    /** 监听器的备注信息。限定字符长度：[0-255] */
    @UCloudParam("Remark")
    private String remark;

    /** 监听器的监听端口。应用型限定取值：[1-65535]，默认值80 */
    @UCloudParam("ListenerPort")
    private Integer listenerPort;

    /** 监听协议。应用型限定取值：“HTTP”/"HTTPS"，默认值“HTTP” */
    @UCloudParam("ListenerProtocol")
    private String listenerProtocol;

    /** （应用型专用）服务器默认证书ID。仅HTTPS监听支持，且必填；暂时只支持最大长度为1 */
    @UCloudParam("Certificates")
    private List<String> certificates;

    /** （应用型专用）安全策略组ID。仅HTTPS监听支持绑定；默认值“Default”，表示绑定原生策略 */
    @UCloudParam("SecurityPolicyId")
    private String securityPolicyId;

    /** 连接空闲超时时间。单位：秒。应用型限定取值：[1-86400]；默认值60 */
    @UCloudParam("IdleTimeout")
    private Integer idleTimeout;

    /**
     * 负载均衡算法。应用型限定取值："Roundrobin"/"Source"/"WeightRoundrobin"/" Leastconn"/"Backup"，默认值"Roundrobin"
     */
    @UCloudParam("Scheduler")
    private String scheduler;

    /** */
    @UCloudParam("StickinessConfig")
    private StickinessConfig stickinessConfig;

    /** */
    @UCloudParam("HealthCheckConfig")
    private HealthCheckConfig healthCheckConfig;

    /** （应用型专用）是否开启数据压缩功能。目前只支持使用gzip对特定文件类型进行压缩。默认值为：false */
    @UCloudParam("CompressionEnabled")
    private Boolean compressionEnabled;

    /** （应用型专用）是否开启HTTP/2特性。仅HTTPS监听支持开启；默认值为：false */
    @UCloudParam("HTTP2Enabled")
    private Boolean http2Enabled;

    /** （应用型专用）是否开启HTTP重定向到HTTPS。仅HTTP监听支持开启；默认值为：false */
    @UCloudParam("RedirectEnabled")
    private Boolean redirectEnabled;

    /** （应用型专用）重定向端口。限定取值：[1-65535]，默认值443 */
    @UCloudParam("RedirectPort")
    private Integer redirectPort;

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getListenerPort() {
        return listenerPort;
    }

    public void setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
    }

    public String getListenerProtocol() {
        return listenerProtocol;
    }

    public void setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
    }

    public List<String> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<String> certificates) {
        this.certificates = certificates;
    }

    public String getSecurityPolicyId() {
        return securityPolicyId;
    }

    public void setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
    }

    public Integer getIdleTimeout() {
        return idleTimeout;
    }

    public void setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    public String getScheduler() {
        return scheduler;
    }

    public void setScheduler(String scheduler) {
        this.scheduler = scheduler;
    }

    public StickinessConfig getStickinessConfig() {
        return stickinessConfig;
    }

    public void setStickinessConfig(StickinessConfig stickinessConfig) {
        this.stickinessConfig = stickinessConfig;
    }

    public HealthCheckConfig getHealthCheckConfig() {
        return healthCheckConfig;
    }

    public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    public Boolean getCompressionEnabled() {
        return compressionEnabled;
    }

    public void setCompressionEnabled(Boolean compressionEnabled) {
        this.compressionEnabled = compressionEnabled;
    }

    public Boolean getHTTP2Enabled() {
        return http2Enabled;
    }

    public void setHTTP2Enabled(Boolean http2Enabled) {
        this.http2Enabled = http2Enabled;
    }

    public Boolean getRedirectEnabled() {
        return redirectEnabled;
    }

    public void setRedirectEnabled(Boolean redirectEnabled) {
        this.redirectEnabled = redirectEnabled;
    }

    public Integer getRedirectPort() {
        return redirectPort;
    }

    public void setRedirectPort(Integer redirectPort) {
        this.redirectPort = redirectPort;
    }

    public static class HealthCheckConfig extends Request {

        /** 是否开启健康检查功能。暂时不支持关闭。默认值为：true */
        @UCloudParam("Enabled")
        private Boolean enabled;

        /** 健康检查方式。应用型限定取值：“Port”/"HTTP"，默认值：“Port” */
        @UCloudParam("Type")
        private String type;

        /** （应用型专用）HTTP检查域名 */
        @UCloudParam("Domain")
        private String domain;

        /** （应用型专用）HTTP检查路径 */
        @UCloudParam("Path")
        private String path;

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }
    }

    public static class StickinessConfig extends Request {

        /** 是否开启会话保持功能。应用型负载均衡实例基于Cookie实现；默认值为：false */
        @UCloudParam("Enabled")
        private Boolean enabled;

        /** （应用型专用）Cookie处理方式。限定枚举值："ServerInsert" / "UserDefined"；默认值为：“ServerInsert” */
        @UCloudParam("Type")
        private String type;

        /** （应用型专用）自定义Cookie。当StickinessType取值"UserDefined"时有效；限定字符长度：[0-255] */
        @UCloudParam("CookieName")
        private String cookieName;

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCookieName() {
            return cookieName;
        }

        public void setCookieName(String cookieName) {
            this.cookieName = cookieName;
        }
    }
}
