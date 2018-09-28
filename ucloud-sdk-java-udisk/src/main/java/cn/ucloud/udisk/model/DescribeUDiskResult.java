package cn.ucloud.udisk.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取云硬盘列表 结果类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 16:27
 */
public class DescribeUDiskResult extends BaseResponseResult {

    public static class UDiskData {
        /**
         * 状态:Available(可用),Attaching(挂载中), InUse(已挂载), Detaching(卸载中),
         * Initializating(分配中), Failed(创建失败),Cloning(克隆中),Restoring(恢复中),RestoreFailed(恢复失败),
         */
        @SerializedName("Status")
        private String status;

        /**
         * 挂载的设备名称
         */
        @SerializedName("DeviceName")
        private String deviceName;
        /**
         * 挂载的UHost的Id
         */
        @SerializedName("UHostId")
        private String uHostId;
        /**
         * 业务组名称
         */
        @SerializedName("Tag")
        private String tag;
        /**
         * 是否支持数据方舟，支持:"2.0", 不支持:"1.0"
         */
        @SerializedName("Version")
        private String version;
        /**
         * 实例名称
         */
        @SerializedName("Name")
        private String name;
        /**
         * 可用区
         */
        @SerializedName("Zone")
        private String zone;
        /**
         * 挂载的UHost的IP
         */
        @SerializedName("UHostIP")
        private String uHostIP;
        /**
         * 云硬盘类型: 普通数据盘:DataDisk,普通系统盘:SystemDisk,SSD数据盘:SSDDataDisk
         */
        @SerializedName("DiskType")
        private String diskType;
        /**
         * 是否开启数据方舟，开启:"Yes", 不支持:"No"
         */
        @SerializedName("UDataArkMode")
        private String uDataArkMode;
        /**
         * 该盘快照上限
         */
        @SerializedName("SnapshotLimit")
        private Integer snapshotLimit;
        /**
         * 过期时间
         */
        @SerializedName("ExpiredTime")
        private Integer expiredTime;
        /**
         * 该盘快照个数
         */
        @SerializedName("SnapshotCount")
        private Integer snapshotCount;
        /**
         * 资源是否过期，过期:"Yes", 未过期:"No"
         */
        @SerializedName("IsExpire")
        private String isExpire;
        /**
         * UDisk实例Id
         */
        @SerializedName("UDiskId")
        private String uDiskId;
        /**
         * Year,Month,Dynamic,Trial
         */
        @SerializedName("ChargeType")
        private String chargeType;
        /**
         * 挂载的UHost的Name
         */
        @SerializedName("UHostName")
        private String uHostName;
        /**
         * 创建时间
         */
        @SerializedName("CreateTime")
        private Integer createTime;
        /**
         * 容量单位GB
         */
        @SerializedName("Size")
        private Integer size;

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

        public Integer getSnapshotLimit() {
            return snapshotLimit;
        }

        public void setSnapshotLimit(Integer snapshotLimit) {
            this.snapshotLimit = snapshotLimit;
        }

        public Integer getExpiredTime() {
            return expiredTime;
        }

        public void setExpiredTime(Integer expiredTime) {
            this.expiredTime = expiredTime;
        }

        public Integer getSnapshotCount() {
            return snapshotCount;
        }

        public void setSnapshotCount(Integer snapshotCount) {
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

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }

    /**
     * 满足条件的查询数目
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 磁盘信息
     */
    @SerializedName("DataSet")
    private List<UDiskData> DataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UDiskData> getDataSet() {
        return DataSet;
    }

    public void setDataSet(List<UDiskData> DataSet) {
        this.DataSet = DataSet;
    }



}
