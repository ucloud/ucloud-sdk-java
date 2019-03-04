package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 获取云数据库支持类型 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 16:18
 **/
public class DescribeUDBTypeResult extends BaseResponseResult {

    public static class UDBType {
        /**
         * DB类型id，mysql/mongodb按版本细分各有一个id,
         * 目前id的取值范围为[1,7],数值对应的版本如下：
         * 1：mysql-5.5，2：mysql-5.1，
         * 3：percona-5.5 4：mongodb-2.4，
         * 5：mongodb-2.6，6：mysql-5.6， 7：percona-5.6
         */
        @SerializedName("DBTypeId")
        private String dbTypeId;

        public String getDbTypeId() {
            return dbTypeId;
        }

        public void setDbTypeId(String dbTypeId) {
            this.dbTypeId = dbTypeId;
        }

        @Override
        public String toString() {
            return "UDBType{" +
                    "dbTypeId='" + dbTypeId + '\'' +
                    '}';
        }
    }

    /**
     * DB类型列表 参数见 UDBTypeSet
     */
    @SerializedName("DataSet")
    private List<UDBType> udbTypes;

    public List<UDBType> getUdbTypes() {
        return udbTypes;
    }

    public void setUdbTypes(List<UDBType> udbTypes) {
        this.udbTypes = udbTypes;
    }

    @Override
    public String toString() {
        return "DescribeUDBTypeResult{" +
                "udbTypes=" + udbTypes +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
