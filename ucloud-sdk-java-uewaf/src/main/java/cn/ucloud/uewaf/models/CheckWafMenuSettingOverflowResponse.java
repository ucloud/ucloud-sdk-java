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
package cn.ucloud.uewaf.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class CheckWafMenuSettingOverflowResponse extends Response {

    /** 用量描述，参考UsageInfo */
    @SerializedName("UsageInfo")
    private UsageInfo usageInfo;

    public UsageInfo getUsageInfo() {
        return usageInfo;
    }

    public void setUsageInfo(UsageInfo usageInfo) {
        this.usageInfo = usageInfo;
    }

    public static class UsageInfo extends Response {

        /** 域名数量限额，参考UsageInfoDetail */
        @SerializedName("DomainLimit")
        private UsageInfoDetail domainLimit;

        /** 独享ip限额，参考UsageInfoDetail */
        @SerializedName("ExclusiveIPLimit")
        private UsageInfoDetail exclusiveIPLimit;

        /** 内部带宽限额，参考UsageInfoDetail */
        @SerializedName("BandwidthInner")
        private UsageInfoDetail bandwidthInner;

        /** 外部带宽限额，参考UsageInfoDetail */
        @SerializedName("BandwidthOuter")
        private UsageInfoDetail bandwidthOuter;

        public UsageInfoDetail getDomainLimit() {
            return domainLimit;
        }

        public void setDomainLimit(UsageInfoDetail domainLimit) {
            this.domainLimit = domainLimit;
        }

        public UsageInfoDetail getExclusiveIPLimit() {
            return exclusiveIPLimit;
        }

        public void setExclusiveIPLimit(UsageInfoDetail exclusiveIPLimit) {
            this.exclusiveIPLimit = exclusiveIPLimit;
        }

        public UsageInfoDetail getBandwidthInner() {
            return bandwidthInner;
        }

        public void setBandwidthInner(UsageInfoDetail bandwidthInner) {
            this.bandwidthInner = bandwidthInner;
        }

        public UsageInfoDetail getBandwidthOuter() {
            return bandwidthOuter;
        }

        public void setBandwidthOuter(UsageInfoDetail bandwidthOuter) {
            this.bandwidthOuter = bandwidthOuter;
        }
    }

    public static class UsageInfoDetail extends Response {

        /** 配额数量 */
        @SerializedName("Quota")
        private Integer quota;

        /** 已使用数量 */
        @SerializedName("Used")
        private Integer used;

        public Integer getQuota() {
            return quota;
        }

        public void setQuota(Integer quota) {
            this.quota = quota;
        }

        public Integer getUsed() {
            return used;
        }

        public void setUsed(Integer used) {
            this.used = used;
        }
    }
}
