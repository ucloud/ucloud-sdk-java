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
         * 特殊状态标识， 目前包含NetEnhnced（网络增强1.0）, NetEnhanced_Ultra]（网络增强2.0）, HotPlug(热升级), CloudInit,
         * IPv6
         */
        @SerializedName("Features")
        private List<String> features;

        /** 行业镜像类型（仅行业镜像将返回这个值） */
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

        /** 镜像状态， 可用：Available，制作中：Making， 不可用：Unavailable */
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
    }
}
