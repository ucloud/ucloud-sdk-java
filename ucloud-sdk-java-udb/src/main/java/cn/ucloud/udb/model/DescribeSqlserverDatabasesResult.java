package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 拉取sqlserver实例下数据库列表 结果类
 * @Author : codezhang
 * @Date : 2019-03-03 17:25
 **/
public class DescribeSqlserverDatabasesResult extends BaseResponseResult {


    public static class DBNameInfo {

        /**
         * sqlserver数据库名称
         */
        @SerializedName("DBName")
        private String dbName;

        /**
         * 数据库是否可用
         */
        @SerializedName("State")
        private String state;

        /**
         * 该数据库关联的帐号
         */
        @SerializedName("AccountName")
        private List<String> accountName;

        public String getDbName() {
            return dbName;
        }

        public void setDbName(String dbName) {
            this.dbName = dbName;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public List<String> getAccountName() {
            return accountName;
        }

        public void setAccountName(List<String> accountName) {
            this.accountName = accountName;
        }

        @Override
        public String toString() {
            return "DBNameInfo{" +
                    "dbName='" + dbName + '\'' +
                    ", state='" + state + '\'' +
                    ", accountName=" + accountName +
                    '}';
        }
    }

    /**
     * 数据库信息
     */
    @SerializedName("DataSet")
    private List<DBNameInfo> dbNameInfos;

    public List<DBNameInfo> getDbNameInfos() {
        return dbNameInfos;
    }

    public void setDbNameInfos(List<DBNameInfo> dbNameInfos) {
        this.dbNameInfos = dbNameInfos;
    }

    @Override
    public String toString() {
        return "DescribeSqlserverDatabasesResult{" +
                "dbNameInfos=" + dbNameInfos +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
