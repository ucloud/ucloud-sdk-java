package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取防火墙信息 参数类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 15:14
 */
public class DescribeFirewallResult extends BaseResponseResult {

    public static class FirewallRule {
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

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }

    public static class FirewallData {
        /**
         * 防火墙组创建时间，格式为Unix Timestamp
         */
        @SerializedName("CreateTime")
        private Integer createTime;

        /**
         * Firewall ID
         */
        @SerializedName("FWId")
        private String fwId;
        /**
         * 分组ID
         */
        @SerializedName("GroupId")
        private String groupId;
        /**
         * 防火墙名称
         */
        @SerializedName("Name")
        private String name;
        /**
         * 备注
         */
        @SerializedName("Remark")
        private String remark;
        /**
         * 防火墙绑定资源数量
         */
        @SerializedName("ResourceCount")
        private Integer resourceCount;
        /**
         * 业务组
         */
        @SerializedName("Tag")
        private String tag;
        /**
         * 防火墙组类型，枚举值为： "user defined", 用户自定义防火墙；
         * "recommend web", 默认Web防火墙；
         * "recommend non web", 默认非Web防火墙
         */
        @SerializedName("Type")
        private String type;
        /**
         * 防火墙组中的规则列表，参见 FirewallRuleSet
         */
        @SerializedName("Rule")
        private List<FirewallRule> rule;

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getFwId() {
            return fwId;
        }

        public void setFwId(String fwId) {
            this.fwId = fwId;
        }

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
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

        public Integer getResourceCount() {
            return resourceCount;
        }

        public void setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<FirewallRule> getRule() {
            return rule;
        }

        public void setRule(List<FirewallRule> rule) {
            this.rule = rule;
        }


        @Override
        public String toString() {
            return new Gson().toJson(this);
        }


    }

    /**
     * 满足条件的数目
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 获取的防火墙组详细信息 参见 FirewallDataSet
     */
    @SerializedName("DataSet")
    private List<FirewallData> dataSet;



    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<FirewallData> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<FirewallData> dataSet) {
        this.dataSet = dataSet;
    }
}
