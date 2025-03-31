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
package cn.ucloud.nlb.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateNetworkLoadBalancerRequest extends Request {

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

    /** 载均衡实例所属的VPC资源ID */
    @NotEmpty
    @UCloudParam("VPCId")
    private String vpcId;

    /** 负载均衡实例所属的子网资源ID */
    @NotEmpty
    @UCloudParam("SubnetId")
    private String subnetId;

    /** API 版本，限定取值 "v1.0"/"v2.0"，默认值："v2.0" */
    @UCloudParam("ApiVersion")
    private String apiVersion;

    /** 负载均衡实例所属的业务组ID */
    @UCloudParam("Tag")
    private String tag;

    /** 负载均衡实例的名称 限定字符长度：[1-255] 限定特殊字符，仅支持：-_. 默认值：nlb */
    @UCloudParam("Name")
    private String name;

    /** 负载均衡实例的备注信息 限定字符长度：[0-255] */
    @UCloudParam("Remark")
    private String remark;

    /** 负载均衡实例的IP协议，限定取值："IPv4"/"IPv6"/"DualStack"，默认值："IPv4" */
    @UCloudParam("IPVersion")
    private String ipVersion;

    /** 付费模式，限定取值："Dynamic"/"Month"/"Year" */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买的时长，ChargeType = "Month"，Quantity = 0 代表购买到月底，其余情况必须赋值 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 代金券code */
    @UCloudParam("CouponId")
    private String couponId;

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

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIPVersion() {
        return ipVersion;
    }

    public void setIPVersion(String ipVersion) {
        this.ipVersion = ipVersion;
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

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
