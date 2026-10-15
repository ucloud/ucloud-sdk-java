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
package cn.ucloud.uk8s.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUK8SCNINodeInfoResponse extends Response {

    /** 节点 CNI 信息列表 */
    @SerializedName("NodeInfoSet")
    private List<NodePluginInfo> nodeInfoSet;

    /** 数据来源：database 表示数据库记录，ipamd_http 表示通过 ipamd 实时查询。 */
    @SerializedName("DataSource")
    private String dataSource;

    /** 是否存在部分节点实时查询失败 */
    @SerializedName("Partial")
    private Boolean partial;

    /** 节点中的最高有效 CNI 版本 */
    @SerializedName("HighestVersion")
    private String highestVersion;

    /** 是否所有节点实时查询成功且 CNI 版本一致。数据来源为 database 时返回 false。 */
    @SerializedName("AllNodesSynced")
    private Boolean allNodesSynced;

    public List<NodePluginInfo> getNodeInfoSet() {
        return nodeInfoSet;
    }

    public void setNodeInfoSet(List<NodePluginInfo> nodeInfoSet) {
        this.nodeInfoSet = nodeInfoSet;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public Boolean getPartial() {
        return partial;
    }

    public void setPartial(Boolean partial) {
        this.partial = partial;
    }

    public String getHighestVersion() {
        return highestVersion;
    }

    public void setHighestVersion(String highestVersion) {
        this.highestVersion = highestVersion;
    }

    public Boolean getAllNodesSynced() {
        return allNodesSynced;
    }

    public void setAllNodesSynced(Boolean allNodesSynced) {
        this.allNodesSynced = allNodesSynced;
    }

    public static class NodePluginInfo extends Response {

        /** Node节点名称 */
        @SerializedName("Node")
        private String node;

        /** 插件版本 */
        @SerializedName("Version")
        private String version;

        /** 插件工作状态，0：未知，1：正常， 2：异常, 3: 升级中 */
        @SerializedName("Status")
        private Integer status;

        /** 插件信息更新时间 */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        /** 上次插件操作结果，0：没有上次操作结果，或当前正在执行升级或查询 1：获取成功 2 获取失败 3 升级成功 4 升级失败 */
        @SerializedName("OperationResult")
        private Integer operationResult;

        /** Node节点IP */
        @SerializedName("IP")
        private String ip;

        public String getNode() {
            return node;
        }

        public void setNode(String node) {
            this.node = node;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }

        public Integer getOperationResult() {
            return operationResult;
        }

        public void setOperationResult(Integer operationResult) {
            this.operationResult = operationResult;
        }

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }
    }
}
