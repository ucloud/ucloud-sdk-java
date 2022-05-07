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

import java.util.List;

public class CreateUEcVHostRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 机房id */
    @NotEmpty
    @UCloudParam("IdcId")
    private String idcId;

    /** cpu核心数 */
    @NotEmpty
    @UCloudParam("CpuCore")
    private Integer cpuCore;

    /** 内存大小，单位GB */
    @NotEmpty
    @UCloudParam("MemSize")
    private Integer memSize;

    /** 数据盘大小，单位GB */
    @NotEmpty
    @UCloudParam("DiskSize")
    private Integer diskSize;

    /** 镜像ID */
    @NotEmpty
    @UCloudParam("ImageId")
    private String imageId;

    /** 节点带宽限制，单位Mbs */
    @NotEmpty
    @UCloudParam("NetLimit")
    private Integer netLimit;

    /** 节点名称 */
    @UCloudParam("NodeName")
    private String nodeName;

    /** 系统盘大小，单位GB， 默认20GB */
    @UCloudParam("SysDiskSize")
    private Integer sysDiskSize;

    /** 账户名，默认root */
    @UCloudParam("AccountName")
    private String accountName;

    /** 密码 */
    @UCloudParam("PassWord")
    private String passWord;

    /** 创建节点数量，默认1 */
    @UCloudParam("NodeCount")
    private Integer nodeCount;

    /** 付费方式，1按时，2按月，3按年，默认2 */
    @UCloudParam("ChargeType")
    private Integer chargeType;

    /** 月数或者年数，0计费到月底， 默认0 */
    @UCloudParam("ChargeQuantity")
    private Integer chargeQuantity;

    /** 子网ID */
    @UCloudParam("SubnetId")
    private String subnetId;

    /** 产品类型：normal（经济型），hf（标准型）,g(Gpu型) */
    @UCloudParam("ProductType")
    private String productType;

    /** 外网防护墙规则组，默认 */
    @UCloudParam("FirewallId")
    private String firewallId;

    /** 运营商（1-电信，2-联通，4移动） */
    @UCloudParam("Isp")
    private List<Integer> isp;

    /** 是否需要外网ip（no-否） */
    @UCloudParam("IsNeedOuterIp")
    private String isNeedOuterIp;

    /** Gpu卡核心数。仅Gpu机型支持此字段 */
    @UCloudParam("Gpu")
    private Integer gpu;

    /** Gpu类型，枚举值["T4S"],ProductType为G时必填 */
    @UCloudParam("GpuType")
    private String gpuType;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getIdcId() {
        return idcId;
    }

    public void setIdcId(String idcId) {
        this.idcId = idcId;
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

    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Integer getNetLimit() {
        return netLimit;
    }

    public void setNetLimit(Integer netLimit) {
        this.netLimit = netLimit;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Integer getSysDiskSize() {
        return sysDiskSize;
    }

    public void setSysDiskSize(Integer sysDiskSize) {
        this.sysDiskSize = sysDiskSize;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
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

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getFirewallId() {
        return firewallId;
    }

    public void setFirewallId(String firewallId) {
        this.firewallId = firewallId;
    }

    public List<Integer> getIsp() {
        return isp;
    }

    public void setIsp(List<Integer> isp) {
        this.isp = isp;
    }

    public String getIsNeedOuterIp() {
        return isNeedOuterIp;
    }

    public void setIsNeedOuterIp(String isNeedOuterIp) {
        this.isNeedOuterIp = isNeedOuterIp;
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
