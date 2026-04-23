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
package cn.ucloud.ucompshare.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class GetOpenClawModelListResponse extends Response {

    /** 模型列表 */
    @SerializedName("Models")
    private OpenClawModelInfo models;

    public OpenClawModelInfo getModels() {
        return models;
    }

    public void setModels(OpenClawModelInfo models) {
        this.models = models;
    }

    public static class OpenClawModelInfo extends Response {

        /** 模型Id */
        @SerializedName("Id")
        private String id;

        /** 模型名称 */
        @SerializedName("Name")
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
