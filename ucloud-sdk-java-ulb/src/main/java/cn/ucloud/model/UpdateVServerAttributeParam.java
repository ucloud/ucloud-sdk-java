package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 更新VServer属性
 * 警示信息: VServerId 对应 CreateVServer 返回的 VServerId
 * 或者 DescribeVServer / DescribeULB 返回的 ULBVServerSet 中的 VServerId
 * 没有传的参数都不会做修改
 * @author: codezhang
 * @date: 2018-09-19 14:29
 **/

public class UpdateVServerAttributeParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * require 负载均衡实例ID
     */
    @NotEmpty(message = "ulbId can not be empty")
    @UcloudParam("ULBId")
    private String ulbId;

    /**
     * require VServer实例ID
     */
    @UcloudParam("VServerId")
    @NotEmpty(message = "vserverId can not be empty")
    private String vserverId;

    /**
     * optional VServer实例名称，若无此字段则不做修改
     */
    @UcloudParam("VServerName")
    private String vserverName;

    /**
     * optional VServer协议类型，请求代理只支持修改为 HTTP/HTTPS，报文转发VServer只支持修改为 TCP/UDP
     */
    @UcloudParam("Protocol")
    private String protocol;

    /**
     * optional
     * VServer负载均衡算法，
     * ConsistentHash，SourcePort，ConsistentHashPort 只在报文转发中使用；
     * Roundrobin和Source在请求代理和报文转发中使用。
     */
    @UcloudParam("Method")
    private String method;

    /**
     * optional
     * VServer会话保持模式，若无此字段则不做修改。
     * 枚举值：
     * None：关闭；
     * ServerInsert：自动生成KEY；
     * UserDefined：用户自定义KEY。
     */
    @UcloudParam("PersistenceType")
    private String persistenceType;


    /**
     * optional
     * 根据PersistenceType确定:
     * None或ServerInsert, 此字段无意义;
     * UserDefined, 则此字段传入用户自定义会话保持String.
     * 若无此字段则不做修改
     */
    @UcloudParam("PersistenceInfo")
    private String persistenceInfo;

    /**
     * optional
     * 请求代理的VServer下表示空闲连接的回收时间，单位：秒，取值范围：时(0，86400]，默认值为60；
     * 报文转发的VServer下表示回话保持的时间，单位：秒，取值范围：[60，900]，
     * 0 表示禁用连接保持
     */
    @UcloudParam("ClientTimeout")
    private Integer clientTimeout;

    /**
     * optional
     * 健康检查的类型，Port:端口,Path:路径
     */
    @UcloudParam("MonitorType")
    private String monitorType;

    /**
     * optional
     * MonitorType 为 Path 时指定健康检查发送请求时HTTP HEADER 里的域名
     */
    @UcloudParam("Domain")
    private String domain;

    /**
     * optional MonitorType 为 Path 时指定健康检查发送请求时的路径，默认为 /
     */
    @UcloudParam("Path")
    private String path;

    public UpdateVServerAttributeParam(@NotEmpty(message = "region can not be empty") String region,
                                       @NotEmpty(message = "ulbId can not be empty") String ulbId,
                                       @NotEmpty(message = "vserverId can not be empty") String vserverId) {
        super("UpdateVServerAttribute");
        this.region = region;
        this.ulbId = ulbId;
        this.vserverId = vserverId;
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

    public String getVserverId() {
        return vserverId;
    }

    public void setVserverId(String vserverId) {
        this.vserverId = vserverId;
    }

    public String getVserverName() {
        return vserverName;
    }

    public void setVserverName(String vserverName) {
        this.vserverName = vserverName;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
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
}
