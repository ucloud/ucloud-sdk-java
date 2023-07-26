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

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUK8SImageResponse extends Response {

    /** 虚拟机可用镜像集合, 详见ImageInfo 数组 */
    @SerializedName("ImageSet")
    private List<ImageInfo> imageSet;

    /** 物理机可用镜像集合, 详见ImageInfo 数组 */
    @SerializedName("PHostImageSet")
    private List<ImageInfo> pHostImageSet;

    public List<ImageInfo> getImageSet() {
        return imageSet;
    }

    public void setImageSet(List<ImageInfo> imageSet) {
        this.imageSet = imageSet;
    }

    public List<ImageInfo> getPHostImageSet() {
        return pHostImageSet;
    }

    public void setPHostImageSet(List<ImageInfo> pHostImageSet) {
        this.pHostImageSet = pHostImageSet;
    }

    public static class ImageInfo extends Response {

        /** 可用区 Id */
        @SerializedName("ZoneId")
        private Integer zoneId;

        /** 镜像 Id */
        @SerializedName("ImageId")
        private String imageId;

        /** 镜像名称 */
        @SerializedName("ImageName")
        private String imageName;

        /** 该镜像是否支持GPU机型，枚举值[true:不支持，false:支持]。 */
        @SerializedName("NotSupportGPU")
        private Boolean notSupportGPU;

        public Integer getZoneId() {
            return zoneId;
        }

        public void setZoneId(Integer zoneId) {
            this.zoneId = zoneId;
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

        public Boolean getNotSupportGPU() {
            return notSupportGPU;
        }

        public void setNotSupportGPU(Boolean notSupportGPU) {
            this.notSupportGPU = notSupportGPU;
        }
    }
}
