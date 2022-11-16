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
package cn.ucloud.umongodb.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUMongoDBCfgTempItemResponse extends Response {

    /** 配置模板项 */
    @SerializedName("DataSet")
    private List<ConfigTemplateItem> dataSet;

    public List<ConfigTemplateItem> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<ConfigTemplateItem> dataSet) {
        this.dataSet = dataSet;
    }

    public static class ConfigOptions extends Response {

        /** mongo版本 */
        @SerializedName("MongodbVersion")
        private String mongodbVersion;

        /** 配置选项名 */
        @SerializedName("OptionName")
        private String optionName;

        /** 配置选项类型 string,int,bool */
        @SerializedName("OptionValueType")
        private String optionValueType;

        /** 配置选项值范围 */
        @SerializedName("OptionValues")
        private String optionValues;

        /** 默认值 */
        @SerializedName("OptionDefaultValue")
        private String optionDefaultValue;

        /** 是否为默认选项 */
        @SerializedName("IsDefaultOption")
        private Boolean isDefaultOption;

        /** 是否可修改 */
        @SerializedName("EnableModify")
        private Boolean enableModify;

        /** 是否前端展示 */
        @SerializedName("EnableDisplay")
        private Boolean enableDisplay;

        /** 是否需重启 */
        @SerializedName("ForceRestart")
        private Boolean forceRestart;

        /** 选项值格式 */
        @SerializedName("OptionFormatType")
        private String optionFormatType;

        /** 允许应用类型 */
        @SerializedName("AllowedApplyType")
        private String allowedApplyType;

        /** 描述 */
        @SerializedName("Description")
        private String description;

        public String getMongodbVersion() {
            return mongodbVersion;
        }

        public void setMongodbVersion(String mongodbVersion) {
            this.mongodbVersion = mongodbVersion;
        }

        public String getOptionName() {
            return optionName;
        }

        public void setOptionName(String optionName) {
            this.optionName = optionName;
        }

        public String getOptionValueType() {
            return optionValueType;
        }

        public void setOptionValueType(String optionValueType) {
            this.optionValueType = optionValueType;
        }

        public String getOptionValues() {
            return optionValues;
        }

        public void setOptionValues(String optionValues) {
            this.optionValues = optionValues;
        }

        public String getOptionDefaultValue() {
            return optionDefaultValue;
        }

        public void setOptionDefaultValue(String optionDefaultValue) {
            this.optionDefaultValue = optionDefaultValue;
        }

        public Boolean getIsDefaultOption() {
            return isDefaultOption;
        }

        public void setIsDefaultOption(Boolean isDefaultOption) {
            this.isDefaultOption = isDefaultOption;
        }

        public Boolean getEnableModify() {
            return enableModify;
        }

        public void setEnableModify(Boolean enableModify) {
            this.enableModify = enableModify;
        }

        public Boolean getEnableDisplay() {
            return enableDisplay;
        }

        public void setEnableDisplay(Boolean enableDisplay) {
            this.enableDisplay = enableDisplay;
        }

        public Boolean getForceRestart() {
            return forceRestart;
        }

        public void setForceRestart(Boolean forceRestart) {
            this.forceRestart = forceRestart;
        }

        public String getOptionFormatType() {
            return optionFormatType;
        }

        public void setOptionFormatType(String optionFormatType) {
            this.optionFormatType = optionFormatType;
        }

        public String getAllowedApplyType() {
            return allowedApplyType;
        }

        public void setAllowedApplyType(String allowedApplyType) {
            this.allowedApplyType = allowedApplyType;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public static class ConfigTemplateItem extends Response {

        /** itemId */
        @SerializedName("ItemId")
        private String itemId;

        /** 模板ID */
        @SerializedName("TemplateId")
        private String templateId;

        /** 配置名称 */
        @SerializedName("ConfigName")
        private String configName;

        /** 配置值 */
        @SerializedName("ConfigValue")
        private String configValue;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 修改时间 */
        @SerializedName("ModifyTime")
        private Integer modifyTime;

        /** 配置选项 */
        @SerializedName("ConfigOption")
        private ConfigOptions configOption;

        /** 节点类型: DataNode:数据节点 | ConfigSrvNode:配置节点 | MongosNode:路由节点 */
        @SerializedName("NodeType")
        private String nodeType;

        public String getItemId() {
            return itemId;
        }

        public void setItemId(String itemId) {
            this.itemId = itemId;
        }

        public String getTemplateId() {
            return templateId;
        }

        public void setTemplateId(String templateId) {
            this.templateId = templateId;
        }

        public String getConfigName() {
            return configName;
        }

        public void setConfigName(String configName) {
            this.configName = configName;
        }

        public String getConfigValue() {
            return configValue;
        }

        public void setConfigValue(String configValue) {
            this.configValue = configValue;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getModifyTime() {
            return modifyTime;
        }

        public void setModifyTime(Integer modifyTime) {
            this.modifyTime = modifyTime;
        }

        public ConfigOptions getConfigOption() {
            return configOption;
        }

        public void setConfigOption(ConfigOptions configOption) {
            this.configOption = configOption;
        }

        public String getNodeType() {
            return nodeType;
        }

        public void setNodeType(String nodeType) {
            this.nodeType = nodeType;
        }
    }
}
