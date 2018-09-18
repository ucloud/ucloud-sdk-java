package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取镜像 结果类
 * @author: codezhang
 * @date: 2018-09-18 16:30
 **/

public class DescribeImageResult extends BaseResponseResult {

    public class UhostImage{
        /**
         * 镜像ID
         */
        @SerializedName("ImageId")
        private String imageId;

        /**
         * 镜像名称
         */
        @SerializedName("ImageName")
        private String imageName;

        /**
         * 可用区，参见 [可用区列表](../summary/regionlist.html) |
         */
        @SerializedName("Zone")
        private String zone;

        /**
         * 操作系统类型：Liunx，Windows
         */
        @SerializedName("OsType")
        private String osType;

        /**
         * 操作系统名称
         */
        @SerializedName("OsName")
        private String osName;

        /**
         * 镜像类型 标准镜像：Base， 行业镜像：Business，自定义镜像：Custom
         */
        @SerializedName("ImageType")
        private String imageType;

        /**
         * 特殊状态标识
         */
        @SerializedName("Features")
        private List<String> features;

        /**
         * 行业镜像类型（仅行业镜像将返回这个值）
         */
        @SerializedName("FuncType")
        private String funcType;

        /**
         * 集成软件名称（仅行业镜像将返回这个值）
         */
        @SerializedName("IntegratedSoftware")
        private String integratedSoftware;

        /**
         * 供应商（仅行业镜像将返回这个值）
         */
        @SerializedName("Vendor")
        private String vendor;

        /**
         * 介绍链接（仅行业镜像将返回这个值）
         */
        @SerializedName("Links")
        private String link;

        /**
         * 镜像状态， 可用：Available，制作中：Making， 不可用：Unavailable
         */
        @SerializedName("State")
        private String state;

        /**
         * 镜像描述
         */
        @SerializedName("ImageDescription")
        private String imageDescription;

        /**
         * 创建时间，格式为Unix时间戳
         */
        @SerializedName("CreateTime")
        private Integer createTime;

        /**
         * 镜像大小
         */
        @SerializedName("ImageSize")
        private Integer imageSize;

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

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
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

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
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

        @Override
        public String toString() {
            return "UhostImage{" +
                    "imageId='" + imageId + '\'' +
                    ", imageName='" + imageName + '\'' +
                    ", zone='" + zone + '\'' +
                    ", osType='" + osType + '\'' +
                    ", osName='" + osName + '\'' +
                    ", imageType='" + imageType + '\'' +
                    ", features=" + features +
                    ", funcType='" + funcType + '\'' +
                    ", integratedSoftware='" + integratedSoftware + '\'' +
                    ", vendor='" + vendor + '\'' +
                    ", link='" + link + '\'' +
                    ", state='" + state + '\'' +
                    ", imageDescription='" + imageDescription + '\'' +
                    ", createTime=" + createTime +
                    ", imageSize=" + imageSize +
                    '}';
        }
    }


    /**
     * 满足条件的镜像总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 镜像列表详见 UHostImageSet
     */
    @SerializedName("ImageSet")
    private List<UhostImage> images;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UhostImage> getImages() {
        return images;
    }

    public void setImages(List<UhostImage> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "DescribeImageResult{" +
                "totalCount=" + totalCount +
                ", images=" + images +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
