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

import java.util.List;

public class DescribeAssurancePagesResponse extends Response {

    /** 防篡改信息，参考AssurancePages */
    @SerializedName("Res")
    private AssurancePages res;

    public AssurancePages getRes() {
        return res;
    }

    public void setRes(AssurancePages res) {
        this.res = res;
    }

    public static class AssuracePagesDetail extends Response {

        /** 反篡改规则ID */
        @SerializedName("Id")
        private Integer id;

        /** 防篡改页面url */
        @SerializedName("Url")
        private String url;

        /** 防护状态 */
        @SerializedName("State")
        private String state;

        /** 备注信息 */
        @SerializedName("Remark")
        private String remark;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }

    public static class AssurancePages extends Response {

        /** 防篡改全局状态 */
        @SerializedName("State")
        private String state;

        /** 防篡改配置总数 */
        @SerializedName("TotalCount")
        private Integer totalCount;

        /** 防篡改规则配额 */
        @SerializedName("Limit")
        private Integer limit;

        /** 防篡改规则列表，参考AssuracePagesDetail */
        @SerializedName("Items")
        private List<AssuracePagesDetail> items;

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Integer getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public Integer getLimit() {
            return limit;
        }

        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        public List<AssuracePagesDetail> getItems() {
            return items;
        }

        public void setItems(List<AssuracePagesDetail> items) {
            this.items = items;
        }
    }
}
