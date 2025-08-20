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

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeCompShareImagesResponse extends Response {

    /** 镜像详情列表 */
    @SerializedName("ImageSet")
    private List<CompShareImage> imageSet;

    /** 总数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<CompShareImage> getImageSet() {
        return imageSet;
    }

    public void setImageSet(List<CompShareImage> imageSet) {
        this.imageSet = imageSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class CompShareImage extends Response {

        /** 镜像Id */
        @SerializedName("CompShareImageId")
        private String compShareImageId;

        /** 镜像名称 */
        @SerializedName("Name")
        private String name;

        /** 镜像作者昵称 */
        @SerializedName("Author")
        private String author;

        /** 镜像作者认证信息 */
        @SerializedName("AuthInfo")
        private Integer authInfo;

        /** 镜像来源。 - Official 平台镜像； - Community 社区镜像 */
        @SerializedName("ImageOwnerAlias")
        private String imageOwnerAlias;

        /** 镜像类型。 - System 平台提供的公共镜像； - App 平台提供的应用镜像； - Custom 自制镜像； - Community 社区镜像 */
        @SerializedName("ImageType")
        private String imageType;

        /** 来源是否为官方镜像【仅自制镜像信息返回该字段】 */
        @SerializedName("IsOfficial")
        private Boolean isOfficial;

        /** 是否为容器镜像。 - True 容器镜像 - False 虚机镜像 */
        @SerializedName("Container")
        private String container;

        /** 镜像状态。 - Making 制作中； - Available 可用； - UnAvailable 不可用； - Reviewing 审核中; - Offline 已下线 */
        @SerializedName("Status")
        private String status;

        /** 镜像大小。单位MB */
        @SerializedName("Size")
        private Integer size;

        /** 可见性。0：私密镜像；1：公开至镜像社区 */
        @SerializedName("Visibility")
        private Integer visibility;

        /** 镜像描述信息 */
        @SerializedName("Description")
        private String description;

        /** 【array of string】镜像标签 */
        @SerializedName("Tags")
        private List<String> tags;

        /** 镜像价格。单位：元 */
        @SerializedName("Price")
        private Double price;

        /** 镜像封面URL */
        @SerializedName("Cover")
        private String cover;

        /** 镜像详细描述。仅指定镜像Id查询时返回 */
        @SerializedName("Readme")
        private String readme;

        /** 镜像软件信息 */
        @SerializedName("Softwares")
        private Software softwares;

        /** 镜像引用创建计数 */
        @SerializedName("CreatedCount")
        private Integer createdCount;

        /** 镜像收藏计数 */
        @SerializedName("FavoritesCount")
        private Integer favoritesCount;

        /** 镜像制作失败错误原因 */
        @SerializedName("FailedReason")
        private String failedReason;

        /** 创建时间戳 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 发布时间戳 */
        @SerializedName("PubTime")
        private Integer pubTime;

        /** 镜像所属账号信息 */
        @SerializedName("Owner")
        private Projects owner;

        /** 镜像组id */
        @SerializedName("GroupId")
        private String groupId;

        /** 版本名称 */
        @SerializedName("VersionName")
        private String versionName;

        /** 版本描述 */
        @SerializedName("VersionDesc")
        private String versionDesc;

        /** 自制镜像来源机型 */
        @SerializedName("SourceGpuType")
        private String sourceGpuType;

        /** 是否支持自启动 default:false */
        @SerializedName("AutoStart")
        private Boolean autoStart;

        /** 是否镜像收费 default: false */
        @SerializedName("ImageCharge")
        private Boolean imageCharge;

        /** 镜像使用时长 */
        @SerializedName("ImageUseTime")
        private Integer imageUseTime;

        public String getCompShareImageId() {
            return compShareImageId;
        }

        public void setCompShareImageId(String compShareImageId) {
            this.compShareImageId = compShareImageId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public Integer getAuthInfo() {
            return authInfo;
        }

        public void setAuthInfo(Integer authInfo) {
            this.authInfo = authInfo;
        }

        public String getImageOwnerAlias() {
            return imageOwnerAlias;
        }

        public void setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
        }

        public String getImageType() {
            return imageType;
        }

        public void setImageType(String imageType) {
            this.imageType = imageType;
        }

        public Boolean getIsOfficial() {
            return isOfficial;
        }

        public void setIsOfficial(Boolean isOfficial) {
            this.isOfficial = isOfficial;
        }

        public String getContainer() {
            return container;
        }

        public void setContainer(String container) {
            this.container = container;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public Integer getVisibility() {
            return visibility;
        }

        public void setVisibility(Integer visibility) {
            this.visibility = visibility;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getReadme() {
            return readme;
        }

        public void setReadme(String readme) {
            this.readme = readme;
        }

        public Software getSoftwares() {
            return softwares;
        }

        public void setSoftwares(Software softwares) {
            this.softwares = softwares;
        }

        public Integer getCreatedCount() {
            return createdCount;
        }

        public void setCreatedCount(Integer createdCount) {
            this.createdCount = createdCount;
        }

        public Integer getFavoritesCount() {
            return favoritesCount;
        }

        public void setFavoritesCount(Integer favoritesCount) {
            this.favoritesCount = favoritesCount;
        }

        public String getFailedReason() {
            return failedReason;
        }

        public void setFailedReason(String failedReason) {
            this.failedReason = failedReason;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getPubTime() {
            return pubTime;
        }

        public void setPubTime(Integer pubTime) {
            this.pubTime = pubTime;
        }

        public Projects getOwner() {
            return owner;
        }

        public void setOwner(Projects owner) {
            this.owner = owner;
        }

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public String getVersionName() {
            return versionName;
        }

        public void setVersionName(String versionName) {
            this.versionName = versionName;
        }

        public String getVersionDesc() {
            return versionDesc;
        }

        public void setVersionDesc(String versionDesc) {
            this.versionDesc = versionDesc;
        }

        public String getSourceGpuType() {
            return sourceGpuType;
        }

        public void setSourceGpuType(String sourceGpuType) {
            this.sourceGpuType = sourceGpuType;
        }

        public Boolean getAutoStart() {
            return autoStart;
        }

        public void setAutoStart(Boolean autoStart) {
            this.autoStart = autoStart;
        }

        public Boolean getImageCharge() {
            return imageCharge;
        }

        public void setImageCharge(Boolean imageCharge) {
            this.imageCharge = imageCharge;
        }

        public Integer getImageUseTime() {
            return imageUseTime;
        }

        public void setImageUseTime(Integer imageUseTime) {
            this.imageUseTime = imageUseTime;
        }
    }

    public static class Projects extends Response {

        /** 账号昵称 */
        @SerializedName("AccountName")
        private String accountName;

        /** 账号Id */
        @SerializedName("AccountId")
        private String accountId;

        public String getAccountName() {
            return accountName;
        }

        public void setAccountName(String accountName) {
            this.accountName = accountName;
        }

        public String getAccountId() {
            return accountId;
        }

        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }
    }

    public static class Software extends Response {

        /** 框架名称 */
        @SerializedName("Framework")
        private String framework;

        /** 框架版本 */
        @SerializedName("FrameworkVersion")
        private String frameworkVersion;

        /** CUDA版本 */
        @SerializedName("CUDAVersion")
        private String cudaVersion;

        /** 【array of string】应用列表 */
        @SerializedName("Applications")
        private List<String> applications;

        public String getFramework() {
            return framework;
        }

        public void setFramework(String framework) {
            this.framework = framework;
        }

        public String getFrameworkVersion() {
            return frameworkVersion;
        }

        public void setFrameworkVersion(String frameworkVersion) {
            this.frameworkVersion = frameworkVersion;
        }

        public String getCUDAVersion() {
            return cudaVersion;
        }

        public void setCUDAVersion(String cudaVersion) {
            this.cudaVersion = cudaVersion;
        }

        public List<String> getApplications() {
            return applications;
        }

        public void setApplications(List<String> applications) {
            this.applications = applications;
        }
    }
}
