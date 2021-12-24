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
package cn.ucloud.uec.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeUEcSubnetResponse extends Response {

    /** 子网信息列表 */
    @SerializedName("SubnetList")
    private List<SubnetInfo> subnetList;

    public List<SubnetInfo> getSubnetList() {
        return subnetList;
    }

    public void setSubnetList(List<SubnetInfo> subnetList) {
        this.subnetList = subnetList;
    }

    public static class SubnetInfo extends Response {

        /** 子网ID */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 子网名称 */
        @SerializedName("SubnetName")
        private String subnetName;

        /** 机房ID */
        @SerializedName("IdcId")
        private String idcId;

        /** 子网cidr */
        @SerializedName("CIDR")
        private String cidr;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 备注 */
        @SerializedName("Comment")
        private String comment;

        /** 总ip数 */
        @SerializedName("TotalIpCnt")
        private Integer totalIpCnt;

        /** 可用ip数 */
        @SerializedName("AvailableIPCnt")
        private Integer availableIPCnt;

        public String getSubnetId() {
            return subnetId;
        }

        public void setSubnetId(String subnetId) {
            this.subnetId = subnetId;
        }

        public String getSubnetName() {
            return subnetName;
        }

        public void setSubnetName(String subnetName) {
            this.subnetName = subnetName;
        }

        public String getIdcId() {
            return idcId;
        }

        public void setIdcId(String idcId) {
            this.idcId = idcId;
        }

        public String getCIDR() {
            return cidr;
        }

        public void setCIDR(String cidr) {
            this.cidr = cidr;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public Integer getTotalIpCnt() {
            return totalIpCnt;
        }

        public void setTotalIpCnt(Integer totalIpCnt) {
            this.totalIpCnt = totalIpCnt;
        }

        public Integer getAvailableIPCnt() {
            return availableIPCnt;
        }

        public void setAvailableIPCnt(Integer availableIPCnt) {
            this.availableIPCnt = availableIPCnt;
        }
    }
}
