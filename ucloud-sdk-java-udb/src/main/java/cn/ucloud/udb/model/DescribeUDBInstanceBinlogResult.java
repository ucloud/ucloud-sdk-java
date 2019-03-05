package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 获取UDBbinlog列表
 * @Author : codezhang
 * @Date : 2019-03-04 13:08
 **/
public class DescribeUDBInstanceBinlogResult extends BaseResponseResult {

    public static class UDBInstanceBinlog {

        /**
         * Binlog文件名
         */
        @SerializedName("Name")
        private String name;

        /**
         * Binlog文件大小
         */
        @SerializedName("Size")
        private Integer size;

        /**
         * Binlog文件生成时间(时间戳)
         */
        @SerializedName("BeginTime")
        private Integer beginTime;

        /**
         * Binlog文件结束时间(时间戳)
         */
        @SerializedName("EndTime")
        private Integer endTime;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public Integer getBeginTime() {
            return beginTime;
        }

        public void setBeginTime(Integer beginTime) {
            this.beginTime = beginTime;
        }

        public Integer getEndTime() {
            return endTime;
        }

        public void setEndTime(Integer endTime) {
            this.endTime = endTime;
        }

    }

    /**
     * 获取的Binlog信息列表 UDBInstanceBinlog
     */
    @SerializedName("DataSet")
    private List<UDBInstanceBinlog> udbInstanceBinlogs;

    public List<UDBInstanceBinlog> getUdbInstanceBinlogs() {
        return udbInstanceBinlogs;
    }

    public void setUdbInstanceBinlogs(List<UDBInstanceBinlog> udbInstanceBinlogs) {
        this.udbInstanceBinlogs = udbInstanceBinlogs;
    }
}
