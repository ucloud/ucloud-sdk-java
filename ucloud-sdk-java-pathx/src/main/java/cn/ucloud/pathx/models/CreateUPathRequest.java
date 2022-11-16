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

public class CreateUPathRequest extends Request {

    
        
    /**
     * 项目ID,如org-xxxx。请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * 名字，便于记忆区分
     */
    @NotEmpty
    @UCloudParam("Name")
    private String name;
        
    
        
    /**
     * 选择的线路，由DescribePathXLineConfig接口提供
     */
    @NotEmpty
    @UCloudParam("LineId")
    private String lineId;
        
    
        
    /**
     * 当PostPaid为false时，该值为预付费固定带宽；当PostPaid为true时，该值为后付费保底带宽，保底带宽越大可用的上限带宽越大。最小1Mbps,最大带宽由 DescribePathXLineConfig 接口获得。可联系产品团队咨询最大带宽。
     */
    @NotEmpty
    @UCloudParam("Bandwidth")
    private Integer bandwidth;
        
    
        
    /**
     * 计费模式，默认为Month 按月收费,可选范围['Month','Year','Dynamic']
     */
    @UCloudParam("ChargeType")
    private String chargeType;
        
    
        
    /**
     * 购买周期，ChargeType为Month时，Quantity默认为0代表购买到月底，按时和按年付费该参数必须大于0
     */
    @UCloudParam("Quantity")
    private Integer quantity;
        
    
        
    /**
     * 是否开启后付费, 默认为false ，不开启后付费。当ChargeType为Dynamic时不能开启后付费。
     */
    @UCloudParam("PostPaid")
    private Boolean postPaid;
        
    
        
    /**
     * private:专线线路；public:海外SD-WAN。默认为private。
     */
    @UCloudParam("PathType")
    private String pathType;
        
    
        
    /**
     * 代金券Id
     */
    @UCloudParam("CouponId")
    private String couponId;
        
    
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }
    
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
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
    
    public Boolean getPostPaid() {
        return postPaid;
    }

    public void setPostPaid(Boolean postPaid) {
        this.postPaid = postPaid;
    }
    
    public String getPathType() {
        return pathType;
    }

    public void setPathType(String pathType) {
        this.pathType = pathType;
    }
    
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
    
}









