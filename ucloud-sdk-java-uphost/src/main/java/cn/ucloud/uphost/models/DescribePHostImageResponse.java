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

    /** 满足条件的镜像总数: false */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 镜像列表 PHostImageSet: false */
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

        /** 镜像ID: false */
        @SerializedName("ImageId")
        private String imageId;

        /** 镜像名称: false */
        @SerializedName("ImageName")
        private String imageName;

        /** 操作系统名称: false */
        @SerializedName("OsName")
        private String osName;

        /** 操作系统类型: false */
        @SerializedName("OsType")
        private String osType;

        /** 支持的机型: false */
        @SerializedName("Support")
        private List<String> support;

        /** 当前版本: false */
        @SerializedName("Version")
        private String version;

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
    }
}
