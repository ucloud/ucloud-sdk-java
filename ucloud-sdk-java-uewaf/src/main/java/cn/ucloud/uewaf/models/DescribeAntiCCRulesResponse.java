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

public class DescribeAntiCCRulesResponse extends Response {

    /** CC规则，参考AntiCcRes */
    @SerializedName("Res")
    private AntiCcRes res;

    public AntiCcRes getRes() {
        return res;
    }

    public void setRes(AntiCcRes res) {
        this.res = res;
    }

    public static class AntiCcRes extends Response {

        /** 指定域名的CC防护状态 */
        @SerializedName("State")
        private String state;

        /** 指定域名的CC防护模式 */
        @SerializedName("Mode")
        private String mode;

        /** CC规则最大容量 */
        @SerializedName("Max")
        private Integer max;

        /** CC规则列表，参考AntiCcRule */
        @SerializedName("Rules")
        private List<AntiCcRule> rules;

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }

        public Integer getMax() {
            return max;
        }

        public void setMax(Integer max) {
            this.max = max;
        }

        public List<AntiCcRule> getRules() {
            return rules;
        }

        public void setRules(List<AntiCcRule> rules) {
            this.rules = rules;
        }
    }

    public static class AntiCcRule extends Response {

        /** 规则ID */
        @SerializedName("Id")
        private Integer id;

        /** URI */
        @SerializedName("Uri")
        private String uri;

        /** 模式 */
        @SerializedName("Mode")
        private String mode;

        /** 统计时长. 单位:秒 */
        @SerializedName("Duration")
        private Integer duration;

        /** 请求次数 */
        @SerializedName("Reqs")
        private Integer reqs;

        /** 执行动作 */
        @SerializedName("Action")
        private String action;

        /** 动作有效期,单位:分钟 */
        @SerializedName("Validity")
        private Integer validity;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }

        public Integer getDuration() {
            return duration;
        }

        public void setDuration(Integer duration) {
            this.duration = duration;
        }

        public Integer getReqs() {
            return reqs;
        }

        public void setReqs(Integer reqs) {
            this.reqs = reqs;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public Integer getValidity() {
            return validity;
        }

        public void setValidity(Integer validity) {
            this.validity = validity;
        }
    }
}
