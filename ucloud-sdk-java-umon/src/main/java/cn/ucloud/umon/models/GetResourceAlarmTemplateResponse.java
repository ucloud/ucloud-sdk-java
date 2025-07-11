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
package cn.ucloud.umon.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetResourceAlarmTemplateResponse extends Response {

    /** 请见ResourceTemplateBound */
    @SerializedName("DataSet")
    private List<ResourceTemplateBound> dataSet;

    public List<ResourceTemplateBound> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<ResourceTemplateBound> dataSet) {
        this.dataSet = dataSet;
    }

    public static class ResourceTemplateBound extends Response {

        /** 是否绑定了告警模板，Yes：是；No：否。若为No，不展示AlarmTemplateId、AlarmTemplateName、Remark */
        @SerializedName("HasAlarmTemplate")
        private String hasAlarmTemplate;

        /** 资源id */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 告警模板id */
        @SerializedName("AlarmTemplateId")
        private Integer alarmTemplateId;

        /** 告警模板名称 */
        @SerializedName("AlarmTemplateName")
        private String alarmTemplateName;

        /** 是否默认模板，Yes：是；No：否 */
        @SerializedName("IsDefault")
        private String isDefault;

        /** 模板备注 */
        @SerializedName("Remark")
        private String remark;

        public String getHasAlarmTemplate() {
            return hasAlarmTemplate;
        }

        public void setHasAlarmTemplate(String hasAlarmTemplate) {
            this.hasAlarmTemplate = hasAlarmTemplate;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public Integer getAlarmTemplateId() {
            return alarmTemplateId;
        }

        public void setAlarmTemplateId(Integer alarmTemplateId) {
            this.alarmTemplateId = alarmTemplateId;
        }

        public String getAlarmTemplateName() {
            return alarmTemplateName;
        }

        public void setAlarmTemplateName(String alarmTemplateName) {
            this.alarmTemplateName = alarmTemplateName;
        }

        public String getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(String isDefault) {
            this.isDefault = isDefault;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}
