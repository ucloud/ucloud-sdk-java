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

public class DescribeNetworkAclAssociationResponse extends Response {

    /** 绑定信息列表 */
    @SerializedName("AssociationList")
    private List<AssociationInfo> associationList;

    public List<AssociationInfo> getAssociationList() {
        return associationList;
    }

    public void setAssociationList(List<AssociationInfo> associationList) {
        this.associationList = associationList;
    }

    public static class AssociationInfo extends Response {

        /** 绑定ID */
        @SerializedName("AssociationId")
        private String associationId;

        /** ACL的ID */
        @SerializedName("AclId")
        private String aclId;

        /** 绑定的子网ID */
        @SerializedName("SubnetworkId")
        private String subnetworkId;

        /** 创建的Unix时间戳 */
        @SerializedName("CreateTime")
        private Integer createTime;

        public String getAssociationId() {
            return associationId;
        }

        public void setAssociationId(String associationId) {
            this.associationId = associationId;
        }

        public String getAclId() {
            return aclId;
        }

        public void setAclId(String aclId) {
            this.aclId = aclId;
        }

        public String getSubnetworkId() {
            return subnetworkId;
        }

        public void setSubnetworkId(String subnetworkId) {
            this.subnetworkId = subnetworkId;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }
    }
}
