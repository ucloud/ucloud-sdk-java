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

package cn.ucloud.ulb.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class UpdateSecurityPolicyRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @NotEmpty
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * 安全策略ID
     */
    @NotEmpty
    @UCloudParam("SecurityPolicyId")
    private String securityPolicyId;
        
    
        
    /**
     * 加密套件，TLS最低版本和加密套件必须全不为空或全为空
     */
    @UCloudParam("SSLCiphers")
    private List<String> sslCiphers;
        
    
        
    /**
     * TLS最低版本，TLS最低版本和加密套件必须全不为空或全为空
     */
    @UCloudParam("TLSVersion")
    private String tlsVersion;
        
    
        
    /**
     * 安全策略名称
     */
    @UCloudParam("SecurityPolicyName")
    private String securityPolicyName;
        
    
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
    
    public String getSecurityPolicyId() {
        return securityPolicyId;
    }

    public void setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
    }
    
    public List<String> getSSLCiphers() {
        return sslCiphers;
    }

    public void setSSLCiphers(List<String> sslCiphers) {
        this.sslCiphers = sslCiphers;
    }
    
    public String getTLSVersion() {
        return tlsVersion;
    }

    public void setTLSVersion(String tlsVersion) {
        this.tlsVersion = tlsVersion;
    }
    
    public String getSecurityPolicyName() {
        return securityPolicyName;
    }

    public void setSecurityPolicyName(String securityPolicyName) {
        this.securityPolicyName = securityPolicyName;
    }
    
}









