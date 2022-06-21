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

public class CreateUPhoneRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 云手机实例名称，默认：UPhone。如果同时创建多个，则增加数字后缀，如UPhone-1 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** 云手机规格名称，不超过64个字节。可通过[查询云手机规格列表]()查询支持的云手机规格。 */
    @NotEmpty
    @UCloudParam("UPhoneModelName")
    private String uPhoneModelName;

    /** 云手机画面带宽，默认2M */
    @NotEmpty
    @UCloudParam("MediaBandwidth")
    private Integer mediaBandwidth;

    /** 云手机镜像ID，不超过32个字节。可通过[查询手机镜像]()查询云手机规格对应的镜像ID。 */
    @NotEmpty
    @UCloudParam("ImageId")
    private String imageId;

    /** 城市Id，通过[获取城市列表](#DescribeUPhoneCities)获取 */
    @NotEmpty
    @UCloudParam("CityId")
    private String cityId;

    /** 创建云手机的个数 */
    @NotEmpty
    @UCloudParam("UPhoneCount")
    private Integer uPhoneCount;

    /** 计费模式。枚举值为： > 年 Year，按年付费； > Month，按月付费； > Dynamic，按小时预付费; 默认为月付 */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长。默认值: 1。月付时，此参数传0，代表购买至月末。 */
    @UCloudParam("Quantity")
    private String quantity;

    /** 购买独立IP必须有此参数。绑定的目的地域。参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("IpDestRegion")
    private String ipDestRegion;

    /** 业务组。默认：Default（Default即为未分组）。请遵照[[api:uhost-api:specification|字段规范]]设定业务组。 */
    @UCloudParam("Tag")
    private String tag;

    /** 绑定独立IP */
    @UCloudParam("BindIp")
    private Boolean bindIp;

    /** 独立IP带宽 */
    @UCloudParam("Bandwidth")
    private Integer bandwidth;

    /** 独立IP参数。需要独立IP的比例。eg: [4:1]->4， [3:1]->3。 */
    @UCloudParam("IpProportion")
    private Integer ipProportion;

    /** 云手机代金券ID。请通过DescribeCoupon接口查询，或登录用户中心查看。注：代金券对带宽不适用，仅适用于云手机计费 */
    @UCloudParam("CouponId")
    private String couponId;

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

    public String getUPhoneModelName() {
        return uPhoneModelName;
    }

    public void setUPhoneModelName(String uPhoneModelName) {
        this.uPhoneModelName = uPhoneModelName;
    }

    public Integer getMediaBandwidth() {
        return mediaBandwidth;
    }

    public void setMediaBandwidth(Integer mediaBandwidth) {
        this.mediaBandwidth = mediaBandwidth;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getIpDestRegion() {
        return ipDestRegion;
    }

    public void setIpDestRegion(String ipDestRegion) {
        this.ipDestRegion = ipDestRegion;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Boolean getBindIp() {
        return bindIp;
    }

    public void setBindIp(Boolean bindIp) {
        this.bindIp = bindIp;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Integer getIpProportion() {
        return ipProportion;
    }

    public void setIpProportion(Integer ipProportion) {
        this.ipProportion = ipProportion;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}