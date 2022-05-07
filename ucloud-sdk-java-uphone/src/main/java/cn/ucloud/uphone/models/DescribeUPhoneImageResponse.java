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

public class DescribeUPhoneImageResponse extends Response {

    /** 云手机镜像实例列表，具体参数见 [UPhoneImageInstance](#uphoneimageinstance) */
    @SerializedName("Images")
    private List<UPhoneImageInstance> images;

    /** UPhoneImageInstance总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<UPhoneImageInstance> getImages() {
        return images;
    }

    public void setImages(List<UPhoneImageInstance> images) {
        this.images = images;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class UPhoneImageInstance extends Response {

        /** 云手机镜像资源Id */
        @SerializedName("ImageId")
        private String imageId;

        /** 云手机镜像名称 */
        @SerializedName("ImageName")
        private String imageName;

        /** 云手机镜像系统 */
        @SerializedName("OsType")
        private String osType;

        /**
         * 云手机镜像类型，枚举值：<br>
         * > 用户自制镜像: CUSTOM; <br>
         * > 标准镜像: BASE;;
         */
        @SerializedName("ImageType")
        private String imageType;

        /** 创建时间，格式为Unix时间戳。 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 修改时间，格式为Unix时间戳。 */
        @SerializedName("ModifyTime")
        private Integer modifyTime;

        /**
         * 云手机镜像状态<br>
         * * 制作中: 制作中; <br>
         * * 可用的: CREATING; <br>
         * * 制作失败: CREATE_FAILED; <br>
         * * 上传中: UPLOADING <br>
         * * 上传失败: UPLOAD_FAILED; <br>
         * * 未知状态：UNDEFINED或""
         */
        @SerializedName("ImageState")
        private String imageState;

        /** 云手机镜像描述信息 */
        @SerializedName("Description")
        private String description;

        /** 云手机镜像创建时所属云手机资源 Id */
        @SerializedName("UPhoneId")
        private String uPhoneId;

        /** 云手机镜像所安装的应用版本列表，具体参数见 [AppVersionInstance](#appversioninstance) */
        @SerializedName("AppVersions")
        private List<AppVersionInstance> appVersions;

        public String getImageId() {
            return imageId;
        }

        public void setImageId(String imageId) {
            this.imageId = imageId;
        }

        public String getImageName() {
            return imageName;
        }

        public void setImageName(String imageName) {
            this.imageName = imageName;
        }

        public String getOsType() {
            return osType;
        }

        public void setOsType(String osType) {
            this.osType = osType;
        }

        public String getImageType() {
            return imageType;
        }

        public void setImageType(String imageType) {
            this.imageType = imageType;
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

        public String getImageState() {
            return imageState;
        }

        public void setImageState(String imageState) {
            this.imageState = imageState;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUPhoneId() {
            return uPhoneId;
        }

        public void setUPhoneId(String uPhoneId) {
            this.uPhoneId = uPhoneId;
        }

        public List<AppVersionInstance> getAppVersions() {
            return appVersions;
        }

        public void setAppVersions(List<AppVersionInstance> appVersions) {
            this.appVersions = appVersions;
        }
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
}
