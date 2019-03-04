package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 获取参数信息 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 15:42
 **/
public class DescribeUDBParamGroupResult extends BaseResponseResult {

    public static class UDBParamMember {

        /**
         * 参数名称
         */
        @SerializedName("Key")
        private String key;

        /**
         * 参数值
         */
        @SerializedName("Value")
        private String value;

        /**
         * 参数值应用类型，取值范围为{0,10,20,30},各值 代表意义为 0-unknown、10-int、20-string、 30-bool
         */
        @SerializedName("ValueType")
        private Integer valueType;

        /**
         * 参数值应用类型,取值范围为{0,10,20}，各值代表 意义为0-unknown、10-static、20-dynamic
         */
        @SerializedName("AllowedVal")
        private String allowedVal;

        /**
         * 参数值应用类型,取值范围为{0,10,20}，
         * 各值代表 意义为0-unknown、10-static、20-dynamic
         */
        @SerializedName("ApplyType")
        private Integer applyType;

        /**
         * 是否可更改，默认为false
         */
        @SerializedName("Modifiable")
        private Boolean modifiable;

        /**
         * 允许值的格式类型，取值范围为{0,10,20}，
         * 意义分 别为PVFT_UNKOWN=0,PVFT_RANGE=10, PVFT_ENUM=20
         */
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

        @Override
        public String toString() {
            return "UDBParamGroup{" +
                    "key='" + key + '\'' +
                    ", value='" + value + '\'' +
                    ", valueType=" + valueType +
                    ", allowedVal='" + allowedVal + '\'' +
                    ", applyType=" + applyType +
                    ", modifiable=" + modifiable +
                    ", formatType=" + formatType +
                    '}';
        }
    }


    public static class UDBParamGroup {

        /**
         * 参数组id
         */
        @SerializedName("GroupId")
        private Integer groupId;

        /**
         * 参数组名称
         */
        @SerializedName("GroupName")
        private String groupName;

        /**
         * DB类型id，mysql/mongodb按版本细分各有一个id
         * 目前id的取值范围为[1,7],数值对应的版本如下
         * 1：mysql-5.5，2：mysql-5.1，
         * 3：percona-5.5 4：mongodb-2.4，
         * 5：mongodb-2.6，6：mysql-5.6 7：percona-5.6
         */
        @SerializedName("DBTypeId")
        private String dbTypeId;

        /**
         * 参数组描述
         */
        @SerializedName("Description")
        private String description;

        /**
         * 参数组是否可修改
         */
        @SerializedName("Modifiable")
        private Boolean modifiable;

        /**
         * 参数的键值对表 UDBParamMember
         */
        @SerializedName("ParamMember")
        private List<UDBParamMember> udbParamMembers;

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

        public String getDbTypeId() {
            return dbTypeId;
        }

        public void setDbTypeId(String dbTypeId) {
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

        public List<UDBParamMember> getUdbParamMembers() {
            return udbParamMembers;
        }

        public void setUdbParamMembers(List<UDBParamMember> udbParamMembers) {
            this.udbParamMembers = udbParamMembers;
        }

        @Override
        public String toString() {
            return "UDBParamGroup{" +
                    "groupId=" + groupId +
                    ", groupName='" + groupName + '\'' +
                    ", dbTypeId='" + dbTypeId + '\'' +
                    ", description='" + description + '\'' +
                    ", modifiable=" + modifiable +
                    ", udbParamMembers=" + udbParamMembers +
                    '}';
        }
    }

    /**
     * 参数组列表 参照UDBParamGroupSet
     */
    @SerializedName("DataSet")
    private List<UDBParamGroup> udbParamGroups;

    /**
     * 参数组总数，列表操作时才会有该参数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<UDBParamGroup> getUdbParamGroups() {
        return udbParamGroups;
    }

    public void setUdbParamGroups(List<UDBParamGroup> udbParamGroups) {
        this.udbParamGroups = udbParamGroups;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "DescribeUDBParamGroupResult{" +
                "udbParamGroups=" + udbParamGroups +
                ", totalCount=" + totalCount +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
