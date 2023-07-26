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

package cn.ucloud.ucompshare.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class CreateULHostInstanceRequest extends Request {

    
        
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
     * 镜像ID。 请通过 [DescribeImage](describe_image.html)获取
     */
    @NotEmpty
    @UCloudParam("ImageId")
    private String imageId;
        
    
        
    /**
     * 套餐ID。如："ulh.c1m1s40b30t800"
     */
    @NotEmpty
    @UCloudParam("BundleId")
    private String bundleId;
        
    
        
    /**
     * ULHost密码。请遵照[[api:uhost-api:specification|字段规范]]设定密码。密码需使用base64进行编码，举例如下：# echo -n Password1 | base64
     */
    @NotEmpty
    @UCloudParam("Password")
    private String password;
        
    
        
    /**
     * 轻量应用主机名称。默认：套餐ID。请遵照[[api:uhost-api:specification|字段规范]]设定实例名称。
     */
    @UCloudParam("Name")
    private String name;
        
    
        
    /**
     * 计费模式。枚举值： \\ > Year，按年付费； \\ > Month，按月付费；默认：Month
     */
    @UCloudParam("ChargeType")
    private String chargeType;
        
    
        
    /**
     * 购买时长。默认：1。不支持购买到月末
     */
    @UCloudParam("Quantity")
    private Integer quantity;
        
    
        
    
        
    
        
    /**
     * 主机代金券ID。请通过DescribeCoupon接口查询，或登录用户中心查看
     */
    @UCloudParam("CouponId")
    private String couponId;
        
    
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
    
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }
    
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    
    
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
    
}









