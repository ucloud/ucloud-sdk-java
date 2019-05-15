package cn.ucloud.udisk.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取云磁盘快照信息 结果类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 18:06
 */
public class DescribeUDiskSnapshotResult extends BaseResponseResult {

    public static class UDiskSnapshotData {

        /**
         * 快照描述
         */
        @SerializedName("Comment")
        private String comment;
        /**
         * 支付类型
         */
        @SerializedName("ChargeType")
        private String chargeType;
        /**
         * 快照名称
         */
        @SerializedName("Name")
        private String name;
        /**
         * 快照的源UDisk的Name
         */
        @SerializedName("UDiskName")
        private String uDiskName;
        /**
         * 过期时间
         */
        @SerializedName("ExpiredTime")
        private Integer expiredTime;
        /**
         * 快照的源UDisk的Id
         */
        @SerializedName("UDiskId")
        private String uDiskId;
        /**
         * 快照Id
         */
        @SerializedName("SnapshotId")
        private String snapshotId;
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
        /**
         * 快照状态，Normal:正常,Failed:失败,Creating:制作中
         */
        @SerializedName("Status")
        private String status;
        /**
         * 对应磁盘是否处于可用状态
         */
        @SerializedName("IsUDiskAvailable")
        private boolean isUDiskAvailable;
        /**
         * 快照版本
         */
        @SerializedName("Version")
        private String version;
        /**
         * 磁盘类型，0:数据盘，1:系统盘
         */
        @SerializedName("DiskType")
        private Integer diskType;
        /**
         * 对应磁盘制作快照时所挂载的主机
         */
        @SerializedName("UHostId")
        private String uHostId;

        /**
         * 是否是加密盘快照，是:"Yes", 否:"No"
         */
        @SerializedName("UKmsMode")
        private String uKmsMode;

        /**
         * 该快照的cmk id
         */
        @SerializedName("CmkId")
        private String cmkId;

        /**
         * 该快照的密文密钥
         */
        @SerializedName("DataKey")
        private String dataKey;

        /**
         * 该快照cmk的状态, Enabled(正常)，Disabled(失效)，Deleted(删除)，NoCmkId(非加密盘)
         */
        @SerializedName("CmkIdStatus")
        private String cmkIdStatus;

        /**
         * cmk id 别名
         */
        @SerializedName("CmkIdAlias")
        private String cmkIdAlias;

        public String getuKmsMode() {
            return uKmsMode;
        }

        public void setuKmsMode(String uKmsMode) {
            this.uKmsMode = uKmsMode;
        }

        public String getCmkId() {
            return cmkId;
        }

        public void setCmkId(String cmkId) {
            this.cmkId = cmkId;
        }

        public String getDataKey() {
            return dataKey;
        }

        public void setDataKey(String dataKey) {
            this.dataKey = dataKey;
        }

        public String getCmkIdStatus() {
            return cmkIdStatus;
        }

        public void setCmkIdStatus(String cmkIdStatus) {
            this.cmkIdStatus = cmkIdStatus;
        }

        public String getCmkIdAlias() {
            return cmkIdAlias;
        }

        public void setCmkIdAlias(String cmkIdAlias) {
            this.cmkIdAlias = cmkIdAlias;
        }

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

        public Integer getExpiredTime() {
            return expiredTime;
        }

        public void setExpiredTime(Integer expiredTime) {
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

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public boolean isUDiskAvailable() {
            return isUDiskAvailable;
        }

        public void setUDiskAvailable(boolean uDiskAvailable) {
            isUDiskAvailable = uDiskAvailable;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public Integer getDiskType() {
            return diskType;
        }

        public void setDiskType(Integer diskType) {
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

    /**
     * 根据过滤条件得到的总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
    /**
     * Snapshot列表, 详细参见 UDiskSnapshotSet
     */
    @SerializedName("DataSet")
    private List<UDiskSnapshotData> dataSet;




    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UDiskSnapshotData> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDiskSnapshotData> dataSet) {
        this.dataSet = dataSet;
    }
}
