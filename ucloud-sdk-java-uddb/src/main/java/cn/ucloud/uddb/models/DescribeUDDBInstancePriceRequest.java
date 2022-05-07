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
package cn.ucloud.uddb.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class DescribeUDDBInstancePriceRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /**
     * UDDB路由节点的版本。分为三种： Trival(免费版)： 2中间件节点； QPS：1.5W FeelFree(标准版)：
     * 固定为4中间件节点，后续将根据业务请求量自动扩展，最多扩展到12个节点，QPS为3w - 10w； EnjoyAlone(物理机版)：专享物理机，节点数让客户可选
     */
    @NotEmpty
    @UCloudParam("RouterVersion")
    private String routerVersion;

    /** 其他版本：该参数可不填；专享版：物理机节点个数。一台物理机有2个节点 */
    @NotEmpty
    @UCloudParam("RouterNodeNum")
    private Integer routerNodeNum;

    /** 初始的数据节点个数 取值必须>0. */
    @NotEmpty
    @UCloudParam("DataNodeCount")
    private Integer dataNodeCount;

    /** 新的数据节点的内存配置, 单位：MB 具体数值参考UDB的内存取值. */
    @NotEmpty
    @UCloudParam("DataNodeMemory")
    private String dataNodeMemory;

    /** 新的数据节点的磁盘大小配置. 单位: GB 具体数值参考UDB的磁盘大小取值. */
    @NotEmpty
    @UCloudParam("DataNodeDiskSpace")
    private Integer dataNodeDiskSpace;

    /** 付费类型，可选值如下: Year: 按年付费 Month: 按月付费 Dynamic: 按需付费(单位: 小时) Trial: 免费试用 默认值为: Dynamic */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长，默认值1 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 每个数据节点的只读实例个数, 取值必须>=0. 默认取值为0. */
    @UCloudParam("DataNodeSlaveCount")
    private Integer dataNodeSlaveCount;

    /** 存储节点的高可用模式， 分为高可用UDB（HA）和普通UDB（Normal），如果不填， 则默认为HA */
    @UCloudParam("InstanceMode")
    private String instanceMode;

    /** 存储节点和只读实例的磁盘类型。分为：SSD磁盘（SATA_SSD）或普通磁盘(Normal)。 如果不填，则默认为SATA_SSD */
    @UCloudParam("InstanceType")
    private String instanceType;

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

    public String getRouterVersion() {
        return routerVersion;
    }

    public void setRouterVersion(String routerVersion) {
        this.routerVersion = routerVersion;
    }

    public Integer getRouterNodeNum() {
        return routerNodeNum;
    }

    public void setRouterNodeNum(Integer routerNodeNum) {
        this.routerNodeNum = routerNodeNum;
    }

    public Integer getDataNodeCount() {
        return dataNodeCount;
    }

    public void setDataNodeCount(Integer dataNodeCount) {
        this.dataNodeCount = dataNodeCount;
    }

    public String getDataNodeMemory() {
        return dataNodeMemory;
    }

    public void setDataNodeMemory(String dataNodeMemory) {
        this.dataNodeMemory = dataNodeMemory;
    }

    public Integer getDataNodeDiskSpace() {
        return dataNodeDiskSpace;
    }

    public void setDataNodeDiskSpace(Integer dataNodeDiskSpace) {
        this.dataNodeDiskSpace = dataNodeDiskSpace;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getDataNodeSlaveCount() {
        return dataNodeSlaveCount;
    }

    public void setDataNodeSlaveCount(Integer dataNodeSlaveCount) {
        this.dataNodeSlaveCount = dataNodeSlaveCount;
    }

    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
}
