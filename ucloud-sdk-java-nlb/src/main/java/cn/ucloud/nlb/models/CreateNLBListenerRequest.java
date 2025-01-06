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
package cn.ucloud.nlb.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateNLBListenerRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 负载均衡实例的ID */
    @NotEmpty
    @UCloudParam("NLBId")
    private String nlbId;

    /** 监听器的名称 限定字符长度：[1-255] 限定特殊字符，仅支持：-_. 默认值：listener */
    @UCloudParam("Name")
    private String name;

    /** 监听器的备注信息 限定字符长度：[0-255] */
    @UCloudParam("Remark")
    private String remark;

    /** 端口范围的起始端口 限定取值：[1-65535] 默认值 1 */
    @UCloudParam("StartPort")
    private Integer startPort;

    /** 端口范围的结束端口 限定取值：[1-65535] 取值不小于起始端口 默认值 65535 */
    @UCloudParam("EndPort")
    private Integer endPort;

    /** 监听协议 限定取值："TCP"/"UDP" */
    @UCloudParam("Protocol")
    private String protocol;

    /**
     * 负载均衡算法 限定取值："RoundRobin"/"SourceHash"/"LeastConn"/"WeightLeastConn "/"WeightRoundRobin" 默认值
     * "RoundRobin"
     */
    @UCloudParam("Scheduler")
    private String scheduler;

    /** 会话保持超时时间。单位：秒 限定取值：[60-900]，0 表示不开启会话保持 默认值60 */
    @UCloudParam("StickinessTimeout")
    private Integer stickinessTimeout;

    /** */
    @UCloudParam("HealthCheckConfig")
    private HealthCheckConfig healthCheckConfig;

    /** 传递源 IP 方法。 限定取值："" / "None" / "Toa"，空字符串和 None 代表关闭。 */
    @UCloudParam("ForwardSrcIPMethod")
    private String forwardSrcIPMethod;

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

    public String getNLBId() {
        return nlbId;
    }

    public void setNLBId(String nlbId) {
        this.nlbId = nlbId;
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

    public Integer getStartPort() {
        return startPort;
    }

    public void setStartPort(Integer startPort) {
        this.startPort = startPort;
    }

    public Integer getEndPort() {
        return endPort;
    }

    public void setEndPort(Integer endPort) {
        this.endPort = endPort;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getScheduler() {
        return scheduler;
    }

    public void setScheduler(String scheduler) {
        this.scheduler = scheduler;
    }

    public Integer getStickinessTimeout() {
        return stickinessTimeout;
    }

    public void setStickinessTimeout(Integer stickinessTimeout) {
        this.stickinessTimeout = stickinessTimeout;
    }

    public HealthCheckConfig getHealthCheckConfig() {
        return healthCheckConfig;
    }

    public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    public String getForwardSrcIPMethod() {
        return forwardSrcIPMethod;
    }

    public void setForwardSrcIPMethod(String forwardSrcIPMethod) {
        this.forwardSrcIPMethod = forwardSrcIPMethod;
    }

    public static class HealthCheckConfig extends Request {

        /** 是否开启健康检查功能。暂时不支持关闭，默认 true */
        @UCloudParam("Enabled")
        private Boolean enabled;

        /** 健康检查探测端口 说明： 限定取值：[1-65535] */
        @UCloudParam("Port")
        private Integer port;

        /** 健康检查方式 限定取值："Port"/"UDP"/"Ping" 默认值：“Port” */
        @UCloudParam("Type")
        private String type;

        /** UDP" 检查模式的请求字符串 */
        @UCloudParam("ReqMsg")
        private String reqMsg;

        /** "UDP" 检查模式的预期响应字符串 */
        @UCloudParam("ResMsg")
        private String resMsg;

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getReqMsg() {
            return reqMsg;
        }

        public void setReqMsg(String reqMsg) {
            this.reqMsg = reqMsg;
        }

        public String getResMsg() {
            return resMsg;
        }

        public void setResMsg(String resMsg) {
            this.resMsg = resMsg;
        }
    }
}
