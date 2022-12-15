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

public class CreateUDBRouteInstanceRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UCloudParam("Zone")
    private String zone;
        
    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * DB类型id，mongodb按版本细分有1：mongodb-2.4，2：mongodb-2.6,3：mongodb-3.0，4：mongodb-3.2
     */
    @NotEmpty
    @UCloudParam("DBTypeId")
    private String dbTypeId;
        
    
        
    /**
     * 实例名称，至少6位
     */
    @NotEmpty
    @UCloudParam("Name")
    private String name;
        
    
        
    /**
     * 端口号，mongodb默认27017
     */
    @NotEmpty
    @UCloudParam("Port")
    private Integer port;
        
    
        
    /**
     * DB实例使用的配置参数组id
     */
    @NotEmpty
    @UCloudParam("ParamGroupId")
    private Integer paramGroupId;
        
    
        
    /**
     * 内存限制(MB)，目前支持以下几档 600M/1500M/3000M /6000M/15000M/30000M
     */
    @NotEmpty
    @UCloudParam("MemoryLimit")
    private Integer memoryLimit;
        
    
        
    /**
     * 磁盘空间(GB), 暂时支持20G - 500G
     */
    @NotEmpty
    @UCloudParam("DiskSpace")
    private Integer diskSpace;
        
    
        
    /**
     * 配置服务器的dbid，允许一个或者三个。
     */
    @NotEmpty
    @UCloudParam("ConfigsvrId")
    private List<String> configsvrId;
        
    
        
    /**
     * Year， Month， Dynamic，Trial，默认: Month
     */
    @UCloudParam("ChargeType")
    private String chargeType;
        
    
        
    /**
     * 购买时长，默认值1
     */
    @UCloudParam("Quantity")
    private Integer quantity;
        
    
        
    /**
     * 是否使用SSD，默认为ture
     */
    @UCloudParam("UseSSD")
    private Boolean useSSD;
        
    
        
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
    
    public String getDBTypeId() {
        return dbTypeId;
    }

    public void setDBTypeId(String dbTypeId) {
        this.dbTypeId = dbTypeId;
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
    
    public Integer getParamGroupId() {
        return paramGroupId;
    }

    public void setParamGroupId(Integer paramGroupId) {
        this.paramGroupId = paramGroupId;
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
    
    public List<String> getConfigsvrId() {
        return configsvrId;
    }

    public void setConfigsvrId(List<String> configsvrId) {
        this.configsvrId = configsvrId;
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
    
    public Boolean getUseSSD() {
        return useSSD;
    }

    public void setUseSSD(Boolean useSSD) {
        this.useSSD = useSSD;
    }
    
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
    
}









