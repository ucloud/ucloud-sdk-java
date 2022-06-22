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
package cn.ucloud.uphone.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUPhoneServerResponse extends Response {

    /** ServerInstance总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 云手机服务器列表，每项参数可见数据模型 [ServerInstance](#ServerInstance) */
    @SerializedName("Servers")
    private List<ServerInstance> servers;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ServerInstance> getServers() {
        return servers;
    }

    public void setServers(List<ServerInstance> servers) {
        this.servers = servers;
    }

    public static class IpSet extends Response {

        /** IP地址 */
        @SerializedName("Ip")
        private String ip;

        /** ipv4或者ipv6 */
        @SerializedName("IpMode")
        private String ipMode;

        /** 共有或私有 */
        @SerializedName("IpType")
        private String ipType;

        /** 运营商 */
        @SerializedName("Isp")
        private String isp;

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getIpMode() {
            return ipMode;
        }

        public void setIpMode(String ipMode) {
            this.ipMode = ipMode;
        }

        public String getIpType() {
            return ipType;
        }

        public void setIpType(String ipType) {
            this.ipType = ipType;
        }

        public String getIsp() {
            return isp;
        }

        public void setIsp(String isp) {
            this.isp = isp;
        }
    }

    public static class UPhoneSpec extends Response {

        /** 手机规格名 */
        @SerializedName("UPhoneModelName")
        private String uPhoneModelName;

        /** 手机开数，即该服务器规格能生成对应手机规格的云手机个数 */
        @SerializedName("UPhoneCount")
        private Integer uPhoneCount;

        public String getUPhoneModelName() {
            return uPhoneModelName;
        }

        public void setUPhoneModelName(String uPhoneModelName) {
            this.uPhoneModelName = uPhoneModelName;
        }

        public Integer getUPhoneCount() {
            return uPhoneCount;
        }

        public void setUPhoneCount(Integer uPhoneCount) {
            this.uPhoneCount = uPhoneCount;
        }
    }

    public static class ServerDiskSet extends Response {

        /** 磁盘类型。请参考磁盘类型。 */
        @SerializedName("DiskType")
        private String diskType;

        /**
         * 是否是系统盘。枚举值：
         *
         * <p>> True，是系统盘
         *
         * <p>> False，是数据盘（默认）。Disks数组中有且只能有一块盘是系统盘。
         */
        @SerializedName("IsBoot")
        private Boolean isBoot;

        /** 磁盘大小，单位: GB */
        @SerializedName("Size")
        private Integer size;

        public String getDiskType() {
            return diskType;
        }

        public void setDiskType(String diskType) {
            this.diskType = diskType;
        }

        public Boolean getIsBoot() {
            return isBoot;
        }

        public void setIsBoot(Boolean isBoot) {
            this.isBoot = isBoot;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }
    }

    public static class ServerInstance extends Response {

        /** 云手机服务器的唯一标识。 */
        @SerializedName("ServerId")
        private String serverId;

        /** 云手机服务器名称。 */
        @SerializedName("ServerName")
        private String serverName;

        /** 云服务器规格。 */
        @SerializedName("ServerModel")
        private ServerModelInstance serverModel;

        /** 云手机规格名称。 */
        @SerializedName("UPhoneModelName")
        private String uPhoneModelName;

        /** 创建时间，格式为Unix时间戳。 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 修改时间，格式为Unix时间戳。 */
        @SerializedName("ModifyTime")
        private Integer modifyTime;

        /** 到期时间，格式为Unix时间戳。 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /**
         * 计费模式。枚举值为：<br>
         * *Year，按年付费；<br>
         * * Month，按月付费；<br>
         * 默认为月付
         */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 城市Id，eg: cn-shanghai, cn-jinan */
        @SerializedName("CityId")
        private String cityId;

        /** 城市名称，eg:上海二、济南市 */
        @SerializedName("CityName")
        private String cityName;

        /** 云服务器备注。 */
        @SerializedName("Remark")
        private String remark;

        /** 云手机开数。 */
        @SerializedName("UPhoneCount")
        private Integer uPhoneCount;

        /**
         * 实例状态，枚举值： 初始化: Initializing; 云手机创建中: UPhoneCreating; 运行中: Running; 删除中: Deleting; 创建失败:
         * CreateFailed 未知(空字符串，获取状态超时或出错)：""
         */
        @SerializedName("State")
        private String state;

        /** 服务器IP信息 */
        @SerializedName("IpSet")
        private List<IpSet> ipSet;

        public String getServerId() {
            return serverId;
        }

        public void setServerId(String serverId) {
            this.serverId = serverId;
        }

        public String getServerName() {
            return serverName;
        }

        public void setServerName(String serverName) {
            this.serverName = serverName;
        }

        public ServerModelInstance getServerModel() {
            return serverModel;
        }

        public void setServerModel(ServerModelInstance serverModel) {
            this.serverModel = serverModel;
        }

        public String getUPhoneModelName() {
            return uPhoneModelName;
        }

        public void setUPhoneModelName(String uPhoneModelName) {
            this.uPhoneModelName = uPhoneModelName;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getModifyTime() {
            return modifyTime;
        }

        public void setModifyTime(Integer modifyTime) {
            this.modifyTime = modifyTime;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getCityId() {
            return cityId;
        }

        public void setCityId(String cityId) {
            this.cityId = cityId;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public Integer getUPhoneCount() {
            return uPhoneCount;
        }

        public void setUPhoneCount(Integer uPhoneCount) {
            this.uPhoneCount = uPhoneCount;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public List<IpSet> getIpSet() {
            return ipSet;
        }

        public void setIpSet(List<IpSet> ipSet) {
            this.ipSet = ipSet;
        }
    }

    public static class ServerModelInstance extends Response {

        /** ServerModel名称 */
        @SerializedName("ServerModelName")
        private String serverModelName;

        /** 虚拟CPU核数。可选参数：1-64（具体机型与CPU的对应关系参照控制台）。 */
        @SerializedName("CPU")
        private Integer cpu;

        /** 内存大小。单位：MB。 */
        @SerializedName("Memory")
        private Integer memory;

        /** 磁盘信息见 UPhoneDiskSet */
        @SerializedName("DiskSet")
        private List<ServerDiskSet> diskSet;

        /** GPU类型 */
        @SerializedName("GPUType")
        private String gpuType;

        /** GPU个数 */
        @SerializedName("GPU")
        private Integer gpu;

        /** 【数组】手机说明，包含该服务器规格所能创建的手机规格名及对应手机开数。每项参数可见数据模型 [UPhoneSpec](#UPhoneSpec) */
        @SerializedName("UPhoneSpecs")
        private List<UPhoneSpec> uPhoneSpecs;

        /** 表示该机型是否上线，用于前端判断是否开放给用户。枚举值： >AVAILABLE，开放 >UNAVAILABLE, 不开放 */
        @SerializedName("ServerModelState")
        private String serverModelState;

        public String getServerModelName() {
            return serverModelName;
        }

        public void setServerModelName(String serverModelName) {
            this.serverModelName = serverModelName;
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

        public List<ServerDiskSet> getDiskSet() {
            return diskSet;
        }

        public void setDiskSet(List<ServerDiskSet> diskSet) {
            this.diskSet = diskSet;
        }

        public String getGPUType() {
            return gpuType;
        }

        public void setGPUType(String gpuType) {
            this.gpuType = gpuType;
        }

        public Integer getGPU() {
            return gpu;
        }

        public void setGPU(Integer gpu) {
            this.gpu = gpu;
        }

        public List<UPhoneSpec> getUPhoneSpecs() {
            return uPhoneSpecs;
        }

        public void setUPhoneSpecs(List<UPhoneSpec> uPhoneSpecs) {
            this.uPhoneSpecs = uPhoneSpecs;
        }

        public String getServerModelState() {
            return serverModelState;
        }

        public void setServerModelState(String serverModelState) {
            this.serverModelState = serverModelState;
        }
    }
}
