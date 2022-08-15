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

public class DescribeUPhoneEipListResponse extends Response {

    /** Eip信息列表 */
    @SerializedName("EipInfos")
    private List<EipInfo> eipInfos;

    /** Eip信息数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<EipInfo> getEipInfos() {
        return eipInfos;
    }

    public void setEipInfos(List<EipInfo> eipInfos) {
        this.eipInfos = eipInfos;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class EipInfo extends Response {

        /** Eip所属区域 */
        @SerializedName("Region")
        private String region;

        /** Eip资源ID */
        @SerializedName("EipId")
        private String eipId;

        /** Eip地址 */
        @SerializedName("EipIp")
        private String eipIp;

        /** Eip名称 */
        @SerializedName("Name")
        private String name;

        /** Eip备注 */
        @SerializedName("Remark")
        private String remark;

        /** 云手机与Eip绑定比例 */
        @SerializedName("Proportion")
        private Integer proportion;

        /** 创建时间；格式为Unix时间戳 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 到期时间；格式为Unix时间戳 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 计费模式。枚举值为： > 年 Year，按年付费； > Month，按月付费； > Dynamic，按小时预付费; 默认为月付 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 绑定的云手机ID */
        @SerializedName("UPhoneIds")
        private List<String> uPhoneIds;

        /** 当前绑定云手机数量 */
        @SerializedName("BindCount")
        private Integer bindCount;

        /** 剩余可绑定手机数量 */
        @SerializedName("RemainCount")
        private Integer remainCount;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getEipId() {
            return eipId;
        }

        public void setEipId(String eipId) {
            this.eipId = eipId;
        }

        public String getEipIp() {
            return eipIp;
        }

        public void setEipIp(String eipIp) {
            this.eipIp = eipIp;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public Integer getProportion() {
            return proportion;
        }

        public void setProportion(Integer proportion) {
            this.proportion = proportion;
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

        public List<String> getUPhoneIds() {
            return uPhoneIds;
        }

        public void setUPhoneIds(List<String> uPhoneIds) {
            this.uPhoneIds = uPhoneIds;
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
    }
}
