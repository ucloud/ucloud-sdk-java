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

package cn.ucloud.sts.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class AssumeRoleResponse extends Response {

    
        
    /**
     * 访问凭证。
     */
    @SerializedName("Credentials")
    private Credentials credentials;
        
    
    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }
    
        public static class Credentials extends Response {
            
        
    /**
     * 安全令牌。
     */
    @SerializedName("SecurityToken")
    private String securityToken;
        
    
        
    /**
     * 密钥ID。
     */
    @SerializedName("AccessKeyId")
    private String accessKeyId;
        
    
        
    /**
     * 密钥Secret。
     */
    @SerializedName("AccessKeySecret")
    private String accessKeySecret;
        
    
        
    /**
     * Token到期失效时间（UTC时间）。
     */
    @SerializedName("Expiration")
    private String expiration;
        
    
    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }
    
    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }
    
    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }
    
    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }
    
        }
}









