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
 * @description: 更新防火墙
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 15:43
 */
public class UpdateFirewallParam extends BaseRequestParam {
    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 防火墙ID
     */
    @NotEmpty(message = "fwId can not be empty")
    @UcloudParam("FWId")
    private String fwId;

    /**
     * optional rule 防火墙规则
     */
    @NotNull(message = "rule can not be empty")
    private List<Rule> rule;

    @UcloudParam("Rule")
    public List<Param> checkFirewallRule() throws ValidatorException {
        List<Param> list = new ArrayList<>();
        if (rule == null || rule.isEmpty()) {
            throw new ValidatorException("rule can not be empty");
        }
        List<Rule> rules = this.getRule();
        String exceptionFormat = "rule[%d%s";
        for (int i = 0, len = rules.size(); i < len; i++) {
            Rule rule = rules.get(i);
            if (rule == null) {
                throw new ValidatorException(String.format(exceptionFormat, i, " can not be null"));
            } else {
                if (StringUtils.isBlank(rule.getProtocol())) {
                    throw new ValidatorException(String.format(exceptionFormat, i, "protocol can not be empty"));
                }
                if (rule.getPort() == null || !rule.getPort().matches("^$|^[1-9][0-9]*$|^[1-9][0-9]*-[1-9][0-9]*$")) {
                    throw new ValidatorException(String.format(exceptionFormat, i, "port can not be null or port illegal"));
                }
                if (StringUtils.isBlank(rule.getIp())) {
                    throw new ValidatorException(String.format(exceptionFormat, i, "ip can not be empty"));
                }
                if (StringUtils.isBlank(rule.getAcceptOrNot())) {
                    throw new ValidatorException(String.format(exceptionFormat, i, "acceptOrNot can not be empty"));
                }
                if (StringUtils.isBlank(rule.getPriority())) {
                    throw new ValidatorException(String.format(exceptionFormat, i, "priority can not be empty"));
                }
                list.add(new Param("Rule." + i, rule.getRule()));
            }
        }
        return list;
    }

    public UpdateFirewallParam(@NotEmpty(message = "region can not be empty") String region,
                               @NotEmpty(message = "fwId can not be empty") String fwId,
                               @NotNull(message = "rule can not be empty") List<Rule> rule) {
        super("UpdateFirewall");
        this.region = region;
        this.fwId = fwId;
        this.rule = rule;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getFwId() {
        return fwId;
    }

    public void setFwId(String fwId) {
        this.fwId = fwId;
    }

    public List<Rule> getRule() {
        return rule;
    }

    public void setRule(List<Rule> rule) {
        this.rule = rule;
    }

    public static class Rule {
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

        public Rule(@NotEmpty(message = "protocol can not be empty") String protocol,
                    @NotNull(message = "port can not be null") String port,
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
}
