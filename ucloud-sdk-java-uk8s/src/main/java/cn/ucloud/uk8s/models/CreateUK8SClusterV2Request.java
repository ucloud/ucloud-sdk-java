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

import java.util.List;

public class CreateUK8SClusterV2Request extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 项目ID。 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 集群Node及Pod所属VPC */
    @NotEmpty
    @UCloudParam("VPCId")
    private String vpcId;

    /** 集群Node及Pod所属子网 */
    @NotEmpty
    @UCloudParam("SubnetId")
    private String subnetId;

    /** Service 网段，用于分配ClusterIP，如172.17.0.0/16。该网段不能与集群所属VPC网段重叠。 */
    @NotEmpty
    @UCloudParam("ServiceCIDR")
    private String serviceCIDR;

    /** 集群名称 */
    @NotEmpty
    @UCloudParam("ClusterName")
    private String clusterName;

    /** 集群节点密码，包括Master和Node。密码需包含最少一个大写字母，请使用base64进行编码，举例如下：# echo -n Password1 | base64 */
    @NotEmpty
    @UCloudParam("Password")
    private String password;

    /** */
    @UCloudParam("Master")
    private List<Master> master;

    /** Master节点的云主机机型（V2.0），如["N", "C", "O", "OS"]，具体请参照云主机机型。 */
    @NotEmpty
    @UCloudParam("MasterMachineType")
    private String masterMachineType;

    /** Master节点的虚拟CPU核数。可选参数：2-64（具体机型与CPU的对应关系参照控制台）。 */
    @NotEmpty
    @UCloudParam("MasterCPU")
    private Integer masterCPU;

    /** Master节点的内存大小。单位：MB。范围 ：[4096, 262144]，取值为1024的倍数（可选范围参考控制台）。 */
    @NotEmpty
    @UCloudParam("MasterMem")
    private Integer masterMem;

    /** */
    @UCloudParam("Nodes")
    private List<Nodes> nodes;

    /** Master节点系统盘类型。请参考[[api:uhost-api:disk_type|磁盘类型]]。默认为SSD云盘 */
    @UCloudParam("MasterBootDiskType")
    private String masterBootDiskType;

    /** Master节点系统盘大小，单位GB，默认为40。范围：[40, 500]。注意SSD本地盘无法调整。 */
    @UCloudParam("MasterBootDiskSize")
    private Integer masterBootDiskSize;

    /** Master节点数据盘类型。请参考[[api:uhost-api:disk_type|磁盘类型]]。默认为SSD云盘 */
    @UCloudParam("MasterDataDiskType")
    private String masterDataDiskType;

    /** Master节点的数据盘大小，单位GB，默认为0。范围 ：[20, 1000] */
    @UCloudParam("MasterDataDiskSize")
    private Integer masterDataDiskSize;

    /** 集群所有节点的付费模式。枚举值为： Year，按年付费； Month，按月付费； Dynamic，按小时付费（需开启权限），默认按月。 */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** k8s集群的版本，版本信息请参考UK8S集群创建页，不指定的话默认为当前支持的最高版本。 */
    @UCloudParam("K8sVersion")
    private String k8sVersion;

    /** 购买时长。默认为1。按小时购买(Dynamic)时无需此参数。 月付时，此参数传0，代表了购买至月末。 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 是否允许外网访问apiserver，开启：Yes 不开启：No。默认为No。 */
    @UCloudParam("ExternalApiServer")
    private String externalApiServer;

    /** 【无效，已删除】当前将自动为Master节点创建隔离组，确保Master节点归属于不同物理机。 */
    @UCloudParam("MasterIsolationGroup")
    private String masterIsolationGroup;

    /** */
    @UCloudParam("KubeProxy")
    private KubeProxy kubeProxy;

    /** Master节点和Node节点的镜像 ID，不填则随机选择可用的基础镜像。支持用户自定义镜像。 */
    @UCloudParam("ImageId")
    private String imageId;

    /** 用户自定义数据。注意：1、总数据量大小不超多16K；2、使用base64编码。 */
    @UCloudParam("UserData")
    private String userData;

    /** 用户自定义脚本，与UserData不同，自定义脚本将在集群安装完毕后执行。 注意：1、总数据量大小不超多16K；2、使用base64编码。 */
    @UCloudParam("InitScript")
    private String initScript;

    /**
     * Master节点的最低cpu平台，不选则随机。枚举值["Intel/Auto", "Intel/IvyBridge", "Intel/Haswell",
     * "Intel/Broadwell", "Intel/Skylake", "Intel/Cascadelake"。
     */
    @UCloudParam("MasterMinimalCpuPlatform")
    private String masterMinimalCpuPlatform;

    /** 创建集群的时候定义clusterdomain */
    @UCloudParam("ClusterDomain")
    private String clusterDomain;

    /** 业务组 */
    @UCloudParam("Tag")
    private String tag;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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

    public String getServiceCIDR() {
        return serviceCIDR;
    }

    public void setServiceCIDR(String serviceCIDR) {
        this.serviceCIDR = serviceCIDR;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Master> getMaster() {
        return master;
    }

    public void setMaster(List<Master> master) {
        this.master = master;
    }

    public String getMasterMachineType() {
        return masterMachineType;
    }

    public void setMasterMachineType(String masterMachineType) {
        this.masterMachineType = masterMachineType;
    }

    public Integer getMasterCPU() {
        return masterCPU;
    }

    public void setMasterCPU(Integer masterCPU) {
        this.masterCPU = masterCPU;
    }

    public Integer getMasterMem() {
        return masterMem;
    }

    public void setMasterMem(Integer masterMem) {
        this.masterMem = masterMem;
    }

    public List<Nodes> getNodes() {
        return nodes;
    }

    public void setNodes(List<Nodes> nodes) {
        this.nodes = nodes;
    }

    public String getMasterBootDiskType() {
        return masterBootDiskType;
    }

    public void setMasterBootDiskType(String masterBootDiskType) {
        this.masterBootDiskType = masterBootDiskType;
    }

    public Integer getMasterBootDiskSize() {
        return masterBootDiskSize;
    }

    public void setMasterBootDiskSize(Integer masterBootDiskSize) {
        this.masterBootDiskSize = masterBootDiskSize;
    }

    public String getMasterDataDiskType() {
        return masterDataDiskType;
    }

    public void setMasterDataDiskType(String masterDataDiskType) {
        this.masterDataDiskType = masterDataDiskType;
    }

    public Integer getMasterDataDiskSize() {
        return masterDataDiskSize;
    }

    public void setMasterDataDiskSize(Integer masterDataDiskSize) {
        this.masterDataDiskSize = masterDataDiskSize;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getK8sVersion() {
        return k8sVersion;
    }

    public void setK8sVersion(String k8sVersion) {
        this.k8sVersion = k8sVersion;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getExternalApiServer() {
        return externalApiServer;
    }

    public void setExternalApiServer(String externalApiServer) {
        this.externalApiServer = externalApiServer;
    }

    public String getMasterIsolationGroup() {
        return masterIsolationGroup;
    }

    public void setMasterIsolationGroup(String masterIsolationGroup) {
        this.masterIsolationGroup = masterIsolationGroup;
    }

    public KubeProxy getKubeProxy() {
        return kubeProxy;
    }

    public void setKubeProxy(KubeProxy kubeProxy) {
        this.kubeProxy = kubeProxy;
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

    public String getMasterMinimalCpuPlatform() {
        return masterMinimalCpuPlatform;
    }

    public void setMasterMinimalCpuPlatform(String masterMinimalCpuPlatform) {
        this.masterMinimalCpuPlatform = masterMinimalCpuPlatform;
    }

    public String getClusterDomain() {
        return clusterDomain;
    }

    public void setClusterDomain(String clusterDomain) {
        this.clusterDomain = clusterDomain;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public static class KubeProxy extends Request {

        /** 集群kube-proxy模式。支持iptables和ipvs，默认为iptables。 */
        @UCloudParam("Mode")
        private String mode;

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }
    }

    public static class Master extends Request {

        /**
         * Master节点所属可用区，需要设置 Master.0.Zone、 Master.1.Zone、Master.2.Zone 三个 Master 节点的可用区。
         * 三个节点可部署在不同可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
         */
        @NotEmpty
        @UCloudParam("Zone")
        private String zone;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }
    }

    public static class Nodes extends Request {

        /**
         * 一组Nodes节点所属可用区，可创建多组Nodes节点，如一组是CPU Nodes节点，另一组是GPU Nodes节点。参见
         * [可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
         */
        @NotEmpty
        @UCloudParam("Zone")
        private String zone;

        /** 一组Nodes节点云主机机型，如["N", "C", "O", "OS"]，具体请参照云主机机型。 */
        @NotEmpty
        @UCloudParam("MachineType")
        private String machineType;

        /** 一组Node节点的虚拟CPU核数。单位：核，范围：[2, 64]，可选范围参考控制台。 */
        @NotEmpty
        @UCloudParam("CPU")
        private Integer cpu;

        /** 一组Node节点的内存大小。单位：MB,范围 ：[4096, 262144]，取值为1024的倍数，可选范围参考控制台。 */
        @NotEmpty
        @UCloudParam("Mem")
        private Integer mem;

        /** 一组Node节点的数量，范围：[1,10]。 */
        @NotEmpty
        @UCloudParam("Count")
        private Integer count;

        /** 一组Node节点的隔离组Id，归属于同一隔离组的虚拟机节点将落在不同的物理机上，单个隔离组最多只能容纳8个节点。参见DescribeIsolationGroup。 */
        @UCloudParam("IsolationGroup")
        private String isolationGroup;

        /** Node节点上可运行最大节点数，默认为110。 */
        @UCloudParam("MaxPods")
        private Integer maxPods;

        /** Node节点标签，形式为key=value，多组Labels用”,“隔开,最多支持五组。 */
        @UCloudParam("Labels")
        private String labels;

        /** 一组Node节点的系统盘类型，请参考[[api:uhost-api:disk_type|磁盘类型]]。默认为SSD云盘 */
        @UCloudParam("BootDiskType")
        private String bootDiskType;

        /** Node节点的系统盘大小，单位GB，默认为40。范围：[40, 500]。注意SSD本地盘无法调整。 */
        @UCloudParam("BootDiskSIze")
        private Integer bootDiskSIze;

        /** 一组Node节点的数据盘类型，请参考[[api:uhost-api:disk_type|磁盘类型]]。默认为SSD云盘 */
        @UCloudParam("DataDiskType")
        private String dataDiskType;

        /** 一组Node节点的GPU类型，枚举值["K80", "P40", "V100"]，最新值参考Console。 */
        @UCloudParam("GpuType")
        private String gpuType;

        /** 一组Node节点的GPU卡核心数，仅GPU机型支持此字段。 */
        @UCloudParam("GPU")
        private Integer gpu;

        /** 数据磁盘大小，单位GB。默认0。范围 ：[20, 1000] */
        @UCloudParam("DataDiskSize")
        private Integer dataDiskSize;

        /**
         * Node节点的最低cpu平台，不选则随机。枚举值["Intel/Auto", "Intel/IvyBridge", "Intel/Haswell",
         * "Intel/Broadwell", "Intel/Skylake", "Intel/Cascadelake"。
         */
        @UCloudParam("MinimalCpuPlatform")
        private String minimalCpuPlatform;

        /** Node节点污点，形式为key=value:effect，多组taints用”,“隔开,最多支持五组。 */
        @UCloudParam("Taints")
        private String taints;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getMachineType() {
            return machineType;
        }

        public void setMachineType(String machineType) {
            this.machineType = machineType;
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

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public String getIsolationGroup() {
            return isolationGroup;
        }

        public void setIsolationGroup(String isolationGroup) {
            this.isolationGroup = isolationGroup;
        }

        public Integer getMaxPods() {
            return maxPods;
        }

        public void setMaxPods(Integer maxPods) {
            this.maxPods = maxPods;
        }

        public String getLabels() {
            return labels;
        }

        public void setLabels(String labels) {
            this.labels = labels;
        }

        public String getBootDiskType() {
            return bootDiskType;
        }

        public void setBootDiskType(String bootDiskType) {
            this.bootDiskType = bootDiskType;
        }

        public Integer getBootDiskSIze() {
            return bootDiskSIze;
        }

        public void setBootDiskSIze(Integer bootDiskSIze) {
            this.bootDiskSIze = bootDiskSIze;
        }

        public String getDataDiskType() {
            return dataDiskType;
        }

        public void setDataDiskType(String dataDiskType) {
            this.dataDiskType = dataDiskType;
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

        public Integer getDataDiskSize() {
            return dataDiskSize;
        }

        public void setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
        }

        public String getMinimalCpuPlatform() {
            return minimalCpuPlatform;
        }

        public void setMinimalCpuPlatform(String minimalCpuPlatform) {
            this.minimalCpuPlatform = minimalCpuPlatform;
        }

        public String getTaints() {
            return taints;
        }

        public void setTaints(String taints) {
            this.taints = taints;
        }
    }
}
