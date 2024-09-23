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
package cn.ucloud.umem.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class DescribeUMemUpgradePriceRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 购买UMem大小,单位:GB */
    @NotEmpty
    @UCloudParam("Size")
    private Integer size;

    /** 空间类型:single(无热备),double(热备)(默认: double) */
    @NotEmpty
    @UCloudParam("Type")
    private String type;

    /** 需要升级的空间的SpaceId */
    @NotEmpty
    @UCloudParam("SpaceId")
    private String spaceId;

    /** 是否为性能增强型。默认为false，或者不填，true为性能增强型。 */
    @UCloudParam("HighPerformance")
    private String highPerformance;

    /** 如果是拆分按钮查询价格就填 true, 否则就填 false,默认为 false */
    @UCloudParam("IsSplit")
    private String isSplit;

    /** 进行容量调整分片的分片ID(性能增强型不需要传入) */
    @UCloudParam("BlockIds")
    private List<String> blockIds;

    /** 进行容量调整的分片的目标容量,单位 GB (性能增强型不需要传入) */
    @UCloudParam("BlockSize")
    private List<Integer> blockSize;

    /** 代理id */
    @UCloudParam("ProxyId")
    private String proxyId;

    /** 代理升级后CPU核数 */
    @UCloudParam("NewCPU")
    private Integer newCPU;

    /** 新增读写分离节点容量大小 */
    @UCloudParam("ReplicaSize")
    private Integer replicaSize;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public String getHighPerformance() {
        return highPerformance;
    }

    public void setHighPerformance(String highPerformance) {
        this.highPerformance = highPerformance;
    }

    public String getIsSplit() {
        return isSplit;
    }

    public void setIsSplit(String isSplit) {
        this.isSplit = isSplit;
    }

    public List<String> getBlockIds() {
        return blockIds;
    }

    public void setBlockIds(List<String> blockIds) {
        this.blockIds = blockIds;
    }

    public List<Integer> getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(List<Integer> blockSize) {
        this.blockSize = blockSize;
    }

    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    public Integer getNewCPU() {
        return newCPU;
    }

    public void setNewCPU(Integer newCPU) {
        this.newCPU = newCPU;
    }

    public Integer getReplicaSize() {
        return replicaSize;
    }

    public void setReplicaSize(Integer replicaSize) {
        this.replicaSize = replicaSize;
    }
}
