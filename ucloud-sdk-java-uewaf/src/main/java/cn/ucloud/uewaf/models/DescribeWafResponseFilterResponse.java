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

public class DescribeWafResponseFilterResponse extends Response {

    /** 信息安全过滤规则列表，参考HttpReponseFilter */
    @SerializedName("Data")
    private List<HttpReponseFilter> data;

    public List<HttpReponseFilter> getData() {
        return data;
    }

    public void setData(List<HttpReponseFilter> data) {
        this.data = data;
    }

    public static class HttpReponseFilter extends Response {

        /** 规则ID */
        @SerializedName("ID")
        private Integer id;

        /** 规则名称 */
        @SerializedName("Name")
        private String name;

        /** 防护类型；可选项：Status（状态码），Sensitive（敏感内容），Customize（自定义字符串） */
        @SerializedName("Type")
        private String type;

        /** 过滤内容 */
        @SerializedName("Content")
        private String content;

        /** 丢弃响应或伪装内容 */
        @SerializedName("RuleAction")
        private String ruleAction;

        /** 伪装响应内容 */
        @SerializedName("DisguiseFile")
        private String disguiseFile;

        public Integer getID() {
            return id;
        }

        public void setID(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getRuleAction() {
            return ruleAction;
        }

        public void setRuleAction(String ruleAction) {
            this.ruleAction = ruleAction;
        }

        public String getDisguiseFile() {
            return disguiseFile;
        }

        public void setDisguiseFile(String disguiseFile) {
            this.disguiseFile = disguiseFile;
        }
    }
}
