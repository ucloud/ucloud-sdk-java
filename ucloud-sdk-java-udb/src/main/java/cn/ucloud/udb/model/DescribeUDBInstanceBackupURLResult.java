package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 获取UDB备份下载地址 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 12:07
 **/
public class DescribeUDBInstanceBackupURLResult extends BaseResponseResult {

    /**
     * DB实例备份文件公网的地址
     */
    @SerializedName("BackupPath")
    private String backupPath;

    /**
     * 内部地址
     */
    @SerializedName("InnerBackupPath")
    private String innerBackupPath;

    public String getBackupPath() {
        return backupPath;
    }

    public void setBackupPath(String backupPath) {
        this.backupPath = backupPath;
    }

    public String getInnerBackupPath() {
        return innerBackupPath;
    }

    public void setInnerBackupPath(String innerBackupPath) {
        this.innerBackupPath = innerBackupPath;
    }
}
