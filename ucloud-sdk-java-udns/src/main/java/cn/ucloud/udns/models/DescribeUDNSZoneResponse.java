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
package cn.ucloud.udns.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUDNSZoneResponse extends Response {

    /** 符合查询条件的域名数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 域名资源信息 */
    @SerializedName("DNSZoneInfos")
    private List<ZoneInfo> dnsZoneInfos;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ZoneInfo> getDNSZoneInfos() {
        return dnsZoneInfos;
    }

    public void setDNSZoneInfos(List<ZoneInfo> dnsZoneInfos) {
        this.dnsZoneInfos = dnsZoneInfos;
    }

    public static class VPCInfo extends Response {

        /** VPC ID */
        @SerializedName("VPCId")
        private String vpcId;

        /** VPC所属项目ID */
        @SerializedName("VPCProjectId")
        private String vpcProjectId;

        /** VPC名称 */
        @SerializedName("Name")
        private String name;

        /** VPC地址空间 */
        @SerializedName("Network")
        private List<String> network;

        /** VPC类型：Normal 公有云 Hybrid 托管云 */
        @SerializedName("VPCType")
        private String vpcType;

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }

        public String getVPCProjectId() {
            return vpcProjectId;
        }

        public void setVPCProjectId(String vpcProjectId) {
            this.vpcProjectId = vpcProjectId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getNetwork() {
            return network;
        }

        public void setNetwork(List<String> network) {
            this.network = network;
        }

        public String getVPCType() {
            return vpcType;
        }

        public void setVPCType(String vpcType) {
            this.vpcType = vpcType;
        }
    }

    public static class ZoneInfo extends Response {

        /** 域名名称 */
        @SerializedName("DNSZoneName")
        private String dnsZoneName;

        /** 业务组 */
        @SerializedName("Tag")
        private String tag;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        /** 是否支持迭代。枚举值,"enable",支持迭代; "disable",不支持迭代 */
        @SerializedName("IsRecursionEnabled")
        private String isRecursionEnabled;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 过期时间 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 计费类型（Dynamic、Month、Year） */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 是否开启自动续费（Yes No） */
        @SerializedName("IsAutoRenew")
        private String isAutoRenew;

        /** 记录相关ID */
        @SerializedName("RecordInfos")
        private List<String> recordInfos;

        /** 绑定的VPC信息 */
        @SerializedName("VPCInfos")
        private List<VPCInfo> vpcInfos;

        public String getDNSZoneName() {
            return dnsZoneName;
        }

        public void setDNSZoneName(String dnsZoneName) {
            this.dnsZoneName = dnsZoneName;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getIsRecursionEnabled() {
            return isRecursionEnabled;
        }

        public void setIsRecursionEnabled(String isRecursionEnabled) {
            this.isRecursionEnabled = isRecursionEnabled;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getIsAutoRenew() {
            return isAutoRenew;
        }

        public void setIsAutoRenew(String isAutoRenew) {
            this.isAutoRenew = isAutoRenew;
        }

        public List<String> getRecordInfos() {
            return recordInfos;
        }

        public void setRecordInfos(List<String> recordInfos) {
            this.recordInfos = recordInfos;
        }

        public List<VPCInfo> getVPCInfos() {
            return vpcInfos;
        }

        public void setVPCInfos(List<VPCInfo> vpcInfos) {
            this.vpcInfos = vpcInfos;
        }
    }
}
