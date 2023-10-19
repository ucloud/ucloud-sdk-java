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

public class CreateVServerRequest extends Request {

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

    /** 传统型负载均衡实例ID */
    @NotEmpty
    @UCloudParam("ULBId")
    private String ulbId;

    /** VServer实例名称，默认为"VServer" */
    @UCloudParam("VServerName")
    private String vServerName;

    /** 监听器类型，枚举值，RequestProxy ，请求代理；PacketsTransmit ，报文转发。默认为RequestProxy */
    @UCloudParam("ListenType")
    private String listenType;

    /** VServer实例的协议，请求代理模式下有 HTTP、HTTPS、TCP，报文转发下有 TCP，UDP。默认为“HTTP" */
    @UCloudParam("Protocol")
    private String protocol;

    /** VServer后端端口，取值范围[1-65535]；默认值为80 */
    @UCloudParam("FrontendPort")
    private Integer frontendPort;

    /**
     * VServer负载均衡模式，枚举值：Roundrobin -> 轮询;Source -> 源地址；ConsistentHash -> 一致性哈希；SourcePort ->
     * 源地址（计算端口）；ConsistentHashPort -> 一致性哈希（计算端口）; WeightRoundrobin -> 加权轮询; Leastconn ->
     * 最小连接数;Backup ->主备模式。 ConsistentHash，SourcePort，ConsistentHashPort
     * 只在报文转发中使用；Leastconn只在请求代理中使用；Roundrobin、Source和WeightRoundrobin,Backup在请求代理和报文转发中使用。
     * 默认为："Roundrobin"
     */
    @UCloudParam("Method")
    private String method;

    /** VServer会话保持方式，默认关闭会话保持。枚举值：None -> 关闭；ServerInsert -> 自动生成KEY；UserDefined -> 用户自定义KEY。 */
    @UCloudParam("PersistenceType")
    private String persistenceType;

    /** 根据PersistenceType确认； None和ServerInsert： 此字段无意义； UserDefined：此字段传入自定义会话保持String */
    @UCloudParam("PersistenceInfo")
    private String persistenceInfo;

    /**
     * ListenType为RequestProxy时表示空闲连接的回收时间，单位：秒，取值范围：时(0，86400]，默认值为60；ListenType为PacketsTransmit时表示连接保持的时间，单位：秒，取值范围：[60，900]，0
     * 表示禁用连接保持
     */
    @UCloudParam("ClientTimeout")
    private Integer clientTimeout;

    /**
     * 健康检查类型，枚举值：Port -> 端口检查；Path -> 路径检查；Ping -> Ping探测；Customize -> UDP检查
     * 请求代理型默认值为Port，其中TCP协议仅支持Port，其他协议支持Port和Path;
     * 报文转发型TCP协议仅支持Port，UDP协议支持Ping、Port和Customize，默认值为Ping
     */
    @UCloudParam("MonitorType")
    private String monitorType;

    /** 根据MonitorType确认； 当MonitorType为Path时，此字段有意义，代表HTTP检查域名 */
    @UCloudParam("Domain")
    private String domain;

    /** 根据MonitorType确认； 当MonitorType为Path时，此字段有意义，代表HTTP检查路径 */
    @UCloudParam("Path")
    private String path;

    /** 根据MonitorType确认； 当MonitorType为Customize时，此字段有意义，代表UDP检查发出的请求报文 */
    @UCloudParam("RequestMsg")
    private String requestMsg;

    /** 根据MonitorType确认； 当MonitorType为Customize时，此字段有意义，代表UDP检查请求应收到的响应报文 */
    @UCloudParam("ResponseMsg")
    private String responseMsg;

    /** 安全策略组ID，默认值'Default' */
    @UCloudParam("SecurityPolicyId")
    private String securityPolicyId;

    /** 0:关闭 1:开启，用于数据压缩功能 */
    @UCloudParam("EnableCompression")
    private Integer enableCompression;

    /** 重定向端口，取值范围[0-65535]；默认值为0，代表关闭；仅HTTP协议支持开启重定向功能 */
    @UCloudParam("ForwardPort")
    private Integer forwardPort;

    /** 0:关闭 1:开启，用于开启http2功能；默认值为0 */
    @UCloudParam("EnableHTTP2")
    private Integer enableHTTP2;

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

    public String getULBId() {
        return ulbId;
    }

    public void setULBId(String ulbId) {
        this.ulbId = ulbId;
    }

    public String getVServerName() {
        return vServerName;
    }

    public void setVServerName(String vServerName) {
        this.vServerName = vServerName;
    }

    public String getListenType() {
        return listenType;
    }

    public void setListenType(String listenType) {
        this.listenType = listenType;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Integer getFrontendPort() {
        return frontendPort;
    }

    public void setFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getPersistenceType() {
        return persistenceType;
    }

    public void setPersistenceType(String persistenceType) {
        this.persistenceType = persistenceType;
    }

    public String getPersistenceInfo() {
        return persistenceInfo;
    }

    public void setPersistenceInfo(String persistenceInfo) {
        this.persistenceInfo = persistenceInfo;
    }

    public Integer getClientTimeout() {
        return clientTimeout;
    }

    public void setClientTimeout(Integer clientTimeout) {
        this.clientTimeout = clientTimeout;
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
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

    public String getRequestMsg() {
        return requestMsg;
    }

    public void setRequestMsg(String requestMsg) {
        this.requestMsg = requestMsg;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    public String getSecurityPolicyId() {
        return securityPolicyId;
    }

    public void setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
    }

    public Integer getEnableCompression() {
        return enableCompression;
    }

    public void setEnableCompression(Integer enableCompression) {
        this.enableCompression = enableCompression;
    }

    public Integer getForwardPort() {
        return forwardPort;
    }

    public void setForwardPort(Integer forwardPort) {
        this.forwardPort = forwardPort;
    }

    public Integer getEnableHTTP2() {
        return enableHTTP2;
    }

    public void setEnableHTTP2(Integer enableHTTP2) {
        this.enableHTTP2 = enableHTTP2;
    }
}
