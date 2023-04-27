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
package cn.ucloud.udi.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeFunctionTemplateResponse extends Response {

    /** 功能模板 */
    @SerializedName("Templates")
    private List<FunctionTemplate> templates;

    public List<FunctionTemplate> getTemplates() {
        return templates;
    }

    public void setTemplates(List<FunctionTemplate> templates) {
        this.templates = templates;
    }

    public static class FunctionTemplate extends Response {

        /** */
        @SerializedName("Name")
        private String name;

        /** */
        @SerializedName("FunctionName")
        private String functionName;

        /** */
        @SerializedName("Id")
        private String id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFunctionName() {
            return functionName;
        }

        public void setFunctionName(String functionName) {
            this.functionName = functionName;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
