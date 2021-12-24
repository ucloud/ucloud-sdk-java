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
package cn.ucloud.vpc.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeNetworkAclEntryResponse extends Response {

    /** 所有的规则信息: false */
    @SerializedName("EntryList")
    private List<AclEntryInfo> entryList;

    public List<AclEntryInfo> getEntryList() {
        return entryList;
    }

    public void setEntryList(List<AclEntryInfo> entryList) {
        this.entryList = entryList;
    }

    public static class TargetResourceInfo extends Response {

        /** 子网ID: false */
        @SerializedName("SubnetworkId")
        private String subnetworkId;

        /** 资源名称: false */
        @SerializedName("ResourceName")
        private String resourceName;

        /** 资源ID: false */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 资源类型: false */
        @SerializedName("ResourceType")
        private Integer resourceType;

        /** 资源绑定的虚拟网卡的名称: false */
        @SerializedName("SubResourceName")
        private String subResourceName;

        /** 资源绑定的虚拟网卡的ID: false */
        @SerializedName("SubResourceId")
        private String subResourceId;

        /** 资源绑定虚拟网卡的类型: false */
        @SerializedName("SubResourceType")
        private Integer subResourceType;

        /** 资源内网IP: false */
        @SerializedName("PrivateIp")
        private String privateIp;

        public String getSubnetworkId() {
            return subnetworkId;
        }

        public void setSubnetworkId(String subnetworkId) {
            this.subnetworkId = subnetworkId;
        }

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public Integer getResourceType() {
            return resourceType;
        }

        public void setResourceType(Integer resourceType) {
            this.resourceType = resourceType;
        }

        public String getSubResourceName() {
            return subResourceName;
        }

        public void setSubResourceName(String subResourceName) {
            this.subResourceName = subResourceName;
        }

        public String getSubResourceId() {
            return subResourceId;
        }

        public void setSubResourceId(String subResourceId) {
            this.subResourceId = subResourceId;
        }

        public Integer getSubResourceType() {
            return subResourceType;
        }

        public void setSubResourceType(Integer subResourceType) {
            this.subResourceType = subResourceType;
        }

        public String getPrivateIp() {
            return privateIp;
        }

        public void setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
        }
    }

    public static class AclEntryInfo extends Response {

        /** Entry的ID: false */
        @SerializedName("EntryId")
        private String entryId;

        /** 优先级: false */
        @SerializedName("Priority")
        private String priority;

        /** 出向或者入向: false */
        @SerializedName("Direction")
        private String direction;

        /** 针对的IP协议: false */
        @SerializedName("IpProtocol")
        private String ipProtocol;

        /** IP段的CIDR信息: false */
        @SerializedName("CidrBlock")
        private String cidrBlock;

        /** Port的段信息: false */
        @SerializedName("PortRange")
        private String portRange;

        /** 匹配规则的动作: false */
        @SerializedName("EntryAction")
        private String entryAction;

        /** 应用目标类型。 0代表“子网内全部资源” ，1代表“子网内指定资源” 。: false */
        @SerializedName("TargetType")
        private Integer targetType;

        /** 创建的Unix时间戳: false */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 更改的Unix时间戳: false */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        /** 应用目标资源信息。TargetType为0时不返回该值。具体结构见下方TargetResourceInfo: false */
        @SerializedName("TargetResourceList")
        private List<TargetResourceInfo> targetResourceList;

        /** 应用目标资源数量。TargetType为0时不返回该值。: false */
        @SerializedName("TargetResourceCount")
        private Integer targetResourceCount;

        public String getEntryId() {
            return entryId;
        }

        public void setEntryId(String entryId) {
            this.entryId = entryId;
        }

        public String getPriority() {
            return priority;
        }

        public void setPriority(String priority) {
            this.priority = priority;
        }

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public String getIpProtocol() {
            return ipProtocol;
        }

        public void setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
        }

        public String getCidrBlock() {
            return cidrBlock;
        }

        public void setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
        }

        public String getPortRange() {
            return portRange;
        }

        public void setPortRange(String portRange) {
            this.portRange = portRange;
        }

        public String getEntryAction() {
            return entryAction;
        }

        public void setEntryAction(String entryAction) {
            this.entryAction = entryAction;
        }

        public Integer getTargetType() {
            return targetType;
        }

        public void setTargetType(Integer targetType) {
            this.targetType = targetType;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }

        public List<TargetResourceInfo> getTargetResourceList() {
            return targetResourceList;
        }

        public void setTargetResourceList(List<TargetResourceInfo> targetResourceList) {
            this.targetResourceList = targetResourceList;
        }

        public Integer getTargetResourceCount() {
            return targetResourceCount;
        }

        public void setTargetResourceCount(Integer targetResourceCount) {
            this.targetResourceCount = targetResourceCount;
        }
    }
}
