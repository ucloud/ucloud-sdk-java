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

public class DescribeUDBInstancePriceRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @NotEmpty
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;
        
    
        
    /**
     * 内存限制(MB)，单位为MB.目前支持：2000-96000
     */
    @NotEmpty
    @UCloudParam("MemoryLimit")
    private Integer memoryLimit;
        
    
        
    /**
     * 磁盘空间(GB),暂时支持20(GB) - 3000(GB), 输入不带单位
     */
    @NotEmpty
    @UCloudParam("DiskSpace")
    private Integer diskSpace;
        
    
        
    /**
     * UDB实例的DB版本字符串
     */
    @NotEmpty
    @UCloudParam("DBTypeId")
    private String dbTypeId;
        
    
        
    /**
     * 购买DB实例数量,最大数量为10台, 默认为1台
     */
    @UCloudParam("Count")
    private Integer count;
        
    
        
    /**
     * Year，按年付费； 
Month，按月付费 
Dynamic，按需付费（需开启权限) 
Trial，试用（需开启权限）
默认为月付
     */
    @UCloudParam("ChargeType")
    private String chargeType;
        
    
        
    /**
     * DB购买多少个"计费时间单位"，默认值为1。比如：买2个月，Quantity就是2。如果计费单位是“按月”，并且Quantity为0，表示“购买到月底”
     */
    @UCloudParam("Quantity")
    private Integer quantity;
        
    
        
    /**
     * SSD类型，可选值为"SATA"、“NVMe”. 默认为“SATA”
     */
    @UCloudParam("SSDType")
    private String ssdType;
        
    
        
    /**
     * 实例的部署类型。可选值为：Normal: 普通单点实例，Slave: 从库实例，HA: 高可用部署实例，默认是Normal
     */
    @UCloudParam("InstanceMode")
    private String instanceMode;
        
    
        
    /**
     * CPU个数，如果db类型为sqlserver，则为必填参数
     */
    @UCloudParam("CPU")
    private Integer cpu;
        
    
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
    
    public String getDBTypeId() {
        return dbTypeId;
    }

    public void setDBTypeId(String dbTypeId) {
        this.dbTypeId = dbTypeId;
    }
    
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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
    
    public String getSSDType() {
        return ssdType;
    }

    public void setSSDType(String ssdType) {
        this.ssdType = ssdType;
    }
    
    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }
    
    public Integer getCPU() {
        return cpu;
    }

    public void setCPU(Integer cpu) {
        this.cpu = cpu;
    }
    
}









