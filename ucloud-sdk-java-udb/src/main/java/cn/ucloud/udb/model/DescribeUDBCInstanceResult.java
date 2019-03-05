package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 获取数据库专区的信息 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 10:37
 **/
public class DescribeUDBCInstanceResult extends BaseResponseResult {

    public static class UDBCInstance {

        /**
         * 专区ID
         */
        @SerializedName("UDBCId")
        private String udbcId;

        /**
         * 专区名称
         */
        @SerializedName("UDBCName")
        private String udbcName;

        /**
         * 磁盘空间（默认单位为G）
         */
        @SerializedName("DiskSpace")
        private Integer diskSpace;

        /**
         * 内存大小（默认单位为G）
         */
        @SerializedName("MemoryLimit")
        private Integer memoryLimit;

        /**
         * 专区创建时间，采用UTC计时时间戳
         */
        @SerializedName("CreateTime")
        private Integer createTime;

        /**
         * 专区修改时间，采用UTC计时时间戳
         */
        @SerializedName("ModifyTime")
        private Integer modifyTime;

        /**
         * 专区DB的数量
         */
        @SerializedName("UDBInstanceCount")
        private Integer udbInstanceCount;

        /**
         * 专区的类型
         */
        @SerializedName("Type")
        private String type;

        /**
         * 专区已使用内存大小
         */
        @SerializedName("UsedMemory")
        private Integer usedMemory;

        /**
         * 专区已使用磁盘大小
         */
        @SerializedName("UsedDiskSpace")
        private Integer usedDiskSpace;

        /**
         * 专区过期时间，采用UTC计时时间戳
         */
        @SerializedName("ExpiredTime")
        private Integer expiredTime;

        /**
         * 备注
         */
        @SerializedName("Remark")
        private String remark;

        /**
         * 是否过期
         */
        @SerializedName("IsExpired")
        private Boolean isExpired;

        /**
         * 所属业务组
         */
        @SerializedName("Tag")
        private String tag;

        /**
         * 专区所在可用区
         */
        @SerializedName("Zone")
        private String zone;

        /**
         * 计费类型:Year,Month，默认为Month
         */
        @SerializedName("ChargeType")
        private String chargeType;

        /**
         * 购买时长，默认值1
         */
        @SerializedName("Quantity")
        private Integer quantity;

        /**
         * 是否自动续费，自动续费：“Yes”，不自动续费：“No”	false
         */
        @SerializedName("AutoRenew")
        private String autoRenew;


        public String getUdbcId() {
            return udbcId;
        }

        public void setUdbcId(String udbcId) {
            this.udbcId = udbcId;
        }

        public String getUdbcName() {
            return udbcName;
        }

        public void setUdbcName(String udbcName) {
            this.udbcName = udbcName;
        }

        public Integer getDiskSpace() {
            return diskSpace;
        }

        public void setDiskSpace(Integer diskSpace) {
            this.diskSpace = diskSpace;
        }

        public Integer getMemoryLimit() {
            return memoryLimit;
        }

        public void setMemoryLimit(Integer memoryLimit) {
            this.memoryLimit = memoryLimit;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getModifyTime() {
            return modifyTime;
        }

        public void setModifyTime(Integer modifyTime) {
            this.modifyTime = modifyTime;
        }

        public Integer getUdbInstanceCount() {
            return udbInstanceCount;
        }

        public void setUdbInstanceCount(Integer udbInstanceCount) {
            this.udbInstanceCount = udbInstanceCount;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getUsedMemory() {
            return usedMemory;
        }

        public void setUsedMemory(Integer usedMemory) {
            this.usedMemory = usedMemory;
        }

        public Integer getUsedDiskSpace() {
            return usedDiskSpace;
        }

        public void setUsedDiskSpace(Integer usedDiskSpace) {
            this.usedDiskSpace = usedDiskSpace;
        }

        public Integer getExpiredTime() {
            return expiredTime;
        }

        public void setExpiredTime(Integer expiredTime) {
            this.expiredTime = expiredTime;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public Boolean getExpired() {
            return isExpired;
        }

        public void setExpired(Boolean expired) {
            isExpired = expired;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public String getAutoRenew() {
            return autoRenew;
        }

        public void setAutoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
        }

    }

    /**
     * 专区的基本信息
     */
    @SerializedName("DataSet")
    private List<UDBCInstance> udbcInstances;

    /**
     * 总个数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<UDBCInstance> getUdbcInstances() {
        return udbcInstances;
    }

    public void setUdbcInstances(List<UDBCInstance> udbcInstances) {
        this.udbcInstances = udbcInstances;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

}
