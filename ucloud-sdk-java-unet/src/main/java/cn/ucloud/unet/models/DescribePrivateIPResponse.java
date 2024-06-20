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
package cn.ucloud.unet.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribePrivateIPResponse extends Response {

    /** 返回资源数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 辅助IP的详细信息 */
    @SerializedName("DataSet")
    private List<DescribeSecondaryIPDataSet> dataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<DescribeSecondaryIPDataSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<DescribeSecondaryIPDataSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class DescribeSecondaryIPDataSet extends Response {

        /** 内网IP类型；枚举值：PrimaryIP：主内网IP，SecondaryIP：辅助内网IP */
        @SerializedName("PrivateIPType")
        private String privateIPType;

        /** VPCID */
        @SerializedName("VPCID")
        private String vpcid;

        /** 外网IP */
        @SerializedName("EIP")
        private String eip;

        /** 资源ID */
        @SerializedName("ResourceID")
        private String resourceID;

        /** 资源名称 */
        @SerializedName("ResourceName")
        private String resourceName;

        /** 内网IP */
        @SerializedName("PrivateIP")
        private String privateIP;

        /** 子网ID */
        @SerializedName("SubnetID")
        private String subnetID;

        /** EIP资源ID */
        @SerializedName("EIPId")
        private String eipId;

        public String getPrivateIPType() {
            return privateIPType;
        }

        public void setPrivateIPType(String privateIPType) {
            this.privateIPType = privateIPType;
        }

        public String getVPCID() {
            return vpcid;
        }

        public void setVPCID(String vpcid) {
            this.vpcid = vpcid;
        }

        public String getEIP() {
            return eip;
        }

        public void setEIP(String eip) {
            this.eip = eip;
        }

        public String getResourceID() {
            return resourceID;
        }

        public void setResourceID(String resourceID) {
            this.resourceID = resourceID;
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

        public String getSubnetID() {
            return subnetID;
        }

        public void setSubnetID(String subnetID) {
            this.subnetID = subnetID;
        }

        public String getEIPId() {
            return eipId;
        }

        public void setEIPId(String eipId) {
            this.eipId = eipId;
        }
    }
}
