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
package cn.ucloud.upfs.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUPFSVolumeResponse extends Response {

    /** UPFS文件系统总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** UPFS文件系统详细信息列表 */
    @SerializedName("DataSet")
    private List<UPFSVolumeInfo> dataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UPFSVolumeInfo> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UPFSVolumeInfo> dataSet) {
        this.dataSet = dataSet;
    }

    public static class UPFSVolumeInfo extends Response {

        /** 可用区名字 */
        @SerializedName("Zone")
        private String zone;

        /** 文件系统名称 */
        @SerializedName("VolumeName")
        private String volumeName;

        /** 文件系统ID */
        @SerializedName("VolumeId")
        private String volumeId;

        /** 文件系统协议类型 */
        @SerializedName("ProtocolType")
        private String protocolType;

        /** 文件系统备注信息 */
        @SerializedName("Remark")
        private String remark;

        /** 文件系统所属业务组 */
        @SerializedName("Tag")
        private String tag;

        /** 文件系统创建时间（unix时间戳） */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 文件系统过期时间（unix时间戳） */
        @SerializedName("ExpiredTime")
        private Integer expiredTime;

        /** 文件系统大小，单位GB */
        @SerializedName("Size")
        private Integer size;

        /** 是否过期 */
        @SerializedName("IsExpired")
        private String isExpired;

        /** 计费类型 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 文件系统挂载状态 */
        @SerializedName("MountStatus")
        private Integer mountStatus;

        /** 文件系统挂载地址 */
        @SerializedName("MountAddress")
        private String mountAddress;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getVolumeName() {
            return volumeName;
        }

        public void setVolumeName(String volumeName) {
            this.volumeName = volumeName;
        }

        public String getVolumeId() {
            return volumeId;
        }

        public void setVolumeId(String volumeId) {
            this.volumeId = volumeId;
        }

        public String getProtocolType() {
            return protocolType;
        }

        public void setProtocolType(String protocolType) {
            this.protocolType = protocolType;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getExpiredTime() {
            return expiredTime;
        }

        public void setExpiredTime(Integer expiredTime) {
            this.expiredTime = expiredTime;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public String getIsExpired() {
            return isExpired;
        }

        public void setIsExpired(String isExpired) {
            this.isExpired = isExpired;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Integer getMountStatus() {
            return mountStatus;
        }

        public void setMountStatus(Integer mountStatus) {
            this.mountStatus = mountStatus;
        }

        public String getMountAddress() {
            return mountAddress;
        }

        public void setMountAddress(String mountAddress) {
            this.mountAddress = mountAddress;
        }
    }
}
