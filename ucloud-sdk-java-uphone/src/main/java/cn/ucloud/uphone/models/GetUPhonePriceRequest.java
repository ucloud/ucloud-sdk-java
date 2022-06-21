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
package cn.ucloud.uphone.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class GetUPhonePriceRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 城市Id，通过[获取城市列表](#DescribeUPhoneCities)获取 */
    @NotEmpty
    @UCloudParam("CityId")
    private String cityId;

    /** 云手机规格名称 */
    @UCloudParam("UPhoneModelName")
    private Integer uPhoneModelName;

    /** 云手机画面带宽值，画面带宽和手机强绑定关系，必须和手机数量对应。 */
    @UCloudParam("MediaBandwidth")
    private Integer mediaBandwidth;

    /** 云手机个数 */
    @UCloudParam("UPhoneCount")
    private Integer uPhoneCount;

    /** 计费模式。枚举值为： > Year，按年付费； > Month，按月付费； > Dynamic，按小时预付费; 如果不传某个枚举值，默认返回年付、月付的价格组合集。 */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长。默认: 1。 月付时，此参数传0，代表了购买至月末。 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 购买独立IP必须此参数。绑定的目的地域。参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("IpDestRegion")
    private String ipDestRegion;

    /** 购买独立IP需要此参数，其中一个ip的带宽值。 */
    @UCloudParam("INetBandwidth")
    private Integer iNetBandwidth;

    /** 购买独立IP需要此参数。需要的eip数量。 */
    @UCloudParam("IpCount")
    private Integer ipCount;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public Integer getUPhoneModelName() {
        return uPhoneModelName;
    }

    public void setUPhoneModelName(Integer uPhoneModelName) {
        this.uPhoneModelName = uPhoneModelName;
    }

    public Integer getMediaBandwidth() {
        return mediaBandwidth;
    }

    public void setMediaBandwidth(Integer mediaBandwidth) {
        this.mediaBandwidth = mediaBandwidth;
    }

    public Integer getUPhoneCount() {
        return uPhoneCount;
    }

    public void setUPhoneCount(Integer uPhoneCount) {
        this.uPhoneCount = uPhoneCount;
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

    public String getIpDestRegion() {
        return ipDestRegion;
    }

    public void setIpDestRegion(String ipDestRegion) {
        this.ipDestRegion = ipDestRegion;
    }

    public Integer getINetBandwidth() {
        return iNetBandwidth;
    }

    public void setINetBandwidth(Integer iNetBandwidth) {
        this.iNetBandwidth = iNetBandwidth;
    }

    public Integer getIpCount() {
        return ipCount;
    }

    public void setIpCount(Integer ipCount) {
        this.ipCount = ipCount;
    }
}
