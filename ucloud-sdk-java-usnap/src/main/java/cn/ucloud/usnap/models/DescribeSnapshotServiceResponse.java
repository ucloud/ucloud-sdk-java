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
package cn.ucloud.usnap.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeSnapshotServiceResponse extends Response {

    /** 快照服务列表 */
    @SerializedName("DataSet")
    private List<SnapshotServiceDataSet> dataSet;

    /** 快照服务DataSet总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<SnapshotServiceDataSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<SnapshotServiceDataSet> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class SnapshotServiceDataSet extends Response {

        /** 可用区信息 */
        @SerializedName("Zone")
        private String zone;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 磁盘Id */
        @SerializedName("VDiskId")
        private String vDiskId;

        /** 状态:Available(可用),InAvailable(不可用),Expired(欠费) */
        @SerializedName("Status")
        private String status;

        /** "UDiskData" 云盘数据盘； ”UDiskBoot“ 云盘系统盘 */
        @SerializedName("VDiskType")
        private String vDiskType;

        /** 磁盘是否可用，1表示可用，0表示不可用 */
        @SerializedName("VDiskStatus")
        private Integer vDiskStatus;

        /** 磁盘大小 （G） */
        @SerializedName("VDiskSize")
        private Integer vDiskSize;

        /** 服务ID */
        @SerializedName("ServiceId")
        private String serviceId;

        /** 磁盘名 */
        @SerializedName("VDiskName")
        private String vDiskName;

        /** 过期时间 */
        @SerializedName("ExpiredTime")
        private Integer expiredTime;

        /** 计费类型 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 计费是否过期 */
        @SerializedName("IsExpire")
        private String isExpire;

        /** 是否自动续费 */
        @SerializedName("AutoRenew")
        private String autoRenew;

        /** 业务组 */
        @SerializedName("Tag")
        private String tag;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getVDiskId() {
            return vDiskId;
        }

        public void setVDiskId(String vDiskId) {
            this.vDiskId = vDiskId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getVDiskType() {
            return vDiskType;
        }

        public void setVDiskType(String vDiskType) {
            this.vDiskType = vDiskType;
        }

        public Integer getVDiskStatus() {
            return vDiskStatus;
        }

        public void setVDiskStatus(Integer vDiskStatus) {
            this.vDiskStatus = vDiskStatus;
        }

        public Integer getVDiskSize() {
            return vDiskSize;
        }

        public void setVDiskSize(Integer vDiskSize) {
            this.vDiskSize = vDiskSize;
        }

        public String getServiceId() {
            return serviceId;
        }

        public void setServiceId(String serviceId) {
            this.serviceId = serviceId;
        }

        public String getVDiskName() {
            return vDiskName;
        }

        public void setVDiskName(String vDiskName) {
            this.vDiskName = vDiskName;
        }

        public Integer getExpiredTime() {
            return expiredTime;
        }

        public void setExpiredTime(Integer expiredTime) {
            this.expiredTime = expiredTime;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getIsExpire() {
            return isExpire;
        }

        public void setIsExpire(String isExpire) {
            this.isExpire = isExpire;
        }

        public String getAutoRenew() {
            return autoRenew;
        }

        public void setAutoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }
    }
}
