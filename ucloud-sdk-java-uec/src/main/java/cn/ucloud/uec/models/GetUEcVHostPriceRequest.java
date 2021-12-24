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

public class GetUEcVHostPriceRequest extends Request {

    /** 机房Id */
    @NotEmpty
    @UCloudParam("IdcId")
    private String idcId;

    /** 节点数量，默认1 */
    @UCloudParam("NodeCount")
    private Integer nodeCount;

    /** CPU核数 */
    @UCloudParam("CpuCore")
    private Integer cpuCore;

    /** 内存大小，单位GB */
    @UCloudParam("MemSize")
    private Integer memSize;

    /** 系统盘大小，单位GB */
    @UCloudParam("SysDiskSize")
    private Integer sysDiskSize;

    /** 数据盘大小，单位GB */
    @UCloudParam("DiskSize")
    private Integer diskSize;

    /** 网络带宽限速，单位Mbs */
    @UCloudParam("NetLimit")
    private Integer netLimit;

    /** 付费方式，1按时，2按月，3按年，默认2 */
    @UCloudParam("ChargeType")
    private Integer chargeType;

    /** 月数或者年数，0计费到月底， 默认0 */
    @UCloudParam("ChargeQuantity")
    private Integer chargeQuantity;

    /** 产品类型：normal（经济型），hf（标准型），g(Gpu型),默认normal */
    @UCloudParam("ProductType")
    private String productType;

    /** 外网IP的数量，默认1 */
    @UCloudParam("IpCount")
    private Integer ipCount;

    /** Gpu卡核心数。仅Gpu机型支持此字段 */
    @UCloudParam("Gpu")
    private Integer gpu;

    /** Gpu类型，枚举值["T4"],ProductType为g时必填 */
    @UCloudParam("GpuType")
    private String gpuType;

    public String getIdcId() {
        return idcId;
    }

    public void setIdcId(String idcId) {
        this.idcId = idcId;
    }

    public Integer getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    public Integer getCpuCore() {
        return cpuCore;
    }

    public void setCpuCore(Integer cpuCore) {
        this.cpuCore = cpuCore;
    }

    public Integer getMemSize() {
        return memSize;
    }

    public void setMemSize(Integer memSize) {
        this.memSize = memSize;
    }

    public Integer getSysDiskSize() {
        return sysDiskSize;
    }

    public void setSysDiskSize(Integer sysDiskSize) {
        this.sysDiskSize = sysDiskSize;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    public Integer getNetLimit() {
        return netLimit;
    }

    public void setNetLimit(Integer netLimit) {
        this.netLimit = netLimit;
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

    public Integer getIpCount() {
        return ipCount;
    }

    public void setIpCount(Integer ipCount) {
        this.ipCount = ipCount;
    }

    public Integer getGpu() {
        return gpu;
    }

    public void setGpu(Integer gpu) {
        this.gpu = gpu;
    }

    public String getGpuType() {
        return gpuType;
    }

    public void setGpuType(String gpuType) {
        this.gpuType = gpuType;
    }
}
