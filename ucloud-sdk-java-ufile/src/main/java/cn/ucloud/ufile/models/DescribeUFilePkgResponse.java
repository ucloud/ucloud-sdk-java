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
package cn.ucloud.ufile.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUFilePkgResponse extends Response {

    /** 已购买的资源包 */
    @SerializedName("Pkgs")
    private List<UFilePkg> pkgs;

    public List<UFilePkg> getPkgs() {
        return pkgs;
    }

    public void setPkgs(List<UFilePkg> pkgs) {
        this.pkgs = pkgs;
    }

    public static class UFilePkg extends Response {

        /** 资源包地域 */
        @SerializedName("Region")
        private String region;

        /** 资源包ID */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 资源包名称 */
        @SerializedName("PkgName")
        private String pkgName;

        /** 资源包类型ID */
        @SerializedName("PkgType")
        private Integer pkgType;

        /** 资源包容量 */
        @SerializedName("Amount")
        private Integer amount;

        /** 资源包剩余容量（仅支持流量包） */
        @SerializedName("RemainAmount")
        private String remainAmount;

        /** 资源包创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 资源包失效时间 */
        @SerializedName("ExpiredTime")
        private Integer expiredTime;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getPkgName() {
            return pkgName;
        }

        public void setPkgName(String pkgName) {
            this.pkgName = pkgName;
        }

        public Integer getPkgType() {
            return pkgType;
        }

        public void setPkgType(Integer pkgType) {
            this.pkgType = pkgType;
        }

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }

        public String getRemainAmount() {
            return remainAmount;
        }

        public void setRemainAmount(String remainAmount) {
            this.remainAmount = remainAmount;
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
    }
}
