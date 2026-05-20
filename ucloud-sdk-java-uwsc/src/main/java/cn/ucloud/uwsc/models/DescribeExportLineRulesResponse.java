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
package cn.ucloud.uwsc.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeExportLineRulesResponse extends Response {

    /** 白名单信息 */
    @SerializedName("WhiteListInfos")
    private List<WhiteListInfo> whiteListInfos;

    public List<WhiteListInfo> getWhiteListInfos() {
        return whiteListInfos;
    }

    public void setWhiteListInfos(List<WhiteListInfo> whiteListInfos) {
        this.whiteListInfos = whiteListInfos;
    }

    public static class WhiteListInfo extends Response {

        /** */
        @SerializedName("RuleType")
        private String ruleType;

        /** */
        @SerializedName("Name")
        private String name;

        /** */
        @SerializedName("Remark")
        private String remark;

        public String getRuleType() {
            return ruleType;
        }

        public void setRuleType(String ruleType) {
            this.ruleType = ruleType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}
