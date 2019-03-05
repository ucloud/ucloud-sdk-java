package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description :  获取数据专区的类型信息 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 11:06
 **/
public class DescribeUDBCTypeResult extends BaseResponseResult {

    public static class UDBCType {

        /**
         * 磁盘空间
         */
        @SerializedName("DiskType")
        private Integer diskType;

        /**
         * 内存大小
         */
        @SerializedName("MemoryLimit")
        private Integer memoryLimit;

        /**
         * 是否使用SSD
         */
        @SerializedName("UseSSD")
        private Boolean useSSD;

        /**
         * 机型名称
         */
        @SerializedName("Name")
        private String name;

        /**
         * 机型类型
         */
        @SerializedName("Type")
        private String type;

        public Integer getDiskType() {
            return diskType;
        }

        public void setDiskType(Integer diskType) {
            this.diskType = diskType;
        }

        public Integer getMemoryLimit() {
            return memoryLimit;
        }

        public void setMemoryLimit(Integer memoryLimit) {
            this.memoryLimit = memoryLimit;
        }

        public Boolean getUseSSD() {
            return useSSD;
        }

        public void setUseSSD(Boolean useSSD) {
            this.useSSD = useSSD;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

    }

    /**
     * 专区的类型信息
     */
    @SerializedName("DataSet")
    private List<UDBCType> udbcTypes;

    public List<UDBCType> getUdbcTypes() {
        return udbcTypes;
    }

    public void setUdbcTypes(List<UDBCType> udbcTypes) {
        this.udbcTypes = udbcTypes;
    }
}
