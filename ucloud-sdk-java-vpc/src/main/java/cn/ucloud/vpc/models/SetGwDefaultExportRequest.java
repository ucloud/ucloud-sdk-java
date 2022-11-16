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

package cn.ucloud.vpc.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class SetGwDefaultExportRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 项目Id。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * NAT网关Id
     */
    @NotEmpty
    @UCloudParam("NATGWId")
    private String natgwId;
        
    
        
    /**
     * NAT网关绑定的EIP。ExportIp和ExportEipId必填一个
     */
    @UCloudParam("ExportIp")
    private String exportIp;
        
    
        
    /**
     * NAT网关绑定的EIP Id。ExportIp和ExportEipId必填一个
     */
    @UCloudParam("ExportEipId")
    private String exportEipId;
        
    
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public String getNATGWId() {
        return natgwId;
    }

    public void setNATGWId(String natgwId) {
        this.natgwId = natgwId;
    }
    
    public String getExportIp() {
        return exportIp;
    }

    public void setExportIp(String exportIp) {
        this.exportIp = exportIp;
    }
    
    public String getExportEipId() {
        return exportEipId;
    }

    public void setExportEipId(String exportEipId) {
        this.exportEipId = exportEipId;
    }
    
}









