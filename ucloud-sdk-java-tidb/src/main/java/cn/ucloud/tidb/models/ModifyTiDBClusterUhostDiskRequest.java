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
package cn.ucloud.tidb.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class ModifyTiDBClusterUhostDiskRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 实例ID */
    @NotEmpty
    @UCloudParam("Id")
    private String id;

    /** 扩缩类型，枚举值为：SCALEOUT，扩容；SCALEIN，缩容； */
    @NotEmpty
    @UCloudParam("ScaleType")
    private String scaleType;

    /** */
    @UCloudParam("NodeConfig")
    private NodeConfig nodeConfig;

    /** 开始时间 */
    @UCloudParam("StartTime")
    private Integer startTime;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScaleType() {
        return scaleType;
    }

    public void setScaleType(String scaleType) {
        this.scaleType = scaleType;
    }

    public NodeConfig getNodeConfig() {
        return nodeConfig;
    }

    public void setNodeConfig(NodeConfig nodeConfig) {
        this.nodeConfig = nodeConfig;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public static class NodeConfig extends Request {

        /** 节点角色 */
        @NotEmpty
        @UCloudParam("ServerType")
        private String serverType;

        /** 磁盘容量 */
        @NotEmpty
        @UCloudParam("DiskSize")
        private Integer diskSize;

        public String getServerType() {
            return serverType;
        }

        public void setServerType(String serverType) {
            this.serverType = serverType;
        }

        public Integer getDiskSize() {
            return diskSize;
        }

        public void setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
        }
    }
}
