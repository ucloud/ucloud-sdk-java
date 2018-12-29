package cn.ucloud.ulb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 创建VServer
 * 创建VServer实例，定义监听的协议和端口以及负载均衡算法
 * @author: codezhang
 * @date: 2018-09-19 11:48
 **/

public class CreateVServerParam extends BaseRequestParam {

    /**
     * require
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 负载均衡实例ID
     */
    @UcloudParam("ULBId")
    @NotEmpty(message = "ulbId can not be empty")
    private String ulbId;

    /**
     * optional
     * VServer实例名称，默认为"VServer"
     */
    @UcloudParam("VServerName")
    private String vserverName;

    /**
     * optional 监听器类型，枚举值为：
     * RequestProxy -> 请求代理；
     * PacketsTransmit -> 报文转发；
     * 默认为"RequestProxy"
     */
    @UcloudParam("ListenType")
    private String listenType;

    /**
     * optional VServer实例的协议，
     * 请求代理模式下有 HTTP、HTTPS、TCP，报文转发下有 TCP，UDP。
     * 默认为“HTTP"
     */
    @UcloudParam("Protocol")
    private String protocol;

    /**
     * optional VServer后端端口，取值范围[1-65535]；默认值为80
     */
    @UcloudParam("FrontendPort")
    private Integer frontendPort;

    /**
     * optional
     * VServer负载均衡模式，枚举值：
     * Roundrobin -> 轮询;
     * Source -> 源地址;
     * ConsistentHash -> 一致性哈希;
     * SourcePort -> 源地址（计算端口);
     * ConsistentHashPort -> 一致性哈希（计算端口）。
     * ConsistentHash，SourcePort，ConsistentHashPort 只在报文转发中使用;
     * Roundrobin和Source在请求代理和报文转发中使用。
     * 默认为："Roundrobin"
     */
    @UcloudParam("Method")
    private String method;

    /**
     * optional VServer会话保持方式，默认关闭会话保持。
     * 枚举值：
     * None -> 关闭；
     * ServerInsert -> 自动生成KEY；
     * UserDefined -> 用户自定义KEY。
     */
    @UcloudParam("PersistenceType")
    private String persistenceType;

    /**
     * optional 根据PersistenceType确认；
     * None和ServerInsert： 此字段无意义；
     * UserDefined：此字段传入自定义会话保持String
     */
    @UcloudParam("PersistenceInfo")
    private String persistenceInfo;

    /**
     * optional
     * ListenType为RequestProxy时表示空闲连接的回收时间，单位：秒，取值范围：时(0，86400]，默认值为60；
     * ListenType为PacketsTransmit时表示连接保持的时间，单位：秒，取值范围：[60，900]，0 表示禁用连接保持
     */
    @UcloudParam("ClientTimeout")
    private Integer clientTimeout;

    /**
     * optional
     * 健康检查类型，枚举值：Port -> 端口检查；Path -> 路径检查；
     */
    @UcloudParam("MonitorType")
    private String monitorType;

    public CreateVServerParam(@NotEmpty(message = "region can not be empty") String region,
                              @NotEmpty(message = "ulbId can not be empty") String ulbId) {
        super("CreateVServer");
        this.region = region;
        this.ulbId = ulbId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getUlbId() {
        return ulbId;
    }

    public void setUlbId(String ulbId) {
        this.ulbId = ulbId;
    }

    public String getVserverName() {
        return vserverName;
    }

    public void setVserverName(String vserverName) {
        this.vserverName = vserverName;
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
}
