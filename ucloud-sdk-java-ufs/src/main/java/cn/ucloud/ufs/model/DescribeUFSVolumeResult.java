package cn.ucloud.ufs.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:  获取文件系统列表 结果类
 * @author: codezhang
 * @date: 2018-10-08 14:44
 **/

public class DescribeUFSVolumeResult extends BaseResponseResult {

    public static class UFSVolumeInfo {

        /**
         * 文件系统名称
         */
        @SerializedName("VolumeName")
        private String volumeName;

        /**
         * 文件系统ID
         */
        @SerializedName("VolumeId")
        private String volumeId;

        /**
         * 文件系统是否已添加挂载点
         */
        @SerializedName("VolumeStatus")
        private String volumeStatus;

        /**
         * 文件系统已添加挂载点时返回
         */
        @SerializedName("MountPoint")
        private String mountPoint;

        /**
         * 文件系统备注信息
         */
        @SerializedName("Remark")
        private String remark;

        /**
         * 文件系统所属业务组
         */
        @SerializedName("Tag")
        private String tag;

        /**
         * 文件系统创建时间（unix时间戳）
         */
        @SerializedName("CreateTime")
        private Integer createTime;

        /**
         * 文件系统过期时间（unix时间戳）
         */
        @SerializedName("ExpiredTime")
        private Integer expiredTime;

        /**
         * 文件系统大小，单位GB
         */
        @SerializedName("Size")
        private Integer size;

        /**
         * 是否过期
         */
        @SerializedName("IsExpired")
        private String isExpired;

        public String getVolumeName() {
            return volumeName;
        }

        public void setVolumeName(String volumeName) {
            this.volumeName = volumeName;
        }

        public String getVolumeId() {
            return volumeId;
        }

        public void setVolumeId(String volumeId) {
            this.volumeId = volumeId;
        }

        public String getVolumeStatus() {
            return volumeStatus;
        }

        public void setVolumeStatus(String volumeStatus) {
            this.volumeStatus = volumeStatus;
        }

        public String getMountPoint() {
            return mountPoint;
        }

        public void setMountPoint(String mountPoint) {
            this.mountPoint = mountPoint;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getExpiredTime() {
            return expiredTime;
        }

        public void setExpiredTime(Integer expiredTime) {
            this.expiredTime = expiredTime;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public String getIsExpired() {
            return isExpired;
        }

        public void setIsExpired(String isExpired) {
            this.isExpired = isExpired;
        }

        @Override
        public String toString() {
            return "UFSVolumeInfo{" +
                    "volumeName='" + volumeName + '\'' +
                    ", volumeId='" + volumeId + '\'' +
                    ", volumeStatus='" + volumeStatus + '\'' +
                    ", mountPoint='" + mountPoint + '\'' +
                    ", remark='" + remark + '\'' +
                    ", tag='" + tag + '\'' +
                    ", createTime=" + createTime +
                    ", expiredTime=" + expiredTime +
                    ", size=" + size +
                    ", isExpired='" + isExpired + '\'' +
                    '}';
        }
    }


    /**
     * 文件系统总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 文件系统详细信息列表
     */
    @SerializedName("DataSet")
    private List<UFSVolumeInfo> ufsVolumeInfos;


    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UFSVolumeInfo> getUfsVolumeInfos() {
        return ufsVolumeInfos;
    }

    public void setUfsVolumeInfos(List<UFSVolumeInfo> ufsVolumeInfos) {
        this.ufsVolumeInfos = ufsVolumeInfos;
    }

    @Override
    public String toString() {
        return "DescribeUFSVolumeResult{" +
                "totalCount=" + totalCount +
                ", ufsVolumeInfos=" + ufsVolumeInfos +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
