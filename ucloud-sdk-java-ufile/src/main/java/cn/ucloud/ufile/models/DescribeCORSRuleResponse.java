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

public class DescribeCORSRuleResponse extends Response {

    /** 跨域规则信息集合 */
    @SerializedName("DataSet")
    private List<CORSRuleSet> dataSet;

    public List<CORSRuleSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<CORSRuleSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class CORSRuleSet extends Response {

        /** 指定允许的跨域请求的来源，使用通配符(*)表示允许所有来源的跨域请求（多个Origin用‘,’分隔） */
        @SerializedName("AllowedOrigin")
        private String allowedOrigin;

        /** 指定允许的跨域请求方法。支持的方法名有：GET、PUT、POST、DELETE、HEAD、OPTIONS（多个Method用‘,’分隔） */
        @SerializedName("AllowedMethod")
        private String allowedMethod;

        /** 跨域规则id */
        @SerializedName("CORSId")
        private String corsId;

        /** 跨域规则创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 跨域规则最新修改时间 */
        @SerializedName("ModifyTime")
        private Integer modifyTime;

        /** 指定允许的跨域请求头（多个Header用‘,’分隔） */
        @SerializedName("AllowedHeader")
        private String allowedHeader;

        /** 指定允许用户从应用程序中访问的响应头（多个ExposeHeader用‘,’分隔） */
        @SerializedName("ExposeHeader")
        private String exposeHeader;

        public String getAllowedOrigin() {
            return allowedOrigin;
        }

        public void setAllowedOrigin(String allowedOrigin) {
            this.allowedOrigin = allowedOrigin;
        }

        public String getAllowedMethod() {
            return allowedMethod;
        }

        public void setAllowedMethod(String allowedMethod) {
            this.allowedMethod = allowedMethod;
        }

        public String getCORSId() {
            return corsId;
        }

        public void setCORSId(String corsId) {
            this.corsId = corsId;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getModifyTime() {
            return modifyTime;
        }

        public void setModifyTime(Integer modifyTime) {
            this.modifyTime = modifyTime;
        }

        public String getAllowedHeader() {
            return allowedHeader;
        }

        public void setAllowedHeader(String allowedHeader) {
            this.allowedHeader = allowedHeader;
        }

        public String getExposeHeader() {
            return exposeHeader;
        }

        public void setExposeHeader(String exposeHeader) {
            this.exposeHeader = exposeHeader;
        }
    }
}
