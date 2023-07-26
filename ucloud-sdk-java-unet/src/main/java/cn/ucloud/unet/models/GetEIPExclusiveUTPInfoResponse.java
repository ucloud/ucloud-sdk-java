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

public class GetEIPExclusiveUTPInfoResponse extends Response {

    /** EIP专属流量包信息 */
    @SerializedName("EIPExclusiveInfo")
    private EIPExclusiveInfo eipExclusiveInfo;

    public EIPExclusiveInfo getEIPExclusiveInfo() {
        return eipExclusiveInfo;
    }

    public void setEIPExclusiveInfo(EIPExclusiveInfo eipExclusiveInfo) {
        this.eipExclusiveInfo = eipExclusiveInfo;
    }

    public static class EIPExclusiveInfo extends Response {

        /** EIP资源Id */
        @SerializedName("EIPId")
        private String eipId;

        /** */
        @SerializedName("AccountId")
        private Integer accountId;

        /** 专属流量包总规格（单位MB） */
        @SerializedName("TotalSize")
        private Integer totalSize;

        /** 专属流量包剩余可用规格（单位MB） */
        @SerializedName("AvailableSize")
        private Integer availableSize;

        /** 专属流量包上次重置时间 */
        @SerializedName("LastResetTime")
        private Integer lastResetTime;

        /** 专属流量包下次重置时间 */
        @SerializedName("NextResetTime")
        private Integer nextResetTime;

        /** 专属流量包重置策略枚举：Day、Month、Year */
        @SerializedName("ResetPolicy")
        private String resetPolicy;

        /** 资源创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        public String getEIPId() {
            return eipId;
        }

        public void setEIPId(String eipId) {
            this.eipId = eipId;
        }

        public Integer getAccountId() {
            return accountId;
        }

        public void setAccountId(Integer accountId) {
            this.accountId = accountId;
        }

        public Integer getTotalSize() {
            return totalSize;
        }

        public void setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
        }

        public Integer getAvailableSize() {
            return availableSize;
        }

        public void setAvailableSize(Integer availableSize) {
            this.availableSize = availableSize;
        }

        public Integer getLastResetTime() {
            return lastResetTime;
        }

        public void setLastResetTime(Integer lastResetTime) {
            this.lastResetTime = lastResetTime;
        }

        public Integer getNextResetTime() {
            return nextResetTime;
        }

        public void setNextResetTime(Integer nextResetTime) {
            this.nextResetTime = nextResetTime;
        }

        public String getResetPolicy() {
            return resetPolicy;
        }

        public void setResetPolicy(String resetPolicy) {
            this.resetPolicy = resetPolicy;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }
    }
}
