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
package cn.ucloud.uphone.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUPhoneShareBandwidthResponse extends Response {

    /** 共享带宽信息 */
    @SerializedName("ShareBandwidth")
    private List<ShareBandwidthInfo> shareBandwidth;

    /** 共享带宽总数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<ShareBandwidthInfo> getShareBandwidth() {
        return shareBandwidth;
    }

    public void setShareBandwidth(List<ShareBandwidthInfo> shareBandwidth) {
        this.shareBandwidth = shareBandwidth;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class ShareBandwidthInfo extends Response {

        /** 绑定的目的地域。参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
        @SerializedName("Region")
        private String region;

        /** 共享带宽ID */
        @SerializedName("Id")
        private String id;

        /** 云手机IP绑定比例 */
        @SerializedName("IpProportion")
        private Integer ipProportion;

        /** 带宽大小，单位M */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /** 共享带宽名称 */
        @SerializedName("Name")
        private String name;

        /** 当前绑定IP数量 */
        @SerializedName("IpCount")
        private Integer ipCount;

        /** 当前绑定手机数量 */
        @SerializedName("BindCount")
        private Integer bindCount;

        /** 剩余可绑定手机数量 */
        @SerializedName("RemainCount")
        private Integer remainCount;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        /** 创建时间；格式为Unix时间戳 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 到期时间；格式为Unix时间戳 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 计费模式。枚举值为： > 年 Year，按年付费； > Month，按月付费； > Dynamic，按小时预付费; 默认为月付 */
        @SerializedName("ChargeType")
        private String chargeType;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Integer getIpProportion() {
            return ipProportion;
        }

        public void setIpProportion(Integer ipProportion) {
            this.ipProportion = ipProportion;
        }

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getIpCount() {
            return ipCount;
        }

        public void setIpCount(Integer ipCount) {
            this.ipCount = ipCount;
        }

        public Integer getBindCount() {
            return bindCount;
        }

        public void setBindCount(Integer bindCount) {
            this.bindCount = bindCount;
        }

        public Integer getRemainCount() {
            return remainCount;
        }

        public void setRemainCount(Integer remainCount) {
            this.remainCount = remainCount;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
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
    }
}
