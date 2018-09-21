package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取内容转发组信息 结果类
 * @author: codezhang
 * @date: 2018-09-21 10:05
 **/

public class DescribePolicyGroupResult extends BaseResponseResult {

    public static class ULBPolicyGroup{

        /**
         * 内容转发策略组ID
         */
        @SerializedName("GroupId")
        private String groupId;


        /**
         * 内容转发策略组名称
         */
        @SerializedName("GroupName")
        private String groupName;


        /**
         * 内容转发策略组详细信息，具体结构见 UlbPolicySet
         */
        @SerializedName("PolicySet")
        private List<ULBPolicy> ulbPolicies;

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public List<ULBPolicy> getUlbPolicies() {
            return ulbPolicies;
        }

        public void setUlbPolicies(List<ULBPolicy> ulbPolicies) {
            this.ulbPolicies = ulbPolicies;
        }

        @Override
        public String toString() {
            return "ULBPolicyGroup{" +
                    "groupId='" + groupId + '\'' +
                    ", groupName='" + groupName + '\'' +
                    ", ulbPolicies=" + ulbPolicies +
                    '}';
        }
    }


    public static class ULBPolicy{
        /**
         * 内容转发策略组ID
         */
        @SerializedName("PolicyId")
        private String policyId;

        /**
         * 内容转发匹配字段的类型，当前只支持按域名转发。枚举值为： Domain，按域名转发
         */
        @SerializedName("Type")
        private String type;

        /**
         * 内容转发匹配字段
         */
        @SerializedName("Match")
        private String match;

        /**
         * 内容转发策略组ID应用的VServer实例的ID
         */
        @SerializedName("VServerId")
        private String vserverId;

        /**
         *  内容转发策略组ID所应用的后端资源列表，具体结构见 UlbPolicyBackendSet
         */
        @SerializedName("BackendSet")
        private List<ULBPolicyBackend> ulbPolicyBackends;

        public String getPolicyId() {
            return policyId;
        }

        public void setPolicyId(String policyId) {
            this.policyId = policyId;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getMatch() {
            return match;
        }

        public void setMatch(String match) {
            this.match = match;
        }

        public String getVserverId() {
            return vserverId;
        }

        public void setVserverId(String vserverId) {
            this.vserverId = vserverId;
        }

        public List<ULBPolicyBackend> getUlbPolicyBackends() {
            return ulbPolicyBackends;
        }

        public void setUlbPolicyBackends(List<ULBPolicyBackend> ulbPolicyBackends) {
            this.ulbPolicyBackends = ulbPolicyBackends;
        }

        @Override
        public String toString() {
            return "ULBPolicy{" +
                    "policyId='" + policyId + '\'' +
                    ", type='" + type + '\'' +
                    ", match='" + match + '\'' +
                    ", vserverId='" + vserverId + '\'' +
                    ", ulbPolicyBackends=" + ulbPolicyBackends +
                    '}';
        }
    }


    public  static class ULBPolicyBackend{

        /**
         * 后端资源实例的ID
         */
        @SerializedName("BackendId")
        private  String backendId;

        /**
         * 后端资源实例的内网IP
         */
        @SerializedName("PrivateIP")
        private String privateIp;

        /**
         * 后端资源实例的服务端口
         */
        @SerializedName("Port")
        private Integer port;

        public String getBackendId() {
            return backendId;
        }

        public void setBackendId(String backendId) {
            this.backendId = backendId;
        }

        public String getPrivateIp() {
            return privateIp;
        }

        public void setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        @Override
        public String toString() {
            return "ULBPolicyBackend{" +
                    "backendId='" + backendId + '\'' +
                    ", privateIp='" + privateIp + '\'' +
                    ", port=" + port +
                    '}';
        }
    }


    /**
     * 内容转发策略组列表，具体结构见 UlbPolicyGroupSet
     */
    @SerializedName("DataSet")
    private List<ULBPolicyGroup> ulbPolicyGroups;

    public List<ULBPolicyGroup> getUlbPolicyGroups() {
        return ulbPolicyGroups;
    }

    public void setUlbPolicyGroups(List<ULBPolicyGroup> ulbPolicyGroups) {
        this.ulbPolicyGroups = ulbPolicyGroups;
    }

    @Override
    public String toString() {
        return "DescribePolicyGroupResult{" +
                "ulbPolicyGroups=" + ulbPolicyGroups +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
