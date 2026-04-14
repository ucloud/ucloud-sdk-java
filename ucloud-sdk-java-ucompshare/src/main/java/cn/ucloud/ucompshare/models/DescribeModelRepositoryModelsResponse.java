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

import java.util.List;

public class DescribeModelRepositoryModelsResponse extends Response {

    /** 模型信息列表 */
    @SerializedName("Models")
    private List<ModelRepositoryModel> models;

    public List<ModelRepositoryModel> getModels() {
        return models;
    }

    public void setModels(List<ModelRepositoryModel> models) {
        this.models = models;
    }

    public static class ModelRepositoryModel extends Response {

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 模型名称 */
        @SerializedName("Name")
        private String name;

        /** 模型路径 */
        @SerializedName("Path")
        private String path;

        /** 模型标签 */
        @SerializedName("Tag")
        private String tag;

        /** 模型大小 */
        @SerializedName("Size")
        private String size;

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }
    }
}
