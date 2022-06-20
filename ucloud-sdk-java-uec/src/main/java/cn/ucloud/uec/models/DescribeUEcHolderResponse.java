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
package cn.ucloud.uec.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUEcHolderResponse extends Response {

    /** 容器组列表（详情参考HolderList） */
    @SerializedName("HolderList")
    private List<HolderList> holderList;

    /** 满足条件的容器组总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<HolderList> getHolderList() {
        return holderList;
    }

    public void setHolderList(List<HolderList> holderList) {
        this.holderList = holderList;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class StorVolumeInfo extends Response {

        /** 名称 */
        @SerializedName("Name")
        private String name;

        /** 资源id */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 挂载点 */
        @SerializedName("MountPoint")
        private String mountPoint;

        /** 容量（单位GB） */
        @SerializedName("DiskSize")
        private Integer diskSize;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getMountPoint() {
            return mountPoint;
        }

        public void setMountPoint(String mountPoint) {
            this.mountPoint = mountPoint;
        }

        public Integer getDiskSize() {
            return diskSize;
        }

        public void setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
        }
    }

    public static class DockerInfo extends Response {

        /** CPU核数（/核）精度0.1核 */
        @SerializedName("CpuCores")
        private Double cpuCores;

        /** 内存大小（Gi） */
        @SerializedName("MemSize")
        private Double memSize;

        /** 容器名称 */
        @SerializedName("Name")
        private String name;

        /** 容器状态，0：初始化；1：拉取镜像；2：拉取镜像失败；3：启动中；4：运行中；5：正在停止； 6：已停止；7：已删除；8：镜像拉取成功；9：启动失败；99：异常 */
        @SerializedName("State")
        private Integer state;

        /** 镜像名称 */
        @SerializedName("ImageName")
        private String imageName;

        /** 工作目录 */
        @SerializedName("WorkDir")
        private String workDir;

        /** 命令 */
        @SerializedName("Command")
        private String command;

        /** 参数 */
        @SerializedName("Args")
        private String args;

        /** 环境变量（详情参考EnvList） */
        @SerializedName("EnvList")
        private List<EnvList> envList;

        /** 容器配置字典（详情参考CfgDictList） */
        @SerializedName("CfgDictList")
        private List<CfgDictList> cfgDictList;

        public Double getCpuCores() {
            return cpuCores;
        }

        public void setCpuCores(Double cpuCores) {
            this.cpuCores = cpuCores;
        }

        public Double getMemSize() {
            return memSize;
        }

        public void setMemSize(Double memSize) {
            this.memSize = memSize;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getState() {
            return state;
        }

        public void setState(Integer state) {
            this.state = state;
        }

        public String getImageName() {
            return imageName;
        }

        public void setImageName(String imageName) {
            this.imageName = imageName;
        }

        public String getWorkDir() {
            return workDir;
        }

        public void setWorkDir(String workDir) {
            this.workDir = workDir;
        }

        public String getCommand() {
            return command;
        }

        public void setCommand(String command) {
            this.command = command;
        }

        public String getArgs() {
            return args;
        }

        public void setArgs(String args) {
            this.args = args;
        }

        public List<EnvList> getEnvList() {
            return envList;
        }

        public void setEnvList(List<EnvList> envList) {
            this.envList = envList;
        }

        public List<CfgDictList> getCfgDictList() {
            return cfgDictList;
        }

        public void setCfgDictList(List<CfgDictList> cfgDictList) {
            this.cfgDictList = cfgDictList;
        }
    }

    public static class CfgDictList extends Response {

        /** 名称 */
        @SerializedName("Name")
        private String name;

        /** 挂载路径 */
        @SerializedName("MountPath")
        private String mountPath;

        /** 资源id */
        @SerializedName("ResourceId")
        private String resourceId;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMountPath() {
            return mountPath;
        }

        public void setMountPath(String mountPath) {
            this.mountPath = mountPath;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }
    }

    public static class EnvList extends Response {

        /** 环境变量key值 */
        @SerializedName("Key")
        private String key;

        /** 环境变量Value值 */
        @SerializedName("Value")
        private String value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class IpList extends Response {

        /** 外网ip */
        @SerializedName("Ip")
        private String ip;

        /** 运营商 */
        @SerializedName("Isp")
        private String isp;

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getIsp() {
            return isp;
        }

        public void setIsp(String isp) {
            this.isp = isp;
        }
    }

    public static class HolderList extends Response {

        /** 容器组资源id */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 容器组名称 */
        @SerializedName("HolderName")
        private String holderName;

        /** 容器组子网id */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 容器组内网ip */
        @SerializedName("InnerIp")
        private String innerIp;

        /** 容器组外网ip集合（详情参考IpList） */
        @SerializedName("IpList")
        private List<IpList> ipList;

        /** 容器组运行状态0：初始化；1：拉取镜像；2：启动中；3：运行中；4：错误；5：正在重启；6：正在删除；7：已经删除；8：容器运行错误；9：启动失败；99：异常 */
        @SerializedName("State")
        private Integer state;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 过期时间 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 线路类型（运营商类型： 0-其它, 1-一线城市单线,2-二线城市单线, 3-全国教育网, 4-全国三通） */
        @SerializedName("Type")
        private Integer type;

        /** 机房id */
        @SerializedName("IdcId")
        private String idcId;

        /** 机房名称 */
        @SerializedName("OcName")
        private String ocName;

        /** 省份名称 */
        @SerializedName("Province")
        private String province;

        /** 城市名称 */
        @SerializedName("City")
        private String city;

        /** 0：总是；1：失败是；2：永不 */
        @SerializedName("RestartStrategy")
        private Integer restartStrategy;

        /** 容器数量 */
        @SerializedName("DockerCount")
        private Integer dockerCount;

        /** 容器信息（详情参考DockerInfo） */
        @SerializedName("DockerInfo")
        private List<DockerInfo> dockerInfo;

        /** 机器类型（normal经济型，hf标准型） */
        @SerializedName("ProductType")
        private String productType;

        /** 外网绑定的带宽 */
        @SerializedName("NetLimit")
        private Integer netLimit;

        /** 外网防火墙id */
        @SerializedName("FirewallId")
        private String firewallId;

        /** 存储卷信息（详情参考StorVolumeInfo） */
        @SerializedName("StorVolumeInfo")
        private List<StorVolumeInfo> storVolumeInfo;

        /** 存储卷数量 */
        @SerializedName("StorVolumeCount")
        private Integer storVolumeCount;

        /** 容器组镜像密钥列表（详情参考ImageList） */
        @SerializedName("ImageList")
        private List<ImageList> imageList;

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getHolderName() {
            return holderName;
        }

        public void setHolderName(String holderName) {
            this.holderName = holderName;
        }

        public String getSubnetId() {
            return subnetId;
        }

        public void setSubnetId(String subnetId) {
            this.subnetId = subnetId;
        }

        public String getInnerIp() {
            return innerIp;
        }

        public void setInnerIp(String innerIp) {
            this.innerIp = innerIp;
        }

        public List<IpList> getIpList() {
            return ipList;
        }

        public void setIpList(List<IpList> ipList) {
            this.ipList = ipList;
        }

        public Integer getState() {
            return state;
        }

        public void setState(Integer state) {
            this.state = state;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getIdcId() {
            return idcId;
        }

        public void setIdcId(String idcId) {
            this.idcId = idcId;
        }

        public String getOcName() {
            return ocName;
        }

        public void setOcName(String ocName) {
            this.ocName = ocName;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public Integer getRestartStrategy() {
            return restartStrategy;
        }

        public void setRestartStrategy(Integer restartStrategy) {
            this.restartStrategy = restartStrategy;
        }

        public Integer getDockerCount() {
            return dockerCount;
        }

        public void setDockerCount(Integer dockerCount) {
            this.dockerCount = dockerCount;
        }

        public List<DockerInfo> getDockerInfo() {
            return dockerInfo;
        }

        public void setDockerInfo(List<DockerInfo> dockerInfo) {
            this.dockerInfo = dockerInfo;
        }

        public String getProductType() {
            return productType;
        }

        public void setProductType(String productType) {
            this.productType = productType;
        }

        public Integer getNetLimit() {
            return netLimit;
        }

        public void setNetLimit(Integer netLimit) {
            this.netLimit = netLimit;
        }

        public String getFirewallId() {
            return firewallId;
        }

        public void setFirewallId(String firewallId) {
            this.firewallId = firewallId;
        }

        public List<StorVolumeInfo> getStorVolumeInfo() {
            return storVolumeInfo;
        }

        public void setStorVolumeInfo(List<StorVolumeInfo> storVolumeInfo) {
            this.storVolumeInfo = storVolumeInfo;
        }

        public Integer getStorVolumeCount() {
            return storVolumeCount;
        }

        public void setStorVolumeCount(Integer storVolumeCount) {
            this.storVolumeCount = storVolumeCount;
        }

        public List<ImageList> getImageList() {
            return imageList;
        }

        public void setImageList(List<ImageList> imageList) {
            this.imageList = imageList;
        }
    }

    public static class ImageList extends Response {

        /** 仓库地址 */
        @SerializedName("StoreAddr")
        private String storeAddr;

        /** 用户名称 */
        @SerializedName("UserName")
        private String userName;

        /** 镜像密钥 */
        @SerializedName("ImageKey")
        private String imageKey;

        public String getStoreAddr() {
            return storeAddr;
        }

        public void setStoreAddr(String storeAddr) {
            this.storeAddr = storeAddr;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getImageKey() {
            return imageKey;
        }

        public void setImageKey(String imageKey) {
            this.imageKey = imageKey;
        }
    }
}
