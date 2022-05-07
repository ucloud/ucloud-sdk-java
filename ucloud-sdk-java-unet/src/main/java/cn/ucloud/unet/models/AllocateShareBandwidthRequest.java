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
package cn.ucloud.unet.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class AllocateShareBandwidthRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 共享带宽名字 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** 付费方式:Year 按年,Month 按月,Dynamic 按时; */
    @NotEmpty
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 共享带宽值 */
    @NotEmpty
    @UCloudParam("ShareBandwidth")
    private Integer shareBandwidth;

    /** 购买时长 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 共享带宽类型，IPv4或者IPv6，不传默认IPv4 */
    @UCloudParam("IPVersion")
    private String ipVersion;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getShareBandwidth() {
        return shareBandwidth;
    }

    public void setShareBandwidth(Integer shareBandwidth) {
        this.shareBandwidth = shareBandwidth;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getIPVersion() {
        return ipVersion;
    }

    public void setIPVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }
}
