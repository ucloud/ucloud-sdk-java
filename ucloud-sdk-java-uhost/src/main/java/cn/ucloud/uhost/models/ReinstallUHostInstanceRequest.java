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

package cn.ucloud.uhost.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class ReinstallUHostInstanceRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @NotEmpty
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @UCloudParam("Zone")
    private String zone;
        
    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * UHost实例资源ID 参见 [DescribeUHostInstance](describe_uhost_instance.html)
     */
    @NotEmpty
    @UCloudParam("UHostId")
    private String uHostId;
        
    
        
    /**
     * 如果重装UHost实例时LoginMode为Password，则必须填写，如果LoginMode为KeyPair，不需要填写 （密码格式使用BASE64编码；举例如下：# echo -n Password1 | base64UGFzc3dvcmQx。）
     */
    @UCloudParam("Password")
    private String password;
        
    
        
    /**
     * 镜像Id，默认使用原镜像 参见 [DescribeImage](describe_image.html)
     */
    @UCloudParam("ImageId")
    private String imageId;
        
    
        
    /**
     * 是否保留数据盘，保留：Yes，不报留：No， 默认：Yes；如果是从Windows重装为Linux或反之，则无法保留数据盘（该参数目前仅对本地数据盘起作用）
     */
    @UCloudParam("ReserveDisk")
    private String reserveDisk;
        
    
        
    
        
    
        
    /**
     * 系统盘大小。 单位：GB， 范围[20,100]， 步长：10
     */
    @UCloudParam("BootDiskSpace")
    private Integer bootDiskSpace;
        
    
        
    /**
     * cloudinit初始化使用。注意：1、总数据量大小不超多16K 2、使用base64编码
     */
    @UCloudParam("UserData")
    private String userData;
        
    
        
    /**
     * 数据盘是否需要自动分区挂载。当镜像支持Cloud-init Feature时可填写此字段。取值“On”（默认值）， “Off”
     */
    @UCloudParam("AutoDataDiskInit")
    private String autoDataDiskInit;
        
    
        
    /**
     * 主机登陆模式。密码（默认选项）: Password，密钥 KeyPair。
     */
    @UCloudParam("LoginMode")
    private String loginMode;
        
    
        
    /**
     * KeypairId 密钥对ID，LoginMode为KeyPair时此项必须。
     */
    @UCloudParam("KeyPairId")
    private String keyPairId;
        
    
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
    
    public String getUHostId() {
        return uHostId;
    }

    public void setUHostId(String uHostId) {
        this.uHostId = uHostId;
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
    
    public String getReserveDisk() {
        return reserveDisk;
    }

    public void setReserveDisk(String reserveDisk) {
        this.reserveDisk = reserveDisk;
    }
    
    
    
    public Integer getBootDiskSpace() {
        return bootDiskSpace;
    }

    public void setBootDiskSpace(Integer bootDiskSpace) {
        this.bootDiskSpace = bootDiskSpace;
    }
    
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }
    
    public String getAutoDataDiskInit() {
        return autoDataDiskInit;
    }

    public void setAutoDataDiskInit(String autoDataDiskInit) {
        this.autoDataDiskInit = autoDataDiskInit;
    }
    
    public String getLoginMode() {
        return loginMode;
    }

    public void setLoginMode(String loginMode) {
        this.loginMode = loginMode;
    }
    
    public String getKeyPairId() {
        return keyPairId;
    }

    public void setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
    }
    
}









