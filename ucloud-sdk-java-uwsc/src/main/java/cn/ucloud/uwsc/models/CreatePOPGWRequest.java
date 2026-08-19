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
package cn.ucloud.uwsc.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreatePOPGWRequest extends Request {

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

    /** */
    @UCloudParam("BWConf")
    private BWConf bwConf;

    /** 资源名称 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** UWAN 网关的购买时长，默认为 0，代表有效期至月底。(保持和BWConf.Quantity 相同) */
    @NotEmpty
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 资源备注信息 */
    @UCloudParam("Remark")
    private String remark;

    /** 付费方式, 枚举值为: - Year：按年付费; - Month: 按月付费； (月付非必填，默认为 0；年付必填。) */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 入网类型，仅支持“IPSec” */
    @UCloudParam("Type")
    private String type;

    /** 代金券ID, 默认不使用 */
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

    public BWConf getBWConf() {
        return bwConf;
    }

    public void setBWConf(BWConf bwConf) {
        this.bwConf = bwConf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public static class BWConf extends Request {

        /** 带宽的名称 */
        @NotEmpty
        @UCloudParam("Name")
        private String name;

        /** 带宽的计费方式，取值： - fixed-bw：固定带宽计费； - traffic：流量计费。 */
        @NotEmpty
        @UCloudParam("PayMode")
        private String payMode;

        /** UWAN 网关的带宽规格。取值：1-100。单位：Mbps。 */
        @NotEmpty
        @UCloudParam("BwMax")
        private Double bwMax;

        /** 付费方式，枚举值： - Month：月付； - Year：年付； - Postpadi：后付费（仅支持流量计费方式） */
        @NotEmpty
        @UCloudParam("ChargeType")
        private String chargeType;

        /** 带宽购买时长，默认为 0，代表有效期至月底 */
        @UCloudParam("Quantity")
        private Double quantity;

        /** 产品 ID */
        @UCloudParam("ProductId")
        private Integer productId;

        /** 优惠券 ID */
        @UCloudParam("CouponId")
        private String couponId;

        /** 带宽包备注信息 */
        @UCloudParam("Remark")
        private String remark;

        /** 带宽类型，默认为空字符串 */
        @UCloudParam("BwType")
        private String bwType;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPayMode() {
            return payMode;
        }

        public void setPayMode(String payMode) {
            this.payMode = payMode;
        }

        public Double getBwMax() {
            return bwMax;
        }

        public void setBwMax(Double bwMax) {
            this.bwMax = bwMax;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Double getQuantity() {
            return quantity;
        }

        public void setQuantity(Double quantity) {
            this.quantity = quantity;
        }

        public Integer getProductId() {
            return productId;
        }

        public void setProductId(Integer productId) {
            this.productId = productId;
        }

        public String getCouponId() {
            return couponId;
        }

        public void setCouponId(String couponId) {
            this.couponId = couponId;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getBwType() {
            return bwType;
        }

        public void setBwType(String bwType) {
            this.bwType = bwType;
        }
    }
}
