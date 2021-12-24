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
package cn.ucloud.uk8s.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class AddUK8SUHostNodeRequest extends Request {

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist): false */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list): false
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist): false */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** UK8S集群ID。 可从UK8S控制台获取。: false */
    @NotEmpty
    @UCloudParam("ClusterId")
    private String clusterId;

    /** 虚拟CPU核数。可选参数：2-64（具体机型与CPU的对应关系参照控制台）。默认值: 4。: false */
    @NotEmpty
    @UCloudParam("CPU")
    private Integer cpu;

    /** 创建Node节点数量，取值范围是[1,50]。: false */
    @NotEmpty
    @UCloudParam("Count")
    private Integer count;

    /**
     * Node节点密码。请遵照[[api:uhost-api:specification|字段规范]]设定密码。密码需使用base64进行编码，如下：# echo -n Password1 |
     * base64: false
     */
    @NotEmpty
    @UCloudParam("Password")
    private String password;

    /** 内存大小。单位：MB。范围 ：[4096, 262144]，取值为1024的倍数（可选范围参考控制台）。默认值：8192: false */
    @NotEmpty
    @UCloudParam("Mem")
    private Integer mem;

    /**
     * 计费模式。枚举值为： \\ > Year，按年付费； \\ > Month，按月付费；\\ > Dynamic，按小时预付费 \\ >
     * Postpay，按小时后付费（支持关机不收费，目前仅部分可用区支持，请联系您的客户经理） \\ 默认为月付: false
     */
    @NotEmpty
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 磁盘类型。请参考[[api:uhost-api:disk_type|磁盘类型]]。默认为SSD云盘: false */
    @UCloudParam("BootDiskType")
    private String bootDiskType;

    /** 磁盘类型。请参考[[api:uhost-api:disk_type|磁盘类型]]。默认为SSD云盘: false */
    @UCloudParam("DataDiskType")
    private String dataDiskType;

    /** 数据磁盘大小，单位GB。默认0。范围 ：[20, 1000]: false */
    @UCloudParam("DataDiskSize")
    private Integer dataDiskSize;

    /** 购买时长。默认: 1。按小时购买(Dynamic)时无需此参数。 月付时，此参数传0，代表了购买至月末。: false */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 云主机机型。枚举值["N", "C", "G", "O", "OS"]。参考[[api:uhost-api:uhost_type|云主机机型说明]]。: false */
    @UCloudParam("MachineType")
    private String machineType;

    /**
     * 最低cpu平台，枚举值["Intel/Auto", "Intel/IvyBridge", "Intel/Haswell", "Intel/Broadwell",
     * "Intel/Skylake", "Intel/Cascadelake"；"Intel/CascadelakeR";
     * “Amd/Epyc2”,"Amd/Auto"],默认值是"Intel/Auto": false
     */
    @UCloudParam("MinmalCpuPlatform")
    private String minmalCpuPlatform;

    /** GPU类型，枚举值["K80", "P40", "V100",]，MachineType为G时必填: false */
    @UCloudParam("GpuType")
    private String gpuType;

    /** GPU卡核心数。仅GPU机型支持此字段（可选范围与MachineType+GpuType相关）: false */
    @UCloudParam("GPU")
    private Integer gpu;

    /** Node节点标签。key=value形式,多组用”,“隔开，最多5组。 如env=pro,type=game: false */
    @UCloudParam("Labels")
    private String labels;

    /** 默认110，生产环境建议小于等于110。: false */
    @UCloudParam("MaxPods")
    private Integer maxPods;

    /** 硬件隔离组id。可通过DescribeIsolationGroup获取。: false */
    @UCloudParam("IsolationGroup")
    private String isolationGroup;

    /** 镜像 Id，不填时后台程序会自动选用一个可用的镜像 Id，支持用户自定义镜像，自定义镜像必须基于基础镜像制作。: false */
    @UCloudParam("ImageId")
    private String imageId;

    /** 子网 ID。默认为集群创建时填写的子网ID，也可以填写集群同VPC内的子网ID。: false */
    @UCloudParam("SubnetId")
    private String subnetId;

    /** 用于标示添加完节点后是否将节点临时禁用. 传入 "true" 表示禁用,传入其它或不传表示不禁用: false */
    @UCloudParam("DisableSchedule")
    private Boolean disableSchedule;

    /** 用户自定义数据。当镜像支持Cloud-init Feature时可填写此字段。注意：1、总数据量大小不超过 16K；2、使用base64编码。: false */
    @UCloudParam("UserData")
    private String userData;

    /** 用户自定义Shell脚本。与UserData的区别在于InitScript在节点初始化完毕后才执行，UserData则是云主机初始化时执行。: false */
    @UCloudParam("InitScript")
    private String initScript;

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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public Integer getCPU() {
        return cpu;
    }

    public void setCPU(Integer cpu) {
        this.cpu = cpu;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMem() {
        return mem;
    }

    public void setMem(Integer mem) {
        this.mem = mem;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getBootDiskType() {
        return bootDiskType;
    }

    public void setBootDiskType(String bootDiskType) {
        this.bootDiskType = bootDiskType;
    }

    public String getDataDiskType() {
        return dataDiskType;
    }

    public void setDataDiskType(String dataDiskType) {
        this.dataDiskType = dataDiskType;
    }

    public Integer getDataDiskSize() {
        return dataDiskSize;
    }

    public void setDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getMinmalCpuPlatform() {
        return minmalCpuPlatform;
    }

    public void setMinmalCpuPlatform(String minmalCpuPlatform) {
        this.minmalCpuPlatform = minmalCpuPlatform;
    }

    public String getGpuType() {
        return gpuType;
    }

    public void setGpuType(String gpuType) {
        this.gpuType = gpuType;
    }

    public Integer getGPU() {
        return gpu;
    }

    public void setGPU(Integer gpu) {
        this.gpu = gpu;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public Integer getMaxPods() {
        return maxPods;
    }

    public void setMaxPods(Integer maxPods) {
        this.maxPods = maxPods;
    }

    public String getIsolationGroup() {
        return isolationGroup;
    }

    public void setIsolationGroup(String isolationGroup) {
        this.isolationGroup = isolationGroup;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public Boolean getDisableSchedule() {
        return disableSchedule;
    }

    public void setDisableSchedule(Boolean disableSchedule) {
        this.disableSchedule = disableSchedule;
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public String getInitScript() {
        return initScript;
    }

    public void setInitScript(String initScript) {
        this.initScript = initScript;
    }
}
