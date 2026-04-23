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

public class GetBucketStaticPageRuleResponse extends Response {

    /** 规则内容 */
    @SerializedName("Rule")
    private BucketStaticPageRule rule;

    public BucketStaticPageRule getRule() {
        return rule;
    }

    public void setRule(BucketStaticPageRule rule) {
        this.rule = rule;
    }

    public static class BucketStaticPageRule extends Response {

        /** 启用状态 */
        @SerializedName("Status")
        private String status;

        /** 默认网页 */
        @SerializedName("DefaultIndex")
        private String defaultIndex;

        /** 子目录重定向功能的启用状态 */
        @SerializedName("SubDirRedirect")
        private String subDirRedirect;

        /** 404时的处理规则 */
        @SerializedName("RuleFor404")
        private String ruleFor404;

        /** 默认404页面在存储桶的路径 */
        @SerializedName("DefaultPage404")
        private String defaultPage404;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getDefaultIndex() {
            return defaultIndex;
        }

        public void setDefaultIndex(String defaultIndex) {
            this.defaultIndex = defaultIndex;
        }

        public String getSubDirRedirect() {
            return subDirRedirect;
        }

        public void setSubDirRedirect(String subDirRedirect) {
            this.subDirRedirect = subDirRedirect;
        }

        public String getRuleFor404() {
            return ruleFor404;
        }

        public void setRuleFor404(String ruleFor404) {
            this.ruleFor404 = ruleFor404;
        }

        public String getDefaultPage404() {
            return defaultPage404;
        }

        public void setDefaultPage404(String defaultPage404) {
            this.defaultPage404 = defaultPage404;
        }
    }
}
