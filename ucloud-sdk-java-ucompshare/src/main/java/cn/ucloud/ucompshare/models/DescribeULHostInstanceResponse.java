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


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeULHostInstanceResponse extends Response {

    
        
    /**
     * 实例列表
     */
    @SerializedName("ULHostInstanceSets")
    private List<ULHostInstanceSet> ulHostInstanceSets;
        
    
    public List<ULHostInstanceSet> getULHostInstanceSets() {
        return ulHostInstanceSets;
    }

    public void setULHostInstanceSets(List<ULHostInstanceSet> ulHostInstanceSets) {
        this.ulHostInstanceSets = ulHostInstanceSets;
    }
    
        public static class UHostIPSet extends Response {
            
        
    /**
     * IPv4/IPv6；
     */
    @SerializedName("IPMode")
    private String ipMode;
        
    
        
    /**
     * 内网 Private 类型下，表示是否为默认网卡。true: 是默认网卡；其他值：不是。
     */
    @SerializedName("Default")
    private String fDefault;
        
    
        
    /**
     * 内网 Private 类型下，当前网卡的Mac。
     */
    @SerializedName("Mac")
    private String mac;
        
    
        
    /**
     * 当前EIP的权重。权重最大的为当前的出口IP。
     */
    @SerializedName("Weight")
    private Integer weight;
        
    
        
    /**
     * 国际: Internation，BGP: Bgp，内网: Private
     */
    @SerializedName("Type")
    private String type;
        
    
        
    /**
     * 外网IP资源ID 。(内网IP无对应的资源ID)
     */
    @SerializedName("IPId")
    private String ipId;
        
    
        
    /**
     * IP地址
     */
    @SerializedName("IP")
    private String ip;
        
    
        
    /**
     * IP对应的带宽, 单位: Mb  (内网IP不显示带宽信息)
     */
    @SerializedName("Bandwidth")
    private Integer bandwidth;
        
    
        
    /**
     * IP地址对应的VPC ID。（北京一不支持，字段返回为空）
     */
    @SerializedName("VPCId")
    private String vpcId;
        
    
        
    /**
     * IP地址对应的子网 ID。（北京一不支持，字段返回为空）
     */
    @SerializedName("SubnetId")
    private String subnetId;
        
    
        
    /**
     * 弹性网卡为默认网卡时，返回对应的 ID 值
     */
    @SerializedName("NetworkInterfaceId")
    private String networkInterfaceId;
        
    
    public String getIPMode() {
        return ipMode;
    }

    public void setIPMode(String ipMode) {
        this.ipMode = ipMode;
    }
    
    public String getDefault() {
        return fDefault;
    }

    public void setDefault(String fDefault) {
        this.fDefault = fDefault;
    }
    
    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
    
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getIPId() {
        return ipId;
    }

    public void setIPId(String ipId) {
        this.ipId = ipId;
    }
    
    public String getIP() {
        return ip;
    }

    public void setIP(String ip) {
        this.ip = ip;
    }
    
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }
    
    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }
    
        }
        public static class ULHostDiskSet extends Response {
            
        
    /**
     * 磁盘Id
     */
    @SerializedName("DiskId")
    private String diskId;
        
    
        
    /**
     * 磁盘类型。如："CLOUD_RSSD"、"CLOUD_SSD"
     */
    @SerializedName("DiskType")
    private String diskType;
        
    
        
    /**
     * 磁盘类型。系统盘："Boot"；数据盘："Data"
     */
    @SerializedName("Type")
    private String type;
        
    
        
    /**
     * 磁盘大小。单位：GB
     */
    @SerializedName("Size")
    private Integer size;
        
    
        
    /**
     * 是否为系统盘。是："True"；否："False"
     */
    @SerializedName("IsBoot")
    private String isBoot;
        
    
        
    /**
     * 磁盘盘符。系统盘："vda"
     */
    @SerializedName("Drive")
    private String drive;
        
    
    public String getDiskId() {
        return diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }
    
    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    
    public String getIsBoot() {
        return isBoot;
    }

    public void setIsBoot(String isBoot) {
        this.isBoot = isBoot;
    }
    
    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }
    
        }
        public static class ULHostInstanceSet extends Response {
            
        
    /**
     * 可用区。
     */
    @SerializedName("Zone")
    private String zone;
        
    
        
    /**
     * 实例Id。
     */
    @SerializedName("ULHostId")
    private String ulHostId;
        
    
        
    /**
     * 实例名称。默认套餐Id
     */
    @SerializedName("Name")
    private String name;
        
    
        
    /**
     * 业务组。
     */
    @SerializedName("Tag")
    private String tag;
        
    
        
    /**
     * 备注。
     */
    @SerializedName("Remark")
    private String remark;
        
    
        
    /**
     * 镜像Id。
     */
    @SerializedName("ImageId")
    private String imageId;
        
    
        
    /**
     * 镜像名称。
     */
    @SerializedName("ImageName")
    private String imageName;
        
    
        
    /**
     * 【数组】镜像包含的应用列表。
     */
    @SerializedName("Apps")
    private List<String> apps;
        
    
        
    /**
     * CPU核数。
     */
    @SerializedName("CPU")
    private Integer cpu;
        
    
        
    /**
     * 内存。单位：MB
     */
    @SerializedName("Memory")
    private Integer memory;
        
    
        
    /**
     * 实例状态。枚举值：\\ >初始化: Initializing; \\ >启动中: Starting; \\> 运行中: Running; \\> 关机中: Stopping; \\ >关机: Stopped \\ >安装失败: Install Fail; \\ >重启中: Rebooting; \\ > 未知(空字符串，获取状态超时或出错)：""
     */
    @SerializedName("State")
    private String state;
        
    
        
    /**
     * 计费模式。枚举值：Month/Year
     */
    @SerializedName("ChargeType")
    private String chargeType;
        
    
        
    /**
     * IP信息
     */
    @SerializedName("IPSet")
    private List<UHostIPSet> ipSet;
        
    
        
    /**
     * 磁盘信息
     */
    @SerializedName("DiskSet")
    private List<ULHostDiskSet> diskSet;
        
    
        
    /**
     * 是否自动续费。枚举值：Yes/No
     */
    @SerializedName("AutoRenew")
    private String autoRenew;
        
    
        
    /**
     * 是否过期。枚举值：Yes/No
     */
    @SerializedName("IsExpire")
    private String isExpire;
        
    
        
    /**
     * 过期时间。Unix时间戳
     */
    @SerializedName("ExpireTime")
    private Integer expireTime;
        
    
        
    /**
     * 创建时间。Unix时间戳
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
    
    public String getULHostId() {
        return ulHostId;
    }

    public void setULHostId(String ulHostId) {
        this.ulHostId = ulHostId;
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
    
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
    
    public List<String> getApps() {
        return apps;
    }

    public void setApps(List<String> apps) {
        this.apps = apps;
    }
    
    public Integer getCPU() {
        return cpu;
    }

    public void setCPU(Integer cpu) {
        this.cpu = cpu;
    }
    
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }
    
    public List<UHostIPSet> getIPSet() {
        return ipSet;
    }

    public void setIPSet(List<UHostIPSet> ipSet) {
        this.ipSet = ipSet;
    }
    
    public List<ULHostDiskSet> getDiskSet() {
        return diskSet;
    }

    public void setDiskSet(List<ULHostDiskSet> diskSet) {
        this.diskSet = diskSet;
    }
    
    public String getAutoRenew() {
        return autoRenew;
    }

    public void setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
    }
    
    public String getIsExpire() {
        return isExpire;
    }

    public void setIsExpire(String isExpire) {
        this.isExpire = isExpire;
    }
    
    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    
        }
}









