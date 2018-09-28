package cn.ucloud.udisk.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 拉取回收站中云硬盘列表 结果类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 18:52
 */
public class DescribeRecycleUDiskResult extends BaseResponseResult {
    /**
     * 满足查询条件的数目
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 云磁盘信息
     */
    @SerializedName("DataSet")
    private List<RecycleUDisk> dataSet;


    public static class RecycleUDisk {

        /**
         * 业务组
         */
        @SerializedName("Tag")
        private String tag;
        /**
         * 名称
         */
        @SerializedName("Name")
        private String name;

        /**
         * 可用区
         */
        @SerializedName("Zone")
        private String zone;

        /**
         * 过期时间
         */
        @SerializedName("ExpiredTime")
        private Integer expiredTime;
        /**
         * 云磁盘ID
         */
        @SerializedName("UDiskId")
        private String uDiskId;

        /**
         * 销毁倒计时
         */
        @SerializedName("CountdownTime")
        private Integer countdownTime;
        /**
         * 创建时间
         */
        @SerializedName("CreateTime")
        private Integer createTime;
        /**
         * 磁盘容量
         */
        @SerializedName("Size")
        private Integer size;

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
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

        public Integer getCountdownTime() {
            return countdownTime;
        }

        public void setCountdownTime(Integer countdownTime) {
            this.countdownTime = countdownTime;
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
}
