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
package cn.ucloud.uec.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GetUEcImageResponse extends Response {

    /** 获取的镜像信息，具体参考下面ImageInfo: false */
    @SerializedName("ImageList")
    private List<ImageInfo> imageList;

    /** 镜像总数: false */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<ImageInfo> getImageList() {
        return imageList;
    }

    public void setImageList(List<ImageInfo> imageList) {
        this.imageList = imageList;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class ImageInfo extends Response {

        /** 镜像ID: false */
        @SerializedName("ImageId")
        private String imageId;

        /** 镜像名称: false */
        @SerializedName("ImageName")
        private String imageName;

        /** 镜像类型：1标准镜像，2行业镜像，3自定义镜像: false */
        @SerializedName("ImageType")
        private Integer imageType;

        /** 系统类型：unix, windows: false */
        @SerializedName("OcType")
        private String ocType;

        /** 镜像描述: false */
        @SerializedName("ImageDesc")
        private String imageDesc;

        /** 镜像状态：镜像状态 1可用，2不可用，3制作中: false */
        @SerializedName("State")
        private Integer state;

        /** 镜像大小，单位GB: false */
        @SerializedName("ImageSize")
        private Integer imageSize;

        /** 镜像创建时间戳: false */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 部署详情列表: false */
        @SerializedName("DeployInfoList")
        private List<DeployImageInfo> deployInfoList;

        /** 是否支持Gpu(1-支持,0-不支持): false */
        @SerializedName("Gpu")
        private Integer gpu;

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

        public Integer getImageType() {
            return imageType;
        }

        public void setImageType(Integer imageType) {
            this.imageType = imageType;
        }

        public String getOcType() {
            return ocType;
        }

        public void setOcType(String ocType) {
            this.ocType = ocType;
        }

        public String getImageDesc() {
            return imageDesc;
        }

        public void setImageDesc(String imageDesc) {
            this.imageDesc = imageDesc;
        }

        public Integer getState() {
            return state;
        }

        public void setState(Integer state) {
            this.state = state;
        }

        public Integer getImageSize() {
            return imageSize;
        }

        public void setImageSize(Integer imageSize) {
            this.imageSize = imageSize;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public List<DeployImageInfo> getDeployInfoList() {
            return deployInfoList;
        }

        public void setDeployInfoList(List<DeployImageInfo> deployInfoList) {
            this.deployInfoList = deployInfoList;
        }

        public Integer getGpu() {
            return gpu;
        }

        public void setGpu(Integer gpu) {
            this.gpu = gpu;
        }
    }

    public static class DeployImageInfo extends Response {

        /** 机房ID: false */
        @SerializedName("IdcId")
        private String idcId;

        /** 镜像状态 1-可用, 2-不可用, 3-获取中, 4-转换中, 5-部署中: false */
        @SerializedName("State")
        private Integer state;

        public String getIdcId() {
            return idcId;
        }

        public void setIdcId(String idcId) {
            this.idcId = idcId;
        }

        public Integer getState() {
            return state;
        }

        public void setState(Integer state) {
            this.state = state;
        }
    }
}
