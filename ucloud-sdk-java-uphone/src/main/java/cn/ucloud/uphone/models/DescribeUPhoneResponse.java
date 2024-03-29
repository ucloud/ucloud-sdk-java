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

public class DescribeUPhoneResponse extends Response {

    /** UPhoneInstance总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 云手机实例列表，每项参数可见数据模型 [UPhoneInstance](#UPhoneInstance) */
    @SerializedName("UPhones")
    private List<UPhoneInstance> uPhones;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UPhoneInstance> getUPhones() {
        return uPhones;
    }

    public void setUPhones(List<UPhoneInstance> uPhones) {
        this.uPhones = uPhones;
    }

    public static class UPhoneInstance extends Response {

        /** 云手机的名称，不超过65个字符。 */
        @SerializedName("UPhoneName")
        private String uPhoneName;

        /** 云手机的唯一标识，不超过32个字节。 */
        @SerializedName("UPhoneId")
        private String uPhoneId;

        /** 云手机规格名称 */
        @SerializedName("UPhoneModelName")
        private String uPhoneModelName;

        /** 虚拟CPU核数。 */
        @SerializedName("CPU")
        private Double cpu;

        /** 内存大小。单位MB */
        @SerializedName("Memory")
        private Integer memory;

        /** 磁盘大小，单位: GB */
        @SerializedName("DiskSize")
        private Integer diskSize;

        /** 分辨率 */
        @SerializedName("Resolution")
        private String resolution;

        /** 刷新率 */
        @SerializedName("Refresh")
        private Integer refresh;

        /** 云手机所在的服务器ID，不超过32个字节。 */
        @SerializedName("ServerId")
        private String serverId;

        /** 云手机镜像ID，不超过32个字节。 */
        @SerializedName("ImageId")
        private String imageId;

        /** 云手机镜像系统，如"Android armv8" */
        @SerializedName("OsType")
        private String osType;

        /**
         * 云手机状态<br>
         * * 启动中: STARTING; <br>
         * * 运行中: RUNNING; <br>
         * * 关机中: STOPPING; <br>
         * * 关机: STOPPED <br>
         * * 重启中: REBOOTING; <br>
         * * 重置中: RESETTING; <br>
         * * 启动失败: START_FAILED; <br>
         * * 关机失败: STOP_FAILED; <br>
         * * 重启失败: REBOOT_FAILED; <br>
         * * 重置失败: RESET_FAILED; <br>
         * * 未知状态：UNDEFINED_STATE或""
         */
        @SerializedName("State")
        private String state;

        /** 城市Id，eg: cn-shanghai, cn-jinan */
        @SerializedName("CityId")
        private String cityId;

        /** 城市名称，eg:上海二、济南市 */
        @SerializedName("CityName")
        private String cityName;

        /** 创建时间，格式为Unix时间戳。 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 业务组名称 */
        @SerializedName("Tag")
        private String tag;

        /** 云手机启动图片URL链接 */
        @SerializedName("SplashScreen")
        private String splashScreen;

        /** 云手机异步任务回调 */
        @SerializedName("Callback")
        private String callback;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        /** 计费模式。枚举值为： > 年 Year，按年付费； > Month，按月付费； > Dynamic，按小时预付费; 默认为月付 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 到期时间；格式为Unix时间戳 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** IP所属地域Id，eg: hk，th-bkk */
        @SerializedName("IpRegion")
        private String ipRegion;

        /** 云手机IP地址 */
        @SerializedName("Ip")
        private String ip;

        /** 云手机IP地址ID */
        @SerializedName("EipId")
        private String eipId;

        /** 所属共享带宽ID */
        @SerializedName("ShareBandwidthId")
        private String shareBandwidthId;

        /** 所属共享带宽名称 */
        @SerializedName("ShareBandwidthName")
        private String shareBandwidthName;

        /** 云手机的ADB信息 */
        @SerializedName("ADB")
        private String adb;

        /** 云手机带宽，单位Kbps */
        @SerializedName("UPhoneBandwidth")
        private Integer uPhoneBandwidth;

        /** 是否锁定带宽，true代表锁定不可更改，false代表未锁定可以修改带宽 */
        @SerializedName("LockBandwidth")
        private Boolean lockBandwidth;

        /** 云手机场景 */
        @SerializedName("UPhoneScene")
        private String uPhoneScene;

        public String getUPhoneName() {
            return uPhoneName;
        }

        public void setUPhoneName(String uPhoneName) {
            this.uPhoneName = uPhoneName;
        }

        public String getUPhoneId() {
            return uPhoneId;
        }

        public void setUPhoneId(String uPhoneId) {
            this.uPhoneId = uPhoneId;
        }

        public String getUPhoneModelName() {
            return uPhoneModelName;
        }

        public void setUPhoneModelName(String uPhoneModelName) {
            this.uPhoneModelName = uPhoneModelName;
        }

        public Double getCPU() {
            return cpu;
        }

        public void setCPU(Double cpu) {
            this.cpu = cpu;
        }

        public Integer getMemory() {
            return memory;
        }

        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        public Integer getDiskSize() {
            return diskSize;
        }

        public void setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
        }

        public String getResolution() {
            return resolution;
        }

        public void setResolution(String resolution) {
            this.resolution = resolution;
        }

        public Integer getRefresh() {
            return refresh;
        }

        public void setRefresh(Integer refresh) {
            this.refresh = refresh;
        }

        public String getServerId() {
            return serverId;
        }

        public void setServerId(String serverId) {
            this.serverId = serverId;
        }

        public String getImageId() {
            return imageId;
        }

        public void setImageId(String imageId) {
            this.imageId = imageId;
        }

        public String getOsType() {
            return osType;
        }

        public void setOsType(String osType) {
            this.osType = osType;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
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

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getSplashScreen() {
            return splashScreen;
        }

        public void setSplashScreen(String splashScreen) {
            this.splashScreen = splashScreen;
        }

        public String getCallback() {
            return callback;
        }

        public void setCallback(String callback) {
            this.callback = callback;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public String getIpRegion() {
            return ipRegion;
        }

        public void setIpRegion(String ipRegion) {
            this.ipRegion = ipRegion;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getEipId() {
            return eipId;
        }

        public void setEipId(String eipId) {
            this.eipId = eipId;
        }

        public String getShareBandwidthId() {
            return shareBandwidthId;
        }

        public void setShareBandwidthId(String shareBandwidthId) {
            this.shareBandwidthId = shareBandwidthId;
        }

        public String getShareBandwidthName() {
            return shareBandwidthName;
        }

        public void setShareBandwidthName(String shareBandwidthName) {
            this.shareBandwidthName = shareBandwidthName;
        }

        public String getADB() {
            return adb;
        }

        public void setADB(String adb) {
            this.adb = adb;
        }

        public Integer getUPhoneBandwidth() {
            return uPhoneBandwidth;
        }

        public void setUPhoneBandwidth(Integer uPhoneBandwidth) {
            this.uPhoneBandwidth = uPhoneBandwidth;
        }

        public Boolean getLockBandwidth() {
            return lockBandwidth;
        }

        public void setLockBandwidth(Boolean lockBandwidth) {
            this.lockBandwidth = lockBandwidth;
        }

        public String getUPhoneScene() {
            return uPhoneScene;
        }

        public void setUPhoneScene(String uPhoneScene) {
            this.uPhoneScene = uPhoneScene;
        }
    }
}
