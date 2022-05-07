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
package cn.ucloud.cube.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateCubePodRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** VPCId */
    @NotEmpty
    @UCloudParam("VPCId")
    private String vpcId;

    /** 子网Id */
    @NotEmpty
    @UCloudParam("SubnetId")
    private String subnetId;

    /** base64编码的Pod的yaml。大小不超过16KB */
    @NotEmpty
    @UCloudParam("Pod")
    private String pod;

    /** pod所在组 */
    @UCloudParam("Group")
    private String group;

    /** pod的名字 */
    @UCloudParam("Name")
    private String name;

    /** 业务组。默认：Default（Default即为未分组） */
    @UCloudParam("Tag")
    private String tag;

    /** Cpu平台（V6：Intel、A2：AMD、Auto），默认Auto。支持的地域（北京2B、北京2E、上海2A、广东、香港 、东京）目前北京2E仅有A2，其余地域仅有V6 */
    @UCloudParam("CpuPlatform")
    private String cpuPlatform;

    /** 计费模式。枚举值为： \\ > Year，按年付费； \\ > Month，按月付费；\\ > Postpay， \\ 后付费；默认为后付费 */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长。默认:值 1。 月付时，此参数传0，代表购买至月末。 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** base64编码的kubeconfig。大小不超过16KB */
    @UCloudParam("KubeConfig")
    private String kubeConfig;

    /** 代金券ID。请通过DescribeCoupon接口查询，或登录用户中心查看 */
    @UCloudParam("CouponId")
    private String couponId;

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

    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getCpuPlatform() {
        return cpuPlatform;
    }

    public void setCpuPlatform(String cpuPlatform) {
        this.cpuPlatform = cpuPlatform;
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

    public String getKubeConfig() {
        return kubeConfig;
    }

    public void setKubeConfig(String kubeConfig) {
        this.kubeConfig = kubeConfig;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
