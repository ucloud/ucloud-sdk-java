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
package cn.ucloud.udns.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUDNSDomainResponse extends Response {

    /** 查询记录 */
    @SerializedName("RecordInfos")
    private List<RecordInfo> recordInfos;

    /** 总条数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<RecordInfo> getRecordInfos() {
        return recordInfos;
    }

    public void setRecordInfos(List<RecordInfo> recordInfos) {
        this.recordInfos = recordInfos;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class RecordInfo extends Response {

        /** 域名记录资源ID */
        @SerializedName("RecordId")
        private String recordId;

        /** 主机记录 */
        @SerializedName("Name")
        private String name;

        /** 记录类型 */
        @SerializedName("Type")
        private String type;

        /** 数值组 */
        @SerializedName("ValueSet")
        private List<ValueSet> valueSet;

        /** 记录策略，标准或随机应答 */
        @SerializedName("ValueType")
        private String valueType;

        /** TTL值，单位为秒 */
        @SerializedName("TTL")
        private Integer ttl;

        /** 记录备注信息 */
        @SerializedName("Remark")
        private String remark;

        public String getRecordId() {
            return recordId;
        }

        public void setRecordId(String recordId) {
            this.recordId = recordId;
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

        public List<ValueSet> getValueSet() {
            return valueSet;
        }

        public void setValueSet(List<ValueSet> valueSet) {
            this.valueSet = valueSet;
        }

        public String getValueType() {
            return valueType;
        }

        public void setValueType(String valueType) {
            this.valueType = valueType;
        }

        public Integer getTTL() {
            return ttl;
        }

        public void setTTL(Integer ttl) {
            this.ttl = ttl;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }

    public static class ValueSet extends Response {

        /** 主机记录 */
        @SerializedName("Data")
        private String data;

        /** 权重 */
        @SerializedName("Weight")
        private Integer weight;

        /** 是否启用 */
        @SerializedName("IsEnabled")
        private Integer isEnabled;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public Integer getIsEnabled() {
            return isEnabled;
        }

        public void setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
        }
    }
}
