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

public class ListUMongoDBInstancesResponse extends Response {

    /** 副本集ID */
    @SerializedName("DataSet")
    private List<MongodbInstance> dataSet;

    public List<MongodbInstance> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<MongodbInstance> dataSet) {
        this.dataSet = dataSet;
    }

    public static class MongodbInstance extends Response {

        /** 可用区 */
        @SerializedName("Zone")
        private String zone;

        /** 副本集/分片集群ID */
        @SerializedName("ClusterId")
        private String clusterId;

        /** 副本集/分片集群实例名称 */
        @SerializedName("Name")
        private String name;

        /** 副本集/分片集群的Mongodb的版本，包括MongoDB-3.6, MongoDB-4.2 */
        @SerializedName("DBVersion")
        private String dbVersion;

        /** 副本集/分片集群的访问地址 */
        @SerializedName("ConnectURL")
        private String connectURL;

        /** 副本集/分片集群的创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 集群类型，ReplicaSet :副本集，SharedCluster：分片集 */
        @SerializedName("ClusterType")
        private String clusterType;

        /**
         * 副本集/分片集群状态标记
         * Initing：初始化中，InitFailed：安装失败，Starting：启动中，StartFailed：启动失败，Running：运行，Stopping：关闭中，Stopped：已关闭,
         * StopFailed：关闭失败，Deleting：删除中，Deleted：已删除，DeleteFailed：删除失败，Restarting：重启中，RestartFailed：重启失败。
         */
        @SerializedName("State")
        private String state;

        /** 副本集/分片集IPv6访问地址 */
        @SerializedName("IPv6ConnectURL")
        private String iPv6ConnectURL;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getClusterId() {
            return clusterId;
        }

        public void setClusterId(String clusterId) {
            this.clusterId = clusterId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDBVersion() {
            return dbVersion;
        }

        public void setDBVersion(String dbVersion) {
            this.dbVersion = dbVersion;
        }

        public String getConnectURL() {
            return connectURL;
        }

        public void setConnectURL(String connectURL) {
            this.connectURL = connectURL;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getClusterType() {
            return clusterType;
        }

        public void setClusterType(String clusterType) {
            this.clusterType = clusterType;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getIPv6ConnectURL() {
            return iPv6ConnectURL;
        }

        public void setIPv6ConnectURL(String iPv6ConnectURL) {
            this.iPv6ConnectURL = iPv6ConnectURL;
        }
    }
}
