package cn.ucloud.unet.pojo;

import cn.ucloud.common.annotation.UcloudParam;
import com.google.gson.annotations.SerializedName;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class FirewallRule {
    //---------------以下是DescribeFirewallResult.Rule的字段------------------
    /**
     * 目标端口
     */
    @SerializedName("DstPort")
    private String dstPort;
    /**
     * 优先级
     */
    @SerializedName("Priority")
    private String piority;

    /**
     * 协议类型
     */
    @SerializedName("ProtocolType")
    private String protocolType;
    /**
     * 防火墙动作
     */
    @SerializedName("RuleAction")
    private String ruleAction;
    /**
     * 源地址
     */
    @SerializedName("SrcIP")
    private String srcIP;

    /**
     * 备注
     */
    @SerializedName("Remark")
    private String remark;

    //-----------------以下是UpdateFirewallParam.Rule的字段-------------------
    @SuppressWarnings("squid:S1170")
    private final String ruleFormat = "%s|%s|%s|%s|%s";
    @SuppressWarnings("squid:S1700")
    private String rule;

    /**
     * 协议: TCP, UDP, ...
     */
    @NotEmpty(message = "protocol can not be empty")
    private String protocol;

    /**
     * 端口号
     */
    @NotNull(message = "port can not be null")
    private String port;

    /**
     * IP
     */
    @NotEmpty(message = "ip can not be empty")
    private String ip;

    /**
     * ACCEPT（接受）, DROP（拒绝）
     */
    @NotEmpty(message = "acceptOrNot can not be empty")
    private String acceptOrNot;

    /**
     * 优先级：HIGH（高），MEDIUM（中），LOW（低）
     */
    @NotEmpty(message = "priority can not be empty")
    private String priority;

    //------------------describe的getter&setter--------------------------
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDstPort() {
        return dstPort;
    }

    public void setDstPort(String dstPort) {
        this.dstPort = dstPort;
    }

    public String getPiority() {
        return piority;
    }

    public void setPiority(String piority) {
        this.piority = piority;
    }

    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public String getRuleAction() {
        return ruleAction;
    }

    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }

    public String getSrcIP() {
        return srcIP;
    }

    public void setSrcIP(String srcIP) {
        this.srcIP = srcIP;
    }

    //------------------update的getter&setter--------------------------

    @NotEmpty(message = "rule can not be empty")
    @UcloudParam("Rule")
    public String getRule() {
        rule = String.format(ruleFormat, protocol, port, ip, acceptOrNot, priority);
        return rule;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setPort(int port) {
        this.port = Integer.toString(port);
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getAcceptOrNot() {
        return acceptOrNot;
    }

    public void setAcceptOrNot(String acceptOrNot) {
        this.acceptOrNot = acceptOrNot;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

}
