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
package cn.ucloud.uhost.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeImageResponse extends Response {

    /** 满足条件的镜像总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 镜像列表详见 UHostImageSet */
    @SerializedName("ImageSet")
    private List<UHostImageSet> imageSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UHostImageSet> getImageSet() {
        return imageSet;
    }

    public void setImageSet(List<UHostImageSet> imageSet) {
        this.imageSet = imageSet;
    }

    public static class UHostImageSet extends Response {

        /** 可用区，参见 [可用区列表](../summary/regionlist.html) */
        @SerializedName("Zone")
        private String zone;

        /** 镜像ID */
        @SerializedName("ImageId")
        private String imageId;

        /** 镜像名称 */
        @SerializedName("ImageName")
        private String imageName;

        /** 操作系统类型：Linux，Windows */
        @SerializedName("OsType")
        private String osType;

        /** 操作系统名称 */
        @SerializedName("OsName")
        private String osName;

        /** 镜像类型 标准镜像：Base， 行业镜像：Business，自定义镜像：Custom */
        @SerializedName("ImageType")
        private String imageType;

        /**
         * 特殊状态标识，目前包含NetEnhnced（网络增强1.0）, NetEnhanced_Ultra（网络增强2.0）, NetEnhanced_Extreme（网络增强3.0）,
         * HotPlug(热升级), GPU（GPU镜像）,CloudInit,
         * IPv6（支持IPv6网络）,RssdAttachable（支持RSSD云盘）,Vgpu_AMD（支持AMD的vgpu）,Vgpu_NVIDIA（支持NVIDIA的vgpu）,Aarch64_Type（支持arm64架构）
         */
        @SerializedName("Features")
        private List<String> features;

        /**
         * 镜像归属,枚举值:["gpu","app","uhost"]。"gpu":
         * 对gpu进行处理过的行业镜像；"app"：轻量云主机专用的镜像；"uhost"：云主机镜像市场的行业镜像
         */
        @SerializedName("FuncType")
        private String funcType;

        /** 集成软件名称（仅行业镜像将返回这个值） */
        @SerializedName("IntegratedSoftware")
        private String integratedSoftware;

        /** 供应商（仅行业镜像将返回这个值） */
        @SerializedName("Vendor")
        private String vendor;

        /** 介绍链接（仅行业镜像将返回这个值） */
        @SerializedName("Links")
        private String links;

        /** 镜像状态， 可用：Available，制作中：Making， 不可用：Unavailable，复制中：Copying */
        @SerializedName("State")
        private String state;

        /** 镜像描述 */
        @SerializedName("ImageDescription")
        private String imageDescription;

        /** 创建时间，格式为Unix时间戳 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 镜像大小 */
        @SerializedName("ImageSize")
        private Integer imageSize;

        /** 默认值为空'''。当CentOS 7.3/7.4/7.5等镜像会标记为“Broadwell” */
        @SerializedName("MinimalCPU")
        private String minimalCPU;

        /** 系统EOL的时间，格式：YYYY/MM/DD */
        @SerializedName("MaintainEol")
        private String maintainEol;

        /** 支持的GPU机型 */
        @SerializedName("SupportedGPUTypes")
        private List<String> supportedGPUTypes;

        /**
         * 场景分类，目前包含Featured（精选），PreInstalledDrivers（预装驱动），AIPainting（AI绘画），AIModels（AI模型），HPC（高性能计算）
         */
        @SerializedName("SceneCategories")
        private List<String> sceneCategories;

        /** 主要安装软件 */
        @SerializedName("PrimarySoftware")
        private String primarySoftware;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

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

        public String getOsName() {
            return osName;
        }

        public void setOsName(String osName) {
            this.osName = osName;
        }

        public String getImageType() {
            return imageType;
        }

        public void setImageType(String imageType) {
            this.imageType = imageType;
        }

        public List<String> getFeatures() {
            return features;
        }

        public void setFeatures(List<String> features) {
            this.features = features;
        }

        public String getFuncType() {
            return funcType;
        }

        public void setFuncType(String funcType) {
            this.funcType = funcType;
        }

        public String getIntegratedSoftware() {
            return integratedSoftware;
        }

        public void setIntegratedSoftware(String integratedSoftware) {
            this.integratedSoftware = integratedSoftware;
        }

        public String getVendor() {
            return vendor;
        }

        public void setVendor(String vendor) {
            this.vendor = vendor;
        }

        public String getLinks() {
            return links;
        }

        public void setLinks(String links) {
            this.links = links;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getImageDescription() {
            return imageDescription;
        }

        public void setImageDescription(String imageDescription) {
            this.imageDescription = imageDescription;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getImageSize() {
            return imageSize;
        }

        public void setImageSize(Integer imageSize) {
            this.imageSize = imageSize;
        }

        public String getMinimalCPU() {
            return minimalCPU;
        }

        public void setMinimalCPU(String minimalCPU) {
            this.minimalCPU = minimalCPU;
        }

        public String getMaintainEol() {
            return maintainEol;
        }

        public void setMaintainEol(String maintainEol) {
            this.maintainEol = maintainEol;
        }

        public List<String> getSupportedGPUTypes() {
            return supportedGPUTypes;
        }

        public void setSupportedGPUTypes(List<String> supportedGPUTypes) {
            this.supportedGPUTypes = supportedGPUTypes;
        }

        public List<String> getSceneCategories() {
            return sceneCategories;
        }

        public void setSceneCategories(List<String> sceneCategories) {
            this.sceneCategories = sceneCategories;
        }

        public String getPrimarySoftware() {
            return primarySoftware;
        }

        public void setPrimarySoftware(String primarySoftware) {
            this.primarySoftware = primarySoftware;
        }
    }
}
