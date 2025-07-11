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

public class GetAlarmTemplateListResponse extends Response {

    /** 总数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 告警模板列表 */
    @SerializedName("DataSet")
    private List<AlarmTemplate> dataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<AlarmTemplate> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<AlarmTemplate> dataSet) {
        this.dataSet = dataSet;
    }

    public static class AlarmTemplate extends Response {

        /** 告警模板id */
        @SerializedName("AlarmTemplateId")
        private Integer alarmTemplateId;

        /** 告警模板名称 */
        @SerializedName("AlarmTemplateName")
        private String alarmTemplateName;

        /** 资源类型 */
        @SerializedName("ResourceType")
        private String resourceType;

        /** 绑定的资源数量 */
        @SerializedName("BoundResourceCount")
        private Integer boundResourceCount;

        /** 是否是全局机房模版，0不是，1是 */
        @SerializedName("IsGlobal")
        private Integer isGlobal;

        /** 是否为默认模板 */
        @SerializedName("IsDefault")
        private String isDefault;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

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

        public String getResourceType() {
            return resourceType;
        }

        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        public Integer getBoundResourceCount() {
            return boundResourceCount;
        }

        public void setBoundResourceCount(Integer boundResourceCount) {
            this.boundResourceCount = boundResourceCount;
        }

        public Integer getIsGlobal() {
            return isGlobal;
        }

        public void setIsGlobal(Integer isGlobal) {
            this.isGlobal = isGlobal;
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
