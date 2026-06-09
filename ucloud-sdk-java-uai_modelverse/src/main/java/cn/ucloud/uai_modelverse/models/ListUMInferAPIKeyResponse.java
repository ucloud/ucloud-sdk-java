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
package cn.ucloud.uai_modelverse.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListUMInferAPIKeyResponse extends Response {

    /** apikey */
    @SerializedName("Data")
    private List<APIKey> data;

    public List<APIKey> getData() {
        return data;
    }

    public void setData(List<APIKey> data) {
        this.data = data;
    }

    public static class APIKey extends Response {

        /**
         * ip白名单，换行分割的多组ip。支持IPv4和网段,输入后回车生效,最多100个, 示例: ﻿ 192.168.1.1 192.168.1.10-192.168.1.100
         * 192.168.1.10/24
         */
        @SerializedName("IPWhitelist")
        private String ipWhitelist;

        /** 资源ID */
        @SerializedName("KeyId")
        private String keyId;

        /** 名称 */
        @SerializedName("Name")
        private String name;

        /** 渠道id */
        @SerializedName("ChannelId")
        private Integer channelId;

        /** 公司id */
        @SerializedName("TopOrganizationId")
        private Integer topOrganizationId;

        /** 项目id */
        @SerializedName("OrganizationId")
        private Integer organizationId;

        /** 状态，1 正常 */
        @SerializedName("Status")
        private Integer status;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 密钥值 */
        @SerializedName("Key")
        private String key;

        /** 过期时间的unix时间戳，-1 用不过期 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 是否modelverse可用 0: 启用 1: 禁用 */
        @SerializedName("ModelverseDisabled")
        private Integer modelverseDisabled;

        /** 是否沙盒可用 0: 启用 1: 禁用(astraflow 沙盒控制未上线，暂时无效) */
        @SerializedName("SandBoxDisabled")
        private Integer sandBoxDisabled;

        /** 日限额，单位随用户所在渠道。126渠道单位为美元 */
        @SerializedName("DailyLimitAmount")
        private String dailyLimitAmount;

        /** 日已使用额，单位随用户所在渠道。126渠道单位为美元 */
        @SerializedName("DailyUsedAmount")
        private String dailyUsedAmount;

        /** 月限额，单位随用户所在渠道。126渠道单位为美元 */
        @SerializedName("MonthlyLimitAmount")
        private String monthlyLimitAmount;

        /** 月已使用额，单位随用户所在渠道。126渠道单位为美元 */
        @SerializedName("MonthlyUsedAmount")
        private String monthlyUsedAmount;

        /** 全部模型访问开关，开启不受 GrantedModels 参数控制，关闭只能访问 GrantedModels 中添加模型 */
        @SerializedName("GrantAllModels")
        private Boolean grantAllModels;

        /** 授权的模型，英文逗号分隔，all表示所有模型都有权限 */
        @SerializedName("GrantedModels")
        private List<String> grantedModels;

        public String getIPWhitelist() {
            return ipWhitelist;
        }

        public void setIPWhitelist(String ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
        }

        public String getKeyId() {
            return keyId;
        }

        public void setKeyId(String keyId) {
            this.keyId = keyId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getChannelId() {
            return channelId;
        }

        public void setChannelId(Integer channelId) {
            this.channelId = channelId;
        }

        public Integer getTopOrganizationId() {
            return topOrganizationId;
        }

        public void setTopOrganizationId(Integer topOrganizationId) {
            this.topOrganizationId = topOrganizationId;
        }

        public Integer getOrganizationId() {
            return organizationId;
        }

        public void setOrganizationId(Integer organizationId) {
            this.organizationId = organizationId;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public Integer getModelverseDisabled() {
            return modelverseDisabled;
        }

        public void setModelverseDisabled(Integer modelverseDisabled) {
            this.modelverseDisabled = modelverseDisabled;
        }

        public Integer getSandBoxDisabled() {
            return sandBoxDisabled;
        }

        public void setSandBoxDisabled(Integer sandBoxDisabled) {
            this.sandBoxDisabled = sandBoxDisabled;
        }

        public String getDailyLimitAmount() {
            return dailyLimitAmount;
        }

        public void setDailyLimitAmount(String dailyLimitAmount) {
            this.dailyLimitAmount = dailyLimitAmount;
        }

        public String getDailyUsedAmount() {
            return dailyUsedAmount;
        }

        public void setDailyUsedAmount(String dailyUsedAmount) {
            this.dailyUsedAmount = dailyUsedAmount;
        }

        public String getMonthlyLimitAmount() {
            return monthlyLimitAmount;
        }

        public void setMonthlyLimitAmount(String monthlyLimitAmount) {
            this.monthlyLimitAmount = monthlyLimitAmount;
        }

        public String getMonthlyUsedAmount() {
            return monthlyUsedAmount;
        }

        public void setMonthlyUsedAmount(String monthlyUsedAmount) {
            this.monthlyUsedAmount = monthlyUsedAmount;
        }

        public Boolean getGrantAllModels() {
            return grantAllModels;
        }

        public void setGrantAllModels(Boolean grantAllModels) {
            this.grantAllModels = grantAllModels;
        }

        public List<String> getGrantedModels() {
            return grantedModels;
        }

        public void setGrantedModels(List<String> grantedModels) {
            this.grantedModels = grantedModels;
        }
    }
}
