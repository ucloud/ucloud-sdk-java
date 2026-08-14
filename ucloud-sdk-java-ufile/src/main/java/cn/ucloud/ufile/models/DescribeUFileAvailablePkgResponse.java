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

public class DescribeUFileAvailablePkgResponse extends Response {

    /** 可购买的资源包规格 */
    @SerializedName("PkgList")
    private List<AvailablePkg> pkgList;

    public List<AvailablePkg> getPkgList() {
        return pkgList;
    }

    public void setPkgList(List<AvailablePkg> pkgList) {
        this.pkgList = pkgList;
    }

    public static class AvailablePkg extends Response {

        /** 资源类型ID */
        @SerializedName("Type")
        private Integer type;

        /** 资源类型名称 */
        @SerializedName("Name")
        private String name;

        /** 支持购买的数量规格 */
        @SerializedName("Specs")
        private List<AvailablePkgSpecs> specs;

        /** 公共支持购买的时长，当一个Spec配了独立的Durations时，就按独立配置Durations生效；否者按CommonDurations生效 */
        @SerializedName("CommonDurations")
        private List<AvailablePkgDurations> commonDurations;

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<AvailablePkgSpecs> getSpecs() {
            return specs;
        }

        public void setSpecs(List<AvailablePkgSpecs> specs) {
            this.specs = specs;
        }

        public List<AvailablePkgDurations> getCommonDurations() {
            return commonDurations;
        }

        public void setCommonDurations(List<AvailablePkgDurations> commonDurations) {
            this.commonDurations = commonDurations;
        }
    }

    public static class AvailablePkgDurations extends Response {

        /** 折扣 */
        @SerializedName("Discount")
        private Double discount;

        /** 购买时长 */
        @SerializedName("Duration")
        private Integer duration;

        /** 时长单位，如: Month、Year */
        @SerializedName("Unit")
        private String unit;

        public Double getDiscount() {
            return discount;
        }

        public void setDiscount(Double discount) {
            this.discount = discount;
        }

        public Integer getDuration() {
            return duration;
        }

        public void setDuration(Integer duration) {
            this.duration = duration;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }
    }

    public static class AvailablePkgSpecs extends Response {

        /** 仅针对当前规格生效的durations */
        @SerializedName("Durations")
        private List<AvailablePkgDurations> durations;

        /** 购买数量 */
        @SerializedName("Amount")
        private Integer amount;

        /** 数量的单位，如：GB，TB */
        @SerializedName("Unit")
        private String unit;

        public List<AvailablePkgDurations> getDurations() {
            return durations;
        }

        public void setDurations(List<AvailablePkgDurations> durations) {
            this.durations = durations;
        }

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }
    }
}
