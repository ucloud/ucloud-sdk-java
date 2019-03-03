package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 拉取sqlserver帐号 结果类
 * @Author : codezhang
 * @Date : 2019-03-03 17:13
 **/
public class DescribeSqlserverAccountsResult extends BaseResponseResult {

    public static class AccountInfo {

        /**
         * 帐号信息
         */
        @SerializedName("AccountName")
        private String accountName;

        /**
         * 帐号是否可用
         */
        @SerializedName("State")
        private String state;

        /**
         * 该帐号绑定的数据库
         */
        @SerializedName("DBName")
        private String dbName;

        public String getAccountName() {
            return accountName;
        }

        public void setAccountName(String accountName) {
            this.accountName = accountName;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getDbName() {
            return dbName;
        }

        public void setDbName(String dbName) {
            this.dbName = dbName;
        }

        @Override
        public String toString() {
            return "AccountInfo{" +
                    "accountName='" + accountName + '\'' +
                    ", state='" + state + '\'' +
                    ", dbName='" + dbName + '\'' +
                    '}';
        }
    }

    /**
     * 账号信息
     */
    @SerializedName("DataSet")
    private List<AccountInfo> accountInfos;

    public List<AccountInfo> getAccountInfos() {
        return accountInfos;
    }

    public void setAccountInfos(List<AccountInfo> accountInfos) {
        this.accountInfos = accountInfos;
    }

    @Override
    public String toString() {
        return "DescribeSqlserverAccountsResult{" +
                "accountInfos=" + accountInfos +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
