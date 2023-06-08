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


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class DescribeUDiskRequest extends Request {

    
        
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
     * UDisk Id(留空返回全部)
     */
    @UCloudParam("UDiskId")
    private String uDiskId;
        
    
        
    /**
     * 数据偏移量, 默认为0
     */
    @UCloudParam("Offset")
    private Integer offset;
        
    
        
    /**
     * 返回数据长度, 默认为20
     */
    @UCloudParam("Limit")
    private Integer limit;
        
    
        
    /**
     * ProtocolVersion字段为1时，需结合IsBoot确定具体磁盘类型:普通数据盘：DiskType:"CLOUD_NORMAL",IsBoot:"False"；普通系统盘：DiskType:"CLOUD_NORMAL",IsBoot:"True"；SSD数据盘：DiskType:"CLOUD_SSD",IsBoot:"False"；SSD系统盘：DiskType:"CLOUD_SSD",IsBoot:"True"；RSSD数据盘：DiskType:"CLOUD_RSSD",IsBoot:"False"；RSSD系统盘：DiskType:"CLOUD_RSSD",IsBoot:"True"；高效数据盘：DiskType:"CLOUD_EFFICIENCY",IsBoot:"False"；高效系统盘：DiskType:"CLOUD_EFFICIENCY",IsBoot:"True"；为空拉取所有。ProtocolVersion字段为0或没有该字段时，可设为以下几个值:普通数据盘：DataDisk；普通系统盘：SystemDisk；SSD数据盘：SSDDataDisk；SSD系统盘：SSDSystemDisk；RSSD数据盘：RSSDDataDisk；RSSD系统盘：RSSDSystemDisk：高效数据盘：EfficiencyDataDisk；高效系统盘：EfficiencySystemDisk；为空拉取所有。
     */
    @UCloudParam("DiskType")
    private String diskType;
        
    
        
    /**
     * 请求协议版本，建议升级为1，为1时DiskType与UHost磁盘类型定义一致；默认为0
     */
    @UCloudParam("ProtocolVersion")
    private Integer protocolVersion;
        
    
        
    /**
     * ProtocolVersion字段为1且DiskType不为空时，必须设置，设置规则请参照DiskType；ProtocolVersion字段为1且DiskType为空时，该字段无效。ProtocolVersion字段为0或没有该字段时，该字段无效。
     */
    @UCloudParam("IsBoot")
    private String isBoot;
        
    
        
    /**
     * 是否忽略计费信息。Yes：忽略，No：不忽略，默认值（No）。（如不关心账单信息，建议选填“Yes”，可降低请求延时）
     */
    @UCloudParam("IgnoreUBillInfo")
    private String ignoreUBillInfo;
        
    
        
    /**
     * 是否忽略快照服务信息。Yes：忽略，No：不忽略，默认值（No）。（如不关心快照服务信息，建议选填“Yes”，可降低请求延时）
     */
    @UCloudParam("IgnoreBackupMode")
    private String ignoreBackupMode;
        
    
        
    /**
     * 是否只返回云盘基础信息（只包含云盘及关联主机的资源信息）。Yes：是，No：否，默认值（No）。（如仅需要基础信息，建议选填“Yes”，可降低请求延时）
     */
    @UCloudParam("UDiskBasicInfo")
    private String uDiskBasicInfo;
        
    
        
    /**
     * 根据传入的UHostIdForAttachment，筛选出能被挂载在该主机上的云盘【本字段即将废弃，建议使用HostIdForAttachment】
     */
    @UCloudParam("UHostIdForAttachment")
    private String uHostIdForAttachment;
        
    
        
    /**
     * 根据传入的HostIdForAttachment，筛选出能被挂载在该主机上的云盘。目前主要针对RSSD云盘。
     */
    @UCloudParam("HostIdForAttachment")
    private String hostIdForAttachment;
        
    
        
    /**
     * 根据传入的HostId，返回与该主机关联的云盘信息。
     */
    @UCloudParam("HostId")
    private String hostId;
        
    
        
    /**
     * 宿主产品类型，可筛选挂载在该类型宿主上的云盘。可选值：uhost, uphost。为空拉取所有。（当HostIdForAttachment字段不为空时，该字段可以不填，若HostIdForAttachment与该字段宿主类型冲突，则以HostIdForAttachment字段为准。）
     */
    @UCloudParam("HostProduct")
    private String hostProduct;
        
    
        
    /**
     * 云盘状态。All(所有状态)，Available(可用)，Attaching(挂载中)，InUse(已挂载)， Detaching(卸载中)， Initializating(分配中)，Failed(创建失败)，Cloning(克隆中)，Restoring(恢复中)，RestoreFailed(恢复失败)。默认值：All
     */
    @UCloudParam("Status")
    private String status;
        
    
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
    
    public String getUDiskId() {
        return uDiskId;
    }

    public void setUDiskId(String uDiskId) {
        this.uDiskId = uDiskId;
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
    
    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }
    
    public Integer getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(Integer protocolVersion) {
        this.protocolVersion = protocolVersion;
    }
    
    public String getIsBoot() {
        return isBoot;
    }

    public void setIsBoot(String isBoot) {
        this.isBoot = isBoot;
    }
    
    public String getIgnoreUBillInfo() {
        return ignoreUBillInfo;
    }

    public void setIgnoreUBillInfo(String ignoreUBillInfo) {
        this.ignoreUBillInfo = ignoreUBillInfo;
    }
    
    public String getIgnoreBackupMode() {
        return ignoreBackupMode;
    }

    public void setIgnoreBackupMode(String ignoreBackupMode) {
        this.ignoreBackupMode = ignoreBackupMode;
    }
    
    public String getUDiskBasicInfo() {
        return uDiskBasicInfo;
    }

    public void setUDiskBasicInfo(String uDiskBasicInfo) {
        this.uDiskBasicInfo = uDiskBasicInfo;
    }
    
    public String getUHostIdForAttachment() {
        return uHostIdForAttachment;
    }

    public void setUHostIdForAttachment(String uHostIdForAttachment) {
        this.uHostIdForAttachment = uHostIdForAttachment;
    }
    
    public String getHostIdForAttachment() {
        return hostIdForAttachment;
    }

    public void setHostIdForAttachment(String hostIdForAttachment) {
        this.hostIdForAttachment = hostIdForAttachment;
    }
    
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }
    
    public String getHostProduct() {
        return hostProduct;
    }

    public void setHostProduct(String hostProduct) {
        this.hostProduct = hostProduct;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}









