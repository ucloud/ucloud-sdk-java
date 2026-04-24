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

import java.util.List;

public class VulStatisticTopNResponse extends Response {

    /** 感染主机数量最多的前N个漏洞列表信息 */
    @SerializedName("Result")
    private List<VulStatisticTopNInfo> result;

    public List<VulStatisticTopNInfo> getResult() {
        return result;
    }

    public void setResult(List<VulStatisticTopNInfo> result) {
        this.result = result;
    }

    public static class VulStatisticTopNInfo extends Response {

        /** 漏洞ID */
        @SerializedName("VulID")
        private String vulID;

        /** 漏洞名称 */
        @SerializedName("Name")
        private String name;

        /** 存在该漏洞的主机数 */
        @SerializedName("AgentCount")
        private Integer agentCount;

        public String getVulID() {
            return vulID;
        }

        public void setVulID(String vulID) {
            this.vulID = vulID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAgentCount() {
            return agentCount;
        }

        public void setAgentCount(Integer agentCount) {
            this.agentCount = agentCount;
        }
    }
}
