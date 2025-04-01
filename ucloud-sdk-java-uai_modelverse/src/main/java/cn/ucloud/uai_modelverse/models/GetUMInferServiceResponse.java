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
package cn.ucloud.uai_modelverse.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUMInferServiceResponse extends Response {

    /** 推理服务数据 */
    @SerializedName("Data")
    private List<UMInferServiceData> data;

    /** 模型数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<UMInferServiceData> getData() {
        return data;
    }

    public void setData(List<UMInferServiceData> data) {
        this.data = data;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class UMInferServiceData extends Response {

        /** 副本数 */
        @SerializedName("Replicas")
        private Integer replicas;

        /** 实际启动的副本数 */
        @SerializedName("ReadyReplicas")
        private Integer readyReplicas;

        /** 算力单元 */
        @SerializedName("ComputingUnit")
        private Integer computingUnit;

        /** 推理服务资源id */
        @SerializedName("UminferID")
        private String uminferID;

        /** 推理服务资源类型 */
        @SerializedName("UminferType")
        private String uminferType;

        /** 服务状态 */
        @SerializedName("Status")
        private String status;

        /** 服务的url */
        @SerializedName("URL")
        private String url;

        /** 服务名字 */
        @SerializedName("Name")
        private String name;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 模型id */
        @SerializedName("ModelID")
        private String modelID;

        /** 模型名字 */
        @SerializedName("ModelName")
        private String modelName;

        /** 描述 */
        @SerializedName("Describe")
        private String describe;

        /** 模型认证key */
        @SerializedName("Key")
        private String key;

        public Integer getReplicas() {
            return replicas;
        }

        public void setReplicas(Integer replicas) {
            this.replicas = replicas;
        }

        public Integer getReadyReplicas() {
            return readyReplicas;
        }

        public void setReadyReplicas(Integer readyReplicas) {
            this.readyReplicas = readyReplicas;
        }

        public Integer getComputingUnit() {
            return computingUnit;
        }

        public void setComputingUnit(Integer computingUnit) {
            this.computingUnit = computingUnit;
        }

        public String getUminferID() {
            return uminferID;
        }

        public void setUminferID(String uminferID) {
            this.uminferID = uminferID;
        }

        public String getUminferType() {
            return uminferType;
        }

        public void setUminferType(String uminferType) {
            this.uminferType = uminferType;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getURL() {
            return url;
        }

        public void setURL(String url) {
            this.url = url;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getModelID() {
            return modelID;
        }

        public void setModelID(String modelID) {
            this.modelID = modelID;
        }

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public String getDescribe() {
            return describe;
        }

        public void setDescribe(String describe) {
            this.describe = describe;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }
}
