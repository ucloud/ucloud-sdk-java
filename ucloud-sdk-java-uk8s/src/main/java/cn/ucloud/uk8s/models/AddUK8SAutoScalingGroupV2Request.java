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

public class AddUK8SAutoScalingGroupV2Request extends Request {

    /** 可用区 */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /** 项目ID */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 地域 */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 集群ID */
    @NotEmpty
    @UCloudParam("ClusterId")
    private String clusterId;

    /** 伸缩组名字 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** 节点CPU大小 */
    @NotEmpty
    @UCloudParam("CPU")
    private Integer cpu;

    /** 节点Mem大小 */
    @NotEmpty
    @UCloudParam("Mem")
    private Integer mem;

    /** 云主机机型。该参数仍需传入；实际节点规格取自绑定的节点池。 */
    @NotEmpty
    @UCloudParam("MachineType")
    private String machineType;

    /** 最小节点数，范围 0–100，且不得大于 Max。必须显式传入，允许为 0。 */
    @NotEmpty
    @UCloudParam("Min")
    private Integer min;

    /** 最大节点数，范围 1–100，且不得小于 Min。 */
    @NotEmpty
    @UCloudParam("Max")
    private Integer max;

    /** 伸缩组绑定的有效节点池 ID。当前实现必须提供，节点配置取自该节点池。 */
    @NotEmpty
    @UCloudParam("NodeGroupId")
    private String nodeGroupId;

    /** Base64 编码的节点登录密码。LoginMode 为 Password（默认）时必填，不会自动生成随机密码；KeyPair 模式下可不填。 */
    @UCloudParam("Password")
    private String password;

    /** 磁盘类型。请参考[[api:uhost-api:disk_type|磁盘类型]]。默认为SSD云盘 */
    @UCloudParam("BootDiskType")
    private String bootDiskType;

    /** 磁盘类型。请参考[[api:uhost-api:disk_type|磁盘类型]]。默认为SSD云盘 */
    @UCloudParam("DataDiskType")
    private String dataDiskType;

    /** 数据磁盘大小，单位GB。默认0。范围 ：[20, 1000] */
    @UCloudParam("DataDiskSize")
    private Integer dataDiskSize;

    /** 最低 CPU 平台的兼容字段；同时提供 MinimalCpuPlatform 时以其为准。 */
    @UCloudParam("MinmalCpuPlatform")
    private String minmalCpuPlatform;

    /** GPU 类型；实际节点规格取自绑定的节点池。 */
    @UCloudParam("GpuType")
    private String gpuType;

    /** GPU卡核心数。仅GPU机型支持此字段 */
    @UCloudParam("GPU")
    private Integer gpu;

    /** key=value,多组用”,“隔开，最多5组 */
    @UCloudParam("Labels")
    private String labels;

    /** 默认110, 支持16-512 */
    @UCloudParam("MaxPods")
    private Integer maxPods;

    /** 系统盘大小，单位GB。默认40。范围：[40, 500]。注意SSD本地盘无法调整。 */
    @UCloudParam("BootDiskSize")
    private Integer bootDiskSize;

    /** 镜像 Id，不填时后台程序会自动选用一个可用的镜像 Id，不支持用户自定义镜像，传入自定义镜像 Id 将报错 */
    @UCloudParam("ImageId")
    private String imageId;

    /** Base64 编码的 cloud-init 用户数据。 */
    @UCloudParam("UserData")
    private String userData;

    /** Base64 编码的用户脚本，在 UK8S 节点初始化完成后执行。 */
    @UCloudParam("InitScript")
    private String initScript;

    /** 计费模式：Year、Month、Dynamic、Postpay，默认 Dynamic。此接口不接受 Preemptive。 */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 硬件隔离组id。可通过DescribeIsolationGroup获取。 */
    @UCloudParam("IsolationGroup")
    private String isolationGroup;

    /** Node节点污点，形式为key=value:effect，多组taints用”,“隔开,最多支持五组。 */
    @UCloudParam("Taints")
    private String taints;

    /** 业务组 */
    @UCloudParam("Tag")
    private String tag;

    /** 伸缩组的优先级，取值[1, 100]，数值越大优先级越高，在扩容的时候会被更优先考虑。 */
    @UCloudParam("Priority")
    private Integer priority;

    /** 节点登录方式：Password 或 KeyPair，默认 Password。 */
    @UCloudParam("LoginMode")
    private String loginMode;

    /** 登录密钥对 ID。LoginMode 为 KeyPair 时必填。 */
    @UCloudParam("KeyPairId")
    private String keyPairId;

    /** 最低 CPU 平台；优先于兼容字段 MinmalCpuPlatform。 */
    @UCloudParam("MinimalCpuPlatform")
    private String minimalCpuPlatform;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCPU() {
        return cpu;
    }

    public void setCPU(Integer cpu) {
        this.cpu = cpu;
    }

    public Integer getMem() {
        return mem;
    }

    public void setMem(Integer mem) {
        this.mem = mem;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public String getNodeGroupId() {
        return nodeGroupId;
    }

    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Integer getBootDiskSize() {
        return bootDiskSize;
    }

    public void setBootDiskSize(Integer bootDiskSize) {
        this.bootDiskSize = bootDiskSize;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
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

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getIsolationGroup() {
        return isolationGroup;
    }

    public void setIsolationGroup(String isolationGroup) {
        this.isolationGroup = isolationGroup;
    }

    public String getTaints() {
        return taints;
    }

    public void setTaints(String taints) {
        this.taints = taints;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
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

    public String getMinimalCpuPlatform() {
        return minimalCpuPlatform;
    }

    public void setMinimalCpuPlatform(String minimalCpuPlatform) {
        this.minimalCpuPlatform = minimalCpuPlatform;
    }
}
