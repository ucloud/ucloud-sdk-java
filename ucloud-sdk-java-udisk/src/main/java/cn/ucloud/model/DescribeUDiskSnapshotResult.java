package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 18:06
 */
public class DescribeUDiskSnapshotResult extends BaseResponseResult {

    @SerializedName("TotalCount")
    private int totalCount;
    @SerializedName("DataSet")
    private List<UDiskSnapshotData> dataSet;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<UDiskSnapshotData> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDiskSnapshotData> dataSet) {
        this.dataSet = dataSet;
    }

    public static class UDiskSnapshotData {
        @SerializedName("Comment")
        private String comment;
        @SerializedName("ChargeType")
        private String chargeType;
        @SerializedName("Name")
        private String name;
        @SerializedName("UDiskName")
        private String uDiskName;
        @SerializedName("ExpiredTime")
        private int expiredTime;
        @SerializedName("UDiskId")
        private String uDiskId;
        @SerializedName("SnapshotId")
        private String snapshotId;
        @SerializedName("CreateTime")
        private int createTime;
        @SerializedName("Size")
        private int size;
        @SerializedName("Status")
        private String status;
        @SerializedName("IsUDiskAvailable")
        private boolean isUDiskAvailable;
        @SerializedName("Version")
        private String version;
        @SerializedName("DiskType")
        private int diskType;
        @SerializedName("UHostId")
        private String uHostId;

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getuDiskName() {
            return uDiskName;
        }

        public void setuDiskName(String uDiskName) {
            this.uDiskName = uDiskName;
        }

        public int getExpiredTime() {
            return expiredTime;
        }

        public void setExpiredTime(int expiredTime) {
            this.expiredTime = expiredTime;
        }

        public String getuDiskId() {
            return uDiskId;
        }

        public void setuDiskId(String uDiskId) {
            this.uDiskId = uDiskId;
        }

        public String getSnapshotId() {
            return snapshotId;
        }

        public void setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
        }

        public int getCreateTime() {
            return createTime;
        }

        public void setCreateTime(int createTime) {
            this.createTime = createTime;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public boolean isUDiskAvailable() {
            return isUDiskAvailable;
        }

        public void setUDiskAvailable(boolean UDiskAvailable) {
            isUDiskAvailable = UDiskAvailable;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public int getDiskType() {
            return diskType;
        }

        public void setDiskType(int diskType) {
            this.diskType = diskType;
        }

        public String getuHostId() {
            return uHostId;
        }

        public void setuHostId(String uHostId) {
            this.uHostId = uHostId;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }
}
