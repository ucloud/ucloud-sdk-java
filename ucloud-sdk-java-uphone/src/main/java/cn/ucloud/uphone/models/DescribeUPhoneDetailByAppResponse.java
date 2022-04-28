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

public class DescribeUPhoneDetailByAppResponse extends Response {

    /** UPhoneWithAppVersion总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 带有应用版本的云手机实例，具体参数见数据模型 [UPhoneDetailInstanc](#UPhoneDetailInstanc) */
    @SerializedName("UPhoneDetails")
    private List<UPhoneDetailInstance> uPhoneDetails;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UPhoneDetailInstance> getUPhoneDetails() {
        return uPhoneDetails;
    }

    public void setUPhoneDetails(List<UPhoneDetailInstance> uPhoneDetails) {
        this.uPhoneDetails = uPhoneDetails;
    }

    public static class AppVersionInstance extends Response {

        /** 应用的唯一标识ID */
        @SerializedName("AppId")
        private String appId;

        /** 应用版本的唯一标识ID */
        @SerializedName("AppVersionId")
        private String appVersionId;

        /** 应用版本名。 */
        @SerializedName("AppVersionName")
        private String appVersionName;

        /** 应用包名。 */
        @SerializedName("PackageName")
        private String packageName;

        /** 应用版本相关的Apk文件存放的公网URL地址。 */
        @SerializedName("URL")
        private String url;

        /** 创建时间，格式为Unix时间戳。 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 修改时间，格式为Unix时间戳。 */
        @SerializedName("ModifyTime")
        private Integer modifyTime;

        /** 应用版本描述。 */
        @SerializedName("Description")
        private String description;

        public String getAppId() {
            return appId;
        }

        public void setAppId(String appId) {
            this.appId = appId;
        }

        public String getAppVersionId() {
            return appVersionId;
        }

        public void setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
        }

        public String getAppVersionName() {
            return appVersionName;
        }

        public void setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
        }

        public String getPackageName() {
            return packageName;
        }

        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }

        public String getURL() {
            return url;
        }

        public void setURL(String url) {
            this.url = url;
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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public static class UPhoneDetailInstance extends Response {

        /** 云手机的名称，不超过65个字符。 */
        @SerializedName("UPhoneName")
        private String uPhoneName;

        /** 云手机规格名称 */
        @SerializedName("UPhoneId")
        private String uPhoneId;

        /** 虚拟CPU核数。 */
        @SerializedName("CPU")
        private Integer cpu;

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
         * * 未知状态：UNDEFINED或""
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

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        /** 应用版本实例，每项参数可见数据模型 [AppVersionInstance](#AppVersionInstance) */
        @SerializedName("AppVersion")
        private AppVersionInstance appVersion;

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

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public AppVersionInstance getAppVersion() {
            return appVersion;
        }

        public void setAppVersion(AppVersionInstance appVersion) {
            this.appVersion = appVersion;
        }
    }
}
