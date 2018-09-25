package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 16:27
 */
public class DescribeUDiskResult extends BaseResponseResult {

    @SerializedName("TotalCount")
    private int totalCount;
    @SerializedName("DataSet")
    private List<UDiskData> DataSet;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<UDiskData> getDataSet() {
        return DataSet;
    }

    public void setDataSet(List<UDiskData> DataSet) {
        this.DataSet = DataSet;
    }

    public static class UDiskData {
        @SerializedName("Status")
        private String status;
        @SerializedName("DeviceName")
        private String deviceName;
        @SerializedName("UHostId")
        private String uHostId;
        @SerializedName("Tag")
        private String tag;
        @SerializedName("Version")
        private String version;
        @SerializedName("Name")
        private String name;
        @SerializedName("Zone")
        private String zone;
        @SerializedName("UHostIP")
        private String uHostIP;
        @SerializedName("DiskType")
        private String diskType;
        @SerializedName("UDataArkMode")
        private String uDataArkMode;
        @SerializedName("SnapshotLimit")
        private int snapshotLimit;
        @SerializedName("ExpiredTime")
        private int expiredTime;
        @SerializedName("SnapshotCount")
        private int snapshotCount;
        @SerializedName("IsExpire")
        private String isExpire;
        @SerializedName("UDiskId")
        private String uDiskId;
        @SerializedName("ChargeType")
        private String chargeType;
        @SerializedName("UHostName")
        private String uHostName;
        @SerializedName("CreateTime")
        private int createTime;
        @SerializedName("Size")
        private int size;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getDeviceName() {
            return deviceName;
        }

        public void setDeviceName(String deviceName) {
            this.deviceName = deviceName;
        }

        public String getuHostId() {
            return uHostId;
        }

        public void setuHostId(String uHostId) {
            this.uHostId = uHostId;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getuHostIP() {
            return uHostIP;
        }

        public void setuHostIP(String uHostIP) {
            this.uHostIP = uHostIP;
        }

        public String getDiskType() {
            return diskType;
        }

        public void setDiskType(String diskType) {
            this.diskType = diskType;
        }

        public String getuDataArkMode() {
            return uDataArkMode;
        }

        public void setuDataArkMode(String uDataArkMode) {
            this.uDataArkMode = uDataArkMode;
        }

        public int getSnapshotLimit() {
            return snapshotLimit;
        }

        public void setSnapshotLimit(int snapshotLimit) {
            this.snapshotLimit = snapshotLimit;
        }

        public int getExpiredTime() {
            return expiredTime;
        }

        public void setExpiredTime(int expiredTime) {
            this.expiredTime = expiredTime;
        }

        public int getSnapshotCount() {
            return snapshotCount;
        }

        public void setSnapshotCount(int snapshotCount) {
            this.snapshotCount = snapshotCount;
        }

        public String getIsExpire() {
            return isExpire;
        }

        public void setIsExpire(String isExpire) {
            this.isExpire = isExpire;
        }

        public String getuDiskId() {
            return uDiskId;
        }

        public void setuDiskId(String uDiskId) {
            this.uDiskId = uDiskId;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getuHostName() {
            return uHostName;
        }

        public void setuHostName(String uHostName) {
            this.uHostName = uHostName;
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

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
