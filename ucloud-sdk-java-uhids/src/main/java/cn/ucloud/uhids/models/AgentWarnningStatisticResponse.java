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
package cn.ucloud.uhids.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class AgentWarnningStatisticResponse extends Response {

    /** 主机状态统计结果值 */
    @SerializedName("Result")
    private AgentWarnningStatisticInfo result;

    public AgentWarnningStatisticInfo getResult() {
        return result;
    }

    public void setResult(AgentWarnningStatisticInfo result) {
        this.result = result;
    }

    public static class AgentWarnningStatisticInfo extends Response {

        /** 主机总数 */
        @SerializedName("AgentTotal")
        private Integer agentTotal;

        /** 在线主机数 */
        @SerializedName("Online")
        private Integer online;

        /** 离线主机数 */
        @SerializedName("Offline")
        private Integer offline;

        /** 有风险主机数 */
        @SerializedName("WarnningCount")
        private Integer warnningCount;

        /** 无风险主机数 */
        @SerializedName("SafeCount")
        private Integer safeCount;

        public Integer getAgentTotal() {
            return agentTotal;
        }

        public void setAgentTotal(Integer agentTotal) {
            this.agentTotal = agentTotal;
        }

        public Integer getOnline() {
            return online;
        }

        public void setOnline(Integer online) {
            this.online = online;
        }

        public Integer getOffline() {
            return offline;
        }

        public void setOffline(Integer offline) {
            this.offline = offline;
        }

        public Integer getWarnningCount() {
            return warnningCount;
        }

        public void setWarnningCount(Integer warnningCount) {
            this.warnningCount = warnningCount;
        }

        public Integer getSafeCount() {
            return safeCount;
        }

        public void setSafeCount(Integer safeCount) {
            this.safeCount = safeCount;
        }
    }
}
