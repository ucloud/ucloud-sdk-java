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

public class ListUMongoDBConfigTemplateResponse extends Response {

    /** 配置模板列表 */
    @SerializedName("DataSet")
    private List<ConfigTemplate> dataSet;

    public List<ConfigTemplate> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<ConfigTemplate> dataSet) {
        this.dataSet = dataSet;
    }

    public static class ConfigTemplate extends Response {

        /** 模板ID */
        @SerializedName("TemplateId")
        private String templateId;

        /** 模板名称 */
        @SerializedName("TemplateName")
        private String templateName;

        /** mongo版本 */
        @SerializedName("MongodbVersion")
        private String mongodbVersion;

        /** 集群类型 */
        @SerializedName("ClusterType")
        private String clusterType;

        /** 模板类型 UsersTemplate DefaultTemplate */
        @SerializedName("TemplateType")
        private String templateType;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 修改时间 */
        @SerializedName("ModifyTime")
        private Integer modifyTime;

        /** 删除时间 */
        @SerializedName("DeleteTime")
        private Integer deleteTime;

        /** 模板描述 */
        @SerializedName("Description")
        private String description;

        public String getTemplateId() {
            return templateId;
        }

        public void setTemplateId(String templateId) {
            this.templateId = templateId;
        }

        public String getTemplateName() {
            return templateName;
        }

        public void setTemplateName(String templateName) {
            this.templateName = templateName;
        }

        public String getMongodbVersion() {
            return mongodbVersion;
        }

        public void setMongodbVersion(String mongodbVersion) {
            this.mongodbVersion = mongodbVersion;
        }

        public String getClusterType() {
            return clusterType;
        }

        public void setClusterType(String clusterType) {
            this.clusterType = clusterType;
        }

        public String getTemplateType() {
            return templateType;
        }

        public void setTemplateType(String templateType) {
            this.templateType = templateType;
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

        public Integer getDeleteTime() {
            return deleteTime;
        }

        public void setDeleteTime(Integer deleteTime) {
            this.deleteTime = deleteTime;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
