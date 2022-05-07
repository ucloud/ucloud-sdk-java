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
package cn.ucloud.pathx.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateGlobalSSHInstanceRequest extends Request {

    /** 项目ID,如org-xxxx。请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 填写支持SSH访问IP的地区名称，如“洛杉矶”，“新加坡”，“香港”，“东京”，“华盛顿”，“法兰克福”，“首尔”。Area和AreaCode两者必填一个 */
    @NotEmpty
    @UCloudParam("Area")
    private String area;

    /** 被SSH访问的源站IP，仅支持IPv4地址。 */
    @NotEmpty
    @UCloudParam("TargetIP")
    private String targetIP;

    /**
     * 源站服务器监听的SSH端口，可取范围[1-65535]，不能使用80，443,
     * 65123端口。如果InstanceType=Free，取值范围缩小为[22,3389],linux系统选择22，windows系统自动选3389。
     */
    @NotEmpty
    @UCloudParam("Port")
    private Integer port;

    /** AreaCode, 区域航空港国际通用代码。Area和AreaCode两者必填一个 */
    @NotEmpty
    @UCloudParam("AreaCode")
    private String areaCode;

    /** 备注信息 */
    @UCloudParam("Remark")
    private String remark;

    /** 支付方式，如按月：Month、 按年：Year、按时：Dynamic */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买数量 按月购买至月底请传0 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 枚举值：["Ultimate","Enterprise","Basic","Primary"], 分别代表旗舰版，企业版，基础版，入门版 */
    @UCloudParam("InstanceType")
    private String instanceType;

    /** Ultimate版本带宽包大小,枚举值：[0,20,40]。单位MB */
    @UCloudParam("BandwidthPackage")
    private Integer bandwidthPackage;

    /** InstanceType等于Basic时可以在["cn-bj2","cn-sh2","cn-gd"]中选择1个作为转发机房，其他付费版默认配置三个转发机房 */
    @UCloudParam("ForwardRegion")
    private String forwardRegion;

    /** 使用代金券可冲抵部分费用 */
    @UCloudParam("CouponId")
    private String couponId;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTargetIP() {
        return targetIP;
    }

    public void setTargetIP(String targetIP) {
        this.targetIP = targetIP;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public Integer getBandwidthPackage() {
        return bandwidthPackage;
    }

    public void setBandwidthPackage(Integer bandwidthPackage) {
        this.bandwidthPackage = bandwidthPackage;
    }

    public String getForwardRegion() {
        return forwardRegion;
    }

    public void setForwardRegion(String forwardRegion) {
        this.forwardRegion = forwardRegion;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
