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
package cn.ucloud.uec.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class GetUEcPodPriceRequest extends Request {

    /** 机房id */
    @NotEmpty
    @UCloudParam("IdcId")
    private String idcId;

    /** 容器组总Cpu核心数 */
    @UCloudParam("CpuCore")
    private Double cpuCore;

    /** 容器组总内存大小（单位M） */
    @UCloudParam("MemSize")
    private Integer memSize;

    /** 支付类型（2按月，3按年，默认2） */
    @UCloudParam("ChargeType")
    private Integer chargeType;

    /** 月数或年数（默认值：1，当支付类型为按月时，默认值为0） */
    @UCloudParam("ChargeQuantity")
    private Integer chargeQuantity;

    /** 产品类型（normal：标准型，hf：高性能型，默认：normal） */
    @UCloudParam("ProductType")
    private String productType;

    /** 是否绑定外网IP（yes：是，no：否，默认：no） */
    @UCloudParam("ElasticIp")
    private String elasticIp;

    /** 绑定的带宽，默认0，当绑定外网IP时默认1（单位M） */
    @UCloudParam("Bandwidth")
    private Integer bandwidth;

    public String getIdcId() {
        return idcId;
    }

    public void setIdcId(String idcId) {
        this.idcId = idcId;
    }

    public Double getCpuCore() {
        return cpuCore;
    }

    public void setCpuCore(Double cpuCore) {
        this.cpuCore = cpuCore;
    }

    public Integer getMemSize() {
        return memSize;
    }

    public void setMemSize(Integer memSize) {
        this.memSize = memSize;
    }

    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getChargeQuantity() {
        return chargeQuantity;
    }

    public void setChargeQuantity(Integer chargeQuantity) {
        this.chargeQuantity = chargeQuantity;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getElasticIp() {
        return elasticIp;
    }

    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }
}
