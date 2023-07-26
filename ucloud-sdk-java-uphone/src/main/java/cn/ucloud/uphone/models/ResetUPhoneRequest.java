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

public class ResetUPhoneRequest extends Request {

    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * 【数组】云手机实例的资源 ID，调用方式举例：UPhoneIds.0=希望重置的云手机实例 1 的 UPhoneId，UPhoneIds.1=云手机实例 2 的 UPhoneId。
     */
    @NotEmpty
    @UCloudParam("UPhoneIds")
    private List<String> uPhoneIds;
        
    
        
    /**
     * 城市Id，通过[获取城市列表](#DescribeUPhoneCities)获取
     */
    @UCloudParam("CityId")
    private String cityId;
        
    
        
    /**
     * 枚举值。当前操作的产品类型，1、uphone：云手机场景；2、uphone-server：云手机服务器场景。默认云手机服务器场景。
     */
    @UCloudParam("ProductType")
    private String productType;
        
    
        
    /**
     * 镜像ID，默认为空。不为空则手机会以填写的镜像进行重置，为空则手机会以重置前的镜像重置
     */
    @UCloudParam("ImageId")
    private String imageId;
        
    
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public List<String> getUPhoneIds() {
        return uPhoneIds;
    }

    public void setUPhoneIds(List<String> uPhoneIds) {
        this.uPhoneIds = uPhoneIds;
    }
    
    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
    
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
    
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
}









