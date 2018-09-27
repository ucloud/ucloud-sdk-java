package cn.ucloud.unet.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.exception.ValidatorException;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;
import org.apache.commons.lang3.StringUtils;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 11:31
 */
public class CreateFirewallParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * name 防火墙名称， 默认为Firewall
     */
    @UcloudParam("Name")
    @NotEmpty(message = "name can not be empty")
    private String name;

    /**
     * tag 防火墙业务组，默认为Default
     */
    @UcloudParam("Tag")
    private String tag;

    /**
     * remark 防火墙描述，默认为空
     */
    @UcloudParam("Remark")
    private String remark;


    /**
     * rule 防火墙规则
     */
    @NotNull(message = "rule can not be empty")
    private List<Rule> rule;

    @UcloudParam("Rule")
    public List<Param> checkFirewallRule() throws ValidatorException {
        List<Param> list = new ArrayList<>();
        if (this.getRule() != null && !this.getRule().isEmpty()) {
            List<Rule> rules = this.getRule();
            for (int i = 0, len = rules.size(); i < len; i++) {
                Rule rule = rules.get(i);
                if (rule == null) {
                    throw new ValidatorException("rule[" + i + "] can not be null");
                } else {
                    if (StringUtils.isBlank(rule.getProtocol())) {
                        throw new ValidatorException("rule[" + i + "].protocol can not be empty");
                    }
                    if (rule.getPort() == null || rule.getPort() <= 0) {
                        throw new ValidatorException("rule[" + i + "].port can not be null or value <= 0");
                    }
                    if (StringUtils.isBlank(rule.getIp())) {
                        throw new ValidatorException("rule[" + i + "].ip can not be empty");
                    }
                    if (StringUtils.isBlank(rule.getAcceptOrNot())) {
                        throw new ValidatorException("rule[" + i + "].acceptOrNot can not be empty");
                    }
                    if (StringUtils.isBlank(rule.getPriority())) {
                        throw new ValidatorException("rule[" + i + "].priority can not be empty");
                    }
                    list.add(new Param("Rule." + i, rule.getRule()));
                }
            }
        }
        return list;
    }


    public CreateFirewallParam(@NotEmpty(message = "region can not be empty") String region,
                               @NotNull(message = "rule can not be empty") List<Rule> rule,
                               @NotNull(message = "name can not be empty") String name) {
        super("CreateFirewall");
        this.region = region;
        this.rule = rule;
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
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

    public List<Rule> getRule() {
        return rule;
    }

    public void setRule(List<Rule> rule) {
        this.rule = rule;
    }

    public static class Rule {
        private final String ruleFormat = "%s|%d|%s|%s|%s";
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
        private Integer port;

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

        public Rule(@NotEmpty(message = "protocol can not be empty") String protocol,
                    @NotNull(message = "port can not be null") Integer port,
                    @NotEmpty(message = "ip can not be empty") String ip,
                    @NotEmpty(message = "acceptOrNot can not be empty") String acceptOrNot,
                    @NotEmpty(message = "priority can not be empty") String priority) {
            this.protocol = protocol;
            this.port = port;
            this.ip = ip;
            this.acceptOrNot = acceptOrNot;
            this.priority = priority;
        }

        @NotEmpty(message = "rule can not be empty")
        @UcloudParam("Rule")
        public String getRule() {
            if (port <= 0)
                port = 22;
            if (StringUtils.isBlank(protocol))
                protocol = "TCP";
            if (StringUtils.isBlank(ip))
                ip = "192.168.1.1";
            if (StringUtils.isBlank(acceptOrNot))
                acceptOrNot = "DROP";
            if (StringUtils.isBlank(priority))
                priority = "LOW";

            rule = String.format(ruleFormat, protocol, port, ip + "/" + port, acceptOrNot, priority);
            return rule;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
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
}
