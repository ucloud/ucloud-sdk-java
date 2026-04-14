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
package cn.ucloud.ucompshare.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class GetCompShareInstancePriceRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /**
     * 计费模式。枚举值为： \\ > Year，按年付费； \\ > Month，按月付费；\\ > Dynamic，按小时付费；\\ Day，按天付费 \\
     * 如果不传某个枚举值，默认返回月付价格
     */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** CPU核数。可选范围参照控制台。默认值: 16 */
    @UCloudParam("Cpu")
    private String cpu;

    /** 内存大小。单位：MB。取值为1024的倍数（可选范围参照好控制台）。默认值：32768 */
    @UCloudParam("Memory")
    private String memory;

    /** GPU卡核心数。默认值：1 */
    @UCloudParam("Gpu")
    private String gpu;

    /** 镜像Id */
    @UCloudParam("CompShareImageId")
    private String compShareImageId;

    /** */
    @UCloudParam("Disks")
    private List<Disks> disks;

    /** GpuType。枚举值：["4090"] */
    @UCloudParam("GpuType")
    private String gpuType;

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

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCompShareImageId() {
        return compShareImageId;
    }

    public void setCompShareImageId(String compShareImageId) {
        this.compShareImageId = compShareImageId;
    }

    public List<Disks> getDisks() {
        return disks;
    }

    public void setDisks(List<Disks> disks) {
        this.disks = disks;
    }

    public String getGpuType() {
        return gpuType;
    }

    public void setGpuType(String gpuType) {
        this.gpuType = gpuType;
    }

    public static class Disks extends Request {

        /** 磁盘类型。请参考[[api:uhost-api:disk_type|磁盘类型]]。 */
        @UCloudParam("Type")
        private String type;

        /** 磁盘大小，单位GB。请参考[[api:uhost-api:disk_type|磁盘类型]]。 */
        @UCloudParam("Size")
        private Integer size;

        /** 是否是系统盘。枚举值：\\ > True，是系统盘 \\ > False，是数据盘（默认）。Disks数组中有且只能有一块盘是系统盘。 */
        @UCloudParam("IsBoot")
        private Boolean isBoot;

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

        public Boolean getIsBoot() {
            return isBoot;
        }

        public void setIsBoot(Boolean isBoot) {
            this.isBoot = isBoot;
        }
    }
}
