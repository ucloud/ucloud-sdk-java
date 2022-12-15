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

public class DescribeSnatRuleResponse extends Response {

    /** 某个NAT网关的所有Snat规则 */
    @SerializedName("DataSet")
    private List<NATGWSnatRule> dataSet;

    /** 规则数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<NATGWSnatRule> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<NATGWSnatRule> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class NATGWSnatRule extends Response {

        /** EIP地址，如106.76.xx.xx */
        @SerializedName("SnatIp")
        private String snatIp;

        /** 资源的内网IP地址 */
        @SerializedName("SourceIp")
        private String sourceIp;

        /** SourceIp所属的子网id */
        @SerializedName("SubnetworkId")
        private String subnetworkId;

        /** snat规则名称 */
        @SerializedName("Name")
        private String name;

        public String getSnatIp() {
            return snatIp;
        }

        public void setSnatIp(String snatIp) {
            this.snatIp = snatIp;
        }

        public String getSourceIp() {
            return sourceIp;
        }

        public void setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
        }

        public String getSubnetworkId() {
            return subnetworkId;
        }

        public void setSubnetworkId(String subnetworkId) {
            this.subnetworkId = subnetworkId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
