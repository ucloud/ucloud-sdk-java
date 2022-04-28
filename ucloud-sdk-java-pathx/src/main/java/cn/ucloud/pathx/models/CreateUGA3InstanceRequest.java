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

public class CreateUGA3InstanceRequest extends Request {

    /** 项目ID,如org-xxxx。请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 实例的共享带宽大小，单位Mbps */
    @NotEmpty
    @UCloudParam("Bandwidth")
    private Integer bandwidth;

    /** 加速配置实例名称,默认PathX */
    @UCloudParam("Name")
    private String name;

    /**
     * 非必填,如果不填，会根据Domain 和IPList 去选一个最近的源站区域 BKK表示AreaCode;曼谷表示Area
     * ["BKK":"曼谷","DXB":"迪拜","FRA":"法兰克福","SGN":"胡志明市","HKG":"香港",CGK":"雅加达","LOS":"拉各斯","LHR":"伦敦","LAX":"洛杉矶","MNL":"马尼拉","DME":"莫斯科","BOM":"孟买","MSP":"圣保罗","ICN":"首尔","PVG":"上海","SIN":"新加坡","NRT":"东京","IAD":"华盛顿","TPE":
     * "台北"]
     */
    @UCloudParam("AreaCode")
    private String areaCode;

    /** 备注项 */
    @UCloudParam("Remark")
    private String remark;

    /** 支付方式，如按月、按年、按时 [Year,Month,Dynamic] */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买周期 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /**
     * 加速大区,默认Global,[ "Global":"全球", "AP":"亚太", "EU":"欧洲", "ME":"中东", "OA":"大洋洲", "AF":"非洲",
     * "NA":"北美洲", "SA":"南美洲" ]
     */
    @UCloudParam("AccelerationArea")
    private String accelerationArea;

    /** 加速源IP，多个IP用英文半角逗号(,)隔开；IPList和Domain二选一必填 */
    @UCloudParam("OriginIPList")
    private String originIPList;

    /** 加速源域名，IPList和Domain二选一必填 */
    @UCloudParam("OriginDomain")
    private String originDomain;

    /** 使用代金券可冲抵部分费用，仅全地域可用的代金券 */
    @UCloudParam("CouponId")
    private String couponId;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAccelerationArea() {
        return accelerationArea;
    }

    public void setAccelerationArea(String accelerationArea) {
        this.accelerationArea = accelerationArea;
    }

    public String getOriginIPList() {
        return originIPList;
    }

    public void setOriginIPList(String originIPList) {
        this.originIPList = originIPList;
    }

    public String getOriginDomain() {
        return originDomain;
    }

    public void setOriginDomain(String originDomain) {
        this.originDomain = originDomain;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
