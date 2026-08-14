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

public class DescribeUFilePkgUsageResponse extends Response {

    /** 按天返回的使用明细 */
    @SerializedName("Usage")
    private List<PkgUsage> usage;

    public List<PkgUsage> getUsage() {
        return usage;
    }

    public void setUsage(List<PkgUsage> usage) {
        this.usage = usage;
    }

    public static class PkgUsage extends Response {

        /** 日期 */
        @SerializedName("Date")
        private String date;

        /** 使用量，单位为B */
        @SerializedName("Cost")
        private String cost;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getCost() {
            return cost;
        }

        public void setCost(String cost) {
            this.cost = cost;
        }
    }
}
