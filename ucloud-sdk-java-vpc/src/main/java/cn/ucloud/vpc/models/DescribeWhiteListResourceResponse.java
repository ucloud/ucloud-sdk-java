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

public class DescribeWhiteListResourceResponse extends Response {

    /** 白名单资源的详细信息，详见DescribeResourceWhiteListDataSet */
    @SerializedName("DataSet")
    private List<NatGWWhitelistDataSet> dataSet;

    /** 上述DataSet总数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<NatGWWhitelistDataSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<NatGWWhitelistDataSet> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class DescribeWhiteListResourceObjectIPInfo extends Response {

        /** natgw字符串 */
        @SerializedName("GwType")
        private String gwType;

        /** 白名单资源的内网IP */
        @SerializedName("PrivateIP")
        private String privateIP;

        /** 白名单资源Id信息 */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 白名单资源名称 */
        @SerializedName("ResourceName")
        private String resourceName;

        /** 白名单资源类型 */
        @SerializedName("ResourceType")
        private String resourceType;

        /** 资源绑定的虚拟网卡的实例ID */
        @SerializedName("SubResourceId")
        private String subResourceId;

        /** 资源绑定的虚拟网卡的实例名称 */
        @SerializedName("SubResourceName")
        private String subResourceName;

        /** 资源绑定的虚拟网卡的类型 */
        @SerializedName("SubResourceType")
        private String subResourceType;

        /** 白名单资源所属VPCId */
        @SerializedName("VPCId")
        private String vpcId;

        public String getGwType() {
            return gwType;
        }

        public void setGwType(String gwType) {
            this.gwType = gwType;
        }

        public String getPrivateIP() {
            return privateIP;
        }

        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

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

        public String getResourceType() {
            return resourceType;
        }

        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        public String getSubResourceId() {
            return subResourceId;
        }

        public void setSubResourceId(String subResourceId) {
            this.subResourceId = subResourceId;
        }

        public String getSubResourceName() {
            return subResourceName;
        }

        public void setSubResourceName(String subResourceName) {
            this.subResourceName = subResourceName;
        }

        public String getSubResourceType() {
            return subResourceType;
        }

        public void setSubResourceType(String subResourceType) {
            this.subResourceType = subResourceType;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }
    }

    public static class NatGWWhitelistDataSet extends Response {

        /** NATGateWay Id */
        @SerializedName("NATGWId")
        private String natgwId;

        /** 白名单开关标记 */
        @SerializedName("IfOpen")
        private Integer ifOpen;

        /** 白名单详情 */
        @SerializedName("ObjectIPInfo")
        private List<DescribeWhiteListResourceObjectIPInfo> objectIPInfo;

        public String getNATGWId() {
            return natgwId;
        }

        public void setNATGWId(String natgwId) {
            this.natgwId = natgwId;
        }

        public Integer getIfOpen() {
            return ifOpen;
        }

        public void setIfOpen(Integer ifOpen) {
            this.ifOpen = ifOpen;
        }

        public List<DescribeWhiteListResourceObjectIPInfo> getObjectIPInfo() {
            return objectIPInfo;
        }

        public void setObjectIPInfo(List<DescribeWhiteListResourceObjectIPInfo> objectIPInfo) {
            this.objectIPInfo = objectIPInfo;
        }
    }
}
