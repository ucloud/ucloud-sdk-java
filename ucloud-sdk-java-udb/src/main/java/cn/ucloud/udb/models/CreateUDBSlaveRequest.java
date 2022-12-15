/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.ucloud.udb.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class CreateUDBSlaveRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @NotEmpty
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @UCloudParam("Zone")
    private String zone;
        
    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * master实例的DBId,该值可以通过DescribeUDBInstance获取
     */
    @NotEmpty
    @UCloudParam("SrcId")
    private String srcId;
        
    
        
    /**
     * 实例名称，至少6位
     */
    @NotEmpty
    @UCloudParam("Name")
    private String name;
        
    
        
    /**
     * 端口号
     */
    @UCloudParam("Port")
    private Integer port;
        
    
        
    /**
     * 仅对主为SSD型实例有效。 可选值"SATA","NVMe"
     */
    @UCloudParam("SSDType")
    private String ssdType;
        
    
        
    /**
     * 是否锁主库，默认为true
     */
    @UCloudParam("IsLock")
    private Boolean isLock;
        
    
        
    /**
     * 内存限制(MB)，目前支持以下几档 2000M/4000M/ 6000M/8000M/12000M/16000M/ 24000M/32000M/48000M/ 64000M/96000M/128000M/192000M/256000M/320000M
     */
    @UCloudParam("MemoryLimit")
    private Integer memoryLimit;
        
    
        
    /**
     * 磁盘空间(GB), 暂时支持20G - 3000G（API支持，前端暂时只开放内存定制）
     */
    @UCloudParam("DiskSpace")
    private Integer diskSpace;
        
    
        
    /**
     * 子网ID（如果不传用默认子网）
     */
    @UCloudParam("SubnetId")
    private String subnetId;
        
    
        
    /**
     * VPCID（如果不传用默认的VPC）
     */
    @UCloudParam("VPCId")
    private String vpcId;
        
    
        
    /**
     * Year， Month， Dynamic，Trial，默认和主库保持一致
     */
    @UCloudParam("ChargeType")
    private String chargeType;
        
    
        
    /**
     * 购买时长，默认默认和主库保持一致
     */
    @UCloudParam("Quantity")
    private Integer quantity;
        
    
        
    /**
     * DB实例使用的配置参数组id，默认和主库保持一致
     */
    @UCloudParam("ParamGroupId")
    private Integer paramGroupId;
        
    
        
    /**
     * 使用物理方式创建从库，目前仅限创建快杰从库，默认为false
     */
    @UCloudParam("IsCreatePhysically")
    private Boolean isCreatePhysically;
        
    
        
    /**
     * 设置从库的延时复制时长（单位秒）
     */
    @UCloudParam("DelaySeconds")
    private Integer delaySeconds;
        
    
        
    /**
     * 使用的代金券id
     */
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
    
    public String getSrcId() {
        return srcId;
    }

    public void setSrcId(String srcId) {
        this.srcId = srcId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
    
    public String getSSDType() {
        return ssdType;
    }

    public void setSSDType(String ssdType) {
        this.ssdType = ssdType;
    }
    
    public Boolean getIsLock() {
        return isLock;
    }

    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }
    
    public Integer getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(Integer memoryLimit) {
        this.memoryLimit = memoryLimit;
    }
    
    public Integer getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
    }
    
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
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
    
    public Integer getParamGroupId() {
        return paramGroupId;
    }

    public void setParamGroupId(Integer paramGroupId) {
        this.paramGroupId = paramGroupId;
    }
    
    public Boolean getIsCreatePhysically() {
        return isCreatePhysically;
    }

    public void setIsCreatePhysically(Boolean isCreatePhysically) {
        this.isCreatePhysically = isCreatePhysically;
    }
    
    public Integer getDelaySeconds() {
        return delaySeconds;
    }

    public void setDelaySeconds(Integer delaySeconds) {
        this.delaySeconds = delaySeconds;
    }
    
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
    
}









