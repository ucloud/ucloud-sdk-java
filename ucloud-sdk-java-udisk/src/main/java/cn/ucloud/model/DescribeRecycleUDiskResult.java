package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 18:52
 */
public class DescribeRecycleUDiskResult extends BaseResponseResult {
    @SerializedName("TotalCount")
    private int totalCount;
    @SerializedName("DataSet")
    private List<RecycleUDisk> dataSet;


    public static class RecycleUDisk {
        @SerializedName("Tag")
        private String tag;
        @SerializedName("Name")
        private String name;
        @SerializedName("Zone")
        private String zone;
        @SerializedName("ExpiredTime")
        private int expiredTime;
        @SerializedName("UDiskId")
        private String uDiskId;
        @SerializedName("CountdownTime")
        private int countdownTime;
        @SerializedName("CreateTime")
        private int createTime;
        @SerializedName("Size")
        private int size;

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

        public int getCountdownTime() {
            return countdownTime;
        }

        public void setCountdownTime(int countdownTime) {
            this.countdownTime = countdownTime;
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
}
