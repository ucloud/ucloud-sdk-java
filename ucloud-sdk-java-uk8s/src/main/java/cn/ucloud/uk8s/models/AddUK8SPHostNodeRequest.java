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

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class AddUK8SPHostNodeRequest extends Request {

    /** 可用区。参见 [可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** UK8S集群ID。 可从UK8S控制台获取。 */
    @NotEmpty
    @UCloudParam("ClusterId")
    private String clusterId;

    /** 最大创建Node节点数量，取值范围是[1,10]。 */
    @NotEmpty
    @UCloudParam("Count")
    private Integer count;

    /**
     * Node节点密码。请遵照[[api:uhost-api:specification|字段规范]]设定密码。密码需使用base64进行编码，如下：# echo -n Password1 |
     * base64
     */
    @NotEmpty
    @UCloudParam("Password")
    private String password;

    /** 计费模式。枚举值为： \\ > Year，按年付费； \\ > Month，按月付费；\\ 默认为月付 */
    @NotEmpty
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长。默认: 1。月付时，此参数传0，代表了购买至月末。 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** Node节点标签。key=value形式,多组用”,“隔开，最多5组。 如env=pro,type=game */
    @UCloudParam("Labels")
    private String labels;

    /** 默认110，生产环境建议小于等于110。 */
    @UCloudParam("MaxPods")
    private Integer maxPods;

    /** 物理机类型，默认为：db-2(基础型-SAS-V3) */
    @UCloudParam("Type")
    private String type;

    /** Raid配置，默认Raid10 支持:Raid0、Raid1、Raid5、Raid10，NoRaid */
    @UCloudParam("Raid")
    private String raid;

    /** 网络环境，可选千兆：1G ，万兆：10G， 默认1G。 */
    @UCloudParam("NIC")
    private String nic;

    /** 子网 ID。默认为集群创建时填写的子网ID，也可以填写集群同VPC内的子网ID。 */
    @UCloudParam("SubnetId")
    private String subnetId;

    /** 镜像 Id，不填时后台程序会自动选用一个可用的镜像 Id，支持用户自定义镜像，自定义镜像必须基于基础镜像制作。 */
    @UCloudParam("ImageId")
    private String imageId;

    /** 用于标示添加完节点后是否将节点临时禁用. 传入 "true" 表示禁用,传入其它或不传表示不禁用 */
    @UCloudParam("DisableSchedule")
    private Boolean disableSchedule;

    /** 用户自定义Shell脚本。与UserData的区别在于InitScript在节点初始化完毕后才执行。 */
    @UCloudParam("InitScript")
    private String initScript;

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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public Integer getMaxPods() {
        return maxPods;
    }

    public void setMaxPods(Integer maxPods) {
        this.maxPods = maxPods;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRaid() {
        return raid;
    }

    public void setRaid(String raid) {
        this.raid = raid;
    }

    public String getNIC() {
        return nic;
    }

    public void setNIC(String nic) {
        this.nic = nic;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Boolean getDisableSchedule() {
        return disableSchedule;
    }

    public void setDisableSchedule(Boolean disableSchedule) {
        this.disableSchedule = disableSchedule;
    }

    public String getInitScript() {
        return initScript;
    }

    public void setInitScript(String initScript) {
        this.initScript = initScript;
    }
}
