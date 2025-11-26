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

public class DescribeResourceSecGroupResponse extends Response {

    /** 资源总数量。传入 ResourceId 时，为传入资源中的有效资源数量。 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 资源绑定的安全组信息 */
    @SerializedName("DataSet")
    private List<ResourceSecgroupInfoEx> dataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ResourceSecgroupInfoEx> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<ResourceSecgroupInfoEx> dataSet) {
        this.dataSet = dataSet;
    }

    public static class BindingSecGroupInfo extends Response {

        /** 安全组 ID */
        @SerializedName("SecGroupId")
        private String secGroupId;

        /** 安全组名称 */
        @SerializedName("Name")
        private String name;

        /** 安全组所属 VPC */
        @SerializedName("VPCId")
        private String vpcId;

        /** 该资源与该安全组绑定的优先级 */
        @SerializedName("Priority")
        private Integer priority;

        public String getSecGroupId() {
            return secGroupId;
        }

        public void setSecGroupId(String secGroupId) {
            this.secGroupId = secGroupId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }

        public Integer getPriority() {
            return priority;
        }

        public void setPriority(Integer priority) {
            this.priority = priority;
        }
    }

    public static class ResourceExInfo extends Response {

        /** 父级资源ID */
        @SerializedName("SuperResourceId")
        private String superResourceId;

        /** 资源名称 */
        @SerializedName("ResourceName")
        private String resourceName;

        /** 主机内网IP */
        @SerializedName("IP")
        private List<String> ip;

        /** 主机外网IP */
        @SerializedName("EIP")
        private List<String> eip;

        /** 弹性网卡信息 */
        @SerializedName("Uni")
        private List<ResourceSecgroupInfo> uni;

        /** 父级资源名称 */
        @SerializedName("SuperResourceName")
        private String superResourceName;

        public String getSuperResourceId() {
            return superResourceId;
        }

        public void setSuperResourceId(String superResourceId) {
            this.superResourceId = superResourceId;
        }

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        public List<String> getIP() {
            return ip;
        }

        public void setIP(List<String> ip) {
            this.ip = ip;
        }

        public List<String> getEIP() {
            return eip;
        }

        public void setEIP(List<String> eip) {
            this.eip = eip;
        }

        public List<ResourceSecgroupInfo> getUni() {
            return uni;
        }

        public void setUni(List<ResourceSecgroupInfo> uni) {
            this.uni = uni;
        }

        public String getSuperResourceName() {
            return superResourceName;
        }

        public void setSuperResourceName(String superResourceName) {
            this.superResourceName = superResourceName;
        }
    }

    public static class ResourceSecgroupInfo extends Response {

        /** 资源ID */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 资源绑定安全组数量 */
        @SerializedName("Count")
        private Integer count;

        /** 详见SecGroupSimpleInfo */
        @SerializedName("SecGroupInfo")
        private List<SecGroupSimpleInfo> secGroupInfo;

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public List<SecGroupSimpleInfo> getSecGroupInfo() {
            return secGroupInfo;
        }

        public void setSecGroupInfo(List<SecGroupSimpleInfo> secGroupInfo) {
            this.secGroupInfo = secGroupInfo;
        }
    }

    public static class ResourceSecgroupInfoEx extends Response {

        /** 资源 ID */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 资源名称 */
        @SerializedName("ResourceName")
        private String resourceName;

        /** 该资源绑定的安全组数量 */
        @SerializedName("Count")
        private Integer count;

        /** 绑定安全组信息 */
        @SerializedName("SecGroupInfo")
        private List<BindingSecGroupInfo> secGroupInfo;

        /** 表示是否允许绑定安全组 */
        @SerializedName("PermitAssociate")
        private Boolean permitAssociate;

        /** 资源额外信息 */
        @SerializedName("ExInfo")
        private ResourceExInfo exInfo;

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public List<BindingSecGroupInfo> getSecGroupInfo() {
            return secGroupInfo;
        }

        public void setSecGroupInfo(List<BindingSecGroupInfo> secGroupInfo) {
            this.secGroupInfo = secGroupInfo;
        }

        public Boolean getPermitAssociate() {
            return permitAssociate;
        }

        public void setPermitAssociate(Boolean permitAssociate) {
            this.permitAssociate = permitAssociate;
        }

        public ResourceExInfo getExInfo() {
            return exInfo;
        }

        public void setExInfo(ResourceExInfo exInfo) {
            this.exInfo = exInfo;
        }
    }

    public static class SecGroupSimpleInfo extends Response {

        /** 安全组资源ID */
        @SerializedName("SecGroupId")
        private String secGroupId;

        /** 安全组名称 */
        @SerializedName("Name")
        private String name;

        public String getSecGroupId() {
            return secGroupId;
        }

        public void setSecGroupId(String secGroupId) {
            this.secGroupId = secGroupId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
