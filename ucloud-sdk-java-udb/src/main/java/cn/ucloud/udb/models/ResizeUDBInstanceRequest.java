/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.udb.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class ResizeUDBInstanceRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 实例的Id */
    @NotEmpty
    @UCloudParam("DBId")
    private String dbId;

    /**
     * 内存限制(MB)，目前支持以下几档 2000M/4000M/ 6000M/8000M/ 12000M/16000M/ 24000M/32000M/
     * 48000M/64000M/96000M/128000M/192000M/256000M/320000M。
     */
    @NotEmpty
    @UCloudParam("MemoryLimit")
    private Integer memoryLimit;

    /** 磁盘空间(GB), 暂时支持20G-32T */
    @NotEmpty
    @UCloudParam("DiskSpace")
    private Integer diskSpace;

    /** SSD类型，可选值为"SATA"、“NVMe” */
    @UCloudParam("SSDType")
    private String ssdType;

    /**
     * UDB数据库机型: "Normal": "标准机型" , "SATA_SSD": "SSD机型" , "PCIE_SSD": "SSD高性能机型" , "Normal_Volume":
     * "标准大容量机型", "SATA_SSD_Volume": "SSD大容量机型" , "PCIE_SSD_Volume": "SSD高性能大容量机型"，“NVMe_SSD”：“快杰机型”
     */
    @UCloudParam("InstanceType")
    private String instanceType;

    /** UDB实例模式类型, 可选值如下: "Normal": 普通版UDB实例 "HA": 高可用版UDB实例 默认是"Normal" */
    @UCloudParam("InstanceMode")
    private String instanceMode;

    /** DB关闭状态下升降级，升降级后是否启动DB，默认为false */
    @UCloudParam("StartAfterUpgrade")
    private Boolean startAfterUpgrade;

    /** 规格类型ID,当SpecificationType为1时有效 */
    @UCloudParam("MachineType")
    private String machineType;

    /** 实例计算规格类型，0或不传代表使用内存方式购买，1代表使用内存-cpu可选配比方式购买，需要填写MachineType */
    @UCloudParam("SpecificationType")
    private String specificationType;

    /** 使用的代金券id */
    @UCloudParam("CouponId")
    private String couponId;

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

    public String getDBId() {
        return dbId;
    }

    public void setDBId(String dbId) {
        this.dbId = dbId;
    }

    public Integer getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(Integer memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public Integer getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
    }

    public String getSSDType() {
        return ssdType;
    }

    public void setSSDType(String ssdType) {
        this.ssdType = ssdType;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }

    public Boolean getStartAfterUpgrade() {
        return startAfterUpgrade;
    }

    public void setStartAfterUpgrade(Boolean startAfterUpgrade) {
        this.startAfterUpgrade = startAfterUpgrade;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getSpecificationType() {
        return specificationType;
    }

    public void setSpecificationType(String specificationType) {
        this.specificationType = specificationType;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
