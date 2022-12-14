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

package cn.ucloud.udisk.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class AttachUDiskResponse extends Response {

    
        
    /**
     * 挂载的UHost实例ID。【即将废弃，建议使用HostId】
     */
    @SerializedName("UHostId")
    private String uHostId;
        
    
        
    /**
     * 挂载的UDisk实例ID
     */
    @SerializedName("UDiskId")
    private String uDiskId;
        
    
        
    /**
     * 挂载的设备名称
     */
    @SerializedName("DeviceName")
    private String deviceName;
        
    
        
    /**
     * 挂载的Host实例ID
     */
    @SerializedName("HostId")
    private String hostId;
        
    
    public String getUHostId() {
        return uHostId;
    }

    public void setUHostId(String uHostId) {
        this.uHostId = uHostId;
    }
    
    public String getUDiskId() {
        return uDiskId;
    }

    public void setUDiskId(String uDiskId) {
        this.uDiskId = uDiskId;
    }
    
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }
    
}









