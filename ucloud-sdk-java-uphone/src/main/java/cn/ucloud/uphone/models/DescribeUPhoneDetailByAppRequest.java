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

package cn.ucloud.uphone.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class DescribeUPhoneDetailByAppRequest extends Request {

    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * 应用的唯一标识ID
     */
    @NotEmpty
    @UCloudParam("AppId")
    private String appId;
        
    
        
    /**
     * 城市Id，通过[获取城市列表](#DescribeUPhoneCities)获取
     */
    @UCloudParam("CityId")
    private String cityId;
        
    
        
    /**
     * 列表起始位置偏移量，默认为0
     */
    @UCloudParam("Offset")
    private Integer offset;
        
    
        
    /**
     * 返回数据长度，默认为20，最大100
     */
    @UCloudParam("Limit")
    private Integer limit;
        
    
        
    /**
     * 枚举值。当前操作的产品类型，1、uphone：云手机场景；2、uphone-server：云手机服务器场景。默认云手机服务器场景。
     */
    @UCloudParam("ProductType")
    private String productType;
        
    
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
    
    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
    
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
    
}









