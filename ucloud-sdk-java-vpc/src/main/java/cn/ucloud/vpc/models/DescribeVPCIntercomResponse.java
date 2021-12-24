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

public class DescribeVPCIntercomResponse extends Response {

    /** 联通VPC信息数组: false */
    @SerializedName("DataSet")
    private List<VPCIntercomInfo> dataSet;

    public List<VPCIntercomInfo> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<VPCIntercomInfo> dataSet) {
        this.dataSet = dataSet;
    }

    public static class VPCIntercomInfo extends Response {

        /** 项目Id: false */
        @SerializedName("ProjectId")
        private String projectId;

        /** vpc类型（1表示托管VPC，0表示公有云VPC）: false */
        @SerializedName("VPCType")
        private Integer vpcType;

        /** 项目Id（数字）: false */
        @SerializedName("AccountId")
        private Integer accountId;

        /** VPC的地址空间 : false */
        @SerializedName("Network")
        private List<String> network;

        /** 所属地域: false */
        @SerializedName("DstRegion")
        private String dstRegion;

        /** VPC名字: false */
        @SerializedName("Name")
        private String name;

        /** VPCId: false */
        @SerializedName("VPCId")
        private String vpcId;

        /** 业务组（未分组显示为 Default）: false */
        @SerializedName("Tag")
        private String tag;

        public String getProjectId() {
            return projectId;
        }

        public void setProjectId(String projectId) {
            this.projectId = projectId;
        }

        public Integer getVPCType() {
            return vpcType;
        }

        public void setVPCType(Integer vpcType) {
            this.vpcType = vpcType;
        }

        public Integer getAccountId() {
            return accountId;
        }

        public void setAccountId(Integer accountId) {
            this.accountId = accountId;
        }

        public List<String> getNetwork() {
            return network;
        }

        public void setNetwork(List<String> network) {
            this.network = network;
        }

        public String getDstRegion() {
            return dstRegion;
        }

        public void setDstRegion(String dstRegion) {
            this.dstRegion = dstRegion;
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

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }
    }
}
