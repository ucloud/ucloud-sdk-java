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
package cn.ucloud.vpc.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CopySecGroupResponse extends Response {

    /** 复制得到的安全组ID */
    @SerializedName("SecGroupId")
    private String secGroupId;

    /** 复制得到的规则ID */
    @SerializedName("RuleID")
    private List<String> ruleID;

    public String getSecGroupId() {
        return secGroupId;
    }

    public void setSecGroupId(String secGroupId) {
        this.secGroupId = secGroupId;
    }

    public List<String> getRuleID() {
        return ruleID;
    }

    public void setRuleID(List<String> ruleID) {
        this.ruleID = ruleID;
    }
}
