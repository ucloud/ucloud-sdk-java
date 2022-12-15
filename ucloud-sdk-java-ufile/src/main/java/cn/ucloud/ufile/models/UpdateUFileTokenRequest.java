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

package cn.ucloud.ufile.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class UpdateUFileTokenRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * 令牌ID
     */
    @NotEmpty
    @UCloudParam("TokenId")
    private String tokenId;
        
    
        
    /**
     * 令牌名称
     */
    @UCloudParam("TokenName")
    private String tokenName;
        
    
        
    /**
     * 令牌允许执行的操作，[ TOKEN_ALLOW_NONE , TOKEN_ALLOW_READ , TOKEN_ALLOW_WRITE , TOKEN_ALLOW_DELETE , TOKEN_ALLOW_LIST, TOKEN_ALLOW_IOP , TOKEN_ALLOW_DP ]
     */
    @UCloudParam("AllowedOps")
    private List<String> allowedOps;
        
    
        
    /**
     * 令牌允许操作的key前缀
     */
    @UCloudParam("AllowedPrefixes")
    private List<String> allowedPrefixes;
        
    
        
    /**
     * 令牌允许操作的bucket
     */
    @UCloudParam("AllowedBuckets")
    private List<String> allowedBuckets;
        
    
        
    /**
     * 令牌的超时时间点（时间戳）;注意：过期时间不能超过 4102416000
     */
    @UCloudParam("ExpireTime")
    private Integer expireTime;
        
    
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
    
    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }
    
    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }
    
    public List<String> getAllowedOps() {
        return allowedOps;
    }

    public void setAllowedOps(List<String> allowedOps) {
        this.allowedOps = allowedOps;
    }
    
    public List<String> getAllowedPrefixes() {
        return allowedPrefixes;
    }

    public void setAllowedPrefixes(List<String> allowedPrefixes) {
        this.allowedPrefixes = allowedPrefixes;
    }
    
    public List<String> getAllowedBuckets() {
        return allowedBuckets;
    }

    public void setAllowedBuckets(List<String> allowedBuckets) {
        this.allowedBuckets = allowedBuckets;
    }
    
    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }
    
}









