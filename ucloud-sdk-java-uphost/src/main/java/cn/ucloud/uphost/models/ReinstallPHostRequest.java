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

package cn.ucloud.uphost.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class ReinstallPHostRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;
        
    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * PHost资源ID
     */
    @NotEmpty
    @UCloudParam("PHostId")
    private String pHostId;
        
    
        
    /**
     * 密码
     */
    @NotEmpty
    @UCloudParam("Password")
    private String password;
        
    
        
    /**
     * 镜像Id，参考镜像列表，默认使用原镜像
     */
    @UCloudParam("ImageId")
    private String imageId;
        
    
        
    /**
     * 物理机名称，默认不更改
     */
    @UCloudParam("Name")
    private String name;
        
    
        
    /**
     * 物理机备注，默认为不更改。
     */
    @UCloudParam("Remark")
    private String remark;
        
    
        
    /**
     * 业务组，默认不更改。
     */
    @UCloudParam("Tag")
    private String tag;
        
    
        
    /**
     * 是否保留数据盘，保留：Yes，不报留：No， 默认：Yes
     */
    @UCloudParam("ReserveDisk")
    private String reserveDisk;
        
    
        
    /**
     * 不保留数据盘重装，可选Raid
     */
    @UCloudParam("Raid")
    private String raid;
        
    
        
    /**
     * 裸金属机型参数->系统盘大小。 单位：GB， 范围[20,500]， 步长：10
     */
    @UCloudParam("BootDiskSpace")
    private Integer bootDiskSpace;
        
    
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
    
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public String getPHostId() {
        return pHostId;
    }

    public void setPHostId(String pHostId) {
        this.pHostId = pHostId;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public String getReserveDisk() {
        return reserveDisk;
    }

    public void setReserveDisk(String reserveDisk) {
        this.reserveDisk = reserveDisk;
    }
    
    public String getRaid() {
        return raid;
    }

    public void setRaid(String raid) {
        this.raid = raid;
    }
    
    public Integer getBootDiskSpace() {
        return bootDiskSpace;
    }

    public void setBootDiskSpace(Integer bootDiskSpace) {
        this.bootDiskSpace = bootDiskSpace;
    }
    
}









