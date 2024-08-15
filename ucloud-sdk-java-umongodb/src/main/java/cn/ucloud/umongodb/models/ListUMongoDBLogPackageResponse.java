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

public class ListUMongoDBLogPackageResponse extends Response {

    /** 列表 */
    @SerializedName("DataSet")
    private List<PackageInfo> dataSet;

    public List<PackageInfo> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<PackageInfo> dataSet) {
        this.dataSet = dataSet;
    }

    public static class PackageInfo extends Response {

        /** id */
        @SerializedName("Id")
        private Integer id;

        /** 名称 */
        @SerializedName("Name")
        private String name;

        /**
         * Package_Running,Package_Success,Package_Failed,Package_Deleting,Package_Deleted,Package_DeleteFailed
         */
        @SerializedName("State")
        private String state;

        /** 大小,单位字节 */
        @SerializedName("Size")
        private Integer size;

        /** SlowLog,ErrorLog */
        @SerializedName("PackageType")
        private String packageType;

        /** 集群id */
        @SerializedName("ClusterId")
        private String clusterId;

        /** 节点id */
        @SerializedName("NodeId")
        private String nodeId;

        /** 角色 */
        @SerializedName("Role")
        private String role;

        /** 开始时间 */
        @SerializedName("Begin")
        private Integer begin;

        /** 结束时间 */
        @SerializedName("End")
        private Integer end;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 完成时间 */
        @SerializedName("FinishTime")
        private Integer finishTime;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public String getPackageType() {
            return packageType;
        }

        public void setPackageType(String packageType) {
            this.packageType = packageType;
        }

        public String getClusterId() {
            return clusterId;
        }

        public void setClusterId(String clusterId) {
            this.clusterId = clusterId;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public Integer getBegin() {
            return begin;
        }

        public void setBegin(Integer begin) {
            this.begin = begin;
        }

        public Integer getEnd() {
            return end;
        }

        public void setEnd(Integer end) {
            this.end = end;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getFinishTime() {
            return finishTime;
        }

        public void setFinishTime(Integer finishTime) {
            this.finishTime = finishTime;
        }
    }
}
