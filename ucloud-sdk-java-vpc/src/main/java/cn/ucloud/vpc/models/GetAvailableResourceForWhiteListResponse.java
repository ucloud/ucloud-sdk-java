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

public class GetAvailableResourceForWhiteListResponse extends Response {

    /** 返回白名单列表的详细信息 */
    @SerializedName("DataSet")
    private List<GetAvailableResourceForWhiteListDataSet> dataSet;

    /** 白名单资源列表的总的个数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<GetAvailableResourceForWhiteListDataSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<GetAvailableResourceForWhiteListDataSet> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class GetAvailableResourceForWhiteListDataSet extends Response {

        /** 资源类型Id */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 资源名称 */
        @SerializedName("ResourceName")
        private String resourceName;

        /** 资源的内网Ip */
        @SerializedName("PrivateIP")
        private String privateIP;

        /**
         * 资源类型。"uhost"：云主机； "upm"，物理云主机； "hadoophost"：hadoop节点； "fortresshost"：堡垒机： "udockhost"，容器
         */
        @SerializedName("ResourceType")
        private String resourceType;

        /** 资源绑定的虚拟网卡的实例名称 */
        @SerializedName("SubResourceName")
        private String subResourceName;

        /** 资源所属VPCId */
        @SerializedName("VPCId")
        private String vpcId;

        /** 资源所属子网Id */
        @SerializedName("SubnetworkId")
        private String subnetworkId;

        /** 资源绑定的虚拟网卡的实例ID */
        @SerializedName("SubResourceId")
        private String subResourceId;

        /** 资源绑定的虚拟网卡的实例类型 */
        @SerializedName("SubResourceType")
        private String subResourceType;

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

        public String getPrivateIP() {
            return privateIP;
        }

        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        public String getResourceType() {
            return resourceType;
        }

        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        public String getSubResourceName() {
            return subResourceName;
        }

        public void setSubResourceName(String subResourceName) {
            this.subResourceName = subResourceName;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }

        public String getSubnetworkId() {
            return subnetworkId;
        }

        public void setSubnetworkId(String subnetworkId) {
            this.subnetworkId = subnetworkId;
        }

        public String getSubResourceId() {
            return subResourceId;
        }

        public void setSubResourceId(String subResourceId) {
            this.subResourceId = subResourceId;
        }

        public String getSubResourceType() {
            return subResourceType;
        }

        public void setSubResourceType(String subResourceType) {
            this.subResourceType = subResourceType;
        }
    }
}
