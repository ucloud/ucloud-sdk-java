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
package cn.ucloud.uhost.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class GetUHostInstancePriceRequest extends Request {

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

    /** CPU核数。可选参数：1-64。可选范围参照控制台。默认值: 4 */
    @NotEmpty
    @UCloudParam("CPU")
    private Integer cpu;

    /** 内存大小。单位：MB。范围 ：[1024, 262144]，取值为1024的倍数（可选范围参照好控制台）。默认值：8192 */
    @NotEmpty
    @UCloudParam("Memory")
    private Integer memory;

    /** 购买台数，范围[1,5] */
    @NotEmpty
    @UCloudParam("Count")
    private Integer count;

    /** */
    @UCloudParam("Disks")
    private List<Disks> disks;

    /** 镜像Id，可通过 [DescribeImage](describe_image.html) 获取镜像ID， 如果镜像ID不传，系统盘大小必传 */
    @UCloudParam("ImageId")
    private String imageId;

    /** GPU卡核心数。仅GPU机型支持此字段。 */
    @UCloudParam("GPU")
    private Integer gpu;

    /**
     * 计费模式。枚举值为： \\ > Year，按年付费； \\ > Month，按月付费；\\ > Dynamic，按小时付费 // >Preemptive 抢占式实例 \\
     * 如果不传某个枚举值，默认返回年付、月付、时付的价格组合集。
     */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 网络增强。枚举值：Normal，不开启; Super，开启网络增强1.0。 默认值为Normal。 */
    @UCloudParam("NetCapability")
    private String netCapability;

    /** 【待废弃】云主机机型（V1版本概念）。参考[[api:uhost-api:uhost_type|云主机机型说明]]。 */
    @UCloudParam("UHostType")
    private String uHostType;

    /**
     * 云主机机型（V2版本概念）。枚举值["N", "C", "G", "O", "OS", "OPRO", "OMAX",
     * "O.BM"]。参考[[api:uhost-api:uhost_type|云主机机型说明]]。
     */
    @UCloudParam("MachineType")
    private String machineType;

    /** GPU类型，枚举值["K80", "P40", "V100", "T4","T4S","2080Ti","2080Ti-4C","1080Ti"] */
    @UCloudParam("GpuType")
    private String gpuType;

    /** 购买时长。默认: 1。按小时购买(Dynamic)时无需此参数。 月付时，此参数传0，代表了购买至月末。 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 取值"Intel" "Amd"，默认值“Intel” */
    @UCloudParam("CpuPlatform")
    private String cpuPlatform;

    /** */
    @UCloudParam("Volumes")
    private List<Volumes> volumes;

    /** */
    @UCloudParam("VirtualGpu")
    private VirtualGpu virtualGpu;

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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Disks> getDisks() {
        return disks;
    }

    public void setDisks(List<Disks> disks) {
        this.disks = disks;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Integer getGPU() {
        return gpu;
    }

    public void setGPU(Integer gpu) {
        this.gpu = gpu;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getNetCapability() {
        return netCapability;
    }

    public void setNetCapability(String netCapability) {
        this.netCapability = netCapability;
    }

    public String getUHostType() {
        return uHostType;
    }

    public void setUHostType(String uHostType) {
        this.uHostType = uHostType;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getGpuType() {
        return gpuType;
    }

    public void setGpuType(String gpuType) {
        this.gpuType = gpuType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCpuPlatform() {
        return cpuPlatform;
    }

    public void setCpuPlatform(String cpuPlatform) {
        this.cpuPlatform = cpuPlatform;
    }

    public List<Volumes> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<Volumes> volumes) {
        this.volumes = volumes;
    }

    public VirtualGpu getVirtualGpu() {
        return virtualGpu;
    }

    public void setVirtualGpu(VirtualGpu virtualGpu) {
        this.virtualGpu = virtualGpu;
    }

    public static class Disks extends Request {

        /** 是否是系统盘。枚举值：\\ > True，是系统盘 \\ > False，是数据盘（默认）。Disks数组中有且只能有一块盘是系统盘。 */
        @NotEmpty
        @UCloudParam("IsBoot")
        private String isBoot;

        /** 磁盘大小，单位GB。请参考[[api:uhost-api:disk_type|磁盘类型]]。 */
        @NotEmpty
        @UCloudParam("Size")
        private Integer size;

        /** 磁盘类型。请参考[[api:uhost-api:disk_type|磁盘类型]]。 */
        @NotEmpty
        @UCloudParam("Type")
        private String type;

        /**
         * 磁盘备份方案。枚举值：\\ > NONE，无备份 \\ > DATAARK，数据方舟 \\ > SNAPSHOT，快照\\ 当前磁盘支持的备份模式参考
         * [[api:uhost-api:disk_type|磁盘类型]]
         */
        @UCloudParam("BackupType")
        private String backupType;

        public String getIsBoot() {
            return isBoot;
        }

        public void setIsBoot(String isBoot) {
            this.isBoot = isBoot;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getBackupType() {
            return backupType;
        }

        public void setBackupType(String backupType) {
            this.backupType = backupType;
        }
    }

    public static class VirtualGpu extends Request {}

    public static class Volumes extends Request {}
}
