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

public class AddSnatRuleRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @NotEmpty
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * NAT网关的ID
     */
    @NotEmpty
    @UCloudParam("NATGWId")
    private String natgwId;
        
    
        
    /**
     * 需要出外网的私网IP地址，例如10.9.7.xx
     */
    @NotEmpty
    @UCloudParam("SourceIp")
    private String sourceIp;
        
    
        
    /**
     * EIP的ip地址,例如106.75.xx.xx
     */
    @NotEmpty
    @UCloudParam("SnatIp")
    private String snatIp;
        
    
        
    /**
     * snat规则名称，默认为“出口规则”
     */
    @UCloudParam("Name")
    private String name;
        
    
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
    
    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }
    
    public String getSnatIp() {
        return snatIp;
    }

    public void setSnatIp(String snatIp) {
        this.snatIp = snatIp;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}









