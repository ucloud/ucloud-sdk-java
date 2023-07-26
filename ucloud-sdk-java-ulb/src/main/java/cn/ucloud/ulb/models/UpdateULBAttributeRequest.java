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

public class UpdateULBAttributeRequest extends Request {

    
        
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
     * ULB资源ID
     */
    @NotEmpty
    @UCloudParam("ULBId")
    private String ulbId;
        
    
        
    /**
     * 名字，不传则默认不修改
     */
    @UCloudParam("Name")
    private String name;
        
    
        
    /**
     * 业务，不传则默认不修改
     */
    @UCloudParam("Tag")
    private String tag;
        
    
        
    /**
     * 备注，不传则默认不修改
     */
    @UCloudParam("Remark")
    private String remark;
        
    
        
    /**
     * 日志开关，1代表开启日志，0代表关闭日志，传1时必须同时传BucketName，TokenName与TokenId二选一
     */
    @UCloudParam("EnableLog")
    private Integer enableLog;
        
    
        
    /**
     * 设置用于存储ulb日志的bucket
     */
    @UCloudParam("BucketName")
    private String bucketName;
        
    
        
    /**
     * 用于指定上传到bucket所需的token，与TokenId选填其一即可
     */
    @UCloudParam("TokenName")
    private String tokenName;
        
    
        
    /**
     * 用于指定上传到bucket所需的token，与TokenName选填其一即可
     */
    @UCloudParam("TokenId")
    private String tokenId;
        
    
        
    /**
     * 是否开启WAF。枚举类型：Yes，No，默认值为No
     */
    @UCloudParam("IsWAFOn")
    private String isWAFOn;
        
    
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
    
    public String getULBId() {
        return ulbId;
    }

    public void setULBId(String ulbId) {
        this.ulbId = ulbId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public Integer getEnableLog() {
        return enableLog;
    }

    public void setEnableLog(Integer enableLog) {
        this.enableLog = enableLog;
    }
    
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
    
    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }
    
    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }
    
    public String getIsWAFOn() {
        return isWAFOn;
    }

    public void setIsWAFOn(String isWAFOn) {
        this.isWAFOn = isWAFOn;
    }
    
}









