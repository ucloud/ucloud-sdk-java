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
package cn.ucloud.upgsql.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListUPgSQLParamTemplateResponse extends Response {

    /** 参数模板信息 */
    @SerializedName("Data")
    private List<TemplateGroup> data;

    public List<TemplateGroup> getData() {
        return data;
    }

    public void setData(List<TemplateGroup> data) {
        this.data = data;
    }

    public static class TemplateGroup extends Response {

        /** 参数模板ID */
        @SerializedName("GroupID")
        private Integer groupID;

        /** 参数模板名称 */
        @SerializedName("GroupName")
        private String groupName;

        /** 应用的DB版本 */
        @SerializedName("DBVersion")
        private String dbVersion;

        /** 描述信息 */
        @SerializedName("Description")
        private String description;

        /** 是否可以修改 */
        @SerializedName("Modifiable")
        private Boolean modifiable;

        /** 模板组类型名称 */
        @SerializedName("ParamGroupTypeName")
        private String paramGroupTypeName;

        public Integer getGroupID() {
            return groupID;
        }

        public void setGroupID(Integer groupID) {
            this.groupID = groupID;
        }

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public String getDBVersion() {
            return dbVersion;
        }

        public void setDBVersion(String dbVersion) {
            this.dbVersion = dbVersion;
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

        public String getParamGroupTypeName() {
            return paramGroupTypeName;
        }

        public void setParamGroupTypeName(String paramGroupTypeName) {
            this.paramGroupTypeName = paramGroupTypeName;
        }
    }
}
