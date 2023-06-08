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

public class CreateUDBReplicationInstanceRequest extends Request {

    
        
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
     * primary节点的DBId,该值可以通过DescribeUDBInstance获取
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
     * 端口号，默认27017，取值范围3306至65535。
     */
    @UCloudParam("Port")
    private Integer port;
        
    
        
    /**
     * 是否是仲裁节点，默认false，仲裁节点按最小机型创建
     */
    @UCloudParam("IsArbiter")
    private Boolean isArbiter;
        
    
        
    /**
     * 是否使用SSD，默认 为 true
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
    
    public Boolean getIsArbiter() {
        return isArbiter;
    }

    public void setIsArbiter(Boolean isArbiter) {
        this.isArbiter = isArbiter;
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









