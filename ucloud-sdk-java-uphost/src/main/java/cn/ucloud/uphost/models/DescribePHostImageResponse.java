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
package cn.ucloud.uphost.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribePHostImageResponse extends Response {

    /** 满足条件的镜像总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 镜像列表 PHostImageSet */
    @SerializedName("ImageSet")
    private List<PHostImageSet> imageSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<PHostImageSet> getImageSet() {
        return imageSet;
    }

    public void setImageSet(List<PHostImageSet> imageSet) {
        this.imageSet = imageSet;
    }

    public static class PHostImageSet extends Response {

        /** 镜像ID */
        @SerializedName("ImageId")
        private String imageId;

        /** 镜像名称 */
        @SerializedName("ImageName")
        private String imageName;

        /** 操作系统名称 */
        @SerializedName("OsName")
        private String osName;

        /** 操作系统类型 */
        @SerializedName("OsType")
        private String osType;

        /** 支持的机型 */
        @SerializedName("Support")
        private List<String> support;

        /** 当前版本 */
        @SerializedName("Version")
        private String version;

        /** 枚举值：Base=>基础镜像，Custom=>自制镜像。 */
        @SerializedName("ImageType")
        private String imageType;

        /** 裸金属2.0参数。镜像创建时间。 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 裸金属2.0参数。镜像当前状态。 */
        @SerializedName("State")
        private String state;

        /** 裸金属2.0参数。镜像大小。 */
        @SerializedName("ImageSize")
        private Integer imageSize;

        /** 镜像描述 */
        @SerializedName("ImageDescription")
        private String imageDescription;

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

        public String getOsName() {
            return osName;
        }

        public void setOsName(String osName) {
            this.osName = osName;
        }

        public String getOsType() {
            return osType;
        }

        public void setOsType(String osType) {
            this.osType = osType;
        }

        public List<String> getSupport() {
            return support;
        }

        public void setSupport(List<String> support) {
            this.support = support;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
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

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Integer getImageSize() {
            return imageSize;
        }

        public void setImageSize(Integer imageSize) {
            this.imageSize = imageSize;
        }

        public String getImageDescription() {
            return imageDescription;
        }

        public void setImageDescription(String imageDescription) {
            this.imageDescription = imageDescription;
        }
    }
}
