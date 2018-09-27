package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 15:14
 */
public class DescribeFirewallResult extends BaseResponseResult {
    @SerializedName("TotalCount")
    private int totalCount;
    @SerializedName("DataSet")
    private List<FirewallData> dataSet;

    public static class FirewallData {

        @SerializedName("CreateTime")
        private int createTime;
        @SerializedName("FWId")
        private String fwId;
        @SerializedName("GroupId")
        private String groupId;
        @SerializedName("Name")
        private String name;
        @SerializedName("Remark")
        private String remark;
        @SerializedName("ResourceCount")
        private int resourceCount;
        @SerializedName("Tag")
        private String tag;
        @SerializedName("Type")
        private String type;
        @SerializedName("Rule")
        private List<FirewallRule> rule;

        public int getCreateTime() {
            return createTime;
        }

        public void setCreateTime(int createTime) {
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

        public int getResourceCount() {
            return resourceCount;
        }

        public void setResourceCount(int resourceCount) {
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

        public static class FirewallRule {
            @SerializedName("DstPort")
            private String dstPort;
            @SerializedName("Priority")
            private String piority;
            @SerializedName("ProtocolType")
            private String protocolType;
            @SerializedName("RuleAction")
            private String ruleAction;
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
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<FirewallData> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<FirewallData> dataSet) {
        this.dataSet = dataSet;
    }
}
