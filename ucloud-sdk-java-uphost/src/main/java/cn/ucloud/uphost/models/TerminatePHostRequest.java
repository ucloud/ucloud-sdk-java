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

public class TerminatePHostRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UCloudParam("Zone")
    private String zone;
        
    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * PHost资源ID
     */
    @NotEmpty
    @UCloudParam("PHostId")
    private String pHostId;
        
    
        
    /**
     * 是否释放绑定的EIP。true: 解绑EIP后，并释放；其他值或不填：解绑EIP。
     */
    @UCloudParam("ReleaseEIP")
    private Boolean releaseEIP;
        
    
        
    /**
     * 裸金属机型参数->删除主机时是否同时删除挂载的数据盘。默认为false。
     */
    @UCloudParam("ReleaseUDisk")
    private Boolean releaseUDisk;
        
    
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
    
    public Boolean getReleaseEIP() {
        return releaseEIP;
    }

    public void setReleaseEIP(Boolean releaseEIP) {
        this.releaseEIP = releaseEIP;
    }
    
    public Boolean getReleaseUDisk() {
        return releaseUDisk;
    }

    public void setReleaseUDisk(Boolean releaseUDisk) {
        this.releaseUDisk = releaseUDisk;
    }
    
}









