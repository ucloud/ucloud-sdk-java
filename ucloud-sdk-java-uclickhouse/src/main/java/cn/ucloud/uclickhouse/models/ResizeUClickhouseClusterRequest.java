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
package cn.ucloud.uclickhouse.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class ResizeUClickhouseClusterRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 集群ID */
    @NotEmpty
    @UCloudParam("ClusterId")
    private String clusterId;

    /** 目标机型ID，可通过GetUClickhouseClusterCreateOption接口获取具体值，与TargetDataDiskSize不能同时为空 */
    @UCloudParam("TargetMachineTypeId")
    private String targetMachineTypeId;

    /** 目标磁盘大小，单位GB，只能扩容，与TargetMachineTypeId不能同时为空 */
    @UCloudParam("TargetDataDiskSize")
    private Integer targetDataDiskSize;

    /** 是否为zookeeper节点，为true时表示升级zookeeper节点规格，为false时表示升级clickhouse节点规格，默认为false */
    @UCloudParam("IsZooKeeperNode")
    private Boolean isZooKeeperNode;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public String getTargetMachineTypeId() {
        return targetMachineTypeId;
    }

    public void setTargetMachineTypeId(String targetMachineTypeId) {
        this.targetMachineTypeId = targetMachineTypeId;
    }

    public Integer getTargetDataDiskSize() {
        return targetDataDiskSize;
    }

    public void setTargetDataDiskSize(Integer targetDataDiskSize) {
        this.targetDataDiskSize = targetDataDiskSize;
    }

    public Boolean getIsZooKeeperNode() {
        return isZooKeeperNode;
    }

    public void setIsZooKeeperNode(Boolean isZooKeeperNode) {
        this.isZooKeeperNode = isZooKeeperNode;
    }
}
