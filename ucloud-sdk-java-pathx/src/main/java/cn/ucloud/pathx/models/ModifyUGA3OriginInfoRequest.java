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

package cn.ucloud.pathx.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class ModifyUGA3OriginInfoRequest extends Request {

    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * 加速配置实例ID，格式uga3-xxxx。
     */
    @NotEmpty
    @UCloudParam("InstanceId")
    private String instanceId;
        
    
        
    /**
     * 加速源域名，仅支持1个域名。修改源站时 OriginIPList和OriginDomain至少填一个。OriginIPList和OriginDomain都填时 以Domain为准,如果两个都不填，不修改
     */
    @NotEmpty
    @UCloudParam("OriginDomain")
    private String originDomain;
        
    
        
    /**
     * ，加速源IP，多个IP用英文半角逗号(,)隔开。修改源站时 ，OriginIPList和OriginDomain至少填一个。OriginIPList和OriginDomain都填时 以OriginDomain为准。如果两个都不填，不修改
     */
    @NotEmpty
    @UCloudParam("OriginIPList")
    private String originIPList;
        
    
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    public String getOriginDomain() {
        return originDomain;
    }

    public void setOriginDomain(String originDomain) {
        this.originDomain = originDomain;
    }
    
    public String getOriginIPList() {
        return originIPList;
    }

    public void setOriginIPList(String originIPList) {
        this.originIPList = originIPList;
    }
    
}









