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

public class GetAvailableResourceForSnatRuleResponse extends Response {

    /** 返回的资源详细信息 */
    @SerializedName("DataSet")
    private List<GetAvailableResourceForSnatRuleDataSet> dataSet;

    /** 总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<GetAvailableResourceForSnatRuleDataSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<GetAvailableResourceForSnatRuleDataSet> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class GetAvailableResourceForSnatRuleDataSet extends Response {

        /** 资源ID */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 资源名称 */
        @SerializedName("ResourceName")
        private String resourceName;

        /** 资源内网IP */
        @SerializedName("PrivateIP")
        private String privateIP;

        /** 资源类型 */
        @SerializedName("ResourceType")
        private String resourceType;

        /** 资源所属VPC的ID */
        @SerializedName("SubnetworkId")
        private String subnetworkId;

        /** 资源所属子网的ID */
        @SerializedName("VPCId")
        private String vpcId;

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

        public String getSubnetworkId() {
            return subnetworkId;
        }

        public void setSubnetworkId(String subnetworkId) {
            this.subnetworkId = subnetworkId;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }
    }
}
