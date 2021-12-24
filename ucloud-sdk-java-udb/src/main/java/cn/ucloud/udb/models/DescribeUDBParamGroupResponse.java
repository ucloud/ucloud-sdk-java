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
package cn.ucloud.udb.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeUDBParamGroupResponse extends Response {

    /** 参数组列表 参照UDBParamGroupSet: false */
    @SerializedName("DataSet")
    private List<UDBParamGroupSet> dataSet;

    /** 参数组总数，列表操作时才会有该参数: false */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<UDBParamGroupSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDBParamGroupSet> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class UDBParamGroupSet extends Response {

        /** 参数组id: false */
        @SerializedName("GroupId")
        private Integer groupId;

        /** 参数组名称: false */
        @SerializedName("GroupName")
        private String groupName;

        /**
         * DB类型id，mysql/mongodb按版本细分各有一个id 目前id的取值范围为[1,7],数值对应的版本如下
         * 1：mysql-5.5，2：mysql-5.1，3：percona-5.5 4：mongodb-2.4，5：mongodb-2.6，6：mysql-5.6
         * 7：percona-5.6: false
         */
        @SerializedName("DBTypeId")
        private String dbTypeId;

        /** 参数组描述: false */
        @SerializedName("Description")
        private String description;

        /** 参数组是否可修改: false */
        @SerializedName("Modifiable")
        private Boolean modifiable;

        /** 参数的键值对表 UDBParamMemberSet: false */
        @SerializedName("ParamMember")
        private List<UDBParamMemberSet> paramMember;

        public Integer getGroupId() {
            return groupId;
        }

        public void setGroupId(Integer groupId) {
            this.groupId = groupId;
        }

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public String getDBTypeId() {
            return dbTypeId;
        }

        public void setDBTypeId(String dbTypeId) {
            this.dbTypeId = dbTypeId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Boolean getModifiable() {
            return modifiable;
        }

        public void setModifiable(Boolean modifiable) {
            this.modifiable = modifiable;
        }

        public List<UDBParamMemberSet> getParamMember() {
            return paramMember;
        }

        public void setParamMember(List<UDBParamMemberSet> paramMember) {
            this.paramMember = paramMember;
        }
    }

    public static class UDBParamMemberSet extends Response {

        /** 参数名称: false */
        @SerializedName("Key")
        private String key;

        /** 参数值: false */
        @SerializedName("Value")
        private String value;

        /** 参数值应用类型，取值范围为{0,10,20,30},各值 代表意义为 0-unknown、10-int、20-string、 30-bool: false */
        @SerializedName("ValueType")
        private Integer valueType;

        /** 允许的值(根据参数类型，用分隔符表示): false */
        @SerializedName("AllowedVal")
        private String allowedVal;

        /** 参数值应用类型,取值范围为{0,10,20}，各值代表 意义为0-unknown、10-static、20-dynamic: false */
        @SerializedName("ApplyType")
        private Integer applyType;

        /** 是否可更改，默认为false: false */
        @SerializedName("Modifiable")
        private Boolean modifiable;

        /** 允许值的格式类型，取值范围为{0,10,20}，意义分 别为PVFT_UNKOWN=0,PVFT_RANGE=10, PVFT_ENUM=20: false */
        @SerializedName("FormatType")
        private Integer formatType;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Integer getValueType() {
            return valueType;
        }

        public void setValueType(Integer valueType) {
            this.valueType = valueType;
        }

        public String getAllowedVal() {
            return allowedVal;
        }

        public void setAllowedVal(String allowedVal) {
            this.allowedVal = allowedVal;
        }

        public Integer getApplyType() {
            return applyType;
        }

        public void setApplyType(Integer applyType) {
            this.applyType = applyType;
        }

        public Boolean getModifiable() {
            return modifiable;
        }

        public void setModifiable(Boolean modifiable) {
            this.modifiable = modifiable;
        }

        public Integer getFormatType() {
            return formatType;
        }

        public void setFormatType(Integer formatType) {
            this.formatType = formatType;
        }
    }
}
